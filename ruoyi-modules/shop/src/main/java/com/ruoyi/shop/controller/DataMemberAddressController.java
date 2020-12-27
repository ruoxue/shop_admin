package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataMemberAddress;
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
import com.ruoyi.shop.service.IDataMemberAddressService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 数据-会员-地址Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/member_address")
public class DataMemberAddressController extends BaseController
{
    @Autowired
    private IDataMemberAddressService dataMemberAddressService;

    /**
     * 查询数据-会员-地址列表
     */
    @PreAuthorize(hasPermi = "system:address:list")
    @GetMapping("/list")
    public TableDataInfo list(DataMemberAddress dataMemberAddress)
    {
        startPage();
        List<DataMemberAddress> list = dataMemberAddressService.selectDataMemberAddressList(dataMemberAddress);
        return getDataTable(list);
    }

    /**
     * 导出数据-会员-地址列表
     */
    @PreAuthorize(hasPermi = "system:address:export")
    @Log(title = "数据-会员-地址", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataMemberAddress dataMemberAddress) throws IOException
    {
        List<DataMemberAddress> list = dataMemberAddressService.selectDataMemberAddressList(dataMemberAddress);
        ExcelUtil<DataMemberAddress> util = new ExcelUtil<DataMemberAddress>(DataMemberAddress.class);
        util.exportExcel(response, list, "address");
    }

    /**
     * 获取数据-会员-地址详细信息
     */
    @PreAuthorize(hasPermi = "system:address:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataMemberAddressService.selectDataMemberAddressById(id));
    }

    /**
     * 新增数据-会员-地址
     */
    @PreAuthorize(hasPermi = "system:address:add")
    @Log(title = "数据-会员-地址", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataMemberAddress dataMemberAddress)
    {
        return toAjax(dataMemberAddressService.insertDataMemberAddress(dataMemberAddress));
    }

    /**
     * 修改数据-会员-地址
     */
    @PreAuthorize(hasPermi = "system:address:edit")
    @Log(title = "数据-会员-地址", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataMemberAddress dataMemberAddress)
    {
        return toAjax(dataMemberAddressService.updateDataMemberAddress(dataMemberAddress));
    }

    /**
     * 删除数据-会员-地址
     */
    @PreAuthorize(hasPermi = "system:address:remove")
    @Log(title = "数据-会员-地址", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataMemberAddressService.deleteDataMemberAddressByIds(ids));
    }
}
