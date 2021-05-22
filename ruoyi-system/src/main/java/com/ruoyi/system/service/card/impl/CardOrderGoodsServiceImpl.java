package com.ruoyi.system.service.card.impl;

import java.util.List;

import com.ruoyi.system.mapper.card.CardOrderGoodsMapper;
import com.ruoyi.system.service.card.ICardOrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.crad.domain.CardOrderGoods;

import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author dxs
 * @date 2020-12-27
 */
@Service
public class CardOrderGoodsServiceImpl implements ICardOrderGoodsService
{
    @Autowired
    private CardOrderGoodsMapper cardOrderGoodsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public CardOrderGoods selectCardOrderGoodsById(String id)
    {
        return cardOrderGoodsMapper.selectCardOrderGoodsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardOrderGoods 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CardOrderGoods> selectCardOrderGoodsList(CardOrderGoods cardOrderGoods)
    {
        return cardOrderGoodsMapper.selectCardOrderGoodsList(cardOrderGoods);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardOrderGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCardOrderGoods(CardOrderGoods cardOrderGoods)
    {
        return cardOrderGoodsMapper.insertCardOrderGoods(cardOrderGoods);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardOrderGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCardOrderGoods(CardOrderGoods cardOrderGoods)
    {
        return cardOrderGoodsMapper.updateCardOrderGoods(cardOrderGoods);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCardOrderGoodsByIds(String ids)
    {
        return cardOrderGoodsMapper.deleteCardOrderGoodsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCardOrderGoodsById(String id)
    {
        return cardOrderGoodsMapper.deleteCardOrderGoodsById(id);
    }
}
