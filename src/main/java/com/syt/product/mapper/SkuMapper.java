package com.syt.product.mapper;

import com.syt.product.pojo.entity.Sku;

public interface SkuMapper {

    int insert(Sku sku);

    int deleteById(Long id);

    int count();
}
