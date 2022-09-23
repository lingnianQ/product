package com.syt.product.mapper;

import com.syt.product.pojo.entity.AttributeTemplate;
import com.syt.product.pojo.vo.AttributeTemplateStandardVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AttributeTemplateMapperTest {

    @Autowired
    private AttributeTemplateMapper attributeTemplateMapper;

    @Test
    void testInsert() {
        AttributeTemplate attributeTemplate = new AttributeTemplate();
        attributeTemplate.setName("testName");
        attributeTemplate.setPinyin("test--pinyin");
        attributeTemplate.setKeywords("test--keywords");
        attributeTemplate.setSort(99);

        int rows = attributeTemplateMapper.insert(attributeTemplate);
        System.out.println("=====插入完成" + rows);
        System.out.println(attributeTemplate);
    }

    @Test
    void testDeleteById() {
        attributeTemplateMapper.deleteById(1L);
        System.out.println("删除成功");
    }

    @Test
    void testCount() {
        int count = attributeTemplateMapper.count();
        System.out.println("count = " + count);
    }

    @Test
    void getStandardById() {
        AttributeTemplateStandardVO attributeTemplateStandardVO = attributeTemplateMapper.getStandardById(2L);
        System.out.println("attributeTemplateStandardVO = " + attributeTemplateStandardVO);
    }

    @Test
    void list() {
        attributeTemplateMapper.list().forEach(System.out::println);
    }
}