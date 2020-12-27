package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataTruckCompanyMapper;
import com.ruoyi.shop.domain.DataTruckCompany;
import com.ruoyi.shop.service.IDataTruckCompanyService;

/**
 * 商城-快递-公司Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataTruckCompanyServiceImpl implements IDataTruckCompanyService 
{
    @Autowired
    private DataTruckCompanyMapper dataTruckCompanyMapper;

    /**
     * 查询商城-快递-公司
     * 
     * @param id 商城-快递-公司ID
     * @return 商城-快递-公司
     */
    @Override
    public DataTruckCompany selectDataTruckCompanyById(Long id)
    {
        return dataTruckCompanyMapper.selectDataTruckCompanyById(id);
    }

    /**
     * 查询商城-快递-公司列表
     * 
     * @param dataTruckCompany 商城-快递-公司
     * @return 商城-快递-公司
     */
    @Override
    public List<DataTruckCompany> selectDataTruckCompanyList(DataTruckCompany dataTruckCompany)
    {
        return dataTruckCompanyMapper.selectDataTruckCompanyList(dataTruckCompany);
    }

    /**
     * 新增商城-快递-公司
     * 
     * @param dataTruckCompany 商城-快递-公司
     * @return 结果
     */
    @Override
    public int insertDataTruckCompany(DataTruckCompany dataTruckCompany)
    {
        return dataTruckCompanyMapper.insertDataTruckCompany(dataTruckCompany);
    }

    /**
     * 修改商城-快递-公司
     * 
     * @param dataTruckCompany 商城-快递-公司
     * @return 结果
     */
    @Override
    public int updateDataTruckCompany(DataTruckCompany dataTruckCompany)
    {
        return dataTruckCompanyMapper.updateDataTruckCompany(dataTruckCompany);
    }

    /**
     * 批量删除商城-快递-公司
     * 
     * @param ids 需要删除的商城-快递-公司ID
     * @return 结果
     */
    @Override
    public int deleteDataTruckCompanyByIds(Long[] ids)
    {
        return dataTruckCompanyMapper.deleteDataTruckCompanyByIds(ids);
    }

    /**
     * 删除商城-快递-公司信息
     * 
     * @param id 商城-快递-公司ID
     * @return 结果
     */
    @Override
    public int deleteDataTruckCompanyById(Long id)
    {
        return dataTruckCompanyMapper.deleteDataTruckCompanyById(id);
    }
}
