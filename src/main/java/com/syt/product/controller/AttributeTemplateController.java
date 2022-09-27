package com.syt.product.controller;

import com.syt.product.pojo.dto.AttributeTemplateAddNewDTO;
import com.syt.product.service.IAttributeTemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 19:22
 */
@Slf4j
@RestController
@RequestMapping("/attributeTemplate")
public class AttributeTemplateController {

    @Autowired
    private IAttributeTemplateService attributeTemplateService;

    public AttributeTemplateController() {
        log.info("开始处理属性模板控制层---");
    }

    @GetMapping("/add-new")
    public String addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO) {
        log.debug("开始处理属性模板的添加: {}", attributeTemplateAddNewDTO);
        attributeTemplateService.addNew(attributeTemplateAddNewDTO);
        return "ok";
    }

    @GetMapping("/delById/{id}")
    public String deleteById(@PathVariable Long id) {
        log.debug("开始处理属性模板deleteById: {}", id);
        attributeTemplateService.deleteById(id);
        return "ok";
    }
}
