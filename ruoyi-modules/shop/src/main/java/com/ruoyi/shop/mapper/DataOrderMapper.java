package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataOrder;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataOrderMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataOrder selectDataOrderById(Long orderId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataOrder 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataOrder> selectDataOrderList(DataOrder dataOrder);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataOrder 【请填写功能名称】
     * @return 结果
     */
    public int insertDataOrder(DataOrder dataOrder);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataOrder 【请填写功能名称】
     * @return 结果
     */
    public int updateDataOrder(DataOrder dataOrder);

    /**
     * 删除【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataOrderById(Long orderId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataOrderByIds(Long[] orderIds);
}
