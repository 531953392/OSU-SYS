package com.ruoyi.system.service.osu.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.osu.AppInfoGroup;
import com.ruoyi.system.mapper.osu.AppInfoGroupMapper;
import com.ruoyi.system.service.osu.IAppInfoGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author dxs
 * @date 2021-05-25
 */
@Service
public class AppInfoGroupServiceImpl implements IAppInfoGroupService
{
    @Autowired
    private AppInfoGroupMapper appInfoGroupMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param infoId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AppInfoGroup selectAppInfoGroupById(String infoId)
    {
        return appInfoGroupMapper.selectAppInfoGroupById(infoId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appInfoGroup 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AppInfoGroup> selectAppInfoGroupList(AppInfoGroup appInfoGroup)
    {
        return appInfoGroupMapper.selectAppInfoGroupList(appInfoGroup);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param appInfoGroup 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAppInfoGroup(AppInfoGroup appInfoGroup)
    {
        appInfoGroup.setCreateTime(DateUtils.getNowDate());
        return appInfoGroupMapper.insertAppInfoGroup(appInfoGroup);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param appInfoGroup 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAppInfoGroup(AppInfoGroup appInfoGroup)
    {
        appInfoGroup.setUpdateTime(DateUtils.getNowDate());
        return appInfoGroupMapper.updateAppInfoGroup(appInfoGroup);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAppInfoGroupByIds(String ids)
    {
        return appInfoGroupMapper.deleteAppInfoGroupByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param infoId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteAppInfoGroupById(String infoId)
    {
        return appInfoGroupMapper.deleteAppInfoGroupById(infoId);
    }

    @Override
    public int changeStatus(AppInfoGroup appInfoGroup) {
        return appInfoGroupMapper.updateAppInfoGroup(appInfoGroup);
    }
}
