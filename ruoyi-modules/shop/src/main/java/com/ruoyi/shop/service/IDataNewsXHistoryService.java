package com.ruoyi.shop.service;

import java.util.List;
import com.ruoyi.shop.domain.DataNewsXHistory;

/**
 * 数据-文章-会员-历史Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataNewsXHistoryService 
{
    /**
     * 查询数据-文章-会员-历史
     * 
     * @param id 数据-文章-会员-历史ID
     * @return 数据-文章-会员-历史
     */
    public DataNewsXHistory selectDataNewsXHistoryById(Long id);

    /**
     * 查询数据-文章-会员-历史列表
     * 
     * @param dataNewsXHistory 数据-文章-会员-历史
     * @return 数据-文章-会员-历史集合
     */
    public List<DataNewsXHistory> selectDataNewsXHistoryList(DataNewsXHistory dataNewsXHistory);

    /**
     * 新增数据-文章-会员-历史
     * 
     * @param dataNewsXHistory 数据-文章-会员-历史
     * @return 结果
     */
    public int insertDataNewsXHistory(DataNewsXHistory dataNewsXHistory);

    /**
     * 修改数据-文章-会员-历史
     * 
     * @param dataNewsXHistory 数据-文章-会员-历史
     * @return 结果
     */
    public int updateDataNewsXHistory(DataNewsXHistory dataNewsXHistory);

    /**
     * 批量删除数据-文章-会员-历史
     * 
     * @param ids 需要删除的数据-文章-会员-历史ID
     * @return 结果
     */
    public int deleteDataNewsXHistoryByIds(Long[] ids);

    /**
     * 删除数据-文章-会员-历史信息
     * 
     * @param id 数据-文章-会员-历史ID
     * @return 结果
     */
    public int deleteDataNewsXHistoryById(Long id);
}
