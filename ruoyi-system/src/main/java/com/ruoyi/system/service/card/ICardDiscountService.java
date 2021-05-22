package com.ruoyi.system.service.card;

import com.ruoyi.system.domain.card.CardBrand;
import com.ruoyi.system.domain.card.CardDiscount;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2020-12-23
 */
public interface ICardDiscountService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param discountId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public CardDiscount selectCardDiscountById(String discountId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardDiscount 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CardDiscount> selectCardDiscountList(CardDiscount cardDiscount);

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardDiscount 【请填写功能名称】
     * @return 结果
     */
    public int insertCardDiscount(CardDiscount cardDiscount);

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardDiscount 【请填写功能名称】
     * @return 结果
     */
    public int updateCardDiscount(CardDiscount cardDiscount);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCardDiscountByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param discountId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCardDiscountById(String discountId);

    /**
     * 状态修改
     *
     * @param cardDiscount
     * @return 结果
     */
    public int changeStatus(CardDiscount cardDiscount);
}
