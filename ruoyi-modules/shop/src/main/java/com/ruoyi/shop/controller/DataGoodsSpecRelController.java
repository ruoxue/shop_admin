package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataGoodsSpecRel;
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
import com.ruoyi.shop.service.IDataGoodsSpecRelService;
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
@RequestMapping("/rel")
public class DataGoodsSpecRelController extends BaseController
{
    @Autowired
    private IDataGoodsSpecRelService dataGoodsSpecRelService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:rel:list")
    @GetMapping("/list")
    public TableDataInfo list(DataGoodsSpecRel dataGoodsSpecRel)
    {
        startPage();
        List<DataGoodsSpecRel> list = dataGoodsSpecRelService.selectDataGoodsSpecRelList(dataGoodsSpecRel);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:rel:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataGoodsSpecRel dataGoodsSpecRel) throws IOException
    {
        List<DataGoodsSpecRel> list = dataGoodsSpecRelService.selectDataGoodsSpecRelList(dataGoodsSpecRel);
        ExcelUtil<DataGoodsSpecRel> util = new ExcelUtil<DataGoodsSpecRel>(DataGoodsSpecRel.class);
        util.exportExcel(response, list, "rel");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize(hasPermi = "system:rel:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataGoodsSpecRelService.selectDataGoodsSpecRelById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:rel:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataGoodsSpecRel dataGoodsSpecRel)
    {
        return toAjax(dataGoodsSpecRelService.insertDataGoodsSpecRel(dataGoodsSpecRel));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:rel:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataGoodsSpecRel dataGoodsSpecRel)
    {
        return toAjax(dataGoodsSpecRelService.updateDataGoodsSpecRel(dataGoodsSpecRel));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:rel:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataGoodsSpecRelService.deleteDataGoodsSpecRelByIds(ids));
    }
}
