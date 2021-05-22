package com.ruoyi.system.service.card;

import java.util.List;
import com.ruoyi.system.crad.domain.CardOrderGoods;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2020-12-27
 */
public interface ICardOrderGoodsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public CardOrderGoods selectCardOrderGoodsById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardOrderGoods 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CardOrderGoods> selectCardOrderGoodsList(CardOrderGoods cardOrderGoods);

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardOrderGoods 【请填写功能名称】
     * @return 结果
     */
    public int insertCardOrderGoods(CardOrderGoods cardOrderGoods);

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardOrderGoods 【请填写功能名称】
     * @return 结果
     */
    public int updateCardOrderGoods(CardOrderGoods cardOrderGoods);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCardOrderGoodsByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCardOrderGoodsById(String id);
}
