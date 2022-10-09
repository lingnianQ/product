package com.syt.product.service;

import com.syt.product.pojo.dto.AttributeTemplateAddNewDTO;
import com.syt.product.pojo.vo.AttributeTemplateListItemVO;

import java.util.List;

/**
 * 属性模板接口
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 11:20
 */
public interface IAttributeTemplateService {
    /**
     * 添加属性模板
     *
     * @param attributeTemplateAddNewDTO 添加
     */
    void addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO);

    /**
     * 删除属性模板
     *
     * @param id 属性模板id
     */
    void deleteById(Long id);

    /**
     * 查询属性模板列表
     *
     * @return list
     */
    List<AttributeTemplateListItemVO> list();
}
