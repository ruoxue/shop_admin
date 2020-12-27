package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.shop.domain.DataGoodsSpec;
import com.ruoyi.shop.mapper.DataGoodsSpecMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.service.IDataGoodsSpecService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataGoodsSpecServiceImpl implements IDataGoodsSpecService 
{
    @Autowired
    private DataGoodsSpecMapper dataGoodsSpecMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param goodsSpecId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataGoodsSpec selectDataGoodsSpecById(Long goodsSpecId)
    {
        return dataGoodsSpecMapper.selectDataGoodsSpecById(goodsSpecId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataGoodsSpec 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataGoodsSpec> selectDataGoodsSpecList(DataGoodsSpec dataGoodsSpec)
    {
        return dataGoodsSpecMapper.selectDataGoodsSpecList(dataGoodsSpec);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataGoodsSpec 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataGoodsSpec(DataGoodsSpec dataGoodsSpec)
    {
        dataGoodsSpec.setCreateTime(DateUtils.getNowDate());
        return dataGoodsSpecMapper.insertDataGoodsSpec(dataGoodsSpec);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataGoodsSpec 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataGoodsSpec(DataGoodsSpec dataGoodsSpec)
    {
        dataGoodsSpec.setUpdateTime(DateUtils.getNowDate());
        return dataGoodsSpecMapper.updateDataGoodsSpec(dataGoodsSpec);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param goodsSpecIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataGoodsSpecByIds(Long[] goodsSpecIds)
    {
        return dataGoodsSpecMapper.deleteDataGoodsSpecByIds(goodsSpecIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param goodsSpecId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataGoodsSpecById(Long goodsSpecId)
    {
        return dataGoodsSpecMapper.deleteDataGoodsSpecById(goodsSpecId);
    }
}
