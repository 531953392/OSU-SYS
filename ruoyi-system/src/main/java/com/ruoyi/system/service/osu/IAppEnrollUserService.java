package com.ruoyi.system.service.osu;

import com.ruoyi.system.domain.osu.AppEnrollUser;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2021-05-31
 */
public interface IAppEnrollUserService
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AppEnrollUser selectAppEnrollById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param AppEnroll 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AppEnrollUser> selectAppEnrollList(AppEnrollUser appEnroll);


}
