package com.ruoyi.web.controller.card;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.card.CardBrand;
import com.ruoyi.system.service.card.ICardBrandService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;

import java.util.List;

/**
 * 【品牌】Controller
 * 
 * @author dxs
 * @date 2020-12-18
 */
@Controller
@RequestMapping("/system/card/brand")
public class CardBrandController extends BaseController
{
    private String prefix = "system/card/brand";

    @Autowired
    private ICardBrandService cardBrandService;

    @RequiresPermissions("system:brand:view")
    @GetMapping()
    public String brand()
    {
        return prefix + "/brand";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:brand:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CardBrand cardBrand)
    {
        startPage();
        List<CardBrand> list = cardBrandService.selectCardBrandList(cardBrand);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:brand:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CardBrand cardBrand)
    {
        List<CardBrand> list = cardBrandService.selectCardBrandList(cardBrand);
        ExcelUtil<CardBrand> util = new ExcelUtil<CardBrand>(CardBrand.class);
        return util.exportExcel(list, "brand");
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
    @RequiresPermissions("system:brand:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Validated CardBrand cardBrand)
    {
        return toAjax(cardBrandService.insertCardBrand(cardBrand));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{brandId}")
    public String edit(@PathVariable("brandId") String brandId, ModelMap mmap)
    {
        CardBrand cardBrand = cardBrandService.selectCardBrandById(brandId);
        mmap.put("cardBrand", cardBrand);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:brand:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CardBrand cardBrand)
    {
        return toAjax(cardBrandService.updateCardBrand(cardBrand));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:brand:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cardBrandService.deleteCardBrandByIds(ids));
    }


    /**
     * 品牌状态修改
     */
    @Log(title = "品牌状态管理", businessType = BusinessType.UPDATE)
    @RequiresPermissions("system:brand:edit")
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(CardBrand cardBrand)
    {
        return toAjax(cardBrandService.changeStatus(cardBrand));
    }
}
