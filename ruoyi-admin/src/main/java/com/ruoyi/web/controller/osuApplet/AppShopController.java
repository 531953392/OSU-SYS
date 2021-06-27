package com.ruoyi.web.controller.osuApplet;

import java.util.List;

import com.ruoyi.system.domain.osu.AppShop;
import com.ruoyi.system.service.osu.IAppShopService;
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
 * @date 2021-06-22
 */
@Controller
@RequestMapping("/system/shop")
public class AppShopController extends BaseController
{
    private String prefix = "system/osu/shop";

    @Autowired
    private IAppShopService appShopService;

    @GetMapping()
    public String shop()
    {
        return prefix + "/shop";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppShop appShop)
    {
        startPage();
        List<AppShop> list = appShopService.selectAppShopList(appShop);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppShop appShop)
    {
        List<AppShop> list = appShopService.selectAppShopList(appShop);
        ExcelUtil<AppShop> util = new ExcelUtil<AppShop>(AppShop.class);
        return util.exportExcel(list, "shop");
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
    public AjaxResult addSave(AppShop appShop)
    {
        return toAjax(appShopService.insertAppShop(appShop));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        AppShop appShop = appShopService.selectAppShopById(id);
        mmap.put("appShop", appShop);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AppShop appShop)
    {
        return toAjax(appShopService.updateAppShop(appShop));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(appShopService.deleteAppShopByIds(ids));
    }
}
