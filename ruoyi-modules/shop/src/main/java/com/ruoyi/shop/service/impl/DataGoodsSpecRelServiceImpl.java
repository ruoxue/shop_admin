package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.shop.domain.DataGoodsSpecRel;
import com.ruoyi.shop.mapper.DataGoodsSpecRelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.service.IDataGoodsSpecRelService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataGoodsSpecRelServiceImpl implements IDataGoodsSpecRelService 
{
    @Autowired
    private DataGoodsSpecRelMapper dataGoodsSpecRelMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataGoodsSpecRel selectDataGoodsSpecRelById(Long id)
    {
        return dataGoodsSpecRelMapper.selectDataGoodsSpecRelById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataGoodsSpecRel 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataGoodsSpecRel> selectDataGoodsSpecRelList(DataGoodsSpecRel dataGoodsSpecRel)
    {
        return dataGoodsSpecRelMapper.selectDataGoodsSpecRelList(dataGoodsSpecRel);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataGoodsSpecRel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataGoodsSpecRel(DataGoodsSpecRel dataGoodsSpecRel)
    {
        dataGoodsSpecRel.setCreateTime(DateUtils.getNowDate());
        return dataGoodsSpecRelMapper.insertDataGoodsSpecRel(dataGoodsSpecRel);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataGoodsSpecRel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataGoodsSpecRel(DataGoodsSpecRel dataGoodsSpecRel)
    {
        return dataGoodsSpecRelMapper.updateDataGoodsSpecRel(dataGoodsSpecRel);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataGoodsSpecRelByIds(Long[] ids)
    {
        return dataGoodsSpecRelMapper.deleteDataGoodsSpecRelByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataGoodsSpecRelById(Long id)
    {
        return dataGoodsSpecRelMapper.deleteDataGoodsSpecRelById(id);
    }
}
