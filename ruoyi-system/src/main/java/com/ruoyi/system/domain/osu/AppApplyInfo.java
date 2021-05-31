package com.ruoyi.system.osu.domain;

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

    /** 姓名 */
    @Excel(name = "姓名")
    private String realName;

    /** 微信号 */
    @Excel(name = "微信号")
    private String wechat;

    /** 年纪 */
    @Excel(name = "年纪")
    private Long grade;

    /** 专业 */
    @Excel(name = "专业")
    private String major;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String mailAddress;

    /** 第一志愿 */
    @Excel(name = "第一志愿")
    private Long firstChoice;

    /** 第二志愿 */
    @Excel(name = "第二志愿")
    private String secondChoice;

    /** 你能为CSSS带来什么？ */
    @Excel(name = "你能为CSSS带来什么？")
    private String csssText1;

    /** 你是否参加过社团活动？扮演什么样的角色？（参与 策划 等等 */
    @Excel(name = "你是否参加过社团活动？扮演什么样的角色？", readConverterExp = "你是否参加过社团活动？扮演什么样的角色？（参与 策划 等等")
    private String csssText2;

    /** 请描述一下你心中的CSSS */
    @Excel(name = "请描述一下你心中的CSSS")
    private String csssText3;

    /** 你希望从CSSS中获得什么？ */
    @Excel(name = "你希望从CSSS中获得什么？")
    private String csssText4;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

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
    public void setRealName(String realName) 
    {
        this.realName = realName;
    }

    public String getRealName() 
    {
        return realName;
    }
    public void setWechat(String wechat) 
    {
        this.wechat = wechat;
    }

    public String getWechat() 
    {
        return wechat;
    }
    public void setGrade(Long grade) 
    {
        this.grade = grade;
    }

    public Long getGrade() 
    {
        return grade;
    }
    public void setMajor(String major) 
    {
        this.major = major;
    }

    public String getMajor() 
    {
        return major;
    }
    public void setMailAddress(String mailAddress) 
    {
        this.mailAddress = mailAddress;
    }

    public String getMailAddress() 
    {
        return mailAddress;
    }
    public void setFirstChoice(Long firstChoice) 
    {
        this.firstChoice = firstChoice;
    }

    public Long getFirstChoice() 
    {
        return firstChoice;
    }
    public void setSecondChoice(String secondChoice) 
    {
        this.secondChoice = secondChoice;
    }

    public String getSecondChoice() 
    {
        return secondChoice;
    }
    public void setCsssText1(String csssText1) 
    {
        this.csssText1 = csssText1;
    }

    public String getCsssText1() 
    {
        return csssText1;
    }
    public void setCsssText2(String csssText2) 
    {
        this.csssText2 = csssText2;
    }

    public String getCsssText2() 
    {
        return csssText2;
    }
    public void setCsssText3(String csssText3) 
    {
        this.csssText3 = csssText3;
    }

    public String getCsssText3() 
    {
        return csssText3;
    }
    public void setCsssText4(String csssText4) 
    {
        this.csssText4 = csssText4;
    }

    public String getCsssText4() 
    {
        return csssText4;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("userNickName", getUserNickName())
            .append("userAvatarUrl", getUserAvatarUrl())
            .append("realName", getRealName())
            .append("wechat", getWechat())
            .append("grade", getGrade())
            .append("major", getMajor())
            .append("mailAddress", getMailAddress())
            .append("firstChoice", getFirstChoice())
            .append("secondChoice", getSecondChoice())
            .append("csssText1", getCsssText1())
            .append("csssText2", getCsssText2())
            .append("csssText3", getCsssText3())
            .append("csssText4", getCsssText4())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("status", getStatus())
            .toString();
    }
}
