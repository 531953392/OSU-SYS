package com.ruoyi.system.service.card.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.card.CardOrderGoodsItem;
import com.ruoyi.system.mapper.card.CardOrderGoodsItemMapper;
import com.ruoyi.system.service.card.ICardOrderGoodsItemService;
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
public class CardOrderGoodsItemServiceImpl implements ICardOrderGoodsItemService
{
    @Autowired
    private CardOrderGoodsItemMapper cardOrderGoodsItemMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public CardOrderGoodsItem selectCardOrderGoodsItemById(String id)
    {
        return cardOrderGoodsItemMapper.selectCardOrderGoodsItemById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardOrderGoodsItem 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CardOrderGoodsItem> selectCardOrderGoodsItemList(CardOrderGoodsItem cardOrderGoodsItem)
    {
        return cardOrderGoodsItemMapper.selectCardOrderGoodsItemList(cardOrderGoodsItem);
    }


    @Override
    public List<CardOrderGoodsItem> selectByOrderId(String orderId)
    {
        return cardOrderGoodsItemMapper.selectByOrderId(orderId);
    }


    /**
     * 新增【请填写功能名称】
     * 
     * @param cardOrderGoodsItem 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCardOrderGoodsItem(CardOrderGoodsItem cardOrderGoodsItem)
    {
        cardOrderGoodsItem.setCreateTime(DateUtils.getNowDate());
        return cardOrderGoodsItemMapper.insertCardOrderGoodsItem(cardOrderGoodsItem);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardOrderGoodsItem 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCardOrderGoodsItem(CardOrderGoodsItem cardOrderGoodsItem)
    {
        cardOrderGoodsItem.setUpdateTime(DateUtils.getNowDate());
        return cardOrderGoodsItemMapper.updateCardOrderGoodsItem(cardOrderGoodsItem);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCardOrderGoodsItemByIds(String ids)
    {
        return cardOrderGoodsItemMapper.deleteCardOrderGoodsItemByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCardOrderGoodsItemById(String id)
    {
        return cardOrderGoodsItemMapper.deleteCardOrderGoodsItemById(id);
    }
}
