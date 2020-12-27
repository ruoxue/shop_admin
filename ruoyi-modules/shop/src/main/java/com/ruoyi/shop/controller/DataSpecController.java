package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataSpec;
import com.ruoyi.shop.service.IDataSpecService;
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
@RequestMapping("/spec")
public class DataSpecController extends BaseController
{
    @Autowired
    private IDataSpecService dataSpecService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:spec:list")
    @GetMapping("/list")
    public TableDataInfo list(DataSpec dataSpec)
    {
        startPage();
        List<DataSpec> list = dataSpecService.selectDataSpecList(dataSpec);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:spec:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataSpec dataSpec) throws IOException
    {
        List<DataSpec> list = dataSpecService.selectDataSpecList(dataSpec);
        ExcelUtil<DataSpec> util = new ExcelUtil<DataSpec>(DataSpec.class);
        util.exportExcel(response, list, "spec");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize(hasPermi = "system:spec:query")
    @GetMapping(value = "/{specId}")
    public AjaxResult getInfo(@PathVariable("specId") Long specId)
    {
        return AjaxResult.success(dataSpecService.selectDataSpecById(specId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:spec:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataSpec dataSpec)
    {
        return toAjax(dataSpecService.insertDataSpec(dataSpec));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:spec:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataSpec dataSpec)
    {
        return toAjax(dataSpecService.updateDataSpec(dataSpec));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:spec:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{specIds}")
    public AjaxResult remove(@PathVariable Long[] specIds)
    {
        return toAjax(dataSpecService.deleteDataSpecByIds(specIds));
    }
}
