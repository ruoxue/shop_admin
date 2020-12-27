package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_goods_spec_rel
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataGoodsSpecRel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 商品id */
    @Excel(name = "商品id")
    private Long goodsId;

    /** 规格组id */
    @Excel(name = "规格组id")
    private Long specId;

    /** 规格值id */
    @Excel(name = "规格值id")
    private Long specValueId;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }
    public void setSpecId(Long specId) 
    {
        this.specId = specId;
    }

    public Long getSpecId() 
    {
        return specId;
    }
    public void setSpecValueId(Long specValueId) 
    {
        this.specValueId = specValueId;
    }

    public Long getSpecValueId() 
    {
        return specValueId;
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
            .append("id", getId())
            .append("goodsId", getGoodsId())
            .append("specId", getSpecId())
            .append("specValueId", getSpecValueId())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
