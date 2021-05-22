package com.ruoyi.system.mapper.card;

import com.ruoyi.system.domain.card.CardBrand;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
public interface CardBrandMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param brandId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public CardBrand selectCardBrandById(String brandId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cardBrand 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CardBrand> selectCardBrandList(CardBrand cardBrand);

    /**
     * 新增【请填写功能名称】
     * 
     * @param cardBrand 【请填写功能名称】
     * @return 结果
     */
    public int insertCardBrand(CardBrand cardBrand);

    /**
     * 修改【请填写功能名称】
     * 
     * @param cardBrand 【请填写功能名称】
     * @return 结果
     */
    public int updateCardBrand(CardBrand cardBrand);

    /**
     * 删除【请填写功能名称】
     * 
     * @param brandId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCardBrandById(Long brandId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param brandIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCardBrandByIds(String[] brandIds);
}
