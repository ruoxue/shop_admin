package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataOrderGoods;
import com.ruoyi.shop.service.IDataOrderGoodsService;
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
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/order_goods")
public class DataOrderGoodsController extends BaseController
{
    @Autowired
    private IDataOrderGoodsService dataOrderGoodsService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:goods:list")
    @GetMapping("/list")
    public TableDataInfo list(DataOrderGoods dataOrderGoods)
    {
        startPage();
        List<DataOrderGoods> list = dataOrderGoodsService.selectDataOrderGoodsList(dataOrderGoods);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:goods:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataOrderGoods dataOrderGoods) throws IOException
    {
        List<DataOrderGoods> list = dataOrderGoodsService.selectDataOrderGoodsList(dataOrderGoods);
        ExcelUtil<DataOrderGoods> util = new ExcelUtil<DataOrderGoods>(DataOrderGoods.class);
        util.exportExcel(response, list, "goods");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize(hasPermi = "system:goods:query")
    @GetMapping(value = "/{orderGoodsId}")
    public AjaxResult getInfo(@PathVariable("orderGoodsId") Long orderGoodsId)
    {
        return AjaxResult.success(dataOrderGoodsService.selectDataOrderGoodsById(orderGoodsId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:goods:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataOrderGoods dataOrderGoods)
    {
        return toAjax(dataOrderGoodsService.insertDataOrderGoods(dataOrderGoods));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:goods:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataOrderGoods dataOrderGoods)
    {
        return toAjax(dataOrderGoodsService.updateDataOrderGoods(dataOrderGoods));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:goods:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orderGoodsIds}")
    public AjaxResult remove(@PathVariable Long[] orderGoodsIds)
    {
        return toAjax(dataOrderGoodsService.deleteDataOrderGoodsByIds(orderGoodsIds));
    }
}
