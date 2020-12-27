package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataNewsMark;

/**
 * 数据-文章-标签Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataNewsMarkMapper 
{
    /**
     * 查询数据-文章-标签
     * 
     * @param id 数据-文章-标签ID
     * @return 数据-文章-标签
     */
    public DataNewsMark selectDataNewsMarkById(Long id);

    /**
     * 查询数据-文章-标签列表
     * 
     * @param dataNewsMark 数据-文章-标签
     * @return 数据-文章-标签集合
     */
    public List<DataNewsMark> selectDataNewsMarkList(DataNewsMark dataNewsMark);

    /**
     * 新增数据-文章-标签
     * 
     * @param dataNewsMark 数据-文章-标签
     * @return 结果
     */
    public int insertDataNewsMark(DataNewsMark dataNewsMark);

    /**
     * 修改数据-文章-标签
     * 
     * @param dataNewsMark 数据-文章-标签
     * @return 结果
     */
    public int updateDataNewsMark(DataNewsMark dataNewsMark);

    /**
     * 删除数据-文章-标签
     * 
     * @param id 数据-文章-标签ID
     * @return 结果
     */
    public int deleteDataNewsMarkById(Long id);

    /**
     * 批量删除数据-文章-标签
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataNewsMarkByIds(Long[] ids);
}
