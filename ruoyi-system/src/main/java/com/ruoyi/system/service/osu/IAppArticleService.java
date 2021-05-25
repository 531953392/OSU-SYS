package com.ruoyi.system.service.osu;

import java.util.List;

import com.ruoyi.system.domain.card.CardBrand;
import com.ruoyi.system.domain.osu.AppArticle;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2021-05-23
 */
public interface IAppArticleService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param articleId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AppArticle selectAppArticleById(Long articleId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appArticle 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AppArticle> selectAppArticleList(AppArticle appArticle);

    /**
     * 新增【请填写功能名称】
     * 
     * @param appArticle 【请填写功能名称】
     * @return 结果
     */
    public int insertAppArticle(AppArticle appArticle);

    /**
     * 修改【请填写功能名称】
     * 
     * @param appArticle 【请填写功能名称】
     * @return 结果
     */
    public int updateAppArticle(AppArticle appArticle);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAppArticleByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param articleId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAppArticleById(Long articleId);

    public int changeStatus(AppArticle appArticle);
}
