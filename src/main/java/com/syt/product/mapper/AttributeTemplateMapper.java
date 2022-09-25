package com.syt.product.mapper;

import com.syt.product.pojo.entity.Album;
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
     * 根据id修改相册
     *
     * @param attributeTemplate
     * @return
     */
    int updateById(AttributeTemplate attributeTemplate);

    /**
     * 统计当前表中属性模板数据的数量
     *
     * @return 当前表中属性模板数据的数量
     */
    int count();

    /**
     * 根据属性模板名称统计当前表中属性模板数据的数量
     *
     * @param name 属性模板名称
     * @return 当前表中匹配名称的属性模板数据的数量
     */
    int countByName(String name);

    /**
     * 通过id查找
     *
     * @param id
     * @return
     */
    AttributeTemplateStandardVO getStandardById(Long id);

    /**
     * 查询属性模板列表
     *
     * @return java.util.List,属性模板列表的集合
     */
    List<AttributeTemplateListItemVO> list();
}
