package com.ruoyi.web.controller.osuApplet;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.osu.AppEnrollList;
import com.ruoyi.system.domain.osu.AppEnrollUser;
import com.ruoyi.system.service.osu.IAppEnrollListService;
import com.ruoyi.system.service.osu.IAppEnrollUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【报名题目】Controller
 * 
 * @author dxs
 * @date 2021-05-31
 */
@Controller
@RequestMapping("/system/enrollUser")
public class AppEnrollUserController extends BaseController
{
    private String prefix = "system/osu/enrollUser";

    @Autowired
    private IAppEnrollUserService iAppEnrollService;

    @Autowired
    private IAppEnrollListService iAppEnrollService1;


    @GetMapping()
    public String info(ModelMap map)
    {
        List<AppEnrollList> appEnrollLists =  iAppEnrollService1.selectAppEnrollList(new AppEnrollList());
        map.put("appEnroll",appEnrollLists.get(0));
        map.put("appEnrollList", appEnrollLists);
        return prefix + "/enrollUser";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppEnrollUser appEnroll)
    {
        startPage();
        List<AppEnrollUser> list = iAppEnrollService.selectAppEnrollList(appEnroll);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppEnrollUser appEnroll)
    {
        List<AppEnrollUser> list = iAppEnrollService.selectAppEnrollList(appEnroll);
        ExcelUtil<AppEnrollUser> util = new ExcelUtil<AppEnrollUser>(AppEnrollUser.class);
        AppEnrollList appEnrollList = null;
        if(list.size()!=0){
             appEnrollList = iAppEnrollService1.selectAppEnrollById(list.get(0).getEnroll_id());
        }
        return util.exportExcel(list, appEnrollList==null?"报名活动导出":appEnrollList.getTitle());
    }


}
