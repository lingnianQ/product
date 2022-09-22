package com.syt.product.mapper;

import com.syt.product.pojo.entity.AttributeTemplate;

/**
 * 处理品牌的mapper
 */
public interface AttributeTemplateMapper {
    /**
     * @param attributeTemplate
     * @return
     */
    int insert(AttributeTemplate attributeTemplate);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 统计数量
     * @return
     */
    int count();
}
