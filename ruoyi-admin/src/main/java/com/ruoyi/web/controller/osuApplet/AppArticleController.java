package com.ruoyi.web.controller.osuApplet;

import java.util.List;

import com.ruoyi.system.domain.osu.AppArticle;
import com.ruoyi.system.service.osu.IAppArticleService;
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
 * @date 2021-05-23
 */
@Controller
@RequestMapping("/system/article")
public class AppArticleController extends BaseController
{
    private String prefix = "system/osu/article";

    @Autowired
    private IAppArticleService appArticleService;

    @RequiresPermissions("system:article:view")
    @GetMapping()
    public String article()
    {
        return prefix + "/article";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:article:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppArticle appArticle)
    {
        startPage();
        List<AppArticle> list = appArticleService.selectAppArticleList(appArticle);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:article:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppArticle appArticle)
    {
        List<AppArticle> list = appArticleService.selectAppArticleList(appArticle);
        ExcelUtil<AppArticle> util = new ExcelUtil<AppArticle>(AppArticle.class);
        return util.exportExcel(list, "article");
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
    @RequiresPermissions("system:article:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AppArticle appArticle)
    {
        return toAjax(appArticleService.insertAppArticle(appArticle));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{articleId}")
    public String edit(@PathVariable("articleId") Long articleId, ModelMap mmap)
    {
        AppArticle appArticle = appArticleService.selectAppArticleById(articleId);
        mmap.put("appArticle", appArticle);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:article:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AppArticle appArticle)
    {
        return toAjax(appArticleService.updateAppArticle(appArticle));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:article:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(appArticleService.deleteAppArticleByIds(ids));
    }
}
