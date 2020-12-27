package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataSpecValue;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataSpecValueMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param specValueId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataSpecValue selectDataSpecValueById(Long specValueId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataSpecValue 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataSpecValue> selectDataSpecValueList(DataSpecValue dataSpecValue);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataSpecValue 【请填写功能名称】
     * @return 结果
     */
    public int insertDataSpecValue(DataSpecValue dataSpecValue);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataSpecValue 【请填写功能名称】
     * @return 结果
     */
    public int updateDataSpecValue(DataSpecValue dataSpecValue);

    /**
     * 删除【请填写功能名称】
     * 
     * @param specValueId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataSpecValueById(Long specValueId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param specValueIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataSpecValueByIds(Long[] specValueIds);
}