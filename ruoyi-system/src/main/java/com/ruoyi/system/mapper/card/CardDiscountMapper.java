package com.ruoyi.system.mapper.card;

import com.ruoyi.system.domain.card.CardDiscount;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author dxs
 * @date 2020-12-23
 */
public interface CardDiscountMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param discountId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCardDiscountById(String discountId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param discountIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCardDiscountByIds(String[] discountIds);
}
