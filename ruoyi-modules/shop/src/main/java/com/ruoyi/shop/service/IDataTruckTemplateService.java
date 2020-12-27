package com.ruoyi.shop.service;

import java.util.List;
import com.ruoyi.shop.domain.DataTruckTemplate;

/**
 * 商城-快递-费用Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataTruckTemplateService 
{
    /**
     * 查询商城-快递-费用
     * 
     * @param id 商城-快递-费用ID
     * @return 商城-快递-费用
     */
    public DataTruckTemplate selectDataTruckTemplateById(Long id);

    /**
     * 查询商城-快递-费用列表
     * 
     * @param dataTruckTemplate 商城-快递-费用
     * @return 商城-快递-费用集合
     */
    public List<DataTruckTemplate> selectDataTruckTemplateList(DataTruckTemplate dataTruckTemplate);

    /**
     * 新增商城-快递-费用
     * 
     * @param dataTruckTemplate 商城-快递-费用
     * @return 结果
     */
    public int insertDataTruckTemplate(DataTruckTemplate dataTruckTemplate);

    /**
     * 修改商城-快递-费用
     * 
     * @param dataTruckTemplate 商城-快递-费用
     * @return 结果
     */
    public int updateDataTruckTemplate(DataTruckTemplate dataTruckTemplate);

    /**
     * 批量删除商城-快递-费用
     * 
     * @param ids 需要删除的商城-快递-费用ID
     * @return 结果
     */
    public int deleteDataTruckTemplateByIds(Long[] ids);

    /**
     * 删除商城-快递-费用信息
     * 
     * @param id 商城-快递-费用ID
     * @return 结果
     */
    public int deleteDataTruckTemplateById(Long id);
}
