package com.ruoyi.system.service.card;


import com.ruoyi.system.domain.card.CardBrand;

import java.util.List;


/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
public interface ICardBrandService 
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
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCardBrandByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param brandId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCardBrandById(Long brandId);

    /**
     * 品牌状态修改
     *
     * @param cardBrand 品牌信息
     * @return 结果
     */
    public int changeStatus(CardBrand cardBrand);
}
