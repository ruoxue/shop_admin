package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataMemberMessageMapper;
import com.ruoyi.shop.domain.DataMemberMessage;
import com.ruoyi.shop.service.IDataMemberMessageService;

/**
 * 系统-会员-短信Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataMemberMessageServiceImpl implements IDataMemberMessageService 
{
    @Autowired
    private DataMemberMessageMapper dataMemberMessageMapper;

    /**
     * 查询系统-会员-短信
     * 
     * @param id 系统-会员-短信ID
     * @return 系统-会员-短信
     */
    @Override
    public DataMemberMessage selectDataMemberMessageById(Long id)
    {
        return dataMemberMessageMapper.selectDataMemberMessageById(id);
    }

    /**
     * 查询系统-会员-短信列表
     * 
     * @param dataMemberMessage 系统-会员-短信
     * @return 系统-会员-短信
     */
    @Override
    public List<DataMemberMessage> selectDataMemberMessageList(DataMemberMessage dataMemberMessage)
    {
        return dataMemberMessageMapper.selectDataMemberMessageList(dataMemberMessage);
    }

    /**
     * 新增系统-会员-短信
     * 
     * @param dataMemberMessage 系统-会员-短信
     * @return 结果
     */
    @Override
    public int insertDataMemberMessage(DataMemberMessage dataMemberMessage)
    {
        return dataMemberMessageMapper.insertDataMemberMessage(dataMemberMessage);
    }

    /**
     * 修改系统-会员-短信
     * 
     * @param dataMemberMessage 系统-会员-短信
     * @return 结果
     */
    @Override
    public int updateDataMemberMessage(DataMemberMessage dataMemberMessage)
    {
        return dataMemberMessageMapper.updateDataMemberMessage(dataMemberMessage);
    }

    /**
     * 批量删除系统-会员-短信
     * 
     * @param ids 需要删除的系统-会员-短信ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberMessageByIds(Long[] ids)
    {
        return dataMemberMessageMapper.deleteDataMemberMessageByIds(ids);
    }

    /**
     * 删除系统-会员-短信信息
     * 
     * @param id 系统-会员-短信ID
     * @return 结果
     */
    @Override
    public int deleteDataMemberMessageById(Long id)
    {
        return dataMemberMessageMapper.deleteDataMemberMessageById(id);
    }
}
