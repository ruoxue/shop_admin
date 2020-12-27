package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataGoodsSpec;
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
import com.ruoyi.shop.service.IDataGoodsSpecService;
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
@RequestMapping("/goods_spec")
public class DataGoodsSpecController extends BaseController
{
    @Autowired
    private IDataGoodsSpecService dataGoodsSpecService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:spec:list")
    @GetMapping("/list")
    public TableDataInfo list(DataGoodsSpec dataGoodsSpec)
    {
        startPage();
        List<DataGoodsSpec> list = dataGoodsSpecService.selectDataGoodsSpecList(dataGoodsSpec);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:spec:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataGoodsSpec dataGoodsSpec) throws IOException
    {
        List<DataGoodsSpec> list = dataGoodsSpecService.selectDataGoodsSpecList(dataGoodsSpec);
        ExcelUtil<DataGoodsSpec> util = new ExcelUtil<DataGoodsSpec>(DataGoodsSpec.class);
        util.exportExcel(response, list, "spec");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize(hasPermi = "system:spec:query")
    @GetMapping(value = "/{goodsSpecId}")
    public AjaxResult getInfo(@PathVariable("goodsSpecId") Long goodsSpecId)
    {
        return AjaxResult.success(dataGoodsSpecService.selectDataGoodsSpecById(goodsSpecId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:spec:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataGoodsSpec dataGoodsSpec)
    {
        return toAjax(dataGoodsSpecService.insertDataGoodsSpec(dataGoodsSpec));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:spec:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataGoodsSpec dataGoodsSpec)
    {
        return toAjax(dataGoodsSpecService.updateDataGoodsSpec(dataGoodsSpec));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:spec:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{goodsSpecIds}")
    public AjaxResult remove(@PathVariable Long[] goodsSpecIds)
    {
        return toAjax(dataGoodsSpecService.deleteDataGoodsSpecByIds(goodsSpecIds));
    }
}
