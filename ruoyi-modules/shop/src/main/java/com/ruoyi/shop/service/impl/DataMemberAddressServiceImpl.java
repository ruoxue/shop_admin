package com.ruoyi.shop.service.impl;

import java.util.List;

import com.ruoyi.shop.domain.DataMemberAddress;
import com.ruoyi.shop.mapper.DataMemberAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.service.IDataMemberAddressService;

/**
 * 数据-会员-地址Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataMemberAddressServiceImpl implements IDataMemberAddressService 
{
    @Autowired
    private DataMemberAddressMapper dataMemberAddressMapper;

    /**
     * 查询数据-会员-地址
     * 
     * @param id 数据-会员-地址ID
     * @return 数据-会员-地址
     */
    @Override
    public DataMemberAddress selectDataMemberAddressById(Long id)
    {
        return dataMemberAddressMapper.selectDataMemberAddressById(id);
    }

    /**
     * 查询数据-会员-地址列表
     * 
     * @param dataMemberAddress 数据-会员-地址
     * @return 数据-会员-地址
     */
    @Override
    public List<DataMemberAddress> selectDataMemberAddressList(DataMemberAddress dataMemberAddress)
    {
        return dataMemberAddressMapper.selectDataMemberAddressList(dataMemberAddress);
    }

    /**
     * 新增数据-会员-地址
     * 
     * @param dataMemberAddress 数据-会员-地址
     * @return 结果
     */
    @Override
    public int insertDataMemberAddress(DataMemberAddress dataMemberAddress)
    {
        return dataMemberAddressMapper.insertDataMemberAddress(dataMemberAddress);
    }

    /**
     * 修改数据-会员-地址
     * 
     * @param dataMemberAddress 数据-会员-地址
     * @return 结果
     */
    @Override
    public int updateDataMemberAddress(DataMemberAddress dataMemberAddress)
    {
        return dataMemberAddressMapper.updateDataMemberAddress(dataMemberAddress);
    }

    /**
     * 批量删除数据-会员-地址
     * 
     * @param ids 需要删除的数据-会员-地址ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberAddressByIds(Long[] ids)
    {
        return dataMemberAddressMapper.deleteDataMemberAddressByIds(ids);
    }

    /**
     * 删除数据-会员-地址信息
     * 
     * @param id 数据-会员-地址ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberAddressById(Long id)
    {
        return dataMemberAddressMapper.deleteDataMemberAddressById(id);
    }
}
