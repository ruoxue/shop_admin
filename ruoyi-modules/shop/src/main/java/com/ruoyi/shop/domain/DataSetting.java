package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_setting
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataSetting extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设置项标示 */
    private String key;

    /** 设置项描述 */
    @Excel(name = "设置项描述")
    private String describe;

    /** 设置内容（json格式） */
    @Excel(name = "设置内容", readConverterExp = "j=son格式")
    private String values;

    /** 小程序id */
    private Long wxappId;

    public void setKey(String key) 
    {
        this.key = key;
    }

    public String getKey() 
    {
        return key;
    }
    public void setDescribe(String describe) 
    {
        this.describe = describe;
    }

    public String getDescribe() 
    {
        return describe;
    }
    public void setValues(String values) 
    {
        this.values = values;
    }

    public String getValues() 
    {
        return values;
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
            .append("key", getKey())
            .append("describe", getDescribe())
            .append("values", getValues())
            .append("wxappId", getWxappId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
