package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_category
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataCategory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品分类id */
    private Long categoryId;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String name;

    /** 上级分类id */
    @Excel(name = "上级分类id")
    private Long parentId;

    /** 分类图片id */
    @Excel(name = "分类图片id")
    private Long imageId;

    /** 排序方式(数字越小越靠前) */
    @Excel(name = "排序方式(数字越小越靠前)")
    private Long sort;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    /** $column.columnComment */
    @Excel(name = "小程序id")
    private String cover;

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setImageId(Long imageId) 
    {
        this.imageId = imageId;
    }

    public Long getImageId() 
    {
        return imageId;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setWxappId(Long wxappId) 
    {
        this.wxappId = wxappId;
    }

    public Long getWxappId() 
    {
        return wxappId;
    }
    public void setCover(String cover) 
    {
        this.cover = cover;
    }

    public String getCover() 
    {
        return cover;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("categoryId", getCategoryId())
            .append("name", getName())
            .append("parentId", getParentId())
            .append("imageId", getImageId())
            .append("sort", getSort())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("cover", getCover())
            .toString();
    }
}
