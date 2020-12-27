package com.ruoyi.shop.service.impl;

import java.util.List;

import com.ruoyi.shop.domain.DataDictionary;
import com.ruoyi.shop.mapper.DataDictionaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.service.IDataDictionaryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataDictionaryServiceImpl implements IDataDictionaryService 
{
    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataDictionary selectDataDictionaryById(Long id)
    {
        return dataDictionaryMapper.selectDataDictionaryById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataDictionary 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataDictionary> selectDataDictionaryList(DataDictionary dataDictionary)
    {
        return dataDictionaryMapper.selectDataDictionaryList(dataDictionary);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataDictionary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataDictionary(DataDictionary dataDictionary)
    {
        return dataDictionaryMapper.insertDataDictionary(dataDictionary);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataDictionary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataDictionary(DataDictionary dataDictionary)
    {
        return dataDictionaryMapper.updateDataDictionary(dataDictionary);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataDictionaryByIds(Long[] ids)
    {
        return dataDictionaryMapper.deleteDataDictionaryByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataDictionaryById(Long id)
    {
        return dataDictionaryMapper.deleteDataDictionaryById(id);
    }
}
