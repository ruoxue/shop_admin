package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataNewsXHistory;
import com.ruoyi.shop.service.IDataNewsXHistoryService;
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
 * 数据-文章-会员-历史Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/history")
public class DataNewsXHistoryController extends BaseController
{
    @Autowired
    private IDataNewsXHistoryService dataNewsXHistoryService;

    /**
     * 查询数据-文章-会员-历史列表
     */
    @PreAuthorize(hasPermi = "system:history:list")
    @GetMapping("/list")
    public TableDataInfo list(DataNewsXHistory dataNewsXHistory)
    {
        startPage();
        List<DataNewsXHistory> list = dataNewsXHistoryService.selectDataNewsXHistoryList(dataNewsXHistory);
        return getDataTable(list);
    }

    /**
     * 导出数据-文章-会员-历史列表
     */
    @PreAuthorize(hasPermi = "system:history:export")
    @Log(title = "数据-文章-会员-历史", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataNewsXHistory dataNewsXHistory) throws IOException
    {
        List<DataNewsXHistory> list = dataNewsXHistoryService.selectDataNewsXHistoryList(dataNewsXHistory);
        ExcelUtil<DataNewsXHistory> util = new ExcelUtil<DataNewsXHistory>(DataNewsXHistory.class);
        util.exportExcel(response, list, "history");
    }

    /**
     * 获取数据-文章-会员-历史详细信息
     */
    @PreAuthorize(hasPermi = "system:history:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataNewsXHistoryService.selectDataNewsXHistoryById(id));
    }

    /**
     * 新增数据-文章-会员-历史
     */
    @PreAuthorize(hasPermi = "system:history:add")
    @Log(title = "数据-文章-会员-历史", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataNewsXHistory dataNewsXHistory)
    {
        return toAjax(dataNewsXHistoryService.insertDataNewsXHistory(dataNewsXHistory));
    }

    /**
     * 修改数据-文章-会员-历史
     */
    @PreAuthorize(hasPermi = "system:history:edit")
    @Log(title = "数据-文章-会员-历史", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataNewsXHistory dataNewsXHistory)
    {
        return toAjax(dataNewsXHistoryService.updateDataNewsXHistory(dataNewsXHistory));
    }

    /**
     * 删除数据-文章-会员-历史
     */
    @PreAuthorize(hasPermi = "system:history:remove")
    @Log(title = "数据-文章-会员-历史", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataNewsXHistoryService.deleteDataNewsXHistoryByIds(ids));
    }
}
