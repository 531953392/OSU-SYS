package com.ruoyi.system.service.card;

import com.ruoyi.system.domain.card.CardOrder;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2020-12-27
 */
public interface ICardOrderService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public CardOrder selectCardOrderById(String orderId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardOrder 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CardOrder> selectCardOrderList(CardOrder cardOrder);

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardOrder 【请填写功能名称】
     * @return 结果
     */
    public int insertCardOrder(CardOrder cardOrder);

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardOrder 【请填写功能名称】
     * @return 结果
     */
    public int updateCardOrder(CardOrder cardOrder);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCardOrderByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param orderId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCardOrderById(String orderId);
}
