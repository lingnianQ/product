package com.syt.product.mapper;

import com.syt.product.pojo.entity.BrandCategory;
import com.syt.product.pojo.vo.BrandCategoryListItemVO;
import com.syt.product.pojo.vo.BrandCategoryStandardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 品牌与类别关联测试
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/25 22:20
 */
@Slf4j
@SpringBootTest
class BrandCategoryMapperTest {

    @Autowired
    private BrandCategoryMapper brandCategoryMapper;

    @Test
    void testInsert() {
        BrandCategory brandCategory = new BrandCategory();
        brandCategory.setCategoryId(5L);
        brandCategory.setBrandId(4L);
        int rows = brandCategoryMapper.insert(brandCategory);
        System.out.println("rows = " + rows);
        System.out.println("brandCategory = " + brandCategory);
    }

    @Test
    void testDeleteById() {
        Long id = 1L;
        int rows = brandCategoryMapper.deleteById(id);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteByIds() {
        Long[] ids = {2L, 3L};
        int rows = brandCategoryMapper.deleteByIds(ids);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCountByBrand() {
        Long brandId = 4L;
        int rows = brandCategoryMapper.countByBrand(brandId);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCountByCategory() {
        Long categoryId = 3L;
        int rows = brandCategoryMapper.countByCategory(categoryId);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCountByBrandAndCategory() {
        Long brandId = 4L;
        Long categoryId = 3L;
        int rows = brandCategoryMapper.countByBrandAndCategory(brandId, categoryId);
        System.out.println("rows = " + rows);
    }

    @Test
    void testGetStandardById() {
        Long id = 4L;
        BrandCategoryStandardVO brandCategoryStandardVO = brandCategoryMapper.getStandardById(id);
        System.out.println("brandCategoryStandardVO = " + brandCategoryStandardVO);
    }

    @Test
    void testList() {
        List<BrandCategoryListItemVO> list = brandCategoryMapper.list();
        list.forEach(System.out::println);
    }
}