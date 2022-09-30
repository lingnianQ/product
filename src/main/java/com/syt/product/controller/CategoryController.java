package com.syt.product.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.syt.product.pojo.dto.BrandAddNewDTO;
import com.syt.product.pojo.dto.CategoryAddNewDTO;
import com.syt.product.service.IBrandService;
import com.syt.product.service.ICategoryService;
import com.syt.product.web.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 类别控制层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:34
 */
@Api(tags = "03. 分类管理")
@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    public CategoryController() {
        log.info("开始处理类别控制层---");
    }

    @ApiOperation("添加分类")
    @ApiOperationSupport(order = 1)
    @PostMapping("/add-new")
    public JsonResult<Void> addNew(CategoryAddNewDTO categoryAddNewDTO) {
        log.debug("开始处理类别的添加: {}", categoryAddNewDTO);
        categoryService.addNew(categoryAddNewDTO);
        return JsonResult.ok();
    }

    @ApiOperation("删除分类")
    @ApiOperationSupport(order = 2)
    @GetMapping("/delById/{id}")
    public JsonResult<Void> deleteById(@PathVariable Long id) {
        log.debug("开始处理类别deleteById: {}", id);
        categoryService.deleteById(id);
        return JsonResult.ok();
    }
}
