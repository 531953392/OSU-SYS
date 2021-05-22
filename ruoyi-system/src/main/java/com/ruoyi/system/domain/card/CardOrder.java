package com.ruoyi.system.domain.card;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 card_order
 * 
 * @author dxs
 * @date 2020-12-27
 */
public class CardOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String orderId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String discountId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String brandId;

    /** 折扣卡名称 */
    @Excel(name = "折扣卡名称")
    private String discountName;

    /** 品牌名 */
    @Excel(name = "品牌名")
    private String brandName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** 账户名 */
    @Excel(name = "账户名")
    private String userName;

    /** 真实姓名 */
    @Excel(name = "真实姓名")
    private String realName;

    /** 状态   0待支付 1待发货 2待补货 3有退款 4已发货 */
    @Excel(name = "状态   0待支付 1待发货 2待补货 3有退款 4已发货")
    private Long status;

    /** 商品总金额 */
    @Excel(name = "商品总金额")
    private BigDecimal goodsTotalAmount;

    /** 商品总数量 */
    @Excel(name = "商品总数量")
    private Long goodsTotalQuantity;

    /** 折扣 */
    @Excel(name = "折扣")
    private BigDecimal discount;

    /** 配送方式(10:邮箱/20:手机号) */
    @Excel(name = "配送方式(10:邮箱/20:手机号)")
    private Integer deliveryType;

    /** 配送信息 */
    @Excel(name = "配送信息")
    private String deliveryInfo;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private BigDecimal payAmount;

    /** 支付时间 */
    @Excel(name = "支付时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private Long payType;

    /** 支付系统跟踪号 */
    @Excel(name = "支付系统跟踪号")
    private String payTraceno;

    /** 货币(10:英镑/20:欧元) */
    @Excel(name = "货币(10:英镑/20:欧元)")
    private Integer currency;

    /** 汇率信息 */
    @Excel(name = "汇率信息")
    private String exchangeRateMsg;

    /** 当前汇率 */
    @Excel(name = "当前汇率")
    private String exchangeRate;

    /** 服务费(2%) */
    @Excel(name = "服务费(2%)")
    private String fee;

    /** 服务费 */
    @Excel(name = "服务费")
    private BigDecimal serviceFee;

    /** 最终支付金额 */
    @Excel(name = "最终支付金额")
    private BigDecimal lastPayAmount;

    /** 是否支付 */
    @Excel(name = "is_pay")
    private boolean isPay;

    /** 详细地址 */
    @Excel(name = "full_address")
    private String fullAddress;



    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }
    public void setDiscountId(String discountId) 
    {
        this.discountId = discountId;
    }

    public String getDiscountId() 
    {
        return discountId;
    }
    public void setBrandId(String brandId) 
    {
        this.brandId = brandId;
    }

    public String getBrandId() 
    {
        return brandId;
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
    public void setRealName(String realName) 
    {
        this.realName = realName;
    }

    public String getRealName() 
    {
        return realName;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setGoodsTotalAmount(BigDecimal goodsTotalAmount) 
    {
        this.goodsTotalAmount = goodsTotalAmount;
    }

    public BigDecimal getGoodsTotalAmount() 
    {
        return goodsTotalAmount;
    }
    public void setDiscount(BigDecimal discount) 
    {
        this.discount = discount;
    }

    public BigDecimal getDiscount() 
    {
        return discount;
    }
    public void setDeliveryType(Integer deliveryType) 
    {
        this.deliveryType = deliveryType;
    }

    public Integer getDeliveryType() 
    {
        return deliveryType;
    }
    public void setDeliveryInfo(String deliveryInfo) 
    {
        this.deliveryInfo = deliveryInfo;
    }

    public String getDeliveryInfo() 
    {
        return deliveryInfo;
    }
    public void setPayAmount(BigDecimal payAmount) 
    {
        this.payAmount = payAmount;
    }

    public BigDecimal getPayAmount() 
    {
        return payAmount;
    }
    public void setPayTime(Date payTime) 
    {
        this.payTime = payTime;
    }

    public Date getPayTime() 
    {
        return payTime;
    }
    public void setPayType(Long payType) 
    {
        this.payType = payType;
    }

    public Long getPayType() 
    {
        return payType;
    }
    public void setPayTraceno(String payTraceno) 
    {
        this.payTraceno = payTraceno;
    }

    public String getPayTraceno() 
    {
        return payTraceno;
    }
    public void setCurrency(Integer currency) 
    {
        this.currency = currency;
    }

    public Integer getCurrency() 
    {
        return currency;
    }
    public void setExchangeRateMsg(String exchangeRateMsg) 
    {
        this.exchangeRateMsg = exchangeRateMsg;
    }

    public String getExchangeRateMsg() 
    {
        return exchangeRateMsg;
    }
    public void setExchangeRate(String exchangeRate) 
    {
        this.exchangeRate = exchangeRate;
    }

    public String getExchangeRate() 
    {
        return exchangeRate;
    }
    public void setFee(String fee) 
    {
        this.fee = fee;
    }

    public String getFee() 
    {
        return fee;
    }
    public void setServiceFee(BigDecimal serviceFee) 
    {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getServiceFee() 
    {
        return serviceFee;
    }
    public void setLastPayAmount(BigDecimal lastPayAmount)
    {
        this.lastPayAmount = lastPayAmount;
    }

    public BigDecimal getLastPayAmount()
    {
        return lastPayAmount;
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

    public Long getGoodsTotalQuantity() {
        return goodsTotalQuantity;
    }

    public void setGoodsTotalQuantity(Long goodsTotalQuantity) {
        this.goodsTotalQuantity = goodsTotalQuantity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("discountId", getDiscountId())
            .append("brandId", getBrandId())
                .append("discountName", getDiscountName())
                .append("brandName", getBrandName())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("realName", getRealName())
            .append("status", getStatus())
            .append("goodsTotalAmount", getGoodsTotalAmount())
                .append("goodsTotalQuantity", getGoodsTotalQuantity())
            .append("discount", getDiscount())
            .append("deliveryType", getDeliveryType())
            .append("deliveryInfo", getDeliveryInfo())
            .append("payAmount", getPayAmount())
            .append("payTime", getPayTime())
            .append("payType", getPayType())
            .append("payTraceno", getPayTraceno())
            .append("currency", getCurrency())
            .append("exchangeRateMsg", getExchangeRateMsg())
            .append("exchangeRate", getExchangeRate())
            .append("fee", getFee())
            .append("serviceFee", getServiceFee())
            .append("lastPayAmount", getLastPayAmount())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
            .toString();
    }
}
