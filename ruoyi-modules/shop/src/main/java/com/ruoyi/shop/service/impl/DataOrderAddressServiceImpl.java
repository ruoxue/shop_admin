package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.shop.service.IDataOrderAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataOrderAddressMapper;
import com.ruoyi.shop.domain.DataOrderAddress;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataOrderAddressServiceImpl implements IDataOrderAddressService
{
    @Autowired
    private DataOrderAddressMapper dataOrderAddressMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param orderAddressId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataOrderAddress selectDataOrderAddressById(Long orderAddressId)
    {
        return dataOrderAddressMapper.selectDataOrderAddressById(orderAddressId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataOrderAddress 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataOrderAddress> selectDataOrderAddressList(DataOrderAddress dataOrderAddress)
    {
        return dataOrderAddressMapper.selectDataOrderAddressList(dataOrderAddress);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataOrderAddress 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataOrderAddress(DataOrderAddress dataOrderAddress)
    {
        dataOrderAddress.setCreateTime(DateUtils.getNowDate());
        return dataOrderAddressMapper.insertDataOrderAddress(dataOrderAddress);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataOrderAddress 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataOrderAddress(DataOrderAddress dataOrderAddress)
    {
        return dataOrderAddressMapper.updateDataOrderAddress(dataOrderAddress);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderAddressIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataOrderAddressByIds(Long[] orderAddressIds)
    {
        return dataOrderAddressMapper.deleteDataOrderAddressByIds(orderAddressIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param orderAddressId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataOrderAddressById(Long orderAddressId)
    {
        return dataOrderAddressMapper.deleteDataOrderAddressById(orderAddressId);
    }
}
