package com.ruoyi.web.controller.osuApplet;

import java.util.List;

import com.ruoyi.system.domain.osu.AppArticle;
import com.ruoyi.system.domain.osu.AppInfoGroup;
import com.ruoyi.system.service.osu.IAppInfoGroupService;
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
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author dxs
 * @date 2021-05-25
 */
@Controller
@RequestMapping("/system/group")
public class AppInfoGroupController extends BaseController
{
    private String prefix = "system/osu/group";

    @Autowired
    private IAppInfoGroupService appInfoGroupService;

    @RequiresPermissions("system:group:view")
    @GetMapping()
    public String group()
    {
        return prefix + "/group";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:group:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppInfoGroup appInfoGroup)
    {
        startPage();
        List<AppInfoGroup> list = appInfoGroupService.selectAppInfoGroupList(appInfoGroup);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:group:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppInfoGroup appInfoGroup)
    {
        List<AppInfoGroup> list = appInfoGroupService.selectAppInfoGroupList(appInfoGroup);
        ExcelUtil<AppInfoGroup> util = new ExcelUtil<AppInfoGroup>(AppInfoGroup.class);
        return util.exportExcel(list, "group");
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
    @RequiresPermissions("system:group:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AppInfoGroup appInfoGroup)
    {
        return toAjax(appInfoGroupService.insertAppInfoGroup(appInfoGroup));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{infoId}")
    public String edit(@PathVariable("infoId") String infoId, ModelMap mmap)
    {
        AppInfoGroup appInfoGroup = appInfoGroupService.selectAppInfoGroupById(infoId);
        mmap.put("appInfoGroup", appInfoGroup);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:group:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AppInfoGroup appInfoGroup)
    {
        return toAjax(appInfoGroupService.updateAppInfoGroup(appInfoGroup));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:group:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(appInfoGroupService.deleteAppInfoGroupByIds(ids));
    }

    /**
     * 状态修改
     */
    @Log(title = "状态管理", businessType = BusinessType.UPDATE)
    @RequiresPermissions("system:group:edit")
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(AppInfoGroup appInfoGroup)
    {
        return toAjax(appInfoGroupService.changeStatus(appInfoGroup));
    }
}
