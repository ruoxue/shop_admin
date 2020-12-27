package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataGoodsSpec;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataGoodsSpecMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param goodsSpecId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataGoodsSpec selectDataGoodsSpecById(Long goodsSpecId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataGoodsSpec 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataGoodsSpec> selectDataGoodsSpecList(DataGoodsSpec dataGoodsSpec);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataGoodsSpec 【请填写功能名称】
     * @return 结果
     */
    public int insertDataGoodsSpec(DataGoodsSpec dataGoodsSpec);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataGoodsSpec 【请填写功能名称】
     * @return 结果
     */
    public int updateDataGoodsSpec(DataGoodsSpec dataGoodsSpec);

    /**
     * 删除【请填写功能名称】
     * 
     * @param goodsSpecId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataGoodsSpecById(Long goodsSpecId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param goodsSpecIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataGoodsSpecByIds(Long[] goodsSpecIds);
}
