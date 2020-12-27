package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataTruckTemplate;
import com.ruoyi.shop.service.IDataTruckTemplateService;
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
 * 商城-快递-费用Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/template")
public class DataTruckTemplateController extends BaseController
{
    @Autowired
    private IDataTruckTemplateService dataTruckTemplateService;

    /**
     * 查询商城-快递-费用列表
     */
    @PreAuthorize(hasPermi = "system:template:list")
    @GetMapping("/list")
    public TableDataInfo list(DataTruckTemplate dataTruckTemplate)
    {
        startPage();
        List<DataTruckTemplate> list = dataTruckTemplateService.selectDataTruckTemplateList(dataTruckTemplate);
        return getDataTable(list);
    }

    /**
     * 导出商城-快递-费用列表
     */
    @PreAuthorize(hasPermi = "system:template:export")
    @Log(title = "商城-快递-费用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataTruckTemplate dataTruckTemplate) throws IOException
    {
        List<DataTruckTemplate> list = dataTruckTemplateService.selectDataTruckTemplateList(dataTruckTemplate);
        ExcelUtil<DataTruckTemplate> util = new ExcelUtil<DataTruckTemplate>(DataTruckTemplate.class);
        util.exportExcel(response, list, "template");
    }

    /**
     * 获取商城-快递-费用详细信息
     */
    @PreAuthorize(hasPermi = "system:template:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataTruckTemplateService.selectDataTruckTemplateById(id));
    }

    /**
     * 新增商城-快递-费用
     */
    @PreAuthorize(hasPermi = "system:template:add")
    @Log(title = "商城-快递-费用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataTruckTemplate dataTruckTemplate)
    {
        return toAjax(dataTruckTemplateService.insertDataTruckTemplate(dataTruckTemplate));
    }

    /**
     * 修改商城-快递-费用
     */
    @PreAuthorize(hasPermi = "system:template:edit")
    @Log(title = "商城-快递-费用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataTruckTemplate dataTruckTemplate)
    {
        return toAjax(dataTruckTemplateService.updateDataTruckTemplate(dataTruckTemplate));
    }

    /**
     * 删除商城-快递-费用
     */
    @PreAuthorize(hasPermi = "system:template:remove")
    @Log(title = "商城-快递-费用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataTruckTemplateService.deleteDataTruckTemplateByIds(ids));
    }
}
