package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataTruckRegionMapper;
import com.ruoyi.shop.domain.DataTruckRegion;
import com.ruoyi.shop.service.IDataTruckRegionService;

/**
 * 商城-快递-区域Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataTruckRegionServiceImpl implements IDataTruckRegionService 
{
    @Autowired
    private DataTruckRegionMapper dataTruckRegionMapper;

    /**
     * 查询商城-快递-区域
     * 
     * @param id 商城-快递-区域ID
     * @return 商城-快递-区域
     */
    @Override
    public DataTruckRegion selectDataTruckRegionById(Long id)
    {
        return dataTruckRegionMapper.selectDataTruckRegionById(id);
    }

    /**
     * 查询商城-快递-区域列表
     * 
     * @param dataTruckRegion 商城-快递-区域
     * @return 商城-快递-区域
     */
    @Override
    public List<DataTruckRegion> selectDataTruckRegionList(DataTruckRegion dataTruckRegion)
    {
        return dataTruckRegionMapper.selectDataTruckRegionList(dataTruckRegion);
    }

    /**
     * 新增商城-快递-区域
     * 
     * @param dataTruckRegion 商城-快递-区域
     * @return 结果
     */
    @Override
    public int insertDataTruckRegion(DataTruckRegion dataTruckRegion)
    {
        return dataTruckRegionMapper.insertDataTruckRegion(dataTruckRegion);
    }

    /**
     * 修改商城-快递-区域
     * 
     * @param dataTruckRegion 商城-快递-区域
     * @return 结果
     */
    @Override
    public int updateDataTruckRegion(DataTruckRegion dataTruckRegion)
    {
        return dataTruckRegionMapper.updateDataTruckRegion(dataTruckRegion);
    }

    /**
     * 批量删除商城-快递-区域
     * 
     * @param ids 需要删除的商城-快递-区域ID
     * @return 结果
     */
    @Override
    public int deleteDataTruckRegionByIds(Long[] ids)
    {
        return dataTruckRegionMapper.deleteDataTruckRegionByIds(ids);
    }

    /**
     * 删除商城-快递-区域信息
     * 
     * @param id 商城-快递-区域ID
     * @return 结果
     */
    @Override
    public int deleteDataTruckRegionById(Long id)
    {
        return dataTruckRegionMapper.deleteDataTruckRegionById(id);
    }
}
