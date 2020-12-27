package com.ruoyi.shop.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.shop.service.IDataSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.DataSettingMapper;
import com.ruoyi.shop.domain.DataSetting;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@Service
public class DataSettingServiceImpl implements IDataSettingService
{
    @Autowired
    private DataSettingMapper dataSettingMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param key 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DataSetting selectDataSettingById(String key)
    {
        return dataSettingMapper.selectDataSettingById(key);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataSetting 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DataSetting> selectDataSettingList(DataSetting dataSetting)
    {
        return dataSettingMapper.selectDataSettingList(dataSetting);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataSetting 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDataSetting(DataSetting dataSetting)
    {
        return dataSettingMapper.insertDataSetting(dataSetting);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataSetting 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDataSetting(DataSetting dataSetting)
    {
        dataSetting.setUpdateTime(DateUtils.getNowDate());
        return dataSettingMapper.updateDataSetting(dataSetting);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param keys 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataSettingByIds(String[] keys)
    {
        return dataSettingMapper.deleteDataSettingByIds(keys);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param key 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDataSettingById(String key)
    {
        return dataSettingMapper.deleteDataSettingById(key);
    }
}
