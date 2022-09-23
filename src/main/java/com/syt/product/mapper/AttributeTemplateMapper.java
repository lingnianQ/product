package com.syt.product.mapper;

import com.syt.product.pojo.entity.AttributeTemplate;
import com.syt.product.pojo.vo.AttributeTemplateListItemVO;
import com.syt.product.pojo.vo.AttributeTemplateStandardVO;


import java.util.List;

/**
 * 处理品牌的mapper
 *
 * @author sytsn
 */
public interface AttributeTemplateMapper {
    /**
     * 插入数据
     *
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
     *
     * @return
     */
    int count();


    /**
     * 通过id查找
     *
     * @param id
     * @return
     */
    AttributeTemplateStandardVO getStandardById(Long id);

    /**
     * 查询列表
     *
     * @return java.util.List
     */
    List<AttributeTemplateListItemVO> list();
}
