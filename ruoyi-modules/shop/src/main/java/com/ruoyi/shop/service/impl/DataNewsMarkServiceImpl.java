package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataNewsMarkMapper;
import com.ruoyi.shop.domain.DataNewsMark;
import com.ruoyi.shop.service.IDataNewsMarkService;

/**
 * 数据-文章-标签Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataNewsMarkServiceImpl implements IDataNewsMarkService 
{
    @Autowired
    private DataNewsMarkMapper dataNewsMarkMapper;

    /**
     * 查询数据-文章-标签
     * 
     * @param id 数据-文章-标签ID
     * @return 数据-文章-标签
     */
    @Override
    public DataNewsMark selectDataNewsMarkById(Long id)
    {
        return dataNewsMarkMapper.selectDataNewsMarkById(id);
    }

    /**
     * 查询数据-文章-标签列表
     * 
     * @param dataNewsMark 数据-文章-标签
     * @return 数据-文章-标签
     */
    @Override
    public List<DataNewsMark> selectDataNewsMarkList(DataNewsMark dataNewsMark)
    {
        return dataNewsMarkMapper.selectDataNewsMarkList(dataNewsMark);
    }

    /**
     * 新增数据-文章-标签
     * 
     * @param dataNewsMark 数据-文章-标签
     * @return 结果
     */
    @Override
    public int insertDataNewsMark(DataNewsMark dataNewsMark)
    {
        return dataNewsMarkMapper.insertDataNewsMark(dataNewsMark);
    }

    /**
     * 修改数据-文章-标签
     * 
     * @param dataNewsMark 数据-文章-标签
     * @return 结果
     */
    @Override
    public int updateDataNewsMark(DataNewsMark dataNewsMark)
    {
        return dataNewsMarkMapper.updateDataNewsMark(dataNewsMark);
    }

    /**
     * 批量删除数据-文章-标签
     * 
     * @param ids 需要删除的数据-文章-标签ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsMarkByIds(Long[] ids)
    {
        return dataNewsMarkMapper.deleteDataNewsMarkByIds(ids);
    }

    /**
     * 删除数据-文章-标签信息
     * 
     * @param id 数据-文章-标签ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsMarkById(Long id)
    {
        return dataNewsMarkMapper.deleteDataNewsMarkById(id);
    }
}
