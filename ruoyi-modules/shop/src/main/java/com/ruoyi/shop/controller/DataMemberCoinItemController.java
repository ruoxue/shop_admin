package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataMemberCoinItem;
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
import com.ruoyi.shop.service.IDataMemberCoinItemService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 数据-会员-金币-获得Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/coin_item")
public class DataMemberCoinItemController extends BaseController
{
    @Autowired
    private IDataMemberCoinItemService dataMemberCoinItemService;

    /**
     * 查询数据-会员-金币-获得列表
     */
    @PreAuthorize(hasPermi = "system:item:list")
    @GetMapping("/list")
    public TableDataInfo list(DataMemberCoinItem dataMemberCoinItem)
    {
        startPage();
        List<DataMemberCoinItem> list = dataMemberCoinItemService.selectDataMemberCoinItemList(dataMemberCoinItem);
        return getDataTable(list);
    }

    /**
     * 导出数据-会员-金币-获得列表
     */
    @PreAuthorize(hasPermi = "system:item:export")
    @Log(title = "数据-会员-金币-获得", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataMemberCoinItem dataMemberCoinItem) throws IOException
    {
        List<DataMemberCoinItem> list = dataMemberCoinItemService.selectDataMemberCoinItemList(dataMemberCoinItem);
        ExcelUtil<DataMemberCoinItem> util = new ExcelUtil<DataMemberCoinItem>(DataMemberCoinItem.class);
        util.exportExcel(response, list, "item");
    }

    /**
     * 获取数据-会员-金币-获得详细信息
     */
    @PreAuthorize(hasPermi = "system:item:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataMemberCoinItemService.selectDataMemberCoinItemById(id));
    }

    /**
     * 新增数据-会员-金币-获得
     */
    @PreAuthorize(hasPermi = "system:item:add")
    @Log(title = "数据-会员-金币-获得", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataMemberCoinItem dataMemberCoinItem)
    {
        return toAjax(dataMemberCoinItemService.insertDataMemberCoinItem(dataMemberCoinItem));
    }

    /**
     * 修改数据-会员-金币-获得
     */
    @PreAuthorize(hasPermi = "system:item:edit")
    @Log(title = "数据-会员-金币-获得", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataMemberCoinItem dataMemberCoinItem)
    {
        return toAjax(dataMemberCoinItemService.updateDataMemberCoinItem(dataMemberCoinItem));
    }

    /**
     * 删除数据-会员-金币-获得
     */
    @PreAuthorize(hasPermi = "system:item:remove")
    @Log(title = "数据-会员-金币-获得", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataMemberCoinItemService.deleteDataMemberCoinItemByIds(ids));
    }
}
