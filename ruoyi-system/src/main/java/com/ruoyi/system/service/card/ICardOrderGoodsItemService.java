package com.ruoyi.system.service.card;

import com.ruoyi.system.domain.card.CardOrderGoodsItem;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2020-12-27
 */
public interface ICardOrderGoodsItemService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public CardOrderGoodsItem selectCardOrderGoodsItemById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardOrderGoodsItem 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CardOrderGoodsItem> selectCardOrderGoodsItemList(CardOrderGoodsItem cardOrderGoodsItem);


    /**
     * 查询【请填写功能名称】列表
     *
     * @param orderId 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CardOrderGoodsItem> selectByOrderId(String orderId);
    /**
     * 新增【请填写功能名称】
     * 
     * @param cardOrderGoodsItem 【请填写功能名称】
     * @return 结果
     */
    public int insertCardOrderGoodsItem(CardOrderGoodsItem cardOrderGoodsItem);

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardOrderGoodsItem 【请填写功能名称】
     * @return 结果
     */
    public int updateCardOrderGoodsItem(CardOrderGoodsItem cardOrderGoodsItem);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCardOrderGoodsItemByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCardOrderGoodsItemById(String id);
}
