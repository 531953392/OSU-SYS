package com.ruoyi.system.service.osu.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.sql.SnowflakeIdWorker;
import com.ruoyi.system.domain.osu.AppArticle;
import com.ruoyi.system.mapper.osu.AppArticleMapper;
import com.ruoyi.system.service.osu.IAppArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author dxs
 * @date 2021-05-23
 */
@Service
public class AppArticleServiceImpl implements IAppArticleService
{
    @Autowired
    private AppArticleMapper appArticleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param articleId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AppArticle selectAppArticleById(Long articleId)
    {
        return appArticleMapper.selectAppArticleById(articleId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appArticle 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AppArticle> selectAppArticleList(AppArticle appArticle)
    {
        return appArticleMapper.selectAppArticleList(appArticle);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param appArticle 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAppArticle(AppArticle appArticle)
    {
        appArticle.setArticleId(SnowflakeIdWorker.getUUID());
        appArticle.setCreateBy(ShiroUtils.getLoginName());
        appArticle.setCreateTime(DateUtils.getNowDate());
        return appArticleMapper.insertAppArticle(appArticle);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param appArticle 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAppArticle(AppArticle appArticle)
    {
        appArticle.setUpdateTime(DateUtils.getNowDate());
        appArticle.setUpdateBy(ShiroUtils.getLoginName());
        return appArticleMapper.updateAppArticle(appArticle);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAppArticleByIds(String ids)
    {
        return appArticleMapper.deleteAppArticleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param articleId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteAppArticleById(Long articleId)
    {
        return appArticleMapper.deleteAppArticleById(articleId);
    }
}
