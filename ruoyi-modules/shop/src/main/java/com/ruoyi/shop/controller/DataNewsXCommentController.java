package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataNewsXComment;
import com.ruoyi.shop.service.IDataNewsXCommentService;
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
 * 数据-文章-会员-评论Controller
 * 
 * @author ruoyi
 * @date 2020-12-19
 */
@RestController
@RequestMapping("/comment")
public class DataNewsXCommentController extends BaseController
{
    @Autowired
    private IDataNewsXCommentService dataNewsXCommentService;

    /**
     * 查询数据-文章-会员-评论列表
     */
    @PreAuthorize(hasPermi = "system:comment:list")
    @GetMapping("/list")
    public TableDataInfo list(DataNewsXComment dataNewsXComment)
    {
        startPage();
        List<DataNewsXComment> list = dataNewsXCommentService.selectDataNewsXCommentList(dataNewsXComment);
        return getDataTable(list);
    }

    /**
     * 导出数据-文章-会员-评论列表
     */
    @PreAuthorize(hasPermi = "system:comment:export")
    @Log(title = "数据-文章-会员-评论", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataNewsXComment dataNewsXComment) throws IOException
    {
        List<DataNewsXComment> list = dataNewsXCommentService.selectDataNewsXCommentList(dataNewsXComment);
        ExcelUtil<DataNewsXComment> util = new ExcelUtil<DataNewsXComment>(DataNewsXComment.class);
        util.exportExcel(response, list, "comment");
    }

    /**
     * 获取数据-文章-会员-评论详细信息
     */
    @PreAuthorize(hasPermi = "system:comment:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dataNewsXCommentService.selectDataNewsXCommentById(id));
    }

    /**
     * 新增数据-文章-会员-评论
     */
    @PreAuthorize(hasPermi = "system:comment:add")
    @Log(title = "数据-文章-会员-评论", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataNewsXComment dataNewsXComment)
    {
        return toAjax(dataNewsXCommentService.insertDataNewsXComment(dataNewsXComment));
    }

    /**
     * 修改数据-文章-会员-评论
     */
    @PreAuthorize(hasPermi = "system:comment:edit")
    @Log(title = "数据-文章-会员-评论", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataNewsXComment dataNewsXComment)
    {
        return toAjax(dataNewsXCommentService.updateDataNewsXComment(dataNewsXComment));
    }

    /**
     * 删除数据-文章-会员-评论
     */
    @PreAuthorize(hasPermi = "system:comment:remove")
    @Log(title = "数据-文章-会员-评论", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dataNewsXCommentService.deleteDataNewsXCommentByIds(ids));
    }
}
