package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_spec_value
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataSpecValue extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 规格值id */
    private Long specValueId;

    /** 规格值 */
    @Excel(name = "规格值")
    private String specValue;

    /** 规格组id */
    @Excel(name = "规格组id")
    private Long specId;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    public void setSpecValueId(Long specValueId) 
    {
        this.specValueId = specValueId;
    }

    public Long getSpecValueId() 
    {
        return specValueId;
    }
    public void setSpecValue(String specValue) 
    {
        this.specValue = specValue;
    }

    public String getSpecValue() 
    {
        return specValue;
    }
    public void setSpecId(Long specId) 
    {
        this.specId = specId;
    }

    public Long getSpecId() 
    {
        return specId;
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
            .append("specValueId", getSpecValueId())
            .append("specValue", getSpecValue())
            .append("specId", getSpecId())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
