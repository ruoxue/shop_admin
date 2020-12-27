package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataMemberMapper;
import com.ruoyi.shop.domain.DataMember;
import com.ruoyi.shop.service.IDataMemberService;

/**
 * 数据-会员Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataMemberServiceImpl implements IDataMemberService 
{
    @Autowired
    private DataMemberMapper dataMemberMapper;

    /**
     * 查询数据-会员
     * 
     * @param id 数据-会员ID
     * @return 数据-会员
     */
    @Override
    public DataMember selectDataMemberById(Long id)
    {
        return dataMemberMapper.selectDataMemberById(id);
    }

    /**
     * 查询数据-会员列表
     * 
     * @param dataMember 数据-会员
     * @return 数据-会员
     */
    @Override
    public List<DataMember> selectDataMemberList(DataMember dataMember)
    {
        return dataMemberMapper.selectDataMemberList(dataMember);
    }

    /**
     * 新增数据-会员
     * 
     * @param dataMember 数据-会员
     * @return 结果
     */
    @Override
    public int insertDataMember(DataMember dataMember)
    {
        return dataMemberMapper.insertDataMember(dataMember);
    }

    /**
     * 修改数据-会员
     * 
     * @param dataMember 数据-会员
     * @return 结果
     */
    @Override
    public int updateDataMember(DataMember dataMember)
    {
        return dataMemberMapper.updateDataMember(dataMember);
    }

    /**
     * 批量删除数据-会员
     * 
     * @param ids 需要删除的数据-会员ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberByIds(Long[] ids)
    {
        return dataMemberMapper.deleteDataMemberByIds(ids);
    }

    /**
     * 删除数据-会员信息
     * 
     * @param id 数据-会员ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberById(Long id)
    {
        return dataMemberMapper.deleteDataMemberById(id);
    }
}
