package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_goods
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品id */
    private Long goodsId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 商品分类id */
    @Excel(name = "商品分类id")
    private Long categoryId;

    /** 商品规格(10单规格 20多规格) */
    @Excel(name = "商品规格(10单规格 20多规格)")
    private Integer specType;

    /** 库存计算方式(10下单减库存 20付款减库存) */
    @Excel(name = "库存计算方式(10下单减库存 20付款减库存)")
    private Integer deductStockType;

    /** 商品详情 */
    @Excel(name = "商品详情")
    private String content;

    /** 初始销量 */
    @Excel(name = "初始销量")
    private Long salesInitial;

    /** 实际销量 */
    @Excel(name = "实际销量")
    private Long salesActual;

    /** 商品排序(数字越小越靠前) */
    @Excel(name = "商品排序(数字越小越靠前)")
    private Long goodsSort;

    /** 配送模板id */
    @Excel(name = "配送模板id")
    private Long deliveryId;

    /** 商品状态(10上架 20下架) */
    @Excel(name = "商品状态(10上架 20下架)")
    private Integer goodsStatus;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Integer isDelete;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    /** $column.columnComment */
    @Excel(name = "小程序id")
    private String slider;

    /** $column.columnComment */
    @Excel(name = "小程序id")
    private String cover;

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
    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }
    public void setSpecType(Integer specType) 
    {
        this.specType = specType;
    }

    public Integer getSpecType() 
    {
        return specType;
    }
    public void setDeductStockType(Integer deductStockType) 
    {
        this.deductStockType = deductStockType;
    }

    public Integer getDeductStockType() 
    {
        return deductStockType;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setSalesInitial(Long salesInitial) 
    {
        this.salesInitial = salesInitial;
    }

    public Long getSalesInitial() 
    {
        return salesInitial;
    }
    public void setSalesActual(Long salesActual) 
    {
        this.salesActual = salesActual;
    }

    public Long getSalesActual() 
    {
        return salesActual;
    }
    public void setGoodsSort(Long goodsSort) 
    {
        this.goodsSort = goodsSort;
    }

    public Long getGoodsSort() 
    {
        return goodsSort;
    }
    public void setDeliveryId(Long deliveryId) 
    {
        this.deliveryId = deliveryId;
    }

    public Long getDeliveryId() 
    {
        return deliveryId;
    }
    public void setGoodsStatus(Integer goodsStatus) 
    {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsStatus() 
    {
        return goodsStatus;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() 
    {
        return isDelete;
    }
    public void setWxappId(Long wxappId) 
    {
        this.wxappId = wxappId;
    }

    public Long getWxappId() 
    {
        return wxappId;
    }
    public void setSlider(String slider) 
    {
        this.slider = slider;
    }

    public String getSlider() 
    {
        return slider;
    }
    public void setCover(String cover) 
    {
        this.cover = cover;
    }

    public String getCover() 
    {
        return cover;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("categoryId", getCategoryId())
            .append("specType", getSpecType())
            .append("deductStockType", getDeductStockType())
            .append("content", getContent())
            .append("salesInitial", getSalesInitial())
            .append("salesActual", getSalesActual())
            .append("goodsSort", getGoodsSort())
            .append("deliveryId", getDeliveryId())
            .append("goodsStatus", getGoodsStatus())
            .append("isDelete", getIsDelete())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("slider", getSlider())
            .append("cover", getCover())
            .toString();
    }
}
