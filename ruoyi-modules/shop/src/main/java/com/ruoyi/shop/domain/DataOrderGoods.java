package com.ruoyi.shop.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_order_goods
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataOrderGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long orderGoodsId;

    /** 商品id */
    @Excel(name = "商品id")
    private Long goodsId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 商品封面图id */
    @Excel(name = "商品封面图id")
    private Long imageId;

    /** 库存计算方式(10下单减库存 20付款减库存) */
    @Excel(name = "库存计算方式(10下单减库存 20付款减库存)")
    private Integer deductStockType;

    /** 规格类型(10单规格 20多规格) */
    @Excel(name = "规格类型(10单规格 20多规格)")
    private Integer specType;

    /** 商品sku标识 */
    @Excel(name = "商品sku标识")
    private String specSkuId;

    /** 商品规格id */
    @Excel(name = "商品规格id")
    private Long goodsSpecId;

    /** 商品规格信息 */
    @Excel(name = "商品规格信息")
    private String goodsAttr;

    /** 商品详情 */
    @Excel(name = "商品详情")
    private String content;

    /** 商品编码 */
    @Excel(name = "商品编码")
    private String goodsNo;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private BigDecimal goodsPrice;

    /** 商品划线价 */
    @Excel(name = "商品划线价")
    private BigDecimal linePrice;

    /** 商品重量(Kg) */
    @Excel(name = "商品重量(Kg)")
    private  Integer goodsWeight;

    /** 购买数量 */
    @Excel(name = "购买数量")
    private Long totalNum;

    /** 商品总价 */
    @Excel(name = "商品总价")
    private BigDecimal totalPrice;

    /** 订单id */
    @Excel(name = "订单id")
    private Long orderId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    public void setOrderGoodsId(Long orderGoodsId) 
    {
        this.orderGoodsId = orderGoodsId;
    }

    public Long getOrderGoodsId() 
    {
        return orderGoodsId;
    }
    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }
    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }
    public void setImageId(Long imageId) 
    {
        this.imageId = imageId;
    }

    public Long getImageId() 
    {
        return imageId;
    }
    public void setDeductStockType(Integer deductStockType) 
    {
        this.deductStockType = deductStockType;
    }

    public Integer getDeductStockType() 
    {
        return deductStockType;
    }
    public void setSpecType(Integer specType) 
    {
        this.specType = specType;
    }

    public Integer getSpecType() 
    {
        return specType;
    }
    public void setSpecSkuId(String specSkuId) 
    {
        this.specSkuId = specSkuId;
    }

    public String getSpecSkuId() 
    {
        return specSkuId;
    }
    public void setGoodsSpecId(Long goodsSpecId) 
    {
        this.goodsSpecId = goodsSpecId;
    }

    public Long getGoodsSpecId() 
    {
        return goodsSpecId;
    }
    public void setGoodsAttr(String goodsAttr) 
    {
        this.goodsAttr = goodsAttr;
    }

    public String getGoodsAttr() 
    {
        return goodsAttr;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setGoodsNo(String goodsNo) 
    {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() 
    {
        return goodsNo;
    }
    public void setGoodsPrice(BigDecimal goodsPrice) 
    {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsPrice() 
    {
        return goodsPrice;
    }
    public void setLinePrice(BigDecimal linePrice) 
    {
        this.linePrice = linePrice;
    }

    public BigDecimal getLinePrice() 
    {
        return linePrice;
    }
    public void setGoodsWeight(Integer goodsWeight)
    {
        this.goodsWeight = goodsWeight;
    }

    public Integer getGoodsWeight()
    {
        return goodsWeight;
    }
    public void setTotalNum(Long totalNum) 
    {
        this.totalNum = totalNum;
    }

    public Long getTotalNum() 
    {
        return totalNum;
    }
    public void setTotalPrice(BigDecimal totalPrice) 
    {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() 
    {
        return totalPrice;
    }
    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
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
            .append("orderGoodsId", getOrderGoodsId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("imageId", getImageId())
            .append("deductStockType", getDeductStockType())
            .append("specType", getSpecType())
            .append("specSkuId", getSpecSkuId())
            .append("goodsSpecId", getGoodsSpecId())
            .append("goodsAttr", getGoodsAttr())
            .append("content", getContent())
            .append("goodsNo", getGoodsNo())
            .append("goodsPrice", getGoodsPrice())
            .append("linePrice", getLinePrice())
            .append("goodsWeight", getGoodsWeight())
            .append("totalNum", getTotalNum())
            .append("totalPrice", getTotalPrice())
            .append("orderId", getOrderId())
            .append("userId", getUserId())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
