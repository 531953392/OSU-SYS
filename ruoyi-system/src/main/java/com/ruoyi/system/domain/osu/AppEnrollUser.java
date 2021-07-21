package com.ruoyi.system.domain.osu;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 app_apply_info
 * 
 * @author dxs
 * @date 2021-05-31
 */
public class AppEnrollUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private String id;
    private String user_id;
    private String enroll_id;
    private String enroll_title;
    private String enroll_value;
    private String create_time;
    private String user_name;
    private String user_nick_name;
    private String user_avatar_url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public String getEnroll_value() {
        return enroll_value;
    }

    public void setEnroll_value(String enroll_value) {
        this.enroll_value = enroll_value;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_nick_name() {
        return user_nick_name;
    }

    public void setUser_nick_name(String user_nick_name) {
        this.user_nick_name = user_nick_name;
    }

    public String getUser_avatar_url() {
        return user_avatar_url;
    }

    public void setUser_avatar_url(String user_avatar_url) {
        this.user_avatar_url = user_avatar_url;
    }
}
