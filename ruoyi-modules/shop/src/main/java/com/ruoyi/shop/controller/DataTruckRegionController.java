package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataTruckRegion;
import com.ruoyi.shop.service.IDataTruckRegionService;
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
 * 商城-快递-区域Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/truck_region")
public class DataTruckRegionController extends BaseController
{
    @Autowired
    private IDataTruckRegionService dataTruckRegionService;

    /**
     * 查询商城-快递-区域列表
     */
    @PreAuthorize(hasPermi = "system:region:list")
    @GetMapping("/list")
    public TableDataInfo list(DataTruckRegion dataTruckRegion)
    {
        startPage();
        List<DataTruckRegion> list = dataTruckRegionService.selectDataTruckRegionList(dataTruckRegion);
        return getDataTable(list);
    }

    /**
     * 导出商城-快递-区域列表
     */
    @PreAuthorize(hasPermi = "system:region:export")
    @Log(title = "商城-快递-区域", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataTruckRegion dataTruckRegion) throws IOException
    {
        List<DataTruckRegion> list = dataTruckRegionService.selectDataTruckRegionList(dataTruckRegion);
        ExcelUtil<DataTruckRegion> util = new ExcelUtil<DataTruckRegion>(DataTruckRegion.class);
        util.exportExcel(response, list, "region");
    }

    /**
     * 获取商城-快递-区域详细信息
     */
    @PreAuthorize(hasPermi = "system:region:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataTruckRegionService.selectDataTruckRegionById(id));
    }

    /**
     * 新增商城-快递-区域
     */
    @PreAuthorize(hasPermi = "system:region:add")
    @Log(title = "商城-快递-区域", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataTruckRegion dataTruckRegion)
    {
        return toAjax(dataTruckRegionService.insertDataTruckRegion(dataTruckRegion));
    }

    /**
     * 修改商城-快递-区域
     */
    @PreAuthorize(hasPermi = "system:region:edit")
    @Log(title = "商城-快递-区域", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataTruckRegion dataTruckRegion)
    {
        return toAjax(dataTruckRegionService.updateDataTruckRegion(dataTruckRegion));
    }

    /**
     * 删除商城-快递-区域
     */
    @PreAuthorize(hasPermi = "system:region:remove")
    @Log(title = "商城-快递-区域", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataTruckRegionService.deleteDataTruckRegionByIds(ids));
    }
}
