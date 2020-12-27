package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataSpec;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataSpecMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param specId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataSpec selectDataSpecById(Long specId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataSpec 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataSpec> selectDataSpecList(DataSpec dataSpec);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataSpec 【请填写功能名称】
     * @return 结果
     */
    public int insertDataSpec(DataSpec dataSpec);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataSpec 【请填写功能名称】
     * @return 结果
     */
    public int updateDataSpec(DataSpec dataSpec);

    /**
     * 删除【请填写功能名称】
     * 
     * @param specId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataSpecById(Long specId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param specIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataSpecByIds(Long[] specIds);
}
