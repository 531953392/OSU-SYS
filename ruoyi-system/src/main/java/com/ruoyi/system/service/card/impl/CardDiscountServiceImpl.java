package com.ruoyi.system.service.card.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.sql.SnowflakeIdWorker;
import com.ruoyi.system.domain.card.CardBrand;
import com.ruoyi.system.domain.card.CardDiscount;
import com.ruoyi.system.mapper.card.CardDiscountMapper;
import com.ruoyi.system.service.card.ICardDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author dxs
 * @date 2020-12-23
 */
@Service
public class CardDiscountServiceImpl implements ICardDiscountService
{
    @Autowired
    private CardDiscountMapper cardDiscountMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param discountId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public CardDiscount selectCardDiscountById(String discountId)
    {
        return cardDiscountMapper.selectCardDiscountById(discountId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardDiscount 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CardDiscount> selectCardDiscountList(CardDiscount cardDiscount)
    {
        return cardDiscountMapper.selectCardDiscountList(cardDiscount);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardDiscount 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCardDiscount(CardDiscount cardDiscount)
    {
        cardDiscount.setDiscountId(SnowflakeIdWorker.getUUID());
        cardDiscount.setCreateBy(ShiroUtils.getLoginName());
        cardDiscount.setCreateTime(DateUtils.getNowDate());
        return cardDiscountMapper.insertCardDiscount(cardDiscount);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardDiscount 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCardDiscount(CardDiscount cardDiscount)
    {
        cardDiscount.setUpdateTime(DateUtils.getNowDate());
        cardDiscount.setUpdateBy(ShiroUtils.getLoginName());
        return cardDiscountMapper.updateCardDiscount(cardDiscount);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCardDiscountByIds(String ids)
    {
        return cardDiscountMapper.deleteCardDiscountByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param discountId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCardDiscountById(String discountId)
    {
        return cardDiscountMapper.deleteCardDiscountById(discountId);
    }

    /**
     * 状态修改
     *
     * @param cardDiscount
     * @return 结果
     */
    @Override
    public int changeStatus(CardDiscount cardDiscount)
    {
        return cardDiscountMapper.updateCardDiscount(cardDiscount);
    }
}
