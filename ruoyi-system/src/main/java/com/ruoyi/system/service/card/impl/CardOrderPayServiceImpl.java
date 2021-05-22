package com.ruoyi.system.service.card.impl;

import java.util.List;

import com.ruoyi.system.domain.card.CardOrderPay;
import com.ruoyi.system.mapper.card.CardOrderPayMapper;
import com.ruoyi.system.service.card.ICardOrderPayService;
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
public class CardOrderPayServiceImpl implements ICardOrderPayService
{
    @Autowired
    private CardOrderPayMapper cardOrderPayMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public CardOrderPay selectCardOrderPayById(String id)
    {
        return cardOrderPayMapper.selectCardOrderPayById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardOrderPay 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CardOrderPay> selectCardOrderPayList(CardOrderPay cardOrderPay)
    {
        return cardOrderPayMapper.selectCardOrderPayList(cardOrderPay);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardOrderPay 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCardOrderPay(CardOrderPay cardOrderPay)
    {
        return cardOrderPayMapper.insertCardOrderPay(cardOrderPay);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardOrderPay 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCardOrderPay(CardOrderPay cardOrderPay)
    {
        return cardOrderPayMapper.updateCardOrderPay(cardOrderPay);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCardOrderPayByIds(String ids)
    {
        return cardOrderPayMapper.deleteCardOrderPayByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCardOrderPayById(String id)
    {
        return cardOrderPayMapper.deleteCardOrderPayById(id);
    }
}
