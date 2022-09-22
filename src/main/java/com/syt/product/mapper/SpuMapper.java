package com.syt.product.mapper;

import com.syt.product.pojo.entity.Sku;
import com.syt.product.pojo.entity.Spu;

public interface SpuMapper {

    /**
     * 插入
     * @param spu
     * @return
     */
    int insert(Spu spu);

    /**
     * 根据主键id删除
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 计数
     * @return
     */
    int count();
}
