package com.ruoyi.system.mapper.osu;


import com.ruoyi.system.domain.osu.AppShop;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author dxs
 * @date 2021-06-22
 */
public interface AppShopMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AppShop selectAppShopById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param appShop 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AppShop> selectAppShopList(AppShop appShop);

    /**
     * 新增【请填写功能名称】
     * 
     * @param appShop 【请填写功能名称】
     * @return 结果
     */
    public int insertAppShop(AppShop appShop);

    /**
     * 修改【请填写功能名称】
     * 
     * @param appShop 【请填写功能名称】
     * @return 结果
     */
    public int updateAppShop(AppShop appShop);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAppShopById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAppShopByIds(String[] ids);
}
