package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_spec
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataSpec extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 规格组id */
    private Long specId;

    /** 规格组名称 */
    @Excel(name = "规格组名称")
    private String specName;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    public void setSpecId(Long specId) 
    {
        this.specId = specId;
    }

    public Long getSpecId() 
    {
        return specId;
    }
    public void setSpecName(String specName) 
    {
        this.specName = specName;
    }

    public String getSpecName() 
    {
        return specName;
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
            .append("specId", getSpecId())
            .append("specName", getSpecName())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
