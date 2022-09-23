package com.syt.product.mapper;

import com.syt.product.pojo.vo.BrandStandardVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/23 10:58
 */
@SpringBootTest
class BrandMapperTest {

    @Autowired
    private BrandMapper brandMapper;

    @Test
    void testGetStrandById() {
        BrandStandardVO brandStandardVO = brandMapper.getStandardById(1L);
        System.out.println("brandStandardVO = " + brandStandardVO);
    }
}