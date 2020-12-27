package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataGoodsMapper;
import com.ruoyi.shop.domain.DataGoods;
import com.ruoyi.shop.service.IDataGoodsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataGoodsServiceImpl implements IDataGoodsService 
{
    @Autowired
    private DataGoodsMapper dataGoodsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param goodsId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataGoods selectDataGoodsById(Long goodsId)
    {
        return dataGoodsMapper.selectDataGoodsById(goodsId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataGoods 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataGoods> selectDataGoodsList(DataGoods dataGoods)
    {
        return dataGoodsMapper.selectDataGoodsList(dataGoods);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataGoods(DataGoods dataGoods)
    {
        dataGoods.setCreateTime(DateUtils.getNowDate());
        return dataGoodsMapper.insertDataGoods(dataGoods);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataGoods(DataGoods dataGoods)
    {
        dataGoods.setUpdateTime(DateUtils.getNowDate());
        return dataGoodsMapper.updateDataGoods(dataGoods);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param goodsIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataGoodsByIds(Long[] goodsIds)
    {
        return dataGoodsMapper.deleteDataGoodsByIds(goodsIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param goodsId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataGoodsById(Long goodsId)
    {
        return dataGoodsMapper.deleteDataGoodsById(goodsId);
    }
}
