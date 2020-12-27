package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataCategory;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataCategoryMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param categoryId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataCategory selectDataCategoryById(Long categoryId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataCategory 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataCategory> selectDataCategoryList(DataCategory dataCategory);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataCategory 【请填写功能名称】
     * @return 结果
     */
    public int insertDataCategory(DataCategory dataCategory);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataCategory 【请填写功能名称】
     * @return 结果
     */
    public int updateDataCategory(DataCategory dataCategory);

    /**
     * 删除【请填写功能名称】
     * 
     * @param categoryId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataCategoryById(Long categoryId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param categoryIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataCategoryByIds(Long[] categoryIds);
}
