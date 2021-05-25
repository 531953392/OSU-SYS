package com.ruoyi.system.service.osu.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.osu.AppUser;
import com.ruoyi.system.mapper.osu.AppUserMapper;
import com.ruoyi.system.service.osu.IAppUserService;
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
public class AppUserServiceImpl implements IAppUserService
{
    @Autowired
    private AppUserMapper appUserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AppUser selectAppUserById(String id)
    {
        return appUserMapper.selectAppUserById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AppUser> selectAppUserList(AppUser appUser)
    {
        return appUserMapper.selectAppUserList(appUser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param appUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAppUser(AppUser appUser)
    {
        appUser.setCreateTime(DateUtils.getNowDate());
        return appUserMapper.insertAppUser(appUser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param appUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAppUser(AppUser appUser)
    {
        return appUserMapper.updateAppUser(appUser);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAppUserByIds(String ids)
    {
        return appUserMapper.deleteAppUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteAppUserById(String id)
    {
        return appUserMapper.deleteAppUserById(id);
    }

    @Override
    public int changeStatus(AppUser appUser)
    {
        return appUserMapper.updateAppUser(appUser);
    }
}
