package com.ruoyi.system.osu.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.osu.mapper.AppApplyInfoMapper;
import com.ruoyi.system.osu.domain.AppApplyInfo;
import com.ruoyi.system.osu.service.IAppApplyInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author dxs
 * @date 2021-05-31
 */
@Service
public class AppApplyInfoServiceImpl implements IAppApplyInfoService 
{
    @Autowired
    private AppApplyInfoMapper appApplyInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AppApplyInfo selectAppApplyInfoById(String id)
    {
        return appApplyInfoMapper.selectAppApplyInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appApplyInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AppApplyInfo> selectAppApplyInfoList(AppApplyInfo appApplyInfo)
    {
        return appApplyInfoMapper.selectAppApplyInfoList(appApplyInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param appApplyInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAppApplyInfo(AppApplyInfo appApplyInfo)
    {
        appApplyInfo.setCreateTime(DateUtils.getNowDate());
        return appApplyInfoMapper.insertAppApplyInfo(appApplyInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param appApplyInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAppApplyInfo(AppApplyInfo appApplyInfo)
    {
        appApplyInfo.setUpdateTime(DateUtils.getNowDate());
        return appApplyInfoMapper.updateAppApplyInfo(appApplyInfo);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAppApplyInfoByIds(String ids)
    {
        return appApplyInfoMapper.deleteAppApplyInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteAppApplyInfoById(String id)
    {
        return appApplyInfoMapper.deleteAppApplyInfoById(id);
    }
}
