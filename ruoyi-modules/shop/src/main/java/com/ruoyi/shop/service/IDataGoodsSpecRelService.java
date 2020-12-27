package com.ruoyi.shop.service;

import java.util.List;

import com.ruoyi.shop.domain.DataGoodsSpecRel;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataGoodsSpecRelService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataGoodsSpecRel selectDataGoodsSpecRelById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataGoodsSpecRel 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataGoodsSpecRel> selectDataGoodsSpecRelList(DataGoodsSpecRel dataGoodsSpecRel);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataGoodsSpecRel 【请填写功能名称】
     * @return 结果
     */
    public int insertDataGoodsSpecRel(DataGoodsSpecRel dataGoodsSpecRel);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataGoodsSpecRel 【请填写功能名称】
     * @return 结果
     */
    public int updateDataGoodsSpecRel(DataGoodsSpecRel dataGoodsSpecRel);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataGoodsSpecRelByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataGoodsSpecRelById(Long id);
}
