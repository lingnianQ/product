package com.syt.product.repo.impl;

import com.syt.product.pojo.vo.BrandListItemVO;
import com.syt.product.pojo.vo.BrandStandardVO;
import com.syt.product.repo.IBrandRedisRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 处理品牌缓存的实现类
 * 处理Redis的实现类
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/18 10:45
 */
@Slf4j
@Repository
public class BrandRedisRepositoryImpl implements IBrandRedisRepository {

    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;

    public BrandRedisRepositoryImpl() {
        log.debug("...BrandRedisRepositoryImpl.....");
    }

    @Override
    public void save(BrandStandardVO brandStandardVO) {
        log.debug("准备向Redis中写入数据: {}", brandStandardVO);
        String key = getItemKey(brandStandardVO.getId());
        redisTemplate.opsForSet().add(getAllKeysKey(), key);
        redisTemplate.opsForValue().set(key, brandStandardVO);
    }

    @Override
    public void save(List<BrandListItemVO> brands) {
        String key = getListKey();
        ListOperations<String, Serializable> ops = redisTemplate.opsForList();
        redisTemplate.opsForSet().add(getAllKeysKey(), key);
        for (BrandListItemVO brand : brands) {
            ops.rightPush(key, brand);
        }
    }

    @Override
    public Long deleteAll() {
        Set<String> allKeys = getAllKeys();
        return redisTemplate.delete(allKeys);
    }


    @Override
    public BrandStandardVO get(Long id) {
        Serializable serializable = redisTemplate.opsForValue().get(getItemKey(id));
        if (serializable != null) {
            if (serializable instanceof BrandStandardVO) {
                return (BrandStandardVO) serializable;
            }
        }
        return null;
    }

    @Override
    public List<BrandListItemVO> list() {
        long start = 0;
        long end = -1;
        return list(start, end);
    }

    @Override
    public List<BrandListItemVO> list(long start, long end) {
        String key = getListKey();
        ListOperations<String, Serializable> ops = redisTemplate.opsForList();
        List<Serializable> list = ops.range(key, start, end);

        List<BrandListItemVO> brands = new ArrayList<>();
        for (Serializable item : list) {
            brands.add((BrandListItemVO) item);
        }
        return brands;
    }

    private String getItemKey(Long id) {
        return BRAND_ITEM_KEY_PREFIX + id;
    }

    private String getListKey() {
        return BRAND_LIST_KEY;
    }

    private String getAllKeysKey() {
        return BRAND_ALL_KEYS_KEY;
    }

    private Set<String> getAllKeys() {
        Set<Serializable> members = redisTemplate.opsForSet().members(getAllKeysKey());
        Set<String> keys = new HashSet<>();
        for (Serializable member : members) {
            keys.add((String) member);
        }
        return keys;
    }
}
