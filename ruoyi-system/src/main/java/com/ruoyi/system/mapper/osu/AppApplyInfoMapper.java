package com.ruoyi.system.osu.mapper;

import java.util.List;
import com.ruoyi.system.osu.domain.AppApplyInfo;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author dxs
 * @date 2021-05-31
 */
public interface AppApplyInfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AppApplyInfo selectAppApplyInfoById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appApplyInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AppApplyInfo> selectAppApplyInfoList(AppApplyInfo appApplyInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param appApplyInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertAppApplyInfo(AppApplyInfo appApplyInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param appApplyInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateAppApplyInfo(AppApplyInfo appApplyInfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAppApplyInfoById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAppApplyInfoByIds(String[] ids);
}
