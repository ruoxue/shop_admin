package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataRegion;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataRegionMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataRegion selectDataRegionById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataRegion 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataRegion> selectDataRegionList(DataRegion dataRegion);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataRegion 【请填写功能名称】
     * @return 结果
     */
    public int insertDataRegion(DataRegion dataRegion);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataRegion 【请填写功能名称】
     * @return 结果
     */
    public int updateDataRegion(DataRegion dataRegion);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataRegionById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataRegionByIds(Long[] ids);
}
