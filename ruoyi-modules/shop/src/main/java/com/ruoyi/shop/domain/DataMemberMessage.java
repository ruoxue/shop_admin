package com.ruoyi.shop.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 系统-会员-短信对象 data_member_message
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataMemberMessage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 短信类型 */
    @Excel(name = "短信类型")
    private Integer type;

    /** 消息编号 */
    @Excel(name = "消息编号")
    private String msgid;

    /** 目标手机 */
    @Excel(name = "目标手机")
    private String phone;

    /** 国家编号 */
    @Excel(name = "国家编号")
    private String region;

    /** 返回结果 */
    @Excel(name = "返回结果")
    private String result;

    /** 短信内容 */
    @Excel(name = "短信内容")
    private String content;

    /** 短信状态(0失败,1成功) */
    @Excel(name = "短信状态(0失败,1成功)")
    private Integer status;

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
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setMsgid(String msgid) 
    {
        this.msgid = msgid;
    }

    public String getMsgid() 
    {
        return msgid;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setRegion(String region) 
    {
        this.region = region;
    }

    public String getRegion() 
    {
        return region;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
            .append("type", getType())
            .append("msgid", getMsgid())
            .append("phone", getPhone())
            .append("region", getRegion())
            .append("result", getResult())
            .append("content", getContent())
            .append("status", getStatus())
            .append("createAt", getCreateAt())
            .toString();
    }
}
