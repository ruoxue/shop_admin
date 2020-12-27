package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_region
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataRegion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 父id */
    @Excel(name = "父id")
    private Long pid;

    /** 简称 */
    @Excel(name = "简称")
    private String shortname;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 全称 */
    @Excel(name = "全称")
    private String mergerName;

    /** 层级 1 2 3 省市区县 */
    @Excel(name = "层级 1 2 3 省市区县")
    private Integer level;

    /** 拼音 */
    @Excel(name = "拼音")
    private String pinyin;

    /** 长途区号 */
    @Excel(name = "长途区号")
    private String code;

    /** 邮编 */
    @Excel(name = "邮编")
    private String zipCode;

    /** 首字母 */
    @Excel(name = "首字母")
    private String first;

    /** 经度 */
    @Excel(name = "经度")
    private String lng;

    /** 纬度 */
    @Excel(name = "纬度")
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
    public void setShortname(String shortname) 
    {
        this.shortname = shortname;
    }

    public String getShortname() 
    {
        return shortname;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setMergerName(String mergerName) 
    {
        this.mergerName = mergerName;
    }

    public String getMergerName() 
    {
        return mergerName;
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
    public void setZipCode(String zipCode) 
    {
        this.zipCode = zipCode;
    }

    public String getZipCode() 
    {
        return zipCode;
    }
    public void setFirst(String first) 
    {
        this.first = first;
    }

    public String getFirst() 
    {
        return first;
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
            .append("shortname", getShortname())
            .append("name", getName())
            .append("mergerName", getMergerName())
            .append("level", getLevel())
            .append("pinyin", getPinyin())
            .append("code", getCode())
            .append("zipCode", getZipCode())
            .append("first", getFirst())
            .append("lng", getLng())
            .append("lat", getLat())
            .toString();
    }
}
