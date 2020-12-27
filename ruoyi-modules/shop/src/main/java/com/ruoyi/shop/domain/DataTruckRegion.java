package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 商城-快递-区域对象 data_truck_region
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataTruckRegion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 上级PID */
    @Excel(name = "上级PID")
    private Long pid;

    /** 首字母 */
    @Excel(name = "首字母")
    private String first;

    /** 区域简称 */
    @Excel(name = "区域简称")

    private String shortName;

    /** 区域名称 */
    @Excel(name = "区域名称")
    private String name;

    /** 区域层级 */
    @Excel(name = "区域层级")
    private Integer level;

    /** 区域拼音 */
    @Excel(name = "区域拼音")
    private String pinyin;

    /** 区域邮编 */
    @Excel(name = "区域邮编")
    private String code;

    /** 使用状态 */
    @Excel(name = "使用状态")
    private Integer status;

    /** 所在经度 */
    @Excel(name = "所在经度")
    private String lng;

    /** 所在纬度 */
    @Excel(name = "所在纬度")
    private String lat;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setFirst(String first) 
    {
        this.first = first;
    }

    public String getFirst() 
    {
        return first;
    }



    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setLevel(Integer level) 
    {
        this.level = level;
    }

    public Integer getLevel() 
    {
        return level;
    }
    public void setPinyin(String pinyin) 
    {
        this.pinyin = pinyin;
    }

    public String getPinyin() 
    {
        return pinyin;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setLng(String lng) 
    {
        this.lng = lng;
    }

    public String getLng() 
    {
        return lng;
    }
    public void setLat(String lat) 
    {
        this.lat = lat;
    }

    public String getLat() 
    {
        return lat;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pid", getPid())
            .append("first", getFirst())
            .append("name", getName())
            .append("level", getLevel())
            .append("pinyin", getPinyin())
            .append("code", getCode())
            .append("status", getStatus())
            .append("lng", getLng())
            .append("lat", getLat())
            .toString();
    }
}
