package com.ruoyi.system.service.osu.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.sql.SnowflakeIdWorker;
import com.ruoyi.system.domain.osu.AppArticle;
import com.ruoyi.system.domain.osu.AppEnroll;
import com.ruoyi.system.mapper.osu.AppEnrollMapper;
import com.ruoyi.system.service.osu.IAppEnrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author dxs
 * @date 2021-05-31
 */
@Service
public class AppEnrollServiceImpl implements IAppEnrollService
{
    @Autowired
    private AppEnrollMapper appEnrollMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AppEnroll selectAppEnrollById(String id)
    {
        return appEnrollMapper.selectAppEnrollById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param AppEnroll 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AppEnroll> selectAppEnrollList(AppEnroll AppEnroll)
    {
        return appEnrollMapper.selectAppEnrollList(AppEnroll);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param AppEnroll 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAppEnroll(AppEnroll AppEnroll)
    {
        AppEnroll.setId(SnowflakeIdWorker.getUUID());
        AppEnroll.setCreateBy(ShiroUtils.getLoginName());
        AppEnroll.setCreateTime(DateUtils.getNowDate());
        return appEnrollMapper.insertAppEnroll(AppEnroll);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param AppEnroll 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAppEnroll(AppEnroll AppEnroll)
    {
        AppEnroll.setUpdateTime(DateUtils.getNowDate());
        return appEnrollMapper.updateAppEnroll(AppEnroll);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAppEnrollByIds(String ids)
    {
        return appEnrollMapper.deleteAppEnrollByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteAppEnrollById(String id)
    {
        return appEnrollMapper.deleteAppEnrollById(id);
    }

    @Override
    public int changeStatus(AppEnroll appEnroll) {
        return appEnrollMapper.updateAppEnroll(appEnroll);
    }
}
