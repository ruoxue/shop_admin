package com.ruoyi.shop.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 商城-快递-费用对象 data_truck_template
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataTruckTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 模板编号 */
    @Excel(name = "模板编号")
    private String code;

    /** 模板名称 */
    @Excel(name = "模板名称")
    private String name;

    /** 默认规则 */
    @Excel(name = "默认规则")
    private String normal;

    /** 模板规则 */
    @Excel(name = "模板规则")
    private String content;

    /** 排序权重 */
    @Excel(name = "排序权重")
    private Long sort;

    /** 模板状态 */
    @Excel(name = "模板状态")
    private Integer status;

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
    public void setNormal(String normal) 
    {
        this.normal = normal;
    }

    public String getNormal() 
    {
        return normal;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
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
            .append("code", getCode())
            .append("name", getName())
            .append("normal", getNormal())
            .append("content", getContent())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("deleted", getDeleted())
            .append("createAt", getCreateAt())
            .toString();
    }
}
