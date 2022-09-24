package com.syt.product.mapper;

import com.syt.product.pojo.entity.Brand;
import com.syt.product.pojo.vo.BrandStandardVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/23 10:58
 */
@SpringBootTest
class BrandMapperTest {

    @Autowired
    private BrandMapper brandMapper;

    @Test
    void testInsert() {
        Brand brand = new Brand();
        brand.setName("测试品牌");
        brand.setPinyin("test pinyin");
        brand.setLogo("暂无");
        brand.setDescription("暂无");
        brand.setKeywords("暂无");
        brand.setSort(0);
        brand.setSales(0);
        brand.setProductCount(0);
        brand.setCommentCount(0);
        brand.setPositiveCommentCount(0);
        brand.setEnable(1);
        int rows = brandMapper.insert(brand);
        System.out.println("rows = " + rows);
    }

    @Test
    void testInsertBatch() {
        List<Brand> brandList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Brand brand = new Brand();
            brand.setName("测试品牌" + i);
            brand.setPinyin("test pinyin" + i);
            brand.setLogo("暂无");
            brand.setDescription("暂无");
            brand.setKeywords("暂无");
            brand.setSort(0);
            brand.setSales(0);
            brand.setProductCount(0);
            brand.setCommentCount(0);
            brand.setPositiveCommentCount(0);
            brand.setEnable(1);
            brandList.add(brand);
        }
        int rows = brandMapper.insertBatch(brandList);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteById() {
        int rows = brandMapper.deleteById(17L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteByIds() {
        Long[] ids = {18L, 19L, 20L};
        int rows = brandMapper.deleteByIds(ids);
        System.out.println("rows = " + rows);
    }

    @Test
    void testUpdateById() {
        Brand brand = new Brand();
//        brand.setId(16L);
        brand.setId(null);
        brand.setName("测试品牌updateById");
        brand.setPinyin("test pinyin");
        brand.setLogo("暂无");
        brand.setDescription("暂无");
        brand.setKeywords("暂无");
        brand.setSort(0);
        brand.setSales(0);
        brand.setProductCount(0);
        brand.setCommentCount(0);
        brand.setPositiveCommentCount(0);
        brand.setEnable(1);
        int rows = brandMapper.updateById(brand);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCount() {
        int count = brandMapper.count();
        System.out.println("count = " + count);
        int count2 = brandMapper.countByName("格力");
        System.out.println("count2 = " + count2);
    }

    @Test
    void testGetStrandById() {
        BrandStandardVO brandStandardVO = brandMapper.getStandardById(1L);
        System.out.println("brandStandardVO = " + brandStandardVO);
    }

    @Test
    void list() {
        brandMapper.list().forEach(System.out::println);
    }
}