package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_delivery
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataDelivery extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 模板id */
    private Long deliveryId;

    /** 模板名称 */
    @Excel(name = "模板名称")
    private String name;

    /** 计费方式(10按件数 20按重量) */
    @Excel(name = "计费方式(10按件数 20按重量)")
    private Integer method;

    /** 排序方式(数字越小越靠前) */
    @Excel(name = "排序方式(数字越小越靠前)")
    private Long sort;

    /** 排序方式(数字越小越靠前) */
    @Excel(name = "排序方式(数字越小越靠前)")
    private Long wxappId;

    public void setDeliveryId(Long deliveryId) 
    {
        this.deliveryId = deliveryId;
    }

    public Long getDeliveryId() 
    {
        return deliveryId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setMethod(Integer method) 
    {
        this.method = method;
    }

    public Integer getMethod() 
    {
        return method;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
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
            .append("deliveryId", getDeliveryId())
            .append("name", getName())
            .append("method", getMethod())
            .append("sort", getSort())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
