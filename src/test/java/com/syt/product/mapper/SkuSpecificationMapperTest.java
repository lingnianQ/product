package com.syt.product.mapper;

import com.syt.product.pojo.entity.SkuSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 处理SKU数据数据的测试
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 10:42
 */
@SpringBootTest
class SkuSpecificationMapperTest {

    @Autowired
    private SkuSpecificationMapper skuSpecificationMapper;

    @Test
    void testInsert() {
        SkuSpecification skuSpecification = new SkuSpecification();
        skuSpecification.setSkuId(1L);
        skuSpecification.setAttributeId(1L);
        skuSpecification.setAttributeName("testName");
        skuSpecification.setAttributeValue("testValue");
        skuSpecification.setUnit("testUnit");
        skuSpecification.setSort(1);
        int rows = skuSpecificationMapper.insert(skuSpecification);
        System.out.println("rows = " + rows);
    }

    @Test
    void testInsertBatch() {
        List<SkuSpecification> skuSpecificationList = new ArrayList<>();
        for (int i = 2; i < 10; i++) {
            SkuSpecification skuSpecification = new SkuSpecification();
            skuSpecification.setSkuId((long) i);
            skuSpecification.setAttributeId((long) i);
            skuSpecification.setAttributeName("testName");
            skuSpecification.setAttributeValue("testValue");
            skuSpecification.setUnit("testUnit");
            skuSpecification.setSort(1);
            skuSpecificationList.add(skuSpecification);
        }
        int rows = skuSpecificationMapper.insertBatch(skuSpecificationList);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteById() {
        System.out.println("skuSpecificationMapper.deleteById(1L) = " + skuSpecificationMapper.deleteById(1L));
    }

    @Test
    void testDeleteByIds() {
        Long[] ids = {4L, 5L, 6L};
        System.out.println("skuSpecificationMapper.deleteByIds(ids) = " + skuSpecificationMapper.deleteByIds(ids));
    }

    @Test
    void testUpdateById() {
        SkuSpecification skuSpecification = new SkuSpecification();
        skuSpecification.setId(2L);
        skuSpecification.setSkuId(2L);
        skuSpecification.setAttributeId(1L);
        skuSpecification.setAttributeName("testUpdateById");
        skuSpecification.setAttributeValue("testUpdateById");
        skuSpecification.setUnit("UpdateById");
        skuSpecification.setSort(1);
        System.out.println("skuSpecificationMapper.updateById() = " + skuSpecificationMapper.updateById(skuSpecification));
    }

    @Test
    void testCount() {
        System.out.println("skuSpecificationMapper.count() = " + skuSpecificationMapper.count());
    }

    @Test
    void testGetStandardById() {
        System.out.println(skuSpecificationMapper.getStandardById(2L));
    }

    @Test
    void testList() {
        skuSpecificationMapper.list().forEach(System.out::println);
    }
}