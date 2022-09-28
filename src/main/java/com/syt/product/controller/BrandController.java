package com.syt.product.controller;


import com.syt.product.pojo.dto.BrandAddNewDTO;
import com.syt.product.service.IBrandService;
import com.syt.product.web.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 品牌控制层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:09
 */
@RestController
@RequestMapping("/brand")
@Slf4j
public class BrandController {

    @Autowired
    private IBrandService brandService;

    public BrandController() {
        log.info("开始处理属性模板控制层---");
    }

    @GetMapping("/add-new")
    public JsonResult<Void> addNew(BrandAddNewDTO brandAddNewDTO) {
        log.debug("开始处理品牌的添加: {}", brandAddNewDTO);
        brandService.addNew(brandAddNewDTO);
        return JsonResult.ok();
    }

    @GetMapping("/delById/{id}")
    public JsonResult<Void> deleteById(@PathVariable Long id) {
        log.debug("开始处理品牌deleteById: {}", id);
        brandService.deleteById(id);
        return JsonResult.ok();
    }
}
