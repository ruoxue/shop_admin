package com.ruoyi.shop.service;

import java.util.List;

import com.ruoyi.shop.domain.DataDelivery;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataDeliveryService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param deliveryId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataDelivery selectDataDeliveryById(Long deliveryId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataDelivery 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataDelivery> selectDataDeliveryList(DataDelivery dataDelivery);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataDelivery 【请填写功能名称】
     * @return 结果
     */
    public int insertDataDelivery(DataDelivery dataDelivery);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataDelivery 【请填写功能名称】
     * @return 结果
     */
    public int updateDataDelivery(DataDelivery dataDelivery);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param deliveryIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataDeliveryByIds(Long[] deliveryIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param deliveryId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataDeliveryById(Long deliveryId);
}
