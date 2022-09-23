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
     * 插入属性模板数据
     *
     * @param attributeTemplate 属性模板
     * @return 受影响的行数
     */
    int insert(AttributeTemplate attributeTemplate);

    /**
     * 批量删除属性模板数据
     *
     * @param attributeTemplateList 属性模板集合
     * @return 受影响的行数
     */
    int insertBatch(List<AttributeTemplate> attributeTemplateList);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 通过id批量删除
     *
     * @param ids id
     * @return 受影响的行数
     */
    int deleteByIds(Long[] ids);

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
