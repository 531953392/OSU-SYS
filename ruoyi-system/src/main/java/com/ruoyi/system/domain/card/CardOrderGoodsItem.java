package com.ruoyi.system.domain.card;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 card_order_goods_item
 * 
 * @author dxs
 * @date 2020-12-27
 */
public class CardOrderGoodsItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 订单id */
    @Excel(name = "订单id")
    private String orderId;

    /** 有效期  单位：月 */
    @Excel(name = "有效期  单位：月")
    private Long limitTime;

    /** 状态   10待发货 20已发货 -1已退款  */
    @Excel(name = "状态   10待发货 20已发货 -1已退款 ")
    private Long status;

    /** 面值 */
    @Excel(name = "面值")
    private BigDecimal facePrice;

    /** 单价 */
    @Excel(name = "单价")
    private BigDecimal price;

    /** 礼品卡文件路径 */
    @Excel(name = "礼品卡文件路径")
    private String discountPicture;

    /** 条形码路径 */
    @Excel(name = "条形码路径")
    private String barCode;

    /** 卡密 */
    @Excel(name = "卡密")
    private String cardCipher;

    /** 电子卡路径 */
    @Excel(name = "电子卡路径")
    private String ecardPath;

    /** 采购时间 */
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String procurementTime;

    /** 退款金额 */
    @Excel(name = "退款金额")
    private BigDecimal refundAmount;

    /** 汇率 */
    @Excel(name = "汇率")
    private String exchange;

    /** 发货时间 */
    @Excel(name = "发货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryTime;

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setOrderId(String orderId) 
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }

    public void setLimitTime(Long limitTime) 
    {
        this.limitTime = limitTime;
    }

    public Long getLimitTime() 
    {
        return limitTime;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setFacePrice(BigDecimal facePrice) 
    {
        this.facePrice = facePrice;
    }

    public BigDecimal getFacePrice() 
    {
        return facePrice;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setDiscountPicture(String discountPicture) 
    {
        this.discountPicture = discountPicture;
    }

    public String getDiscountPicture() 
    {
        return discountPicture;
    }
    public void setCardCipher(String cardCipher) 
    {
        this.cardCipher = cardCipher;
    }

    public String getCardCipher() 
    {
        return cardCipher;
    }
    public void setEcardPath(String ecardPath) 
    {
        this.ecardPath = ecardPath;
    }

    public String getEcardPath() 
    {
        return ecardPath;
    }
    public void setProcurementTime(String procurementTime)
    {
        this.procurementTime = procurementTime;
    }

    public String getProcurementTime()
    {
        return procurementTime;
    }
    public void setRefundAmount(BigDecimal refundAmount) 
    {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getRefundAmount() 
    {
        return refundAmount;
    }
    public void setExchange(String exchange) 
    {
        this.exchange = exchange;
    }

    public String getExchange() 
    {
        return exchange;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderId", getOrderId())
            .append("limitTime", getLimitTime())
            .append("status", getStatus())
            .append("facePrice", getFacePrice())
            .append("price", getPrice())
            .append("discountPicture", getDiscountPicture())
            .append("cardCipher", getCardCipher())
            .append("ecardPath", getEcardPath())
            .append("procurementTime", getProcurementTime())
            .append("refundAmount", getRefundAmount())
            .append("exchange", getExchange())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
