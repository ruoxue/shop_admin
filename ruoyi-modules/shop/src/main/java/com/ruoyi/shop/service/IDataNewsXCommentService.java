package com.ruoyi.shop.service;

import java.util.List;
import com.ruoyi.shop.domain.DataNewsXComment;

/**
 * 数据-文章-会员-评论Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataNewsXCommentService 
{
    /**
     * 查询数据-文章-会员-评论
     * 
     * @param id 数据-文章-会员-评论ID
     * @return 数据-文章-会员-评论
     */
    public DataNewsXComment selectDataNewsXCommentById(Long id);

    /**
     * 查询数据-文章-会员-评论列表
     * 
     * @param dataNewsXComment 数据-文章-会员-评论
     * @return 数据-文章-会员-评论集合
     */
    public List<DataNewsXComment> selectDataNewsXCommentList(DataNewsXComment dataNewsXComment);

    /**
     * 新增数据-文章-会员-评论
     * 
     * @param dataNewsXComment 数据-文章-会员-评论
     * @return 结果
     */
    public int insertDataNewsXComment(DataNewsXComment dataNewsXComment);

    /**
     * 修改数据-文章-会员-评论
     * 
     * @param dataNewsXComment 数据-文章-会员-评论
     * @return 结果
     */
    public int updateDataNewsXComment(DataNewsXComment dataNewsXComment);

    /**
     * 批量删除数据-文章-会员-评论
     * 
     * @param ids 需要删除的数据-文章-会员-评论ID
     * @return 结果
     */
    public int deleteDataNewsXCommentByIds(Long[] ids);

    /**
     * 删除数据-文章-会员-评论信息
     * 
     * @param id 数据-文章-会员-评论ID
     * @return 结果
     */
    public int deleteDataNewsXCommentById(Long id);
}
