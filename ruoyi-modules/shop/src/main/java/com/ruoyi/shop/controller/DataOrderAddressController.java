package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataOrderAddress;
import com.ruoyi.shop.service.IDataOrderAddressService;
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
@RequestMapping("/address")
public class DataOrderAddressController extends BaseController
{
    @Autowired
    private IDataOrderAddressService dataOrderAddressService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:address:list")
    @GetMapping("/list")
    public TableDataInfo list(DataOrderAddress dataOrderAddress)
    {
        startPage();
        List<DataOrderAddress> list = dataOrderAddressService.selectDataOrderAddressList(dataOrderAddress);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:address:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataOrderAddress dataOrderAddress) throws IOException
    {
        List<DataOrderAddress> list = dataOrderAddressService.selectDataOrderAddressList(dataOrderAddress);
        ExcelUtil<DataOrderAddress> util = new ExcelUtil<DataOrderAddress>(DataOrderAddress.class);
        util.exportExcel(response, list, "address");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize(hasPermi = "system:address:query")
    @GetMapping(value = "/{orderAddressId}")
    public AjaxResult getInfo(@PathVariable("orderAddressId") Long orderAddressId)
    {
        return AjaxResult.success(dataOrderAddressService.selectDataOrderAddressById(orderAddressId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:address:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataOrderAddress dataOrderAddress)
    {
        return toAjax(dataOrderAddressService.insertDataOrderAddress(dataOrderAddress));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:address:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataOrderAddress dataOrderAddress)
    {
        return toAjax(dataOrderAddressService.updateDataOrderAddress(dataOrderAddress));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:address:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orderAddressIds}")
    public AjaxResult remove(@PathVariable Long[] orderAddressIds)
    {
        return toAjax(dataOrderAddressService.deleteDataOrderAddressByIds(orderAddressIds));
    }
}
