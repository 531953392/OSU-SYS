package com.ruoyi.system.service.card.impl;

import java.util.List;

import com.ruoyi.system.domain.card.CardOrder;
import com.ruoyi.system.mapper.card.CardOrderMapper;
import com.ruoyi.system.service.card.ICardOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author dxs
 * @date 2020-12-27
 */
@Service
public class CardOrderServiceImpl implements ICardOrderService
{
    @Autowired
    private CardOrderMapper cardOrderMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public CardOrder selectCardOrderById(String orderId)
    {
        return cardOrderMapper.selectCardOrderById(orderId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardOrder 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CardOrder> selectCardOrderList(CardOrder cardOrder)
    {
        return cardOrderMapper.selectCardOrderList(cardOrder);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardOrder 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCardOrder(CardOrder cardOrder)
    {
        return cardOrderMapper.insertCardOrder(cardOrder);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardOrder 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCardOrder(CardOrder cardOrder)
    {
        return cardOrderMapper.updateCardOrder(cardOrder);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCardOrderByIds(String ids)
    {
        return cardOrderMapper.deleteCardOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param orderId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCardOrderById(String orderId)
    {
        return cardOrderMapper.deleteCardOrderById(orderId);
    }
}
