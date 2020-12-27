package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataTruckCompany;
import com.ruoyi.shop.service.IDataTruckCompanyService;
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
 * 商城-快递-公司Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/company")
public class DataTruckCompanyController extends BaseController
{
    @Autowired
    private IDataTruckCompanyService dataTruckCompanyService;

    /**
     * 查询商城-快递-公司列表
     */
    @PreAuthorize(hasPermi = "system:company:list")
    @GetMapping("/list")
    public TableDataInfo list(DataTruckCompany dataTruckCompany)
    {
        startPage();
        List<DataTruckCompany> list = dataTruckCompanyService.selectDataTruckCompanyList(dataTruckCompany);
        return getDataTable(list);
    }

    /**
     * 导出商城-快递-公司列表
     */
    @PreAuthorize(hasPermi = "system:company:export")
    @Log(title = "商城-快递-公司", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataTruckCompany dataTruckCompany) throws IOException
    {
        List<DataTruckCompany> list = dataTruckCompanyService.selectDataTruckCompanyList(dataTruckCompany);
        ExcelUtil<DataTruckCompany> util = new ExcelUtil<DataTruckCompany>(DataTruckCompany.class);
        util.exportExcel(response, list, "company");
    }

    /**
     * 获取商城-快递-公司详细信息
     */
    @PreAuthorize(hasPermi = "system:company:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataTruckCompanyService.selectDataTruckCompanyById(id));
    }

    /**
     * 新增商城-快递-公司
     */
    @PreAuthorize(hasPermi = "system:company:add")
    @Log(title = "商城-快递-公司", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataTruckCompany dataTruckCompany)
    {
        return toAjax(dataTruckCompanyService.insertDataTruckCompany(dataTruckCompany));
    }

    /**
     * 修改商城-快递-公司
     */
    @PreAuthorize(hasPermi = "system:company:edit")
    @Log(title = "商城-快递-公司", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataTruckCompany dataTruckCompany)
    {
        return toAjax(dataTruckCompanyService.updateDataTruckCompany(dataTruckCompany));
    }

    /**
     * 删除商城-快递-公司
     */
    @PreAuthorize(hasPermi = "system:company:remove")
    @Log(title = "商城-快递-公司", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataTruckCompanyService.deleteDataTruckCompanyByIds(ids));
    }
}
