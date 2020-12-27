package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataSetting;
import com.ruoyi.shop.service.IDataSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.PreAuthorize;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/setting")
public class DataSettingController extends BaseController
{
    @Autowired
    private IDataSettingService dataSettingService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:setting:list")
    @GetMapping("/list")
    public TableDataInfo list(DataSetting dataSetting)
    {
        startPage();
        List<DataSetting> list = dataSettingService.selectDataSettingList(dataSetting);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:setting:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataSetting dataSetting) throws IOException
    {
        List<DataSetting> list = dataSettingService.selectDataSettingList(dataSetting);
        ExcelUtil<DataSetting> util = new ExcelUtil<DataSetting>(DataSetting.class);
        util.exportExcel(response, list, "setting");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize(hasPermi = "system:setting:query")
    @GetMapping(value = "/{key}")
    public AjaxResult getInfo(@PathVariable("key") String key)
    {
        return AjaxResult.success(dataSettingService.selectDataSettingById(key));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:setting:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataSetting dataSetting)
    {
        return toAjax(dataSettingService.insertDataSetting(dataSetting));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:setting:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataSetting dataSetting)
    {
        return toAjax(dataSettingService.updateDataSetting(dataSetting));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:setting:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{keys}")
    public AjaxResult remove(@PathVariable String[] keys)
    {
        return toAjax(dataSettingService.deleteDataSettingByIds(keys));
    }
}
