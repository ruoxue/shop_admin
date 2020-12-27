package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataNewsXCollectMapper;
import com.ruoyi.shop.domain.DataNewsXCollect;
import com.ruoyi.shop.service.IDataNewsXCollectService;

/**
 * 数据-文章-会员-收藏Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataNewsXCollectServiceImpl implements IDataNewsXCollectService 
{
    @Autowired
    private DataNewsXCollectMapper dataNewsXCollectMapper;

    /**
     * 查询数据-文章-会员-收藏
     * 
     * @param id 数据-文章-会员-收藏ID
     * @return 数据-文章-会员-收藏
     */
    @Override
    public DataNewsXCollect selectDataNewsXCollectById(Long id)
    {
        return dataNewsXCollectMapper.selectDataNewsXCollectById(id);
    }

    /**
     * 查询数据-文章-会员-收藏列表
     * 
     * @param dataNewsXCollect 数据-文章-会员-收藏
     * @return 数据-文章-会员-收藏
     */
    @Override
    public List<DataNewsXCollect> selectDataNewsXCollectList(DataNewsXCollect dataNewsXCollect)
    {
        return dataNewsXCollectMapper.selectDataNewsXCollectList(dataNewsXCollect);
    }

    /**
     * 新增数据-文章-会员-收藏
     * 
     * @param dataNewsXCollect 数据-文章-会员-收藏
     * @return 结果
     */
    @Override
    public int insertDataNewsXCollect(DataNewsXCollect dataNewsXCollect)
    {
        return dataNewsXCollectMapper.insertDataNewsXCollect(dataNewsXCollect);
    }

    /**
     * 修改数据-文章-会员-收藏
     * 
     * @param dataNewsXCollect 数据-文章-会员-收藏
     * @return 结果
     */
    @Override
    public int updateDataNewsXCollect(DataNewsXCollect dataNewsXCollect)
    {
        return dataNewsXCollectMapper.updateDataNewsXCollect(dataNewsXCollect);
    }

    /**
     * 批量删除数据-文章-会员-收藏
     * 
     * @param ids 需要删除的数据-文章-会员-收藏ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsXCollectByIds(Long[] ids)
    {
        return dataNewsXCollectMapper.deleteDataNewsXCollectByIds(ids);
    }

    /**
     * 删除数据-文章-会员-收藏信息
     * 
     * @param id 数据-文章-会员-收藏ID
     * @return 结果
     */
    @Override
    public int deleteDataNewsXCollectById(Long id)
    {
        return dataNewsXCollectMapper.deleteDataNewsXCollectById(id);
    }
}
