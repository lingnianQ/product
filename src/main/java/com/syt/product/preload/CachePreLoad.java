package com.syt.product.preload;

import com.syt.product.mapper.BrandMapper;
import com.syt.product.pojo.vo.BrandListItemVO;
import com.syt.product.pojo.vo.BrandStandardVO;
import com.syt.product.repo.IBrandRedisRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 预热加载缓存
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/18 15:48
 */
@Slf4j
@Component
public class CachePreLoad implements ApplicationRunner {

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private IBrandRedisRepository brandRedisRepository;

    public CachePreLoad() {
        log.debug("创建ApplicationRunner对象:CachePreLoad");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.debug("开始处理缓存预热");

        log.debug("删除Redis中原有的品牌数据");
        brandRedisRepository.deleteAll();

        log.debug("从MySQL中读取品牌列表");
        List<BrandListItemVO> brands = brandMapper.list();

        log.debug("将品牌列表写入Redis");
        brandRedisRepository.save(brands);

        log.debug("逐一根据id从MySQL中读取品牌详情,并写入Redis");
        for (BrandListItemVO item : brands) {
            BrandStandardVO brand = brandMapper.getStandardById(item.getId());
            brandRedisRepository.save(brand);
        }

        log.debug("Redis缓存预热完成");

    }
}
