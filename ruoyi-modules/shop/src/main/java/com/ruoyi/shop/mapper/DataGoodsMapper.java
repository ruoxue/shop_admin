package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataGoods;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataGoodsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param goodsId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataGoods selectDataGoodsById(Long goodsId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataGoods 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataGoods> selectDataGoodsList(DataGoods dataGoods);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataGoods 【请填写功能名称】
     * @return 结果
     */
    public int insertDataGoods(DataGoods dataGoods);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataGoods 【请填写功能名称】
     * @return 结果
     */
    public int updateDataGoods(DataGoods dataGoods);

    /**
     * 删除【请填写功能名称】
     * 
     * @param goodsId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataGoodsById(Long goodsId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param goodsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataGoodsByIds(Long[] goodsIds);
}
