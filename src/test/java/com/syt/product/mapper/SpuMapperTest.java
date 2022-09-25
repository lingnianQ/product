package com.syt.product.mapper;

import com.syt.product.pojo.entity.Spu;
import com.syt.product.util.IdUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpuMapperTest {

    @Autowired
    private SpuMapper spuMapper;

    @Test
    void testInsert() {
        Spu spu = new Spu();
        spu.setId(IdUtils.getId());
        int i = spuMapper.insert(spu);
        System.out.println("spu = " + spu);
    }

    @Test
    void testDeleteById() {
        int i = spuMapper.deleteById(IdUtils.getId());
        System.out.println("i = " + i);
    }

    @Test
    void testCount() {
        int count = spuMapper.count();
        System.out.println("count = " + count);
    }
}