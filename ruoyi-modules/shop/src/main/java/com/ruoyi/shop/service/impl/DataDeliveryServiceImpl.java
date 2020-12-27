package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataDeliveryMapper;
import com.ruoyi.shop.domain.DataDelivery;
import com.ruoyi.shop.service.IDataDeliveryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataDeliveryServiceImpl implements IDataDeliveryService 
{
    @Autowired
    private DataDeliveryMapper dataDeliveryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param deliveryId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataDelivery selectDataDeliveryById(Long deliveryId)
    {
        return dataDeliveryMapper.selectDataDeliveryById(deliveryId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataDelivery 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataDelivery> selectDataDeliveryList(DataDelivery dataDelivery)
    {
        return dataDeliveryMapper.selectDataDeliveryList(dataDelivery);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataDelivery 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataDelivery(DataDelivery dataDelivery)
    {
        dataDelivery.setCreateTime(DateUtils.getNowDate());
        return dataDeliveryMapper.insertDataDelivery(dataDelivery);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataDelivery 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataDelivery(DataDelivery dataDelivery)
    {
        dataDelivery.setUpdateTime(DateUtils.getNowDate());
        return dataDeliveryMapper.updateDataDelivery(dataDelivery);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param deliveryIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataDeliveryByIds(Long[] deliveryIds)
    {
        return dataDeliveryMapper.deleteDataDeliveryByIds(deliveryIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param deliveryId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataDeliveryById(Long deliveryId)
    {
        return dataDeliveryMapper.deleteDataDeliveryById(deliveryId);
    }
}
