package com.ruoyi.system.domain.osu;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 app_apply_info
 * 
 * @author dxs
 * @date 2021-05-31
 */
public class AppEnroll extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 题目ID */
    private String id;

    /** 题目ListID */
    private String enroll_id;

    /** 题目名字 */
    private String enroll_title;

    /** 题目问题 */
    private String problem;

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

    public String getEnroll_id() {
        return enroll_id;
    }

    public void setEnroll_id(String enroll_id) {
        this.enroll_id = enroll_id;
    }

    public String getEnroll_title() {
        return enroll_title;
    }

    public void setEnroll_title(String enroll_title) {
        this.enroll_title = enroll_title;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
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
