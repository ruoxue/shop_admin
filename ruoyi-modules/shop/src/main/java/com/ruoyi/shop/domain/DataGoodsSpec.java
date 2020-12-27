package com.ruoyi.shop.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_goods_spec
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataGoodsSpec extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品规格id */
    private Long goodsSpecId;

    /** 商品id */
    @Excel(name = "商品id")
    private Long goodsId;

    /** 商品编码 */
    @Excel(name = "商品编码")
    private String goodsNo;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private BigDecimal goodsPrice;

    /** 商品划线价 */
    @Excel(name = "商品划线价")
    private BigDecimal linePrice;

    /** 当前库存数量 */
    @Excel(name = "当前库存数量")
    private Long stockNum;

    /** 商品销量 */
    @Excel(name = "商品销量")
    private Long goodsSales;

    /** 商品重量(Kg) */
    @Excel(name = "商品重量(Kg)")
    private Integer goodsWeight;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    /** 商品spu标识 */
    @Excel(name = "商品spu标识")
    private String specSkuId;

    public void setGoodsSpecId(Long goodsSpecId) 
    {
        this.goodsSpecId = goodsSpecId;
    }

    public Long getGoodsSpecId() 
    {
        return goodsSpecId;
    }
    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
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
    public void setStockNum(Long stockNum) 
    {
        this.stockNum = stockNum;
    }

    public Long getStockNum() 
    {
        return stockNum;
    }
    public void setGoodsSales(Long goodsSales) 
    {
        this.goodsSales = goodsSales;
    }

    public Long getGoodsSales() 
    {
        return goodsSales;
    }
    public void setGoodsWeight(Integer goodsWeight)
    {
        this.goodsWeight = goodsWeight;
    }

    public Integer getGoodsWeight()
    {
        return goodsWeight;
    }
    public void setWxappId(Long wxappId) 
    {
        this.wxappId = wxappId;
    }

    public Long getWxappId() 
    {
        return wxappId;
    }
    public void setSpecSkuId(String specSkuId) 
    {
        this.specSkuId = specSkuId;
    }

    public String getSpecSkuId() 
    {
        return specSkuId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodsSpecId", getGoodsSpecId())
            .append("goodsId", getGoodsId())
            .append("goodsNo", getGoodsNo())
            .append("goodsPrice", getGoodsPrice())
            .append("linePrice", getLinePrice())
            .append("stockNum", getStockNum())
            .append("goodsSales", getGoodsSales())
            .append("goodsWeight", getGoodsWeight())
            .append("wxappId", getWxappId())
            .append("specSkuId", getSpecSkuId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
