package com.ruoyi.shop.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 数据-会员-地址对象 data_member_address
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataMemberAddress extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 会员MID */
    @Excel(name = "会员MID")
    private Long mid;

    /** 地址类型(0普通,1默认) */
    @Excel(name = "地址类型(0普通,1默认)")
    private Integer type;

    /** 地址编号 */
    @Excel(name = "地址编号")
    private String code;

    /** 收货姓名 */
    @Excel(name = "收货姓名")
    private String name;

    /** 收货手机 */
    @Excel(name = "收货手机")
    private String phone;

    /** 地址-省份 */
    @Excel(name = "地址-省份")
    private String province;

    /** 地址-城市 */
    @Excel(name = "地址-城市")
    private String city;

    /** 地址-区域 */
    @Excel(name = "地址-区域")
    private String area;

    /** 地址-详情 */
    @Excel(name = "地址-详情")
    private String address;

    /** 删除状态 */
    @Excel(name = "删除状态")
    private Integer deleted;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMid(Long mid) 
    {
        this.mid = mid;
    }

    public Long getMid() 
    {
        return mid;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
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
    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setDeleted(Integer deleted) 
    {
        this.deleted = deleted;
    }

    public Integer getDeleted() 
    {
        return deleted;
    }
    public void setCreateAt(Date createAt) 
    {
        this.createAt = createAt;
    }

    public Date getCreateAt() 
    {
        return createAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mid", getMid())
            .append("type", getType())
            .append("code", getCode())
            .append("name", getName())
            .append("phone", getPhone())
            .append("province", getProvince())
            .append("city", getCity())
            .append("area", getArea())
            .append("address", getAddress())
            .append("deleted", getDeleted())
            .append("createAt", getCreateAt())
            .toString();
    }
}
