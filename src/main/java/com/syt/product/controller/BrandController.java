package com.syt.product.controller;


import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.syt.product.pojo.dto.BrandAddNewDTO;
import com.syt.product.pojo.vo.BrandListItemVO;
import com.syt.product.pojo.vo.BrandStandardVO;
import com.syt.product.service.IBrandService;
import com.syt.product.web.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 品牌控制层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:09
 */
@Api(tags = "03. 品牌管理")
@RestController
@RequestMapping("/brand")
@Slf4j
public class BrandController {

    @Autowired
    private IBrandService brandService;

    public BrandController() {
        log.info("开始处理属性模板控制层---");
    }

    @ApiOperation("添加品牌")
    @ApiOperationSupport(order = 1)
    @PostMapping("/add-new")
    public JsonResult<Void> addNew(@RequestBody BrandAddNewDTO brandAddNewDTO) {
        log.debug("开始处理品牌的添加: {}", brandAddNewDTO);
        brandService.addNew(brandAddNewDTO);
        return JsonResult.ok();
    }

    @ApiOperation("删除品牌")
    @ApiOperationSupport(order = 2)
    @GetMapping("/delById/{id}")
    public JsonResult<Void> deleteById(@PathVariable Long id) {
        log.debug("开始处理品牌deleteById: {}", id);
        brandService.deleteById(id);
        return JsonResult.ok();
    }

    @ApiOperation("启用品牌")
    @ApiOperationSupport(order = 3)
    @GetMapping("/enable/{id:[0-9]+}")
    public JsonResult<Void> setEnable(@PathVariable Long id) {
        log.debug("开始处理品牌setEnable: {}", id);
        brandService.setEnable(id);
        String message = "启用品牌成功";
        log.debug(message);
        return JsonResult.ok(message);
    }

    @ApiOperation("禁用品牌")
    @ApiOperationSupport(order = 4)
    @GetMapping("/disable/{id:[0-9]+}")
    public JsonResult<Void> setDisEnable(@PathVariable Long id) {
        log.debug("开始处理品牌disEnable: {}", id);
        brandService.setDisable(id);
        String message = "禁用品牌成功";
        log.debug(message);
        return JsonResult.ok(message);
    }

    @ApiOperation("查找品牌")
    @ApiOperationSupport(order = 400)
    @GetMapping("/{id:[0-9]+}")
    public JsonResult<BrandStandardVO> getStandardById(@PathVariable Long id) {
        log.debug("开始查询品牌getStandardById: {}", id);
        BrandStandardVO standardById = brandService.getStandardById(id);
        return JsonResult.ok(standardById, "查询成功");
    }

    @ApiOperation("品牌列表")
    @ApiOperationSupport(order = 500)
    @PostMapping("")
    public JsonResult<List<BrandListItemVO>> list() {
        String message = "开始查询品牌列表";
        log.debug(message);
        return JsonResult.ok(brandService.list(), message);
    }
}
