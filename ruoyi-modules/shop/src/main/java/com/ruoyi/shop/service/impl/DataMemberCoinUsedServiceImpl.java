package com.ruoyi.shop.service.impl;

import java.util.List;

import com.ruoyi.shop.domain.DataMemberCoinUsed;
import com.ruoyi.shop.mapper.DataMemberCoinUsedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.service.IDataMemberCoinUsedService;

/**
 * 数据-会员-金币-消费Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataMemberCoinUsedServiceImpl implements IDataMemberCoinUsedService 
{
    @Autowired
    private DataMemberCoinUsedMapper dataMemberCoinUsedMapper;

    /**
     * 查询数据-会员-金币-消费
     * 
     * @param id 数据-会员-金币-消费ID
     * @return 数据-会员-金币-消费
     */
    @Override
    public DataMemberCoinUsed selectDataMemberCoinUsedById(Long id)
    {
        return dataMemberCoinUsedMapper.selectDataMemberCoinUsedById(id);
    }

    /**
     * 查询数据-会员-金币-消费列表
     * 
     * @param dataMemberCoinUsed 数据-会员-金币-消费
     * @return 数据-会员-金币-消费
     */
    @Override
    public List<DataMemberCoinUsed> selectDataMemberCoinUsedList(DataMemberCoinUsed dataMemberCoinUsed)
    {
        return dataMemberCoinUsedMapper.selectDataMemberCoinUsedList(dataMemberCoinUsed);
    }

    /**
     * 新增数据-会员-金币-消费
     * 
     * @param dataMemberCoinUsed 数据-会员-金币-消费
     * @return 结果
     */
    @Override
    public int insertDataMemberCoinUsed(DataMemberCoinUsed dataMemberCoinUsed)
    {
        return dataMemberCoinUsedMapper.insertDataMemberCoinUsed(dataMemberCoinUsed);
    }

    /**
     * 修改数据-会员-金币-消费
     * 
     * @param dataMemberCoinUsed 数据-会员-金币-消费
     * @return 结果
     */
    @Override
    public int updateDataMemberCoinUsed(DataMemberCoinUsed dataMemberCoinUsed)
    {
        return dataMemberCoinUsedMapper.updateDataMemberCoinUsed(dataMemberCoinUsed);
    }

    /**
     * 批量删除数据-会员-金币-消费
     * 
     * @param ids 需要删除的数据-会员-金币-消费ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberCoinUsedByIds(Long[] ids)
    {
        return dataMemberCoinUsedMapper.deleteDataMemberCoinUsedByIds(ids);
    }

    /**
     * 删除数据-会员-金币-消费信息
     * 
     * @param id 数据-会员-金币-消费ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberCoinUsedById(Long id)
    {
        return dataMemberCoinUsedMapper.deleteDataMemberCoinUsedById(id);
    }
}
