package com.ruoyi.system.osu.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.osu.domain.AppApplyInfo;
import com.ruoyi.system.osu.service.IAppApplyInfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author dxs
 * @date 2021-05-31
 */
@Controller
@RequestMapping("/system/info")
public class AppApplyInfoController extends BaseController
{
    private String prefix = "system/osu/info";

    @Autowired
    private IAppApplyInfoService appApplyInfoService;

    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppApplyInfo appApplyInfo)
    {
        startPage();
        List<AppApplyInfo> list = appApplyInfoService.selectAppApplyInfoList(appApplyInfo);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppApplyInfo appApplyInfo)
    {
        List<AppApplyInfo> list = appApplyInfoService.selectAppApplyInfoList(appApplyInfo);
        ExcelUtil<AppApplyInfo> util = new ExcelUtil<AppApplyInfo>(AppApplyInfo.class);
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
    public AjaxResult addSave(AppApplyInfo appApplyInfo)
    {
        return toAjax(appApplyInfoService.insertAppApplyInfo(appApplyInfo));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        AppApplyInfo appApplyInfo = appApplyInfoService.selectAppApplyInfoById(id);
        mmap.put("appApplyInfo", appApplyInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AppApplyInfo appApplyInfo)
    {
        return toAjax(appApplyInfoService.updateAppApplyInfo(appApplyInfo));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(appApplyInfoService.deleteAppApplyInfoByIds(ids));
    }
}
