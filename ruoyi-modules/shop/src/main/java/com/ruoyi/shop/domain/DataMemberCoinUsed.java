package com.ruoyi.shop.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 数据-会员-金币-消费对象 data_member_coin_used
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataMemberCoinUsed extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 会员ID */
    @Excel(name = "会员ID")
    private Long mid;

    /** 来自MID */
    @Excel(name = "来自MID")
    private Long from;

    /** 记录日期 */
    @Excel(name = "记录日期")
    private String date;

    /** 记录类型 */
    @Excel(name = "记录类型")
    private String type;

    /** 目标ID */
    @Excel(name = "目标ID")
    private Long target;

    /** 记录名称 */
    @Excel(name = "记录名称")
    private String name;

    /** 奖励数量 */
    @Excel(name = "奖励数量")
    private Long number;

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
    public void setFrom(Long from) 
    {
        this.from = from;
    }

    public Long getFrom() 
    {
        return from;
    }
    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getDate() 
    {
        return date;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setTarget(Long target) 
    {
        this.target = target;
    }

    public Long getTarget() 
    {
        return target;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
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
            .append("from", getFrom())
            .append("date", getDate())
            .append("type", getType())
            .append("target", getTarget())
            .append("name", getName())
            .append("number", getNumber())
            .append("createAt", getCreateAt())
            .toString();
    }
}
