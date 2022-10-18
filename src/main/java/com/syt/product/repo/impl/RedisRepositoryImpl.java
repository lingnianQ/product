package com.syt.product.repo.impl;

import com.syt.product.pojo.vo.BrandStandardVO;
import com.syt.product.repo.IRedisRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * 处理品牌缓存的实现类
 * 处理Redis的实现类
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/18 10:45
 */
@Slf4j
@Repository
public class RedisRepositoryImpl implements IRedisRepository {

    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;

    public RedisRepositoryImpl() {
        log.debug("...RedisRepositoryImpl.....");
    }

    @Override
    public void save(BrandStandardVO brandStandardVO) {
        log.debug("准备向Redis中写入数据: {}", brandStandardVO);
        String key = getKey(brandStandardVO.getId());
        redisTemplate.opsForValue().set(key, brandStandardVO);
    }

    @Override
    public BrandStandardVO get(Long id) {
        Serializable serializable = redisTemplate.opsForValue().get(getKey(id));
        if (serializable != null) {
            if (serializable instanceof BrandStandardVO) {
                return (BrandStandardVO) serializable;
            }
        }
        return null;
    }

    private String getKey(Long id) {
        return BRAND_ITEM_KEY_PREFIX + id;
    }
}
