package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataCategoryMapper;
import com.ruoyi.shop.domain.DataCategory;
import com.ruoyi.shop.service.IDataCategoryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataCategoryServiceImpl implements IDataCategoryService 
{
    @Autowired
    private DataCategoryMapper dataCategoryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param categoryId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataCategory selectDataCategoryById(Long categoryId)
    {
        return dataCategoryMapper.selectDataCategoryById(categoryId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataCategory 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataCategory> selectDataCategoryList(DataCategory dataCategory)
    {
        return dataCategoryMapper.selectDataCategoryList(dataCategory);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataCategory(DataCategory dataCategory)
    {
        dataCategory.setCreateTime(DateUtils.getNowDate());
        return dataCategoryMapper.insertDataCategory(dataCategory);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataCategory(DataCategory dataCategory)
    {
        dataCategory.setUpdateTime(DateUtils.getNowDate());
        return dataCategoryMapper.updateDataCategory(dataCategory);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param categoryIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataCategoryByIds(Long[] categoryIds)
    {
        return dataCategoryMapper.deleteDataCategoryByIds(categoryIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param categoryId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataCategoryById(Long categoryId)
    {
        return dataCategoryMapper.deleteDataCategoryById(categoryId);
    }
}
