package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataNewsItemMapper;
import com.ruoyi.shop.domain.DataNewsItem;
import com.ruoyi.shop.service.IDataNewsItemService;

/**
 * 数据-文章-内容Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataNewsItemServiceImpl implements IDataNewsItemService 
{
    @Autowired
    private DataNewsItemMapper dataNewsItemMapper;

    /**
     * 查询数据-文章-内容
     * 
     * @param id 数据-文章-内容ID
     * @return 数据-文章-内容
     */
    @Override
    public DataNewsItem selectDataNewsItemById(Long id)
    {
        return dataNewsItemMapper.selectDataNewsItemById(id);
    }

    /**
     * 查询数据-文章-内容列表
     * 
     * @param dataNewsItem 数据-文章-内容
     * @return 数据-文章-内容
     */
    @Override
    public List<DataNewsItem> selectDataNewsItemList(DataNewsItem dataNewsItem)
    {
        return dataNewsItemMapper.selectDataNewsItemList(dataNewsItem);
    }

    /**
     * 新增数据-文章-内容
     * 
     * @param dataNewsItem 数据-文章-内容
     * @return 结果
     */
    @Override
    public int insertDataNewsItem(DataNewsItem dataNewsItem)
    {
        return dataNewsItemMapper.insertDataNewsItem(dataNewsItem);
    }

    /**
     * 修改数据-文章-内容
     * 
     * @param dataNewsItem 数据-文章-内容
     * @return 结果
     */
    @Override
    public int updateDataNewsItem(DataNewsItem dataNewsItem)
    {
        return dataNewsItemMapper.updateDataNewsItem(dataNewsItem);
    }

    /**
     * 批量删除数据-文章-内容
     * 
     * @param ids 需要删除的数据-文章-内容ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsItemByIds(Long[] ids)
    {
        return dataNewsItemMapper.deleteDataNewsItemByIds(ids);
    }

    /**
     * 删除数据-文章-内容信息
     * 
     * @param id 数据-文章-内容ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsItemById(Long id)
    {
        return dataNewsItemMapper.deleteDataNewsItemById(id);
    }
}
