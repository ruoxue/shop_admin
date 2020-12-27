package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataNewsXComment;

/**
 * 数据-文章-会员-评论Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataNewsXCommentMapper 
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
     * 删除数据-文章-会员-评论
     * 
     * @param id 数据-文章-会员-评论ID
     * @return 结果
     */
    public int deleteDataNewsXCommentById(Long id);

    /**
     * 批量删除数据-文章-会员-评论
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataNewsXCommentByIds(Long[] ids);
}
