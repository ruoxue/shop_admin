package com.ruoyi.shop.service;

import java.util.List;
import com.ruoyi.shop.domain.DataTruckProvince;

/**
 * 商城-快递-省份Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataTruckProvinceService 
{
    /**
     * 查询商城-快递-省份
     * 
     * @param id 商城-快递-省份ID
     * @return 商城-快递-省份
     */
    public DataTruckProvince selectDataTruckProvinceById(Long id);

    /**
     * 查询商城-快递-省份列表
     * 
     * @param dataTruckProvince 商城-快递-省份
     * @return 商城-快递-省份集合
     */
    public List<DataTruckProvince> selectDataTruckProvinceList(DataTruckProvince dataTruckProvince);

    /**
     * 新增商城-快递-省份
     * 
     * @param dataTruckProvince 商城-快递-省份
     * @return 结果
     */
    public int insertDataTruckProvince(DataTruckProvince dataTruckProvince);

    /**
     * 修改商城-快递-省份
     * 
     * @param dataTruckProvince 商城-快递-省份
     * @return 结果
     */
    public int updateDataTruckProvince(DataTruckProvince dataTruckProvince);

    /**
     * 批量删除商城-快递-省份
     * 
     * @param ids 需要删除的商城-快递-省份ID
     * @return 结果
     */
    public int deleteDataTruckProvinceByIds(Long[] ids);

    /**
     * 删除商城-快递-省份信息
     * 
     * @param id 商城-快递-省份ID
     * @return 结果
     */
    public int deleteDataTruckProvinceById(Long id);
}
