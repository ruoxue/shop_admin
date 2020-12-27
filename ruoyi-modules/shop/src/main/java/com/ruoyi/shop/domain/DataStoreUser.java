package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 data_store_user
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataStoreUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long storeUserId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 登录密码 */
    @Excel(name = "登录密码")
    private String password;

    /** 小程序id */
    @Excel(name = "小程序id")
    private Long wxappId;

    public void setStoreUserId(Long storeUserId) 
    {
        this.storeUserId = storeUserId;
    }

    public Long getStoreUserId() 
    {
        return storeUserId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
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
            .append("storeUserId", getStoreUserId())
            .append("userName", getUserName())
            .append("password", getPassword())
            .append("wxappId", getWxappId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
