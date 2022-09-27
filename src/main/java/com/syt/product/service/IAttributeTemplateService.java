package com.syt.product.service;

import com.syt.product.pojo.dto.AttributeTemplateAddNewDTO;

/**
 * 属性模板接口
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 11:20
 */
public interface IAttributeTemplateService {
    /**
     * 添加属性模板
     * @param attributeTemplateAddNewDTO 添加
     */
    void addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO);

    /**
     * 删除属性模板
     *
     * @param id 属性模板id
     */
    void deleteById(Long id);
}
