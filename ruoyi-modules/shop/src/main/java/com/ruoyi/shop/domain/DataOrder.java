package com.ruoyi.shop.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_order
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单id */
    private Long orderId;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNo;

    /** 商品总金额 */
    @Excel(name = "商品总金额")
    private BigDecimal totalPrice;

    /** 订单实付款金额 */
    @Excel(name = "订单实付款金额")
    private BigDecimal payPrice;

    /** 付款状态(10未付款 20已付款) */
    @Excel(name = "付款状态(10未付款 20已付款)")
    private Integer payStatus;

    /** 付款时间 */
    @Excel(name = "付款时间")
    private Long payTime;

    /** 运费金额 */
    @Excel(name = "运费金额")
    private BigDecimal expressPrice;

    /** 物流公司 */
    @Excel(name = "物流公司")
    private String expressCompany;

    /** 物流单号 */
    @Excel(name = "物流单号")
    private String expressNo;

    /** 发货状态(10未发货 20已发货) */
    @Excel(name = "发货状态(10未发货 20已发货)")
    private Integer deliveryStatus;

    /** 发货时间 */
    @Excel(name = "发货时间")
    private Long deliveryTime;

    /** 收货状态(10未收货 20已收货) */
    @Excel(name = "收货状态(10未收货 20已收货)")
    private Integer receiptStatus;

    /** 收货时间 */
    @Excel(name = "收货时间")
    private Long receiptTime;

    /** 订单状态(10进行中 20取消 21待取消 30已完成) */
    @Excel(name = "订单状态(10进行中 20取消 21待取消 30已完成)")
    private Integer orderStatus;

    /** 微信支付交易号 */
    @Excel(name = "微信支付交易号")
    private String transactionId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }
    public void setTotalPrice(BigDecimal totalPrice) 
    {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() 
    {
        return totalPrice;
    }
    public void setPayPrice(BigDecimal payPrice) 
    {
        this.payPrice = payPrice;
    }

    public BigDecimal getPayPrice() 
    {
        return payPrice;
    }
    public void setPayStatus(Integer payStatus) 
    {
        this.payStatus = payStatus;
    }

    public Integer getPayStatus() 
    {
        return payStatus;
    }
    public void setPayTime(Long payTime) 
    {
        this.payTime = payTime;
    }

    public Long getPayTime() 
    {
        return payTime;
    }
    public void setExpressPrice(BigDecimal expressPrice) 
    {
        this.expressPrice = expressPrice;
    }

    public BigDecimal getExpressPrice() 
    {
        return expressPrice;
    }
    public void setExpressCompany(String expressCompany) 
    {
        this.expressCompany = expressCompany;
    }

    public String getExpressCompany() 
    {
        return expressCompany;
    }
    public void setExpressNo(String expressNo) 
    {
        this.expressNo = expressNo;
    }

    public String getExpressNo() 
    {
        return expressNo;
    }
    public void setDeliveryStatus(Integer deliveryStatus) 
    {
        this.deliveryStatus = deliveryStatus;
    }

    public Integer getDeliveryStatus() 
    {
        return deliveryStatus;
    }
    public void setDeliveryTime(Long deliveryTime) 
    {
        this.deliveryTime = deliveryTime;
    }

    public Long getDeliveryTime() 
    {
        return deliveryTime;
    }
    public void setReceiptStatus(Integer receiptStatus) 
    {
        this.receiptStatus = receiptStatus;
    }

    public Integer getReceiptStatus() 
    {
        return receiptStatus;
    }
    public void setReceiptTime(Long receiptTime) 
    {
        this.receiptTime = receiptTime;
    }

    public Long getReceiptTime() 
    {
        return receiptTime;
    }
    public void setOrderStatus(Integer orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderStatus() 
    {
        return orderStatus;
    }
    public void setTransactionId(String transactionId) 
    {
        this.transactionId = transactionId;
    }

    public String getTransactionId() 
    {
        return transactionId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setWxappId(Long wxappId) 
    {
        this.wxappId = wxappId;
    }

    public Long getWxappId() 
    {
        return wxappId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("orderNo", getOrderNo())
            .append("totalPrice", getTotalPrice())
            .append("payPrice", getPayPrice())
            .append("payStatus", getPayStatus())
            .append("payTime", getPayTime())
            .append("expressPrice", getExpressPrice())
            .append("expressCompany", getExpressCompany())
            .append("expressNo", getExpressNo())
            .append("deliveryStatus", getDeliveryStatus())
            .append("deliveryTime", getDeliveryTime())
            .append("receiptStatus", getReceiptStatus())
            .append("receiptTime", getReceiptTime())
            .append("orderStatus", getOrderStatus())
            .append("transactionId", getTransactionId())
            .append("userId", getUserId())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
