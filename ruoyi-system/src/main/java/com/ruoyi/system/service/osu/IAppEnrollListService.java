package com.ruoyi.system.service.osu;

import com.ruoyi.system.domain.osu.AppEnroll;
import com.ruoyi.system.domain.osu.AppEnrollList;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2021-05-31
 */
public interface IAppEnrollListService
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AppEnrollList selectAppEnrollById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param AppEnroll 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AppEnrollList> selectAppEnrollList(AppEnrollList appEnroll);

    /**
     * 新增【请填写功能名称】
     * 
     * @param AppEnroll 【请填写功能名称】
     * @return 结果
     */
    public int insertAppEnroll(AppEnrollList appEnroll);

    /**
     * 修改【请填写功能名称】
     * 
     * @param AppEnroll 【请填写功能名称】
     * @return 结果
     */
    public int updateAppEnroll(AppEnrollList appEnroll);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAppEnrollByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAppEnrollById(String id);

    public int changeStatus(AppEnrollList appEnroll);

}
