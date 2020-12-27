package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataSpecValueMapper;
import com.ruoyi.shop.domain.DataSpecValue;
import com.ruoyi.shop.service.IDataSpecValueService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataSpecValueServiceImpl implements IDataSpecValueService 
{
    @Autowired
    private DataSpecValueMapper dataSpecValueMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param specValueId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataSpecValue selectDataSpecValueById(Long specValueId)
    {
        return dataSpecValueMapper.selectDataSpecValueById(specValueId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataSpecValue 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataSpecValue> selectDataSpecValueList(DataSpecValue dataSpecValue)
    {
        return dataSpecValueMapper.selectDataSpecValueList(dataSpecValue);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataSpecValue 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataSpecValue(DataSpecValue dataSpecValue)
    {
        dataSpecValue.setCreateTime(DateUtils.getNowDate());
        return dataSpecValueMapper.insertDataSpecValue(dataSpecValue);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataSpecValue 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataSpecValue(DataSpecValue dataSpecValue)
    {
        return dataSpecValueMapper.updateDataSpecValue(dataSpecValue);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param specValueIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataSpecValueByIds(Long[] specValueIds)
    {
        return dataSpecValueMapper.deleteDataSpecValueByIds(specValueIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param specValueId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataSpecValueById(Long specValueId)
    {
        return dataSpecValueMapper.deleteDataSpecValueById(specValueId);
    }
}
