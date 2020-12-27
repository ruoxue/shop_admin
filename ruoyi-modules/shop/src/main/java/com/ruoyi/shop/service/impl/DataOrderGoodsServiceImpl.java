package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataOrderGoodsMapper;
import com.ruoyi.shop.domain.DataOrderGoods;
import com.ruoyi.shop.service.IDataOrderGoodsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataOrderGoodsServiceImpl implements IDataOrderGoodsService 
{
    @Autowired
    private DataOrderGoodsMapper dataOrderGoodsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param orderGoodsId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataOrderGoods selectDataOrderGoodsById(Long orderGoodsId)
    {
        return dataOrderGoodsMapper.selectDataOrderGoodsById(orderGoodsId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataOrderGoods 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataOrderGoods> selectDataOrderGoodsList(DataOrderGoods dataOrderGoods)
    {
        return dataOrderGoodsMapper.selectDataOrderGoodsList(dataOrderGoods);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataOrderGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataOrderGoods(DataOrderGoods dataOrderGoods)
    {
        dataOrderGoods.setCreateTime(DateUtils.getNowDate());
        return dataOrderGoodsMapper.insertDataOrderGoods(dataOrderGoods);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataOrderGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataOrderGoods(DataOrderGoods dataOrderGoods)
    {
        return dataOrderGoodsMapper.updateDataOrderGoods(dataOrderGoods);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderGoodsIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataOrderGoodsByIds(Long[] orderGoodsIds)
    {
        return dataOrderGoodsMapper.deleteDataOrderGoodsByIds(orderGoodsIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param orderGoodsId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataOrderGoodsById(Long orderGoodsId)
    {
        return dataOrderGoodsMapper.deleteDataOrderGoodsById(orderGoodsId);
    }
}
