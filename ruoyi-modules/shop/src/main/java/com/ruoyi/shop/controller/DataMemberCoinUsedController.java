package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataMemberCoinUsed;
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
import com.ruoyi.shop.service.IDataMemberCoinUsedService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 数据-会员-金币-消费Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/used")
public class DataMemberCoinUsedController extends BaseController
{
    @Autowired
    private IDataMemberCoinUsedService dataMemberCoinUsedService;

    /**
     * 查询数据-会员-金币-消费列表
     */
    @PreAuthorize(hasPermi = "system:used:list")
    @GetMapping("/list")
    public TableDataInfo list(DataMemberCoinUsed dataMemberCoinUsed)
    {
        startPage();
        List<DataMemberCoinUsed> list = dataMemberCoinUsedService.selectDataMemberCoinUsedList(dataMemberCoinUsed);
        return getDataTable(list);
    }

    /**
     * 导出数据-会员-金币-消费列表
     */
    @PreAuthorize(hasPermi = "system:used:export")
    @Log(title = "数据-会员-金币-消费", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataMemberCoinUsed dataMemberCoinUsed) throws IOException
    {
        List<DataMemberCoinUsed> list = dataMemberCoinUsedService.selectDataMemberCoinUsedList(dataMemberCoinUsed);
        ExcelUtil<DataMemberCoinUsed> util = new ExcelUtil<DataMemberCoinUsed>(DataMemberCoinUsed.class);
        util.exportExcel(response, list, "used");
    }

    /**
     * 获取数据-会员-金币-消费详细信息
     */
    @PreAuthorize(hasPermi = "system:used:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataMemberCoinUsedService.selectDataMemberCoinUsedById(id));
    }

    /**
     * 新增数据-会员-金币-消费
     */
    @PreAuthorize(hasPermi = "system:used:add")
    @Log(title = "数据-会员-金币-消费", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataMemberCoinUsed dataMemberCoinUsed)
    {
        return toAjax(dataMemberCoinUsedService.insertDataMemberCoinUsed(dataMemberCoinUsed));
    }

    /**
     * 修改数据-会员-金币-消费
     */
    @PreAuthorize(hasPermi = "system:used:edit")
    @Log(title = "数据-会员-金币-消费", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataMemberCoinUsed dataMemberCoinUsed)
    {
        return toAjax(dataMemberCoinUsedService.updateDataMemberCoinUsed(dataMemberCoinUsed));
    }

    /**
     * 删除数据-会员-金币-消费
     */
    @PreAuthorize(hasPermi = "system:used:remove")
    @Log(title = "数据-会员-金币-消费", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataMemberCoinUsedService.deleteDataMemberCoinUsedByIds(ids));
    }
}
