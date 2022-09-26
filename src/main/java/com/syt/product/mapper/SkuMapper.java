package com.syt.product.mapper;

import com.syt.product.pojo.entity.Sku;

/**
 * 处理SKU数据的Mapper接口
 *
 * @author sytsn
 */
public interface SkuMapper {
    /**
     * 插入
     *
     * @param sku
     * @return
     */
    int insert(Sku sku);

    /**
     * 根据主键id删除
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 计数
     *
     * @return
     */
    int count();
}
