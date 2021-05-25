package com.ruoyi.system.service.osu;

import com.ruoyi.system.domain.osu.AppArticle;
import com.ruoyi.system.domain.osu.AppInfoGroup;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dxs
 * @date 2021-05-25
 */
public interface IAppInfoGroupService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param infoId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AppInfoGroup selectAppInfoGroupById(String infoId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appInfoGroup 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AppInfoGroup> selectAppInfoGroupList(AppInfoGroup appInfoGroup);

    /**
     * 新增【请填写功能名称】
     * 
     * @param appInfoGroup 【请填写功能名称】
     * @return 结果
     */
    public int insertAppInfoGroup(AppInfoGroup appInfoGroup);

    /**
     * 修改【请填写功能名称】
     * 
     * @param appInfoGroup 【请填写功能名称】
     * @return 结果
     */
    public int updateAppInfoGroup(AppInfoGroup appInfoGroup);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAppInfoGroupByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param infoId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAppInfoGroupById(String infoId);

    public int changeStatus(AppInfoGroup appInfoGroup);
}
