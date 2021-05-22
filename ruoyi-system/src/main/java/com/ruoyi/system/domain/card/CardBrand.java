package com.ruoyi.system.domain.card;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 【请填写功能名称】对象 card_brand
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
public class CardBrand extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private String brandId;

    private String brandName;

    private String websiteUrl;

    private Long country;

    private Long category;

    private Long sort;

    private String discount;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    private String brandLogo;

    private String brandIntroduce;

    /** 使用说明 */
    @Excel(name = "使用说明")
    private String instructions;

    public void setInstructions(String instructions)
    {
        this.instructions = instructions;
    }

    public String getInstructions()
    {
        return instructions;
    }

    public void setBrandId(String brandId)
    {
        this.brandId = brandId;
    }

    public String getBrandId()
    {
        return brandId;
    }
    public void setBrandName(String brandName) 
    {
        this.brandName = brandName;
    }

    @NotBlank(message = "品牌名不能为空")
    @Size(min = 0, max = 50, message = "品牌名不能超过50个字符")
    public String getBrandName() 
    {
        return brandName;
    }
    public void setWebsiteUrl(String websiteUrl) 
    {
        this.websiteUrl = websiteUrl;
    }

    public String getWebsiteUrl() 
    {
        return websiteUrl;
    }
    public void setCountry(Long country) 
    {
        this.country = country;
    }

    public Long getCountry() 
    {
        return country;
    }
    public void setCategory(Long category) 
    {
        this.category = category;
    }

    public Long getCategory() 
    {
        return category;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setDiscount(String discount) 
    {
        this.discount = discount;
    }

    public String getDiscount() 
    {
        return discount;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setBrandLogo(String brandLogo) 
    {
        this.brandLogo = brandLogo;
    }

    public String getBrandLogo() 
    {
        return brandLogo;
    }
    public void setBrandIntroduce(String brandIntroduce) 
    {
        this.brandIntroduce = brandIntroduce;
    }

    public String getBrandIntroduce() 
    {
        return brandIntroduce;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("brandId", getBrandId())
            .append("brandName", getBrandName())
            .append("websiteUrl", getWebsiteUrl())
            .append("country", getCountry())
            .append("category", getCategory())
            .append("sort", getSort())
            .append("discount", getDiscount())
            .append("status", getStatus())
            .append("brandLogo", getBrandLogo())
            .append("brandIntroduce", getBrandIntroduce())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
                .append("instructions", getInstructions())


                .toString();
    }
}
