package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataRegionMapper;
import com.ruoyi.shop.domain.DataRegion;
import com.ruoyi.shop.service.IDataRegionService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataRegionServiceImpl implements IDataRegionService 
{
    @Autowired
    private DataRegionMapper dataRegionMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataRegion selectDataRegionById(Long id)
    {
        return dataRegionMapper.selectDataRegionById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataRegion 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataRegion> selectDataRegionList(DataRegion dataRegion)
    {
        return dataRegionMapper.selectDataRegionList(dataRegion);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataRegion 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataRegion(DataRegion dataRegion)
    {
        return dataRegionMapper.insertDataRegion(dataRegion);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataRegion 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataRegion(DataRegion dataRegion)
    {
        return dataRegionMapper.updateDataRegion(dataRegion);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataRegionByIds(Long[] ids)
    {
        return dataRegionMapper.deleteDataRegionByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataRegionById(Long id)
    {
        return dataRegionMapper.deleteDataRegionById(id);
    }
}
