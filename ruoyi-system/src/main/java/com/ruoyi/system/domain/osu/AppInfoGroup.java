package com.ruoyi.system.domain.osu;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 app_info_group
 * 
 * @author dxs
 * @date 2021-05-25
 */
public class AppInfoGroup extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 情报站ID */
    private String id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private String userId;

    /** 情报站类型 */
    @Excel(name = "情报站类型")
    private Long infoType;

    /** 情报站内容 */
    @Excel(name = "情报站内容")
    private String infoContent;

    /** 状态 */
    @Excel(name = "状态" ,readConverterExp = "0=正常,1=关闭")
    private String status;

    /** 审核状态 */
    @Excel(name = "审核状态", readConverterExp = "10=待审核,20=审核通过,30=审核失败")
    private int auditType;


    /** 上传图片1 */
    @Excel(name = "上传图片1")
    private String imageUrl1;

    /** 上传图片2 */
    @Excel(name = "上传图片2")
    private String imageUrl2;

    /** 上传图片3 */
    @Excel(name = "上传图片3")
    private String imageUrl3;

    /** 上传图片3 */
    @Excel(name = "上传图片4")
    private String imageUrl4;

    /** 上传图片3 */
    @Excel(name = "用户账号")
    private String userName;

    /** 上传图片3 */
    @Excel(name = "用户昵称")
    private String userNickName;


    /** 上传图片3 */
    @Excel(name = "用户头像")
    private String userAvatarUrl;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId()
    {
        return userId;
    }
    public void setInfoType(Long infoType) 
    {
        this.infoType = infoType;
    }

    public Long getInfoType() 
    {
        return infoType;
    }
    public void setInfoContent(String infoContent) 
    {
        this.infoContent = infoContent;
    }

    public String getInfoContent() 
    {
        return infoContent;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setImageUrl1(String imageUrl1) 
    {
        this.imageUrl1 = imageUrl1;
    }

    public String getImageUrl1() 
    {
        return imageUrl1;
    }
    public void setImageUrl2(String imageUrl2) 
    {
        this.imageUrl2 = imageUrl2;
    }

    public String getImageUrl2() 
    {
        return imageUrl2;
    }
    public void setImageUrl3(String imageUrl3) 
    {
        this.imageUrl3 = imageUrl3;
    }

    public String getImageUrl3() 
    {
        return imageUrl3;
    }

    public String getImageUrl4() {
        return imageUrl4;
    }

    public void setImageUrl4(String imageUrl4) {
        this.imageUrl4 = imageUrl4;
    }

    public int getAuditType() {
        return auditType;
    }

    public void setAuditType(int auditType) {
        this.auditType = auditType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("infoType", getInfoType())
            .append("infoContent", getInfoContent())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("imageUrl1", getImageUrl1())
            .append("imageUrl2", getImageUrl2())
            .append("imageUrl3", getImageUrl3())
                .append("imageUrl4", getImageUrl4())
                .append("userName", getUserName())
                .append("userNickName", getUserNickName())
                .append("userAvatarUrl", getUserAvatarUrl())
                .append("auditType", getAuditType())

            .toString();
    }
}
