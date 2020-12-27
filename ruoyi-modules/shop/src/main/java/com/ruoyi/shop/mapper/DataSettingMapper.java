package com.ruoyi.shop.mapper;

import java.util.List;
import com.ruoyi.shop.domain.DataSetting;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
public interface DataSettingMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param key 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DataSetting selectDataSettingById(String key);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dataSetting 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DataSetting> selectDataSettingList(DataSetting dataSetting);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dataSetting 【请填写功能名称】
     * @return 结果
     */
    public int insertDataSetting(DataSetting dataSetting);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dataSetting 【请填写功能名称】
     * @return 结果
     */
    public int updateDataSetting(DataSetting dataSetting);

    /**
     * 删除【请填写功能名称】
     * 
     * @param key 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDataSettingById(String key);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param keys 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataSettingByIds(String[] keys);
}
