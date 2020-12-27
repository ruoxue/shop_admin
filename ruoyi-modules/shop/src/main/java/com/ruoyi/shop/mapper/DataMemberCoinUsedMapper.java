package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataMemberCoinUsed;

/**
 * 数据-会员-金币-消费Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataMemberCoinUsedMapper 
{
    /**
     * 查询数据-会员-金币-消费
     * 
     * @param id 数据-会员-金币-消费ID
     * @return 数据-会员-金币-消费
     */
    public DataMemberCoinUsed selectDataMemberCoinUsedById(Long id);

    /**
     * 查询数据-会员-金币-消费列表
     * 
     * @param dataMemberCoinUsed 数据-会员-金币-消费
     * @return 数据-会员-金币-消费集合
     */
    public List<DataMemberCoinUsed> selectDataMemberCoinUsedList(DataMemberCoinUsed dataMemberCoinUsed);

    /**
     * 新增数据-会员-金币-消费
     * 
     * @param dataMemberCoinUsed 数据-会员-金币-消费
     * @return 结果
     */
    public int insertDataMemberCoinUsed(DataMemberCoinUsed dataMemberCoinUsed);

    /**
     * 修改数据-会员-金币-消费
     * 
     * @param dataMemberCoinUsed 数据-会员-金币-消费
     * @return 结果
     */
    public int updateDataMemberCoinUsed(DataMemberCoinUsed dataMemberCoinUsed);

    /**
     * 删除数据-会员-金币-消费
     * 
     * @param id 数据-会员-金币-消费ID
     * @return 结果
     */
    public int deleteDataMemberCoinUsedById(Long id);

    /**
     * 批量删除数据-会员-金币-消费
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataMemberCoinUsedByIds(Long[] ids);
}
