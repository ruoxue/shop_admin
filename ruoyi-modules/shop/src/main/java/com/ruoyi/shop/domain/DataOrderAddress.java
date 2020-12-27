package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_order_address
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataOrderAddress extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 地址id */
    private Long orderAddressId;

    /** 收货人姓名 */
    @Excel(name = "收货人姓名")
    private String name;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 所在省份id */
    @Excel(name = "所在省份id")
    private Long provinceId;

    /** 所在城市id */
    @Excel(name = "所在城市id")
    private Long cityId;

    /** 所在区id */
    @Excel(name = "所在区id")
    private Long regionId;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String detail;

    /** 订单id */
    @Excel(name = "订单id")
    private Long orderId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    public void setOrderAddressId(Long orderAddressId) 
    {
        this.orderAddressId = orderAddressId;
    }

    public Long getOrderAddressId() 
    {
        return orderAddressId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setProvinceId(Long provinceId) 
    {
        this.provinceId = provinceId;
    }

    public Long getProvinceId() 
    {
        return provinceId;
    }
    public void setCityId(Long cityId) 
    {
        this.cityId = cityId;
    }

    public Long getCityId() 
    {
        return cityId;
    }
    public void setRegionId(Long regionId) 
    {
        this.regionId = regionId;
    }

    public Long getRegionId() 
    {
        return regionId;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
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
            .append("orderAddressId", getOrderAddressId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("provinceId", getProvinceId())
            .append("cityId", getCityId())
            .append("regionId", getRegionId())
            .append("detail", getDetail())
            .append("orderId", getOrderId())
            .append("userId", getUserId())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
