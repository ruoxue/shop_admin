package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataNewsXCollect;
import com.ruoyi.shop.service.IDataNewsXCollectService;
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
 * 数据-文章-会员-收藏Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/collect")
public class DataNewsXCollectController extends BaseController
{
    @Autowired
    private IDataNewsXCollectService dataNewsXCollectService;

    /**
     * 查询数据-文章-会员-收藏列表
     */
    @PreAuthorize(hasPermi = "system:collect:list")
    @GetMapping("/list")
    public TableDataInfo list(DataNewsXCollect dataNewsXCollect)
    {
        startPage();
        List<DataNewsXCollect> list = dataNewsXCollectService.selectDataNewsXCollectList(dataNewsXCollect);
        return getDataTable(list);
    }

    /**
     * 导出数据-文章-会员-收藏列表
     */
    @PreAuthorize(hasPermi = "system:collect:export")
    @Log(title = "数据-文章-会员-收藏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataNewsXCollect dataNewsXCollect) throws IOException
    {
        List<DataNewsXCollect> list = dataNewsXCollectService.selectDataNewsXCollectList(dataNewsXCollect);
        ExcelUtil<DataNewsXCollect> util = new ExcelUtil<DataNewsXCollect>(DataNewsXCollect.class);
        util.exportExcel(response, list, "collect");
    }

    /**
     * 获取数据-文章-会员-收藏详细信息
     */
    @PreAuthorize(hasPermi = "system:collect:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataNewsXCollectService.selectDataNewsXCollectById(id));
    }

    /**
     * 新增数据-文章-会员-收藏
     */
    @PreAuthorize(hasPermi = "system:collect:add")
    @Log(title = "数据-文章-会员-收藏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataNewsXCollect dataNewsXCollect)
    {
        return toAjax(dataNewsXCollectService.insertDataNewsXCollect(dataNewsXCollect));
    }

    /**
     * 修改数据-文章-会员-收藏
     */
    @PreAuthorize(hasPermi = "system:collect:edit")
    @Log(title = "数据-文章-会员-收藏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataNewsXCollect dataNewsXCollect)
    {
        return toAjax(dataNewsXCollectService.updateDataNewsXCollect(dataNewsXCollect));
    }

    /**
     * 删除数据-文章-会员-收藏
     */
    @PreAuthorize(hasPermi = "system:collect:remove")
    @Log(title = "数据-文章-会员-收藏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataNewsXCollectService.deleteDataNewsXCollectByIds(ids));
    }
}
