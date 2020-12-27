package com.ruoyi.shop.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 商城-快递-公司对象 data_truck_company
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataTruckCompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 快递公司名称 */
    @Excel(name = "快递公司名称")
    private String name;

    /** 快递公司代码 */
    @Excel(name = "快递公司代码")
    private String code1;

    /** 百度快递100代码 */
    @Excel(name = "百度快递100代码")
    private String code2;

    /** 官方快递100代码 */
    @Excel(name = "官方快递100代码")
    private String code3;

    /** 排序权重 */
    @Excel(name = "排序权重")
    private Long sort;

    /** 状态(0.无效,1.有效) */
    @Excel(name = "状态(0.无效,1.有效)")
    private Integer status;

    /** 删除状态(1已删除,0未删除) */
    @Excel(name = "删除状态(1已删除,0未删除)")
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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCode1(String code1) 
    {
        this.code1 = code1;
    }

    public String getCode1() 
    {
        return code1;
    }
    public void setCode2(String code2) 
    {
        this.code2 = code2;
    }

    public String getCode2() 
    {
        return code2;
    }
    public void setCode3(String code3) 
    {
        this.code3 = code3;
    }

    public String getCode3() 
    {
        return code3;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
            .append("name", getName())
            .append("code1", getCode1())
            .append("code2", getCode2())
            .append("code3", getCode3())
            .append("remark", getRemark())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("deleted", getDeleted())
            .append("createAt", getCreateAt())
            .toString();
    }
}
