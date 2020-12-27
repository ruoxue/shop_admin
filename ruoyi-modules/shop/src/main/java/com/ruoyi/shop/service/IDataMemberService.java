package com.ruoyi.shop.service;

import java.util.List;

import com.ruoyi.shop.domain.DataMember;

/**
 * 数据-会员Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataMemberService 
{
    /**
     * 查询数据-会员
     * 
     * @param id 数据-会员ID
     * @return 数据-会员
     */
    public DataMember selectDataMemberById(Long id);

    /**
     * 查询数据-会员列表
     * 
     * @param dataMember 数据-会员
     * @return 数据-会员集合
     */
    public List<DataMember> selectDataMemberList(DataMember dataMember);

    /**
     * 新增数据-会员
     * 
     * @param dataMember 数据-会员
     * @return 结果
     */
    public int insertDataMember(DataMember dataMember);

    /**
     * 修改数据-会员
     * 
     * @param dataMember 数据-会员
     * @return 结果
     */
    public int updateDataMember(DataMember dataMember);

    /**
     * 批量删除数据-会员
     * 
     * @param ids 需要删除的数据-会员ID
     * @return 结果
     */
    public int deleteDataMemberByIds(Long[] ids);

    /**
     * 删除数据-会员信息
     * 
     * @param id 数据-会员ID
     * @return 结果
     */
    public int deleteDataMemberById(Long id);
}
