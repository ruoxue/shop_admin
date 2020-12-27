package com.ruoyi.shop.service;

import java.util.List;

import com.ruoyi.shop.domain.DataDictionary;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataDictionaryService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataDictionary selectDataDictionaryById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataDictionary 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataDictionary> selectDataDictionaryList(DataDictionary dataDictionary);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataDictionary 【请填写功能名称】
     * @return 结果
     */
    public int insertDataDictionary(DataDictionary dataDictionary);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataDictionary 【请填写功能名称】
     * @return 结果
     */
    public int updateDataDictionary(DataDictionary dataDictionary);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataDictionaryByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataDictionaryById(Long id);
}
