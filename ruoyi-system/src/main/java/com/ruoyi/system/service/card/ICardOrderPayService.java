package com.ruoyi.system.service.card;

import com.ruoyi.system.domain.card.CardOrderPay;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2020-12-27
 */
public interface ICardOrderPayService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public CardOrderPay selectCardOrderPayById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardOrderPay 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CardOrderPay> selectCardOrderPayList(CardOrderPay cardOrderPay);

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardOrderPay 【请填写功能名称】
     * @return 结果
     */
    public int insertCardOrderPay(CardOrderPay cardOrderPay);

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardOrderPay 【请填写功能名称】
     * @return 结果
     */
    public int updateCardOrderPay(CardOrderPay cardOrderPay);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCardOrderPayByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCardOrderPayById(String id);
}
