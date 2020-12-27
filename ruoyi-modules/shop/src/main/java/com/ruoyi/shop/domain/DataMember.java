package com.ruoyi.shop.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 数据-会员对象 data_member
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public class DataMember extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 邀请者MID */
    @Excel(name = "邀请者MID")
    private Long from;

    /** 授权TOKEN令牌 */
    @Excel(name = "授权TOKEN令牌")
    private String token;

    /** 授权TOKEN验证 */
    @Excel(name = "授权TOKEN验证")
    private String tokenv;

    /** 小程序OPENID */
    @Excel(name = "小程序OPENID")
    private String openid1;

    /** 服务号OPENID */
    @Excel(name = "服务号OPENID")
    private String openid2;

    /** 公众号UnionID */
    @Excel(name = "公众号UnionID")
    private String unionid;

    /** 会员手机 */
    @Excel(name = "会员手机")
    private String phone;

    /** 会员头像 */
    @Excel(name = "会员头像")
    private String headimg;

    /** 会员姓名 */
    @Excel(name = "会员姓名")
    private String username;

    /** 会员昵称 */
    @Excel(name = "会员昵称")
    private String nickname;

    /** 登录密码 */
    @Excel(name = "登录密码")
    private String password;

    /** 所在省份 */
    @Excel(name = "所在省份")
    private String regionProvince;

    /** 所在城市 */
    @Excel(name = "所在城市")
    private String regionCity;

    /** 所在区域 */
    @Excel(name = "所在区域")
    private String regionArea;

    /** 会员年龄 */
    @Excel(name = "会员年龄")
    private Long baseAge;

    /** 会员性别 */
    @Excel(name = "会员性别")
    private String baseSex;

    /** 会员身高 */
    @Excel(name = "会员身高")
    private String baseHeight;

    /** 会员体重 */
    @Excel(name = "会员体重")
    private String baseWeight;

    /** 会员生日 */
    @Excel(name = "会员生日")
    private String baseBirthday;

    /** 金币数量 */
    @Excel(name = "金币数量")
    private Long coinTotal;

    /** 金币已用 */
    @Excel(name = "金币已用")
    private Long coinUsed;

    /** 会员状态(1正常,0已拉黑) */
    @Excel(name = "会员状态(1正常,0已拉黑)")
    private Integer status;

    /** 删除状态 */
    @Excel(name = "删除状态")
    private Integer deleted;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFrom(Long from) 
    {
        this.from = from;
    }

    public Long getFrom() 
    {
        return from;
    }
    public void setToken(String token) 
    {
        this.token = token;
    }

    public String getToken() 
    {
        return token;
    }
    public void setTokenv(String tokenv) 
    {
        this.tokenv = tokenv;
    }

    public String getTokenv() 
    {
        return tokenv;
    }
    public void setOpenid1(String openid1) 
    {
        this.openid1 = openid1;
    }

    public String getOpenid1() 
    {
        return openid1;
    }
    public void setOpenid2(String openid2) 
    {
        this.openid2 = openid2;
    }

    public String getOpenid2() 
    {
        return openid2;
    }
    public void setUnionid(String unionid) 
    {
        this.unionid = unionid;
    }

    public String getUnionid() 
    {
        return unionid;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setHeadimg(String headimg) 
    {
        this.headimg = headimg;
    }

    public String getHeadimg() 
    {
        return headimg;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setNickname(String nickname) 
    {
        this.nickname = nickname;
    }

    public String getNickname() 
    {
        return nickname;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setRegionProvince(String regionProvince) 
    {
        this.regionProvince = regionProvince;
    }

    public String getRegionProvince() 
    {
        return regionProvince;
    }
    public void setRegionCity(String regionCity) 
    {
        this.regionCity = regionCity;
    }

    public String getRegionCity() 
    {
        return regionCity;
    }
    public void setRegionArea(String regionArea) 
    {
        this.regionArea = regionArea;
    }

    public String getRegionArea() 
    {
        return regionArea;
    }
    public void setBaseAge(Long baseAge) 
    {
        this.baseAge = baseAge;
    }

    public Long getBaseAge() 
    {
        return baseAge;
    }
    public void setBaseSex(String baseSex) 
    {
        this.baseSex = baseSex;
    }

    public String getBaseSex() 
    {
        return baseSex;
    }
    public void setBaseHeight(String baseHeight) 
    {
        this.baseHeight = baseHeight;
    }

    public String getBaseHeight() 
    {
        return baseHeight;
    }
    public void setBaseWeight(String baseWeight) 
    {
        this.baseWeight = baseWeight;
    }

    public String getBaseWeight() 
    {
        return baseWeight;
    }
    public void setBaseBirthday(String baseBirthday) 
    {
        this.baseBirthday = baseBirthday;
    }

    public String getBaseBirthday() 
    {
        return baseBirthday;
    }
    public void setCoinTotal(Long coinTotal) 
    {
        this.coinTotal = coinTotal;
    }

    public Long getCoinTotal() 
    {
        return coinTotal;
    }
    public void setCoinUsed(Long coinUsed) 
    {
        this.coinUsed = coinUsed;
    }

    public Long getCoinUsed() 
    {
        return coinUsed;
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
            .append("from", getFrom())
            .append("token", getToken())
            .append("tokenv", getTokenv())
            .append("openid1", getOpenid1())
            .append("openid2", getOpenid2())
            .append("unionid", getUnionid())
            .append("phone", getPhone())
            .append("headimg", getHeadimg())
            .append("username", getUsername())
            .append("nickname", getNickname())
            .append("password", getPassword())
            .append("regionProvince", getRegionProvince())
            .append("regionCity", getRegionCity())
            .append("regionArea", getRegionArea())
            .append("baseAge", getBaseAge())
            .append("baseSex", getBaseSex())
            .append("baseHeight", getBaseHeight())
            .append("baseWeight", getBaseWeight())
            .append("baseBirthday", getBaseBirthday())
            .append("coinTotal", getCoinTotal())
            .append("coinUsed", getCoinUsed())
            .append("status", getStatus())
            .append("deleted", getDeleted())
            .append("createAt", getCreateAt())
            .toString();
    }
}
