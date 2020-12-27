package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataStoreUserMapper;
import com.ruoyi.shop.domain.DataStoreUser;
import com.ruoyi.shop.service.IDataStoreUserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataStoreUserServiceImpl implements IDataStoreUserService 
{
    @Autowired
    private DataStoreUserMapper dataStoreUserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param storeUserId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataStoreUser selectDataStoreUserById(Long storeUserId)
    {
        return dataStoreUserMapper.selectDataStoreUserById(storeUserId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataStoreUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataStoreUser> selectDataStoreUserList(DataStoreUser dataStoreUser)
    {
        return dataStoreUserMapper.selectDataStoreUserList(dataStoreUser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataStoreUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataStoreUser(DataStoreUser dataStoreUser)
    {
        dataStoreUser.setCreateTime(DateUtils.getNowDate());
        return dataStoreUserMapper.insertDataStoreUser(dataStoreUser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataStoreUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataStoreUser(DataStoreUser dataStoreUser)
    {
        dataStoreUser.setUpdateTime(DateUtils.getNowDate());
        return dataStoreUserMapper.updateDataStoreUser(dataStoreUser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param storeUserIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataStoreUserByIds(Long[] storeUserIds)
    {
        return dataStoreUserMapper.deleteDataStoreUserByIds(storeUserIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param storeUserId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataStoreUserById(Long storeUserId)
    {
        return dataStoreUserMapper.deleteDataStoreUserById(storeUserId);
    }
}
