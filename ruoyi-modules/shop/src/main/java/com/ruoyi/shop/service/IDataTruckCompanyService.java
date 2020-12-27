package com.ruoyi.shop.service;

import java.util.List;
import com.ruoyi.shop.domain.DataTruckCompany;

/**
 * 商城-快递-公司Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataTruckCompanyService 
{
    /**
     * 查询商城-快递-公司
     * 
     * @param id 商城-快递-公司ID
     * @return 商城-快递-公司
     */
    public DataTruckCompany selectDataTruckCompanyById(Long id);

    /**
     * 查询商城-快递-公司列表
     * 
     * @param dataTruckCompany 商城-快递-公司
     * @return 商城-快递-公司集合
     */
    public List<DataTruckCompany> selectDataTruckCompanyList(DataTruckCompany dataTruckCompany);

    /**
     * 新增商城-快递-公司
     * 
     * @param dataTruckCompany 商城-快递-公司
     * @return 结果
     */
    public int insertDataTruckCompany(DataTruckCompany dataTruckCompany);

    /**
     * 修改商城-快递-公司
     * 
     * @param dataTruckCompany 商城-快递-公司
     * @return 结果
     */
    public int updateDataTruckCompany(DataTruckCompany dataTruckCompany);

    /**
     * 批量删除商城-快递-公司
     * 
     * @param ids 需要删除的商城-快递-公司ID
     * @return 结果
     */
    public int deleteDataTruckCompanyByIds(Long[] ids);

    /**
     * 删除商城-快递-公司信息
     * 
     * @param id 商城-快递-公司ID
     * @return 结果
     */
    public int deleteDataTruckCompanyById(Long id);
}
