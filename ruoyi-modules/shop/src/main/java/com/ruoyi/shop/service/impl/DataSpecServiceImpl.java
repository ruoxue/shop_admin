package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataSpecMapper;
import com.ruoyi.shop.domain.DataSpec;
import com.ruoyi.shop.service.IDataSpecService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataSpecServiceImpl implements IDataSpecService 
{
    @Autowired
    private DataSpecMapper dataSpecMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param specId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataSpec selectDataSpecById(Long specId)
    {
        return dataSpecMapper.selectDataSpecById(specId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataSpec 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataSpec> selectDataSpecList(DataSpec dataSpec)
    {
        return dataSpecMapper.selectDataSpecList(dataSpec);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataSpec 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataSpec(DataSpec dataSpec)
    {
        dataSpec.setCreateTime(DateUtils.getNowDate());
        return dataSpecMapper.insertDataSpec(dataSpec);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataSpec 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataSpec(DataSpec dataSpec)
    {
        return dataSpecMapper.updateDataSpec(dataSpec);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param specIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataSpecByIds(Long[] specIds)
    {
        return dataSpecMapper.deleteDataSpecByIds(specIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param specId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataSpecById(Long specId)
    {
        return dataSpecMapper.deleteDataSpecById(specId);
    }
}
