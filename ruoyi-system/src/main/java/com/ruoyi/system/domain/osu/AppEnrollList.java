package com.ruoyi.system.domain.osu;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 app_apply_info
 * 
 * @author dxs
 * @date 2021-05-31
 */
public class AppEnrollList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 题目ID */
    private String id;

    /** 题目标题 */
    private String title;

    /** 排序 */
    private String sort;

    /** 状态 */
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
