package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataTruckProvince;
import com.ruoyi.shop.service.IDataTruckProvinceService;
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
 * 商城-快递-省份Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/province")
public class DataTruckProvinceController extends BaseController
{
    @Autowired
    private IDataTruckProvinceService dataTruckProvinceService;

    /**
     * 查询商城-快递-省份列表
     */
    @PreAuthorize(hasPermi = "system:province:list")
    @GetMapping("/list")
    public TableDataInfo list(DataTruckProvince dataTruckProvince)
    {
        startPage();
        List<DataTruckProvince> list = dataTruckProvinceService.selectDataTruckProvinceList(dataTruckProvince);
        return getDataTable(list);
    }

    /**
     * 导出商城-快递-省份列表
     */
    @PreAuthorize(hasPermi = "system:province:export")
    @Log(title = "商城-快递-省份", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataTruckProvince dataTruckProvince) throws IOException
    {
        List<DataTruckProvince> list = dataTruckProvinceService.selectDataTruckProvinceList(dataTruckProvince);
        ExcelUtil<DataTruckProvince> util = new ExcelUtil<DataTruckProvince>(DataTruckProvince.class);
        util.exportExcel(response, list, "province");
    }

    /**
     * 获取商城-快递-省份详细信息
     */
    @PreAuthorize(hasPermi = "system:province:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataTruckProvinceService.selectDataTruckProvinceById(id));
    }

    /**
     * 新增商城-快递-省份
     */
    @PreAuthorize(hasPermi = "system:province:add")
    @Log(title = "商城-快递-省份", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataTruckProvince dataTruckProvince)
    {
        return toAjax(dataTruckProvinceService.insertDataTruckProvince(dataTruckProvince));
    }

    /**
     * 修改商城-快递-省份
     */
    @PreAuthorize(hasPermi = "system:province:edit")
    @Log(title = "商城-快递-省份", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataTruckProvince dataTruckProvince)
    {
        return toAjax(dataTruckProvinceService.updateDataTruckProvince(dataTruckProvince));
    }

    /**
     * 删除商城-快递-省份
     */
    @PreAuthorize(hasPermi = "system:province:remove")
    @Log(title = "商城-快递-省份", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataTruckProvinceService.deleteDataTruckProvinceByIds(ids));
    }
}
