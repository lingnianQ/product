package com.syt.product.service;

import com.syt.product.pojo.dto.BrandAddNewDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:21
 */

@SpringBootTest
@Transactional
class IBrandServiceTest {

    @Autowired
    private IBrandService brandService;

    @Test
    void testAddNew() {
        BrandAddNewDTO brandAddNewDTO = BrandAddNewDTO.builder()
                .name("testBrand1")
                .pinyin("testPinyin")
                .logo("logo")
                .description("简介")
                .keywords("关键词")
                .sort(1)
                .productCount(2)
                .commentCount(2)
                .positiveCommentCount(5)
                .enable(0)
                .build();
        brandService.addNew(brandAddNewDTO);
    }

    @Test
    void testDeleteById() {
        Long id = 25L;
        brandService.deleteById(id);
    }
}