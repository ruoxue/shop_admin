package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataOrderGoods;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataOrderGoodsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param orderGoodsId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataOrderGoods selectDataOrderGoodsById(Long orderGoodsId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataOrderGoods 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataOrderGoods> selectDataOrderGoodsList(DataOrderGoods dataOrderGoods);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataOrderGoods 【请填写功能名称】
     * @return 结果
     */
    public int insertDataOrderGoods(DataOrderGoods dataOrderGoods);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataOrderGoods 【请填写功能名称】
     * @return 结果
     */
    public int updateDataOrderGoods(DataOrderGoods dataOrderGoods);

    /**
     * 删除【请填写功能名称】
     * 
     * @param orderGoodsId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataOrderGoodsById(Long orderGoodsId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderGoodsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataOrderGoodsByIds(Long[] orderGoodsIds);
}
