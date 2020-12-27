package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataMember;
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
import com.ruoyi.shop.service.IDataMemberService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 数据-会员Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/member")
public class DataMemberController extends BaseController
{
    @Autowired
    private IDataMemberService dataMemberService;

    /**
     * 查询数据-会员列表
     */
    @PreAuthorize(hasPermi = "system:member:list")
    @GetMapping("/list")
    public TableDataInfo list(DataMember dataMember)
    {
        startPage();
        List<DataMember> list = dataMemberService.selectDataMemberList(dataMember);
        return getDataTable(list);
    }

    /**
     * 导出数据-会员列表
     */
    @PreAuthorize(hasPermi = "system:member:export")
    @Log(title = "数据-会员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataMember dataMember) throws IOException
    {
        List<DataMember> list = dataMemberService.selectDataMemberList(dataMember);
        ExcelUtil<DataMember> util = new ExcelUtil<DataMember>(DataMember.class);
        util.exportExcel(response, list, "member");
    }

    /**
     * 获取数据-会员详细信息
     */
    @PreAuthorize(hasPermi = "system:member:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataMemberService.selectDataMemberById(id));
    }

    /**
     * 新增数据-会员
     */
    @PreAuthorize(hasPermi = "system:member:add")
    @Log(title = "数据-会员", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataMember dataMember)
    {
        return toAjax(dataMemberService.insertDataMember(dataMember));
    }

    /**
     * 修改数据-会员
     */
    @PreAuthorize(hasPermi = "system:member:edit")
    @Log(title = "数据-会员", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataMember dataMember)
    {
        return toAjax(dataMemberService.updateDataMember(dataMember));
    }

    /**
     * 删除数据-会员
     */
    @PreAuthorize(hasPermi = "system:member:remove")
    @Log(title = "数据-会员", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataMemberService.deleteDataMemberByIds(ids));
    }
}
