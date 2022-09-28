package com.syt.product.controller;

import com.syt.product.pojo.dto.BrandAddNewDTO;
import com.syt.product.pojo.dto.CategoryAddNewDTO;
import com.syt.product.service.IBrandService;
import com.syt.product.service.ICategoryService;
import com.syt.product.web.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类别控制层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:34
 */
@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    public CategoryController() {
        log.info("开始处理类别控制层---");
    }

    @GetMapping("/add-new")
    public JsonResult<Void> addNew(CategoryAddNewDTO categoryAddNewDTO) {
        log.debug("开始处理类别的添加: {}", categoryAddNewDTO);
        categoryService.addNew(categoryAddNewDTO);
        return JsonResult.ok();
    }

    @GetMapping("/delById/{id}")
    public JsonResult<Void> deleteById(@PathVariable Long id) {
        log.debug("开始处理类别deleteById: {}", id);
        categoryService.deleteById(id);
        return JsonResult.ok();
    }
}
