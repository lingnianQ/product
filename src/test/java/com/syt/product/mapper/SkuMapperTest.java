package com.syt.product.mapper;

import com.syt.product.pojo.entity.Sku;
import com.syt.product.util.IdUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SkuMapperTest {

    @Autowired
    private SkuMapper skuMapper;

    @Test
    @Transactional
    void testInsert() {
        Sku sku = new Sku();
        sku.setId(IdUtils.getId());
        skuMapper.insert(sku);
        System.out.println("sku = " + sku);
    }

    @Test
    void testDeleteById() {
        int i = skuMapper.deleteById(IdUtils.getId());
        System.out.println("i = " + i);
    }

    @Test
    void testCount() {
        int count = skuMapper.count();
        System.out.println("count = " + count);
    }
}