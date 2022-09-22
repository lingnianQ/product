package com.syt.product.mapper;

import com.syt.product.pojo.entity.Spu;

public interface SpuMapper {

    int insert(Spu spu);

    int deleteById(Long id);

    int count();
}
