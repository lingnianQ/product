package com.syt.product.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.syt.product.pojo.dto.AttributeTemplateAddNewDTO;
import com.syt.product.pojo.vo.AttributeTemplateListItemVO;
import com.syt.product.service.IAttributeTemplateService;
import com.syt.product.web.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 19:22
 */
@Api(tags = "02. 属性模板管理")
@Slf4j
@RestController
@RequestMapping("/attributeTemplates")
public class AttributeTemplateController {

    @Autowired
    private IAttributeTemplateService attributeTemplateService;

    public AttributeTemplateController() {
        log.info("开始处理属性模板控制层---");
    }

    @ApiOperation("添加属性模板")
    @ApiOperationSupport(order = 1)
    @PostMapping("/add-new")
    public JsonResult<Void> addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO) {
        log.debug("开始处理属性模板的添加: {}", attributeTemplateAddNewDTO);
        attributeTemplateService.addNew(attributeTemplateAddNewDTO);
        return JsonResult.ok();
    }

    @ApiOperation("删除属性模板")
    @ApiOperationSupport(order = 2)
    @GetMapping("/delById/{id:[0-9]+}")
    public JsonResult<Void> deleteById(@PathVariable Long id) {
        log.debug("开始处理属性模板deleteById: {}", id);
        attributeTemplateService.deleteById(id);
        return JsonResult.ok();
    }

    @ApiOperation("属性模板列表")
    @ApiOperationSupport(order = 3)
    @PostMapping("")
    public JsonResult<List<AttributeTemplateListItemVO>> list() {

        String message = "属性模板查询成功";
        log.debug(message);

        return JsonResult.ok(attributeTemplateService.list(), message);
    }

}
