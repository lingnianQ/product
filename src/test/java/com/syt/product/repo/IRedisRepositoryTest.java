package com.syt.product.repo;

import com.syt.product.pojo.vo.BrandStandardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/18 12:03
 */
@Slf4j
@SpringBootTest
class IRedisRepositoryTest {

    @Autowired
    private IRedisRepository redisRepository;

    @Test
    void testSave() {
        BrandStandardVO brandStandardVO = new BrandStandardVO();
        brandStandardVO.setId(657L);
        brandStandardVO.setName("testBrand");
        redisRepository.save(brandStandardVO);
    }

    @Test
    void testGet() {
        BrandStandardVO brandStandardVO = redisRepository.get(657L);
        log.debug("brandStandardVO = {}", brandStandardVO);
    }
}