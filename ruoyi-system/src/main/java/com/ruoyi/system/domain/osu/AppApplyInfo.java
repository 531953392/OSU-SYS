package com.ruoyi.system.domain.osu;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 app_apply_info
 * 
 * @author dxs
 * @date 2021-05-31
 */
public class AppApplyInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 报名ID */
    private String id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private String userId;

    /** 手机号 */
    @Excel(name = "手机号")
    private String userName;

    /** 微信昵称 */
    @Excel(name = "微信昵称")
    private String userNickName;

    /** 微信头像 */
    @Excel(name = "微信头像")
    private String userAvatarUrl;

    @Excel(name = "备注")
    private String remark;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

//    /** 状态 */
//    @Excel(name = "状态")
//    private String status;
//    /** 状态 */
//    @Excel(name = "状态")
//    private String status;
//    /** 状态 */
//    @Excel(name = "状态")
//    private String status;
//    /** 状态 */
//    @Excel(name = "状态")
//    private String status;
//    /** 状态 */
//    @Excel(name = "状态")
//    private String status;
//    /** 状态 */
//    @Excel(name = "状态")
//    private String status;
//    /** 状态 */
//    @Excel(name = "状态")
//    private String status;
//    /** 状态 */
//    @Excel(name = "状态")
//    private String status;
//
//    enroll1

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserNickName(String userNickName) 
    {
        this.userNickName = userNickName;
    }

    public String getUserNickName() 
    {
        return userNickName;
    }
    public void setUserAvatarUrl(String userAvatarUrl) 
    {
        this.userAvatarUrl = userAvatarUrl;
    }

    public String getUserAvatarUrl() 
    {
        return userAvatarUrl;
    }


    public String getStatus() 
    {
        return status;
    }

}
