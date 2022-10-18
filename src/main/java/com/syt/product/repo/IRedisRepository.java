package com.syt.product.repo;

import com.syt.product.pojo.vo.BrandStandardVO;

/**
 * 处理品牌缓存
 * 处理Redis的接口
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/18 10:44
 */
public interface IRedisRepository {

    String BRAND_ITEM_KEY_PREFIX = "brand:item:";

    /**
     * 保存品牌到redis
     *
     * @param brandStandardVO
     */
    void save(BrandStandardVO brandStandardVO);

    /**
     * 从Redis中读取数据
     *
     * @param id 品牌id
     * @return 匹配品牌数据, 如果没有匹配的数据, 择返回null
     */
    BrandStandardVO get(Long id);
}
