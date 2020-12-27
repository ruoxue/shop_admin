package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataNewsItem;
import com.ruoyi.shop.service.IDataNewsItemService;
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
 * 数据-文章-内容Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/item")
public class DataNewsItemController extends BaseController
{
    @Autowired
    private IDataNewsItemService dataNewsItemService;

    /**
     * 查询数据-文章-内容列表
     */
    @PreAuthorize(hasPermi = "shop:item:list")
    @GetMapping("/list")
    public TableDataInfo list(DataNewsItem dataNewsItem)
    {
        startPage();
        List<DataNewsItem> list = dataNewsItemService.selectDataNewsItemList(dataNewsItem);
        return getDataTable(list);
    }

    /**
     * 导出数据-文章-内容列表
     */
    @PreAuthorize(hasPermi = "shop:item:export")
    @Log(title = "数据-文章-内容", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataNewsItem dataNewsItem) throws IOException
    {
        List<DataNewsItem> list = dataNewsItemService.selectDataNewsItemList(dataNewsItem);
        ExcelUtil<DataNewsItem> util = new ExcelUtil<DataNewsItem>(DataNewsItem.class);
        util.exportExcel(response, list, "item");
    }

    /**
     * 获取数据-文章-内容详细信息
     */
    @PreAuthorize(hasPermi = "shop:item:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataNewsItemService.selectDataNewsItemById(id));
    }

    /**
     * 新增数据-文章-内容
     */
    @PreAuthorize(hasPermi = "shop:item:add")
    @Log(title = "数据-文章-内容", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataNewsItem dataNewsItem)
    {
        return toAjax(dataNewsItemService.insertDataNewsItem(dataNewsItem));
    }

    /**
     * 修改数据-文章-内容
     */
    @PreAuthorize(hasPermi = "shop:item:edit")
    @Log(title = "数据-文章-内容", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataNewsItem dataNewsItem)
    {
        return toAjax(dataNewsItemService.updateDataNewsItem(dataNewsItem));
    }

    /**
     * 删除数据-文章-内容
     */
    @PreAuthorize(hasPermi = "shop:item:remove")
    @Log(title = "数据-文章-内容", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataNewsItemService.deleteDataNewsItemByIds(ids));
    }
}
