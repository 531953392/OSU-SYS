package com.ruoyi.system.service.card.impl;

import java.util.List;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.sql.SnowflakeIdWorker;
import com.ruoyi.system.domain.card.CardBrand;
import com.ruoyi.system.mapper.card.CardBrandMapper;
import com.ruoyi.system.service.card.ICardBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
@Service
public class CardBrandServiceImpl implements ICardBrandService
{
    @Autowired
    private CardBrandMapper cardBrandMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param brandId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public CardBrand selectCardBrandById(String brandId)
    {
        return cardBrandMapper.selectCardBrandById(brandId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardBrand 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CardBrand> selectCardBrandList(CardBrand cardBrand)
    {
        return cardBrandMapper.selectCardBrandList(cardBrand);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardBrand 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCardBrand(CardBrand cardBrand)
    {
        cardBrand.setBrandId(SnowflakeIdWorker.getUUID());
        cardBrand.setCreateBy(ShiroUtils.getLoginName());
        cardBrand.setCreateTime(DateUtils.getNowDate());
        return cardBrandMapper.insertCardBrand(cardBrand);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardBrand 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCardBrand(CardBrand cardBrand)
    {
        cardBrand.setUpdateTime(DateUtils.getNowDate());
        cardBrand.setUpdateBy(ShiroUtils.getLoginName());
        return cardBrandMapper.updateCardBrand(cardBrand);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCardBrandByIds(String ids)
    {
        return cardBrandMapper.deleteCardBrandByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param brandId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCardBrandById(Long brandId)
    {
        return cardBrandMapper.deleteCardBrandById(brandId);
    }

    /**
     * 品牌状态修改
     *
     * @param cardBrand 品牌信息
     * @return 结果
     */
    @Override
    public int changeStatus(CardBrand cardBrand)
    {
        return cardBrandMapper.updateCardBrand(cardBrand);
    }
}
