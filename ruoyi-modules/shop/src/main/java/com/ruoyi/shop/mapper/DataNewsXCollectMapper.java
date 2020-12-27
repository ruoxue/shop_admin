package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataNewsXCollect;

/**
 * 数据-文章-会员-收藏Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataNewsXCollectMapper 
{
    /**
     * 查询数据-文章-会员-收藏
     * 
     * @param id 数据-文章-会员-收藏ID
     * @return 数据-文章-会员-收藏
     */
    public DataNewsXCollect selectDataNewsXCollectById(Long id);

    /**
     * 查询数据-文章-会员-收藏列表
     * 
     * @param dataNewsXCollect 数据-文章-会员-收藏
     * @return 数据-文章-会员-收藏集合
     */
    public List<DataNewsXCollect> selectDataNewsXCollectList(DataNewsXCollect dataNewsXCollect);

    /**
     * 新增数据-文章-会员-收藏
     * 
     * @param dataNewsXCollect 数据-文章-会员-收藏
     * @return 结果
     */
    public int insertDataNewsXCollect(DataNewsXCollect dataNewsXCollect);

    /**
     * 修改数据-文章-会员-收藏
     * 
     * @param dataNewsXCollect 数据-文章-会员-收藏
     * @return 结果
     */
    public int updateDataNewsXCollect(DataNewsXCollect dataNewsXCollect);

    /**
     * 删除数据-文章-会员-收藏
     * 
     * @param id 数据-文章-会员-收藏ID
     * @return 结果
     */
    public int deleteDataNewsXCollectById(Long id);

    /**
     * 批量删除数据-文章-会员-收藏
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataNewsXCollectByIds(Long[] ids);
}
