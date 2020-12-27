package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataMemberAddress;

/**
 * 数据-会员-地址Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataMemberAddressMapper 
{
    /**
     * 查询数据-会员-地址
     * 
     * @param id 数据-会员-地址ID
     * @return 数据-会员-地址
     */
    public DataMemberAddress selectDataMemberAddressById(Long id);

    /**
     * 查询数据-会员-地址列表
     * 
     * @param dataMemberAddress 数据-会员-地址
     * @return 数据-会员-地址集合
     */
    public List<DataMemberAddress> selectDataMemberAddressList(DataMemberAddress dataMemberAddress);

    /**
     * 新增数据-会员-地址
     * 
     * @param dataMemberAddress 数据-会员-地址
     * @return 结果
     */
    public int insertDataMemberAddress(DataMemberAddress dataMemberAddress);

    /**
     * 修改数据-会员-地址
     * 
     * @param dataMemberAddress 数据-会员-地址
     * @return 结果
     */
    public int updateDataMemberAddress(DataMemberAddress dataMemberAddress);

    /**
     * 删除数据-会员-地址
     * 
     * @param id 数据-会员-地址ID
     * @return 结果
     */
    public int deleteDataMemberAddressById(Long id);

    /**
     * 批量删除数据-会员-地址
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataMemberAddressByIds(Long[] ids);
}
