package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataTruckProvinceMapper;
import com.ruoyi.shop.domain.DataTruckProvince;
import com.ruoyi.shop.service.IDataTruckProvinceService;

/**
 * 商城-快递-省份Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataTruckProvinceServiceImpl implements IDataTruckProvinceService 
{
    @Autowired
    private DataTruckProvinceMapper dataTruckProvinceMapper;

    /**
     * 查询商城-快递-省份
     * 
     * @param id 商城-快递-省份ID
     * @return 商城-快递-省份
     */
    @Override
    public DataTruckProvince selectDataTruckProvinceById(Long id)
    {
        return dataTruckProvinceMapper.selectDataTruckProvinceById(id);
    }

    /**
     * 查询商城-快递-省份列表
     * 
     * @param dataTruckProvince 商城-快递-省份
     * @return 商城-快递-省份
     */
    @Override
    public List<DataTruckProvince> selectDataTruckProvinceList(DataTruckProvince dataTruckProvince)
    {
        return dataTruckProvinceMapper.selectDataTruckProvinceList(dataTruckProvince);
    }

    /**
     * 新增商城-快递-省份
     * 
     * @param dataTruckProvince 商城-快递-省份
     * @return 结果
     */
    @Override
    public int insertDataTruckProvince(DataTruckProvince dataTruckProvince)
    {
        return dataTruckProvinceMapper.insertDataTruckProvince(dataTruckProvince);
    }

    /**
     * 修改商城-快递-省份
     * 
     * @param dataTruckProvince 商城-快递-省份
     * @return 结果
     */
    @Override
    public int updateDataTruckProvince(DataTruckProvince dataTruckProvince)
    {
        return dataTruckProvinceMapper.updateDataTruckProvince(dataTruckProvince);
    }

    /**
     * 批量删除商城-快递-省份
     * 
     * @param ids 需要删除的商城-快递-省份ID
     * @return 结果
     */
    @Override
    public int deleteDataTruckProvinceByIds(Long[] ids)
    {
        return dataTruckProvinceMapper.deleteDataTruckProvinceByIds(ids);
    }

    /**
     * 删除商城-快递-省份信息
     * 
     * @param id 商城-快递-省份ID
     * @return 结果
     */
    @Override
    public int deleteDataTruckProvinceById(Long id)
    {
        return dataTruckProvinceMapper.deleteDataTruckProvinceById(id);
    }
}
