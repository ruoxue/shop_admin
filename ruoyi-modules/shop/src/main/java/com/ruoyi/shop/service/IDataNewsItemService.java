package com.ruoyi.shop.service;

import java.util.List;
import com.ruoyi.shop.domain.DataNewsItem;

/**
 * 数据-文章-内容Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataNewsItemService 
{
    /**
     * 查询数据-文章-内容
     * 
     * @param id 数据-文章-内容ID
     * @return 数据-文章-内容
     */
    public DataNewsItem selectDataNewsItemById(Long id);

    /**
     * 查询数据-文章-内容列表
     * 
     * @param dataNewsItem 数据-文章-内容
     * @return 数据-文章-内容集合
     */
    public List<DataNewsItem> selectDataNewsItemList(DataNewsItem dataNewsItem);

    /**
     * 新增数据-文章-内容
     * 
     * @param dataNewsItem 数据-文章-内容
     * @return 结果
     */
    public int insertDataNewsItem(DataNewsItem dataNewsItem);

    /**
     * 修改数据-文章-内容
     * 
     * @param dataNewsItem 数据-文章-内容
     * @return 结果
     */
    public int updateDataNewsItem(DataNewsItem dataNewsItem);

    /**
     * 批量删除数据-文章-内容
     * 
     * @param ids 需要删除的数据-文章-内容ID
     * @return 结果
     */
    public int deleteDataNewsItemByIds(Long[] ids);

    /**
     * 删除数据-文章-内容信息
     * 
     * @param id 数据-文章-内容ID
     * @return 结果
     */
    public int deleteDataNewsItemById(Long id);
}
