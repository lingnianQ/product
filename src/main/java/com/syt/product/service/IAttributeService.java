package com.syt.product.service;

import com.syt.product.pojo.dto.AttributeAddNewDTO;

/**
 * 属性接口
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/13 1:13
 */
public interface IAttributeService {
    /**
     * 添加属性
     *
     * @param attributeAddNewDTO
     */
    void addNew(AttributeAddNewDTO attributeAddNewDTO);
}
