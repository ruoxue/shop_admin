package com.ruoyi.shop.service;

import java.util.List;
import com.ruoyi.shop.domain.DataTruckRegion;

/**
 * 商城-快递-区域Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataTruckRegionService 
{
    /**
     * 查询商城-快递-区域
     * 
     * @param id 商城-快递-区域ID
     * @return 商城-快递-区域
     */
    public DataTruckRegion selectDataTruckRegionById(Long id);

    /**
     * 查询商城-快递-区域列表
     * 
     * @param dataTruckRegion 商城-快递-区域
     * @return 商城-快递-区域集合
     */
    public List<DataTruckRegion> selectDataTruckRegionList(DataTruckRegion dataTruckRegion);

    /**
     * 新增商城-快递-区域
     * 
     * @param dataTruckRegion 商城-快递-区域
     * @return 结果
     */
    public int insertDataTruckRegion(DataTruckRegion dataTruckRegion);

    /**
     * 修改商城-快递-区域
     * 
     * @param dataTruckRegion 商城-快递-区域
     * @return 结果
     */
    public int updateDataTruckRegion(DataTruckRegion dataTruckRegion);

    /**
     * 批量删除商城-快递-区域
     * 
     * @param ids 需要删除的商城-快递-区域ID
     * @return 结果
     */
    public int deleteDataTruckRegionByIds(Long[] ids);

    /**
     * 删除商城-快递-区域信息
     * 
     * @param id 商城-快递-区域ID
     * @return 结果
     */
    public int deleteDataTruckRegionById(Long id);
}
