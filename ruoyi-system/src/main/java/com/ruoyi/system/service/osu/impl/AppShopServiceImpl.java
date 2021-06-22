package com.ruoyi.system.service.osu.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.sql.SnowflakeIdWorker;
import com.ruoyi.system.domain.osu.AppShop;
import com.ruoyi.system.mapper.osu.AppShopMapper;
import com.ruoyi.system.service.osu.IAppShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author dxs
 * @date 2021-06-22
 */
@Service
public class AppShopServiceImpl implements IAppShopService
{
    @Autowired
    private AppShopMapper appShopMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AppShop selectAppShopById(String id)
    {
        return appShopMapper.selectAppShopById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param appShop 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AppShop> selectAppShopList(AppShop appShop)
    {
        return appShopMapper.selectAppShopList(appShop);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param appShop 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAppShop(AppShop appShop)
    {
        appShop.setId(SnowflakeIdWorker.getUUID());
        appShop.setCreateBy(ShiroUtils.getLoginName());
        appShop.setCreateTime(DateUtils.getNowDate());
        return appShopMapper.insertAppShop(appShop);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param appShop 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAppShop(AppShop appShop)
    {
        appShop.setUpdateTime(DateUtils.getNowDate());
        return appShopMapper.updateAppShop(appShop);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAppShopByIds(String ids)
    {
        return appShopMapper.deleteAppShopByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteAppShopById(String id)
    {
        return appShopMapper.deleteAppShopById(id);
    }
}
