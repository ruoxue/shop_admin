package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataNewsXCommentMapper;
import com.ruoyi.shop.domain.DataNewsXComment;
import com.ruoyi.shop.service.IDataNewsXCommentService;

/**
 * 数据-文章-会员-评论Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataNewsXCommentServiceImpl implements IDataNewsXCommentService 
{
    @Autowired
    private DataNewsXCommentMapper dataNewsXCommentMapper;

    /**
     * 查询数据-文章-会员-评论
     * 
     * @param id 数据-文章-会员-评论ID
     * @return 数据-文章-会员-评论
     */
    @Override
    public DataNewsXComment selectDataNewsXCommentById(Long id)
    {
        return dataNewsXCommentMapper.selectDataNewsXCommentById(id);
    }

    /**
     * 查询数据-文章-会员-评论列表
     * 
     * @param dataNewsXComment 数据-文章-会员-评论
     * @return 数据-文章-会员-评论
     */
    @Override
    public List<DataNewsXComment> selectDataNewsXCommentList(DataNewsXComment dataNewsXComment)
    {
        return dataNewsXCommentMapper.selectDataNewsXCommentList(dataNewsXComment);
    }

    /**
     * 新增数据-文章-会员-评论
     * 
     * @param dataNewsXComment 数据-文章-会员-评论
     * @return 结果
     */
    @Override
    public int insertDataNewsXComment(DataNewsXComment dataNewsXComment)
    {
        return dataNewsXCommentMapper.insertDataNewsXComment(dataNewsXComment);
    }

    /**
     * 修改数据-文章-会员-评论
     * 
     * @param dataNewsXComment 数据-文章-会员-评论
     * @return 结果
     */
    @Override
    public int updateDataNewsXComment(DataNewsXComment dataNewsXComment)
    {
        return dataNewsXCommentMapper.updateDataNewsXComment(dataNewsXComment);
    }

    /**
     * 批量删除数据-文章-会员-评论
     * 
     * @param ids 需要删除的数据-文章-会员-评论ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsXCommentByIds(Long[] ids)
    {
        return dataNewsXCommentMapper.deleteDataNewsXCommentByIds(ids);
    }

    /**
     * 删除数据-文章-会员-评论信息
     * 
     * @param id 数据-文章-会员-评论ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsXCommentById(Long id)
    {
        return dataNewsXCommentMapper.deleteDataNewsXCommentById(id);
    }
}
