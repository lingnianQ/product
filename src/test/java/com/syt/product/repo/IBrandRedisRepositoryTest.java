package com.syt.product.repo;

import com.syt.product.pojo.vo.BrandStandardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/18 12:03
 */
@Slf4j
@SpringBootTest
class IBrandRedisRepositoryTest {

    @Autowired
    private IBrandRedisRepository brandRedisRepository;

    @Test
    void testSave() {
        BrandStandardVO brandStandardVO = new BrandStandardVO();
        brandStandardVO.setId(657L);
        brandStandardVO.setName("testBrand");
        brandRedisRepository.save(brandStandardVO);
    }

    @Test
    void testSave1() {
    }

    @Test
    void testGet() {
        BrandStandardVO brandStandardVO = brandRedisRepository.get(657L);
        log.debug("brandStandardVO = {}", brandStandardVO);
    }


    @Test
    void testList() {
    }
}