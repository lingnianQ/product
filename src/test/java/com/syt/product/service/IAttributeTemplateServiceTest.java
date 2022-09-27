package com.syt.product.service;

import com.syt.product.pojo.dto.AttributeTemplateAddNewDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 属性模板测试
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 19:48
 */
@SpringBootTest
@Transactional
class IAttributeTemplateServiceTest {
    @Autowired
    private IAttributeTemplateService attributeTemplateService;

    @Test
    void testAddNew() {
        AttributeTemplateAddNewDTO attributeTemplateAddNewDTO = AttributeTemplateAddNewDTO
                .builder()
                .name("测试属性")
                .pinyin("测试Pinyin")
                .keywords("测试关键词")
                .sort(2)
                .build();
        attributeTemplateService.addNew(attributeTemplateAddNewDTO);
    }

    @Test
    void testDeleteById() {
        Long id = 80L;
        attributeTemplateService.deleteById(id);
    }
}