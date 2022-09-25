package com.syt.product.mapper;

import com.syt.product.pojo.entity.CategoryAttributeTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 类别与属性模板关联test
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/25 22:37
 */
@Slf4j
@SpringBootTest
class CategoryAttributeTemplateMapperTest {

    @Autowired
    private CategoryAttributeTemplateMapper categoryAttributeTemplateMapper;

    @Test
    void testInsert() {
        CategoryAttributeTemplate categoryAttributeTemplate = new CategoryAttributeTemplate();
        categoryAttributeTemplate.setCategoryId(4L);
        categoryAttributeTemplate.setAttributeTemplateId(3L);
        int rows = categoryAttributeTemplateMapper.insert(categoryAttributeTemplate);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteById() {
        Long id = 1L;
        int rows = categoryAttributeTemplateMapper.deleteById(id);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteByIds() {
        int rows = categoryAttributeTemplateMapper.deleteByIds(2L, 3L, 4L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCountByCategory() {
        int countByCategory = categoryAttributeTemplateMapper.countByCategory(2L);
        System.out.println("countByCategory = " + countByCategory);
    }

    @Test
    void testCountByAttributeTemplate() {
        int countByAttributeTemplate = categoryAttributeTemplateMapper.countByAttributeTemplate(3L);
        System.out.println("countByAttributeTemplate = " + countByAttributeTemplate);
    }
}