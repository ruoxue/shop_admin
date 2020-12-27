package com.ruoyi.shop.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.shop.domain.DataStoreUser;
import com.ruoyi.shop.service.IDataStoreUserService;
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
@RequestMapping("/user")
public class DataStoreUserController extends BaseController
{
    @Autowired
    private IDataStoreUserService dataStoreUserService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:user:list")
    @GetMapping("/list")
    public TableDataInfo list(DataStoreUser dataStoreUser)
    {
        startPage();
        List<DataStoreUser> list = dataStoreUserService.selectDataStoreUserList(dataStoreUser);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize(hasPermi = "system:user:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DataStoreUser dataStoreUser) throws IOException
    {
        List<DataStoreUser> list = dataStoreUserService.selectDataStoreUserList(dataStoreUser);
        ExcelUtil<DataStoreUser> util = new ExcelUtil<DataStoreUser>(DataStoreUser.class);
        util.exportExcel(response, list, "user");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize(hasPermi = "system:user:query")
    @GetMapping(value = "/{storeUserId}")
    public AjaxResult getInfo(@PathVariable("storeUserId") Long storeUserId)
    {
        return AjaxResult.success(dataStoreUserService.selectDataStoreUserById(storeUserId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:user:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DataStoreUser dataStoreUser)
    {
        return toAjax(dataStoreUserService.insertDataStoreUser(dataStoreUser));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:user:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DataStoreUser dataStoreUser)
    {
        return toAjax(dataStoreUserService.updateDataStoreUser(dataStoreUser));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize(hasPermi = "system:user:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{storeUserIds}")
    public AjaxResult remove(@PathVariable Long[] storeUserIds)
    {
        return toAjax(dataStoreUserService.deleteDataStoreUserByIds(storeUserIds));
    }
}
