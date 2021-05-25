package com.ruoyi.system.domain.osu;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 app_user
 * 
 * @author dxs
 * @date 2021-05-25
 */
public class AppUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 小程序用户的openid */
    @Excel(name = "小程序用户的openid")
    private String openid;

    /** 昵称 */
    @Excel(name = "昵称")
    private String nickName;

    /** 用户头像 */
    @Excel(name = "用户头像")
    private String avatarUrl;

    /** 性别  0-男、1-女 */
    @Excel(name = "性别  0-男、1-女")
    private Long gender;

    /** 国家 */
    @Excel(name = "国家")
    private String country;

    /** 省份 */
    @Excel(name = "省份")
    private String province;

    /** 城市 */
    @Excel(name = "城市")
    private String city;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String mobile;

    /** 会话密钥 */
    @Excel(name = "会话密钥")
    private String sessionKey;

    /** 上次访问日期 */
    @Excel(name = "上次访问日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastvisitTime;

    /** 0启用 1禁用 */
    @Excel(name = "0启用 1禁用")
    private Long status;

    /** 用户类型 0-用户、1-医生 */
    @Excel(name = "用户类型 0-用户、1-医生")
    private Long userType;

    /** 用户名-手机号 */
    @Excel(name = "用户名-手机号")
    private String userName;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setOpenid(String openid) 
    {
        this.openid = openid;
    }

    public String getOpenid() 
    {
        return openid;
    }
    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }
    public void setAvatarUrl(String avatarUrl) 
    {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() 
    {
        return avatarUrl;
    }
    public void setGender(Long gender) 
    {
        this.gender = gender;
    }

    public Long getGender() 
    {
        return gender;
    }
    public void setCountry(String country) 
    {
        this.country = country;
    }

    public String getCountry() 
    {
        return country;
    }
    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setSessionKey(String sessionKey) 
    {
        this.sessionKey = sessionKey;
    }

    public String getSessionKey() 
    {
        return sessionKey;
    }
    public void setLastvisitTime(Date lastvisitTime) 
    {
        this.lastvisitTime = lastvisitTime;
    }

    public Date getLastvisitTime() 
    {
        return lastvisitTime;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setUserType(Long userType) 
    {
        this.userType = userType;
    }

    public Long getUserType() 
    {
        return userType;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("openid", getOpenid())
            .append("nickName", getNickName())
            .append("avatarUrl", getAvatarUrl())
            .append("gender", getGender())
            .append("country", getCountry())
            .append("province", getProvince())
            .append("city", getCity())
            .append("mobile", getMobile())
            .append("createTime", getCreateTime())
            .append("sessionKey", getSessionKey())
            .append("lastvisitTime", getLastvisitTime())
            .append("status", getStatus())
            .append("userType", getUserType())
            .append("userName", getUserName())
            .toString();
    }
}
