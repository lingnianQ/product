package com.syt.product.service;

import com.syt.product.pojo.dto.CategoryAddNewDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:40
 */
@SpringBootTest
@Transactional
class ICategoryServiceTest {

    @Autowired
    private ICategoryService categoryService;

    @Test
    void testAddNew() {
        CategoryAddNewDTO categoryAddNewDTO = CategoryAddNewDTO.builder()
                .name("testCategory1")
                .build();
        categoryService.addNew(categoryAddNewDTO);
    }

    @Test
    void testDeleteById() {
        Long id = 89L;
        categoryService.deleteById(id);
    }
}