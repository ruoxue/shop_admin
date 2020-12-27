package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataNewsXHistoryMapper;
import com.ruoyi.shop.domain.DataNewsXHistory;
import com.ruoyi.shop.service.IDataNewsXHistoryService;

/**
 * 数据-文章-会员-历史Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataNewsXHistoryServiceImpl implements IDataNewsXHistoryService 
{
    @Autowired
    private DataNewsXHistoryMapper dataNewsXHistoryMapper;

    /**
     * 查询数据-文章-会员-历史
     * 
     * @param id 数据-文章-会员-历史ID
     * @return 数据-文章-会员-历史
     */
    @Override
    public DataNewsXHistory selectDataNewsXHistoryById(Long id)
    {
        return dataNewsXHistoryMapper.selectDataNewsXHistoryById(id);
    }

    /**
     * 查询数据-文章-会员-历史列表
     * 
     * @param dataNewsXHistory 数据-文章-会员-历史
     * @return 数据-文章-会员-历史
     */
    @Override
    public List<DataNewsXHistory> selectDataNewsXHistoryList(DataNewsXHistory dataNewsXHistory)
    {
        return dataNewsXHistoryMapper.selectDataNewsXHistoryList(dataNewsXHistory);
    }

    /**
     * 新增数据-文章-会员-历史
     * 
     * @param dataNewsXHistory 数据-文章-会员-历史
     * @return 结果
     */
    @Override
    public int insertDataNewsXHistory(DataNewsXHistory dataNewsXHistory)
    {
        return dataNewsXHistoryMapper.insertDataNewsXHistory(dataNewsXHistory);
    }

    /**
     * 修改数据-文章-会员-历史
     * 
     * @param dataNewsXHistory 数据-文章-会员-历史
     * @return 结果
     */
    @Override
    public int updateDataNewsXHistory(DataNewsXHistory dataNewsXHistory)
    {
        return dataNewsXHistoryMapper.updateDataNewsXHistory(dataNewsXHistory);
    }

    /**
     * 批量删除数据-文章-会员-历史
     * 
     * @param ids 需要删除的数据-文章-会员-历史ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsXHistoryByIds(Long[] ids)
    {
        return dataNewsXHistoryMapper.deleteDataNewsXHistoryByIds(ids);
    }

    /**
     * 删除数据-文章-会员-历史信息
     * 
     * @param id 数据-文章-会员-历史ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsXHistoryById(Long id)
    {
        return dataNewsXHistoryMapper.deleteDataNewsXHistoryById(id);
    }
}
