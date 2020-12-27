package com.ruoyi.shop.service;

import java.util.List;
import com.ruoyi.shop.domain.DataOrderAddress;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataOrderAddressService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param orderAddressId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataOrderAddress selectDataOrderAddressById(Long orderAddressId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataOrderAddress 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataOrderAddress> selectDataOrderAddressList(DataOrderAddress dataOrderAddress);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataOrderAddress 【请填写功能名称】
     * @return 结果
     */
    public int insertDataOrderAddress(DataOrderAddress dataOrderAddress);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataOrderAddress 【请填写功能名称】
     * @return 结果
     */
    public int updateDataOrderAddress(DataOrderAddress dataOrderAddress);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderAddressIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataOrderAddressByIds(Long[] orderAddressIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param orderAddressId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataOrderAddressById(Long orderAddressId);
}
