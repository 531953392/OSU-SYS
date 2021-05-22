package com.ruoyi.system.domain.card;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 card_discount
 * 
 * @author dxs
 * @date 2020-12-23
 */
public class CardDiscount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String discountId;

    /** 折扣卡名称 */
    @Excel(name = "折扣卡名称")
    private String discountName;

    /** 品牌名 */
    @Excel(name = "品牌名")
    private String brandName;

    /** 品牌id */
    @Excel(name = "品牌id")
    private String brandId;

    /** 面值 */
    @Excel(name = "面值")
    private BigDecimal facePrice;

    /** 有限期(按月份来算) */
    @Excel(name = "有限期(按月份来算)")
    private Long limitTime;

    /** 库存 */
    @Excel(name = "库存")
    private Long stock;

    /** 使用场景(1:线上,2:线下,3:线上&线下) */
    @Excel(name = "使用场景(1:线上,2:线下,3:线上&线下)")
    private Long usageType;

    /** 限制张数(单个用户) */
    @Excel(name = "限制张数(单个用户)")
    private Long limitCount;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 折扣卡图片 */
    @Excel(name = "折扣卡图片")
    private String discountPicture;

    /** 国家   10英国  20法国 */
    @Excel(name = "国家   10英国  20法国")
    private Long country;

    /** 折扣 */
    @Excel(name = "折扣")
    private String discount;



    public void setDiscountId(String discountId) 
    {
        this.discountId = discountId;
    }

    public String getDiscountId() 
    {
        return discountId;
    }
    public void setDiscountName(String discountName) 
    {
        this.discountName = discountName;
    }

    public String getDiscountName() 
    {
        return discountName;
    }
    public void setBrandName(String brandName) 
    {
        this.brandName = brandName;
    }

    public String getBrandName() 
    {
        return brandName;
    }
    public void setBrandId(String brandId) 
    {
        this.brandId = brandId;
    }

    public String getBrandId() 
    {
        return brandId;
    }
    public void setFacePrice(BigDecimal facePrice) 
    {
        this.facePrice = facePrice;
    }

    public BigDecimal getFacePrice() 
    {
        return facePrice;
    }
    public void setLimitTime(Long limitTime) 
    {
        this.limitTime = limitTime;
    }

    public Long getLimitTime() 
    {
        return limitTime;
    }
    public void setStock(Long stock) 
    {
        this.stock = stock;
    }

    public Long getStock() 
    {
        return stock;
    }
    public void setUsageType(Long usageType) 
    {
        this.usageType = usageType;
    }

    public Long getUsageType() 
    {
        return usageType;
    }
    public void setLimitCount(Long limitCount) 
    {
        this.limitCount = limitCount;
    }

    public Long getLimitCount() 
    {
        return limitCount;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setDiscountPicture(String discountPicture) 
    {
        this.discountPicture = discountPicture;
    }

    public String getDiscountPicture() 
    {
        return discountPicture;
    }
    public void setCountry(Long country)
    {
        this.country = country;
    }

    public Long getCountry()
    {
        return country;
    }
    public void setDiscount(String discount) 
    {
        this.discount = discount;
    }

    public String getDiscount() 
    {
        return discount;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("discountId", getDiscountId())
            .append("discountName", getDiscountName())
            .append("brandName", getBrandName())
            .append("brandId", getBrandId())
            .append("facePrice", getFacePrice())
            .append("limitTime", getLimitTime())
            .append("stock", getStock())
            .append("usageType", getUsageType())
            .append("limitCount", getLimitCount())
            .append("status", getStatus())
            .append("discountPicture", getDiscountPicture())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("country", getCountry())
            .append("discount", getDiscount())
            .toString();
    }
}
