package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataMemberMessage;
import com.ruoyi.shop.service.IDataMemberMessageService;
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
 * 系统-会员-短信Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/message")
public class DataMemberMessageController extends BaseController
{
    @Autowired
    private IDataMemberMessageService dataMemberMessageService;

    /**
     * 查询系统-会员-短信列表
     */
    @PreAuthorize(hasPermi = "system:message:list")
    @GetMapping("/list")
    public TableDataInfo list(DataMemberMessage dataMemberMessage)
    {
        startPage();
        List<DataMemberMessage> list = dataMemberMessageService.selectDataMemberMessageList(dataMemberMessage);
        return getDataTable(list);
    }

    /**
     * 导出系统-会员-短信列表
     */
    @PreAuthorize(hasPermi = "system:message:export")
    @Log(title = "系统-会员-短信", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataMemberMessage dataMemberMessage) throws IOException
    {
        List<DataMemberMessage> list = dataMemberMessageService.selectDataMemberMessageList(dataMemberMessage);
        ExcelUtil<DataMemberMessage> util = new ExcelUtil<DataMemberMessage>(DataMemberMessage.class);
        util.exportExcel(response, list, "message");
    }

    /**
     * 获取系统-会员-短信详细信息
     */
    @PreAuthorize(hasPermi = "system:message:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataMemberMessageService.selectDataMemberMessageById(id));
    }

    /**
     * 新增系统-会员-短信
     */
    @PreAuthorize(hasPermi = "system:message:add")
    @Log(title = "系统-会员-短信", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataMemberMessage dataMemberMessage)
    {
        return toAjax(dataMemberMessageService.insertDataMemberMessage(dataMemberMessage));
    }

    /**
     * 修改系统-会员-短信
     */
    @PreAuthorize(hasPermi = "system:message:edit")
    @Log(title = "系统-会员-短信", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataMemberMessage dataMemberMessage)
    {
        return toAjax(dataMemberMessageService.updateDataMemberMessage(dataMemberMessage));
    }

    /**
     * 删除系统-会员-短信
     */
    @PreAuthorize(hasPermi = "system:message:remove")
    @Log(title = "系统-会员-短信", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataMemberMessageService.deleteDataMemberMessageByIds(ids));
    }
}
