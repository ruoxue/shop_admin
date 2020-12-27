package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataNewsMark;
import com.ruoyi.shop.service.IDataNewsMarkService;
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
 * 数据-文章-标签Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/mark")
public class DataNewsMarkController extends BaseController
{
    @Autowired
    private IDataNewsMarkService dataNewsMarkService;

    /**
     * 查询数据-文章-标签列表
     */
    @PreAuthorize(hasPermi = "system:mark:list")
    @GetMapping("/list")
    public TableDataInfo list(DataNewsMark dataNewsMark)
    {
        startPage();
        List<DataNewsMark> list = dataNewsMarkService.selectDataNewsMarkList(dataNewsMark);
        return getDataTable(list);
    }

    /**
     * 导出数据-文章-标签列表
     */
    @PreAuthorize(hasPermi = "system:mark:export")
    @Log(title = "数据-文章-标签", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataNewsMark dataNewsMark) throws IOException
    {
        List<DataNewsMark> list = dataNewsMarkService.selectDataNewsMarkList(dataNewsMark);
        ExcelUtil<DataNewsMark> util = new ExcelUtil<DataNewsMark>(DataNewsMark.class);
        util.exportExcel(response, list, "mark");
    }

    /**
     * 获取数据-文章-标签详细信息
     */
    @PreAuthorize(hasPermi = "system:mark:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataNewsMarkService.selectDataNewsMarkById(id));
    }

    /**
     * 新增数据-文章-标签
     */
    @PreAuthorize(hasPermi = "system:mark:add")
    @Log(title = "数据-文章-标签", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataNewsMark dataNewsMark)
    {
        return toAjax(dataNewsMarkService.insertDataNewsMark(dataNewsMark));
    }

    /**
     * 修改数据-文章-标签
     */
    @PreAuthorize(hasPermi = "system:mark:edit")
    @Log(title = "数据-文章-标签", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataNewsMark dataNewsMark)
    {
        return toAjax(dataNewsMarkService.updateDataNewsMark(dataNewsMark));
    }

    /**
     * 删除数据-文章-标签
     */
    @PreAuthorize(hasPermi = "system:mark:remove")
    @Log(title = "数据-文章-标签", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataNewsMarkService.deleteDataNewsMarkByIds(ids));
    }
}
