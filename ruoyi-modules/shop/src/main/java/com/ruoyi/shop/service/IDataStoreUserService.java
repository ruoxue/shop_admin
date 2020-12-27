package com.ruoyi.shop.service;

import java.util.List;
import com.ruoyi.shop.domain.DataStoreUser;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface IDataStoreUserService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param storeUserId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataStoreUser selectDataStoreUserById(Long storeUserId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataStoreUser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataStoreUser> selectDataStoreUserList(DataStoreUser dataStoreUser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataStoreUser 【请填写功能名称】
     * @return 结果
     */
    public int insertDataStoreUser(DataStoreUser dataStoreUser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataStoreUser 【请填写功能名称】
     * @return 结果
     */
    public int updateDataStoreUser(DataStoreUser dataStoreUser);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param storeUserIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataStoreUserByIds(Long[] storeUserIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param storeUserId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataStoreUserById(Long storeUserId);
}
