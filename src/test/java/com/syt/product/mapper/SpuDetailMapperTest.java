package com.syt.product.mapper;

import com.syt.product.pojo.entity.SpuDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 2:14
 */
@SpringBootTest
class SpuDetailMapperTest {

    @Autowired
    private SpuDetailMapper spuDetailMapper;

    @Test
    void testInsert() {
        SpuDetail spuDetail = new SpuDetail();
        spuDetail.setSpuId(2L);
        spuDetail.setDetail("test----test---detail");
        int rows = spuDetailMapper.insert(spuDetail);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteById() {
        int rows = spuDetailMapper.deleteById(1L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteByIds() {
        int rows = spuDetailMapper.deleteByIds(9L, 8L, 4L, 5L);
        System.out.println("rows = " + rows);
    }
}