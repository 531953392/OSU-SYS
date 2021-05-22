package com.ruoyi.web.controller.card;

import java.util.List;

import com.ruoyi.system.domain.card.CardBrand;
import com.ruoyi.system.domain.card.CardDiscount;
import com.ruoyi.system.service.card.ICardBrandService;
import com.ruoyi.system.service.card.ICardDiscountService;
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
 * 【礼品卡】Controller
 * 
 * @author dxs
 * @date 2020-12-23
 */
@Controller
@RequestMapping("/system/card/discount")
public class CardDiscountController extends BaseController
{
    private String prefix = "system/card/discount";

    @Autowired
    private ICardDiscountService cardDiscountService;

    @Autowired
    private ICardBrandService cardBrandService;

    @RequiresPermissions("system:discount:view")
    @GetMapping()
    public String discount()
    {
        return prefix + "/discount";
    }

    /**
     * 查询【礼品卡】列表
     */
    @RequiresPermissions("system:discount:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CardDiscount cardDiscount)
    {
        startPage();
        List<CardDiscount> list = cardDiscountService.selectCardDiscountList(cardDiscount);
        return getDataTable(list);
    }

    /**
     * 导出【礼品卡】列表
     */
    @RequiresPermissions("system:discount:export")
    @Log(title = "【礼品卡】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CardDiscount cardDiscount)
    {
        List<CardDiscount> list = cardDiscountService.selectCardDiscountList(cardDiscount);
        ExcelUtil<CardDiscount> util = new ExcelUtil<CardDiscount>(CardDiscount.class);
        return util.exportExcel(list, "discount");
    }

    /**
     * 新增【礼品卡】
     */
    @GetMapping("/add")
    public String add(CardBrand cardBrand, ModelMap mmap)
    {

        mmap.put("brandList", cardBrandService.selectCardBrandList(cardBrand));
        return prefix + "/add";
    }

    /**
     * 新增保存【礼品卡】
     */
    @RequiresPermissions("system:discount:add")
    @Log(title = "【礼品卡】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CardDiscount cardDiscount)
    {
        CardBrand cardBrand = cardBrandService.selectCardBrandById(cardDiscount.getBrandId());
        cardDiscount.setBrandName(cardBrand.getBrandName());
        cardDiscount.setCountry(cardBrand.getCountry());
        cardDiscount.setDiscount(cardBrand.getDiscount());
        return toAjax(cardDiscountService.insertCardDiscount(cardDiscount));
    }

    /**
     * 修改【礼品卡】
     */
    @GetMapping("/edit/{discountId}")
    public String edit(@PathVariable("discountId") String discountId, ModelMap mmap,CardBrand cardBrand)
    {
        CardDiscount cardDiscount = cardDiscountService.selectCardDiscountById(discountId);
        mmap.put("cardDiscount", cardDiscount);
        mmap.put("brandList", cardBrandService.selectCardBrandList(cardBrand));
        return prefix + "/edit";
    }

    /**
     * 修改保存【礼品卡】
     */
    @RequiresPermissions("system:discount:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CardDiscount cardDiscount)
    {
        return toAjax(cardDiscountService.updateCardDiscount(cardDiscount));
    }

    /**
     * 删除【礼品卡】
     */
    @RequiresPermissions("system:discount:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cardDiscountService.deleteCardDiscountByIds(ids));
    }

    /**
     * 状态修改
     */
    @Log(title = "状态管理", businessType = BusinessType.UPDATE)
    @RequiresPermissions("system:brand:edit")
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(CardDiscount cardDiscount)
    {
        return toAjax(cardDiscountService.changeStatus(cardDiscount));
    }
}
