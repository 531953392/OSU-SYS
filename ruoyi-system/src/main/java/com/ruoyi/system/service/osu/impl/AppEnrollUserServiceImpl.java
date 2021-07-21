package com.ruoyi.system.service.osu.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.sql.SnowflakeIdWorker;
import com.ruoyi.system.domain.osu.AppEnrollUser;
import com.ruoyi.system.mapper.osu.AppEnrollUserMapper;
import com.ruoyi.system.service.osu.IAppEnrollUserService;
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
public class AppEnrollUserServiceImpl implements IAppEnrollUserService
{
    @Autowired
    private AppEnrollUserMapper appEnrollMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AppEnrollUser selectAppEnrollById(String id)
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
    public List<AppEnrollUser> selectAppEnrollList(AppEnrollUser AppEnroll)
    {
        return appEnrollMapper.selectAppEnrollList(AppEnroll);
    }

}
