package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataOrderMapper;
import com.ruoyi.shop.domain.DataOrder;
import com.ruoyi.shop.service.IDataOrderService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataOrderServiceImpl implements IDataOrderService 
{
    @Autowired
    private DataOrderMapper dataOrderMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataOrder selectDataOrderById(Long orderId)
    {
        return dataOrderMapper.selectDataOrderById(orderId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataOrder 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataOrder> selectDataOrderList(DataOrder dataOrder)
    {
        return dataOrderMapper.selectDataOrderList(dataOrder);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataOrder 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataOrder(DataOrder dataOrder)
    {
        dataOrder.setCreateTime(DateUtils.getNowDate());
        return dataOrderMapper.insertDataOrder(dataOrder);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataOrder 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataOrder(DataOrder dataOrder)
    {
        dataOrder.setUpdateTime(DateUtils.getNowDate());
        return dataOrderMapper.updateDataOrder(dataOrder);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataOrderByIds(Long[] orderIds)
    {
        return dataOrderMapper.deleteDataOrderByIds(orderIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param orderId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataOrderById(Long orderId)
    {
        return dataOrderMapper.deleteDataOrderById(orderId);
    }
}
