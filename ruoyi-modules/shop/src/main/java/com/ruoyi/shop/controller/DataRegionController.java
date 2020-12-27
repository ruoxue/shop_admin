package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataRegion;
import com.ruoyi.shop.service.IDataRegionService;
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
@RequestMapping("/region")
public class DataRegionController extends BaseController
{
    @Autowired
    private IDataRegionService dataRegionService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:region:list")
    @GetMapping("/list")
    public TableDataInfo list(DataRegion dataRegion)
    {
        startPage();
        List<DataRegion> list = dataRegionService.selectDataRegionList(dataRegion);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:region:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataRegion dataRegion) throws IOException
    {
        List<DataRegion> list = dataRegionService.selectDataRegionList(dataRegion);
        ExcelUtil<DataRegion> util = new ExcelUtil<DataRegion>(DataRegion.class);
        util.exportExcel(response, list, "region");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize(hasPermi = "system:region:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataRegionService.selectDataRegionById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:region:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataRegion dataRegion)
    {
        return toAjax(dataRegionService.insertDataRegion(dataRegion));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:region:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataRegion dataRegion)
    {
        return toAjax(dataRegionService.updateDataRegion(dataRegion));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:region:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataRegionService.deleteDataRegionByIds(ids));
    }
}
