package com.ruoyi.shop.service;

import java.util.List;

import com.ruoyi.shop.domain.DataMemberCoinItem;

/**
 * 数据-会员-金币-获得Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataMemberCoinItemService 
{
    /**
     * 查询数据-会员-金币-获得
     * 
     * @param id 数据-会员-金币-获得ID
     * @return 数据-会员-金币-获得
     */
    public DataMemberCoinItem selectDataMemberCoinItemById(Long id);

    /**
     * 查询数据-会员-金币-获得列表
     * 
     * @param dataMemberCoinItem 数据-会员-金币-获得
     * @return 数据-会员-金币-获得集合
     */
    public List<DataMemberCoinItem> selectDataMemberCoinItemList(DataMemberCoinItem dataMemberCoinItem);

    /**
     * 新增数据-会员-金币-获得
     * 
     * @param dataMemberCoinItem 数据-会员-金币-获得
     * @return 结果
     */
    public int insertDataMemberCoinItem(DataMemberCoinItem dataMemberCoinItem);

    /**
     * 修改数据-会员-金币-获得
     * 
     * @param dataMemberCoinItem 数据-会员-金币-获得
     * @return 结果
     */
    public int updateDataMemberCoinItem(DataMemberCoinItem dataMemberCoinItem);

    /**
     * 批量删除数据-会员-金币-获得
     * 
     * @param ids 需要删除的数据-会员-金币-获得ID
     * @return 结果
     */
    public int deleteDataMemberCoinItemByIds(Long[] ids);

    /**
     * 删除数据-会员-金币-获得信息
     * 
     * @param id 数据-会员-金币-获得ID
     * @return 结果
     */
    public int deleteDataMemberCoinItemById(Long id);
}
