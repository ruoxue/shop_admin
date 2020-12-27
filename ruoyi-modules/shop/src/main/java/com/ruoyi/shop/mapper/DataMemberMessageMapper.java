package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataMemberMessage;

/**
 * 系统-会员-短信Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataMemberMessageMapper 
{
    /**
     * 查询系统-会员-短信
     * 
     * @param id 系统-会员-短信ID
     * @return 系统-会员-短信
     */
    public DataMemberMessage selectDataMemberMessageById(Long id);

    /**
     * 查询系统-会员-短信列表
     * 
     * @param dataMemberMessage 系统-会员-短信
     * @return 系统-会员-短信集合
     */
    public List<DataMemberMessage> selectDataMemberMessageList(DataMemberMessage dataMemberMessage);

    /**
     * 新增系统-会员-短信
     * 
     * @param dataMemberMessage 系统-会员-短信
     * @return 结果
     */
    public int insertDataMemberMessage(DataMemberMessage dataMemberMessage);

    /**
     * 修改系统-会员-短信
     * 
     * @param dataMemberMessage 系统-会员-短信
     * @return 结果
     */
    public int updateDataMemberMessage(DataMemberMessage dataMemberMessage);

    /**
     * 删除系统-会员-短信
     * 
     * @param id 系统-会员-短信ID
     * @return 结果
     */
    public int deleteDataMemberMessageById(Long id);

    /**
     * 批量删除系统-会员-短信
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataMemberMessageByIds(Long[] ids);
}
