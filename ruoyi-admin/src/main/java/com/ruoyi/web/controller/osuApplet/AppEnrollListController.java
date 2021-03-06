package com.ruoyi.web.controller.osuApplet;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.osu.AppEnroll;
import com.ruoyi.system.domain.osu.AppEnrollList;
import com.ruoyi.system.service.osu.IAppEnrollListService;
import com.ruoyi.system.service.osu.IAppEnrollService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
@RequestMapping("/system/enrollList")
public class AppEnrollListController extends BaseController
{
    private String prefix = "system/osu/enrollList";

    @Autowired
    private IAppEnrollListService iAppEnrollService;


    @GetMapping()
    public String info()
    {
        return prefix + "/enroll";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppEnrollList appEnroll)
    {
        startPage();
        List<AppEnrollList> list = iAppEnrollService.selectAppEnrollList(appEnroll);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppEnrollList appEnroll)
    {
        List<AppEnrollList> list = iAppEnrollService.selectAppEnrollList(appEnroll);
        ExcelUtil<AppEnrollList> util = new ExcelUtil<AppEnrollList>(AppEnrollList.class);
        return util.exportExcel(list, "info");
    }


    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }


    /**
     * 新增保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AppEnrollList appEnroll)
    {
        return toAjax(iAppEnrollService.insertAppEnroll(appEnroll));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        AppEnrollList appEnroll = iAppEnrollService.selectAppEnrollById(id);
        mmap.put("appEnroll", appEnroll);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AppEnrollList appEnroll)
    {
        return toAjax(iAppEnrollService.updateAppEnroll(appEnroll));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(iAppEnrollService.deleteAppEnrollByIds(ids));
    }

    /**
     * 状态修改
     */
    @Log(title = "状态管理", businessType = BusinessType.UPDATE)
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(AppEnrollList appEnroll)
    {
        return toAjax(iAppEnrollService.changeStatus(appEnroll));
    }

    /**
     * 查询报名详细
     */
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") String id, ModelMap map)
    {
        map.put("appEnroll", iAppEnrollService.selectAppEnrollById(id));
        map.put("appEnrollList", iAppEnrollService.selectAppEnrollList(new AppEnrollList()));
        return "system/osu/enroll/enroll";
    }
}
