package com.ruoyi.shop.service.impl;

import java.util.List;

import com.ruoyi.shop.domain.DataMemberCoinItem;
import com.ruoyi.shop.mapper.DataMemberCoinItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.service.IDataMemberCoinItemService;

/**
 * 数据-会员-金币-获得Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataMemberCoinItemServiceImpl implements IDataMemberCoinItemService 
{
    @Autowired
    private DataMemberCoinItemMapper dataMemberCoinItemMapper;

    /**
     * 查询数据-会员-金币-获得
     * 
     * @param id 数据-会员-金币-获得ID
     * @return 数据-会员-金币-获得
     */
    @Override
    public DataMemberCoinItem selectDataMemberCoinItemById(Long id)
    {
        return dataMemberCoinItemMapper.selectDataMemberCoinItemById(id);
    }

    /**
     * 查询数据-会员-金币-获得列表
     * 
     * @param dataMemberCoinItem 数据-会员-金币-获得
     * @return 数据-会员-金币-获得
     */
    @Override
    public List<DataMemberCoinItem> selectDataMemberCoinItemList(DataMemberCoinItem dataMemberCoinItem)
    {
        return dataMemberCoinItemMapper.selectDataMemberCoinItemList(dataMemberCoinItem);
    }

    /**
     * 新增数据-会员-金币-获得
     * 
     * @param dataMemberCoinItem 数据-会员-金币-获得
     * @return 结果
     */
    @Override
    public int insertDataMemberCoinItem(DataMemberCoinItem dataMemberCoinItem)
    {
        return dataMemberCoinItemMapper.insertDataMemberCoinItem(dataMemberCoinItem);
    }

    /**
     * 修改数据-会员-金币-获得
     * 
     * @param dataMemberCoinItem 数据-会员-金币-获得
     * @return 结果
     */
    @Override
    public int updateDataMemberCoinItem(DataMemberCoinItem dataMemberCoinItem)
    {
        return dataMemberCoinItemMapper.updateDataMemberCoinItem(dataMemberCoinItem);
    }

    /**
     * 批量删除数据-会员-金币-获得
     * 
     * @param ids 需要删除的数据-会员-金币-获得ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberCoinItemByIds(Long[] ids)
    {
        return dataMemberCoinItemMapper.deleteDataMemberCoinItemByIds(ids);
    }

    /**
     * 删除数据-会员-金币-获得信息
     * 
     * @param id 数据-会员-金币-获得ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberCoinItemById(Long id)
    {
        return dataMemberCoinItemMapper.deleteDataMemberCoinItemById(id);
    }
}
