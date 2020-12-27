package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataTruckTemplateMapper;
import com.ruoyi.shop.domain.DataTruckTemplate;
import com.ruoyi.shop.service.IDataTruckTemplateService;

/**
 * 商城-快递-费用Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataTruckTemplateServiceImpl implements IDataTruckTemplateService 
{
    @Autowired
    private DataTruckTemplateMapper dataTruckTemplateMapper;

    /**
     * 查询商城-快递-费用
     * 
     * @param id 商城-快递-费用ID
     * @return 商城-快递-费用
     */
    @Override
    public DataTruckTemplate selectDataTruckTemplateById(Long id)
    {
        return dataTruckTemplateMapper.selectDataTruckTemplateById(id);
    }

    /**
     * 查询商城-快递-费用列表
     * 
     * @param dataTruckTemplate 商城-快递-费用
     * @return 商城-快递-费用
     */
    @Override
    public List<DataTruckTemplate> selectDataTruckTemplateList(DataTruckTemplate dataTruckTemplate)
    {
        return dataTruckTemplateMapper.selectDataTruckTemplateList(dataTruckTemplate);
    }

    /**
     * 新增商城-快递-费用
     * 
     * @param dataTruckTemplate 商城-快递-费用
     * @return 结果
     */
    @Override
    public int insertDataTruckTemplate(DataTruckTemplate dataTruckTemplate)
    {
        return dataTruckTemplateMapper.insertDataTruckTemplate(dataTruckTemplate);
    }

    /**
     * 修改商城-快递-费用
     * 
     * @param dataTruckTemplate 商城-快递-费用
     * @return 结果
     */
    @Override
    public int updateDataTruckTemplate(DataTruckTemplate dataTruckTemplate)
    {
        return dataTruckTemplateMapper.updateDataTruckTemplate(dataTruckTemplate);
    }

    /**
     * 批量删除商城-快递-费用
     * 
     * @param ids 需要删除的商城-快递-费用ID
     * @return 结果
     */
    @Override
    public int deleteDataTruckTemplateByIds(Long[] ids)
    {
        return dataTruckTemplateMapper.deleteDataTruckTemplateByIds(ids);
    }

    /**
     * 删除商城-快递-费用信息
     * 
     * @param id 商城-快递-费用ID
     * @return 结果
     */
    @Override
    public int deleteDataTruckTemplateById(Long id)
    {
        return dataTruckTemplateMapper.deleteDataTruckTemplateById(id);
    }
}
