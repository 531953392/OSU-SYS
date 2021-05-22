package com.ruoyi.system.domain.card;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 card_order_pay
 * 
 * @author dxs
 * @date 2020-12-27
 */
public class CardOrderPay extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orderId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** (-10:已取消,10:待支付,20:完成) */
    @Excel(name = "(-10:已取消,10:待支付,20:完成)")
    private Long payType;

    /** $column.columnComment */
    @Excel(name = "(-10:已取消,10:待支付,20:完成)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /** $column.columnComment */
    @Excel(name = "(-10:已取消,10:待支付,20:完成)")
    private Long amount;

    /** 系统跟踪号 */
    @Excel(name = "系统跟踪号")
    private String traceNo;

    /** 商户订单号 */
    @Excel(name = "商户订单号")
    private String merOrderId;

    /** 商品标题 */
    @Excel(name = "商品标题")
    private String subject;

    /** 商品描述 */
    @Excel(name = "商品描述")
    private String body;

    /** 商户号 */
    @Excel(name = "商户号")
    private String merId;

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
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setPayType(Long payType) 
    {
        this.payType = payType;
    }

    public Long getPayType() 
    {
        return payType;
    }
    public void setPayTime(Date payTime) 
    {
        this.payTime = payTime;
    }

    public Date getPayTime() 
    {
        return payTime;
    }
    public void setAmount(Long amount) 
    {
        this.amount = amount;
    }

    public Long getAmount() 
    {
        return amount;
    }
    public void setTraceNo(String traceNo) 
    {
        this.traceNo = traceNo;
    }

    public String getTraceNo() 
    {
        return traceNo;
    }
    public void setMerOrderId(String merOrderId) 
    {
        this.merOrderId = merOrderId;
    }

    public String getMerOrderId() 
    {
        return merOrderId;
    }
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }
    public void setBody(String body) 
    {
        this.body = body;
    }

    public String getBody() 
    {
        return body;
    }
    public void setMerId(String merId) 
    {
        this.merId = merId;
    }

    public String getMerId() 
    {
        return merId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderId", getOrderId())
            .append("userId", getUserId())
            .append("payType", getPayType())
            .append("payTime", getPayTime())
            .append("amount", getAmount())
            .append("traceNo", getTraceNo())
            .append("merOrderId", getMerOrderId())
            .append("subject", getSubject())
            .append("body", getBody())
            .append("merId", getMerId())
            .toString();
    }
}
