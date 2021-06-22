package com.ruoyi.system.domain.osu;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 app_shop
 * 
 * @author dxs
 * @date 2021-06-22
 */
public class AppShop extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商家ID */
    private String id;

    /** 商家名字 */
    @Excel(name = "商家名字")
    private String name;

    /** 商家LOGO */
    @Excel(name = "商家LOGO")
    private String logo;

    /** 商家类型 */
    @Excel(name = "商家类型")
    private Long type;

    /** 商家地址 */
    @Excel(name = "商家地址")
    private String address;

    /** 商家介绍 */
    @Excel(name = "商家介绍")
    private String introduction;

    /** 营业时间 */
    @Excel(name = "营业时间")
    private String hours;

    /** 电话 */
    @Excel(name = "电话")
    private String telephone;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 商家图片1 */
    @Excel(name = "商家图片1")
    private String image1;

    /** 商家图片2 */
    @Excel(name = "商家图片2")
    private String image2;

    /** 商家图片3 */
    @Excel(name = "商家图片3")
    private String image3;

    /** 商家图片4 */
    @Excel(name = "商家图片4")
    private String image4;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setLogo(String logo) 
    {
        this.logo = logo;
    }

    public String getLogo() 
    {
        return logo;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setIntroduction(String introduction) 
    {
        this.introduction = introduction;
    }

    public String getIntroduction() 
    {
        return introduction;
    }
    public void setHours(String hours) 
    {
        this.hours = hours;
    }

    public String getHours() 
    {
        return hours;
    }
    public void setTelephone(String telephone) 
    {
        this.telephone = telephone;
    }

    public String getTelephone() 
    {
        return telephone;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setImage1(String image1) 
    {
        this.image1 = image1;
    }

    public String getImage1() 
    {
        return image1;
    }
    public void setImage2(String image2) 
    {
        this.image2 = image2;
    }

    public String getImage2() 
    {
        return image2;
    }
    public void setImage3(String image3) 
    {
        this.image3 = image3;
    }

    public String getImage3() 
    {
        return image3;
    }
    public void setImage4(String image4) 
    {
        this.image4 = image4;
    }

    public String getImage4() 
    {
        return image4;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("logo", getLogo())
            .append("type", getType())
            .append("address", getAddress())
            .append("introduction", getIntroduction())
            .append("hours", getHours())
            .append("telephone", getTelephone())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("sort", getSort())
            .append("image1", getImage1())
            .append("image2", getImage2())
            .append("image3", getImage3())
            .append("image4", getImage4())
            .toString();
    }
}
