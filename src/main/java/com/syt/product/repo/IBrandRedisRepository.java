package com.syt.product.repo;

import com.syt.product.pojo.vo.BrandListItemVO;
import com.syt.product.pojo.vo.BrandStandardVO;

import java.util.List;

/**
 * 处理品牌缓存
 * 处理Redis的接口
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/18 10:44
 */
public interface IBrandRedisRepository {


    String BRAND_KEY_PREFIX = "brand:";
    /**
     * 品牌数据项在redis中的key前缀
     */
    String BRAND_ITEM_KEY_PREFIX = BRAND_KEY_PREFIX + "item:";

    /**
     * 品牌列表在Redis中的Key
     */
    String BRAND_LIST_KEY = BRAND_KEY_PREFIX + "list";

    /**
     * 保存品牌到redis
     *
     * @param brandStandardVO
     */
    void save(BrandStandardVO brandStandardVO);

    /**
     * 向Redis中写入品牌列表
     *
     * @param brands 品牌列表
     */
    void save(List<BrandListItemVO> brands);

    /**
     * 删除已有列表
     */
    void deleteAll();

    /**
     * 从Redis中读取数据
     *
     * @param id 品牌id
     * @return 匹配品牌数据, 如果没有匹配的数据, 择返回null
     */
    BrandStandardVO get(Long id);

    /**
     * 从Redis中读取品牌列表
     *
     * @return 品牌列表
     */
    List<BrandListItemVO> list();

    /**
     * 从Redis中读取品牌列表
     *
     * @param start 读取数据的起始下标
     * @param end   读取数据的截止下标
     * @return 品牌列表
     */
    List<BrandListItemVO> list(long start, long end);

}
