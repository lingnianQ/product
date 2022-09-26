package com.syt.product.mapper;

import com.syt.product.pojo.entity.Sku;
import com.syt.product.pojo.vo.SkuStandardVO;
import com.syt.product.util.IdUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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
    void testInsertBatch() {
        List<Sku> skuList = new ArrayList<>();
        for (int i = 1; i < 19; i++) {
            Sku sku = new Sku();
            sku.setId(IdUtils.getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            skuList.add(sku);
        }
        int rows = skuMapper.insertBatch(skuList);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteById() {
        int i = skuMapper.deleteById(IdUtils.getId());
        System.out.println("i = " + i);
    }

    @Test
    void testDeleteByIds() {
        Long[] ids = {2L, 3L, 4L};
        int rows = skuMapper.deleteByIds(ids);
        System.out.println("rows = " + rows);
    }


    @Test
    void testUpdateById() {
        Sku sku = new Sku();
        sku.setId(9L);
        sku.setTitle("testUpdate");
        int rows = skuMapper.updateById(sku);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCount() {
        int count = skuMapper.count();
        System.out.println("count = " + count);
    }

    @Test
    void testGetStandardById() {
        SkuStandardVO skuStandardVO = skuMapper.getStandardById(9L);
        System.out.println("skuStandardVO = " + skuStandardVO);
    }

    @Test
    void testList() {
        skuMapper.list().forEach(System.out::println);
    }
}