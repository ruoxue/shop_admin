package com.ruoyi.shop.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 数据-文章-内容对象 data_news_item
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataNewsItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 文章标题 */
    @Excel(name = "文章标题")
    private String name;

    /** 文章标签 */
    @Excel(name = "文章标签")
    private String mark;

    /** 文章封面 */
    @Excel(name = "文章封面")
    private String cover;

    /** 文章内容 */
    @Excel(name = "文章内容")
    private String content;

    /** 文章点赞数 */
    @Excel(name = "文章点赞数")
    private Long numLike;

    /** 文章阅读数 */
    @Excel(name = "文章阅读数")
    private Long numRead;

    /** 文章收藏数 */
    @Excel(name = "文章收藏数")
    private Long numCollect;

    /** 文章评论数 */
    @Excel(name = "文章评论数")
    private Long numComment;

    /** 排序权重 */
    @Excel(name = "排序权重")
    private Long sort;

    /** 权限状态(1使用,0禁用) */
    @Excel(name = "权限状态(1使用,0禁用)")
    private Integer status;

    /** 删除状态(0未删,1已删) */
    @Excel(name = "删除状态(0未删,1已删)")
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
    public void setMark(String mark) 
    {
        this.mark = mark;
    }

    public String getMark() 
    {
        return mark;
    }
    public void setCover(String cover) 
    {
        this.cover = cover;
    }

    public String getCover() 
    {
        return cover;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setNumLike(Long numLike) 
    {
        this.numLike = numLike;
    }

    public Long getNumLike() 
    {
        return numLike;
    }
    public void setNumRead(Long numRead) 
    {
        this.numRead = numRead;
    }

    public Long getNumRead() 
    {
        return numRead;
    }
    public void setNumCollect(Long numCollect) 
    {
        this.numCollect = numCollect;
    }

    public Long getNumCollect() 
    {
        return numCollect;
    }
    public void setNumComment(Long numComment) 
    {
        this.numComment = numComment;
    }

    public Long getNumComment() 
    {
        return numComment;
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
            .append("mark", getMark())
            .append("cover", getCover())
            .append("remark", getRemark())
            .append("content", getContent())
            .append("numLike", getNumLike())
            .append("numRead", getNumRead())
            .append("numCollect", getNumCollect())
            .append("numComment", getNumComment())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("deleted", getDeleted())
            .append("createAt", getCreateAt())
            .toString();
    }
}
