package com.ruoyi.system.service.osu;

import com.ruoyi.system.domain.osu.AppUser;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2021-05-25
 */
public interface IAppUserService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AppUser selectAppUserById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appUser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AppUser> selectAppUserList(AppUser appUser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param appUser 【请填写功能名称】
     * @return 结果
     */
    public int insertAppUser(AppUser appUser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param appUser 【请填写功能名称】
     * @return 结果
     */
    public int updateAppUser(AppUser appUser);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAppUserByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAppUserById(String id);

    public int changeStatus(AppUser appUser);
}
