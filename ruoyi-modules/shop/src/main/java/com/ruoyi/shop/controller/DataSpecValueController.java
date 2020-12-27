package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataSpecValue;
import com.ruoyi.shop.service.IDataSpecValueService;
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
@RequestMapping("/value")
public class DataSpecValueController extends BaseController
{
    @Autowired
    private IDataSpecValueService dataSpecValueService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:value:list")
    @GetMapping("/list")
    public TableDataInfo list(DataSpecValue dataSpecValue)
    {
        startPage();
        List<DataSpecValue> list = dataSpecValueService.selectDataSpecValueList(dataSpecValue);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:value:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataSpecValue dataSpecValue) throws IOException
    {
        List<DataSpecValue> list = dataSpecValueService.selectDataSpecValueList(dataSpecValue);
        ExcelUtil<DataSpecValue> util = new ExcelUtil<DataSpecValue>(DataSpecValue.class);
        util.exportExcel(response, list, "value");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize(hasPermi = "system:value:query")
    @GetMapping(value = "/{specValueId}")
    public AjaxResult getInfo(@PathVariable("specValueId") Long specValueId)
    {
        return AjaxResult.success(dataSpecValueService.selectDataSpecValueById(specValueId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:value:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataSpecValue dataSpecValue)
    {
        return toAjax(dataSpecValueService.insertDataSpecValue(dataSpecValue));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:value:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataSpecValue dataSpecValue)
    {
        return toAjax(dataSpecValueService.updateDataSpecValue(dataSpecValue));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:value:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{specValueIds}")
    public AjaxResult remove(@PathVariable Long[] specValueIds)
    {
        return toAjax(dataSpecValueService.deleteDataSpecValueByIds(specValueIds));
    }
}
