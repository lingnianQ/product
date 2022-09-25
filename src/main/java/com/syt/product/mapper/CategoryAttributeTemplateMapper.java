package com.syt.product.mapper;


import com.syt.product.pojo.entity.CategoryAttributeTemplate;
import org.springframework.stereotype.Repository;

/**
 * 类别与属性模板关联Mapper接口
 *
 * @author sytsnb@gmail.com
 * @version 0.0.1
 */
@Repository
public interface CategoryAttributeTemplateMapper {

    /**
     * 插入类别与属性模板关联数据
     *
     * @param categoryAttributeTemplate 类别与属性模板关联对象
     * @return 受影响的行数
     */
    int insert(CategoryAttributeTemplate categoryAttributeTemplate);

    /**
     * 根据id删除类别与属性模板关联
     *
     * @param id 被删除的类别与属性模板关联的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据多个id批量删除类别与属性模板关联数据
     *
     * @param ids 期望删除的若干个类别与属性模板关联数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

    /**
     * 根据类别统计关联数据的数量
     *
     * @param categoryId 类别id
     * @return 此类别关联的数据的数量
     */
    int countByCategory(Long categoryId);

    /**
     * 根据属性模板统计关联数据的数量
     *
     * @param attributeTemplateId 属性模板id
     * @return 此属性模板关联的数据的数量
     */
    int countByAttributeTemplate(Long attributeTemplateId);

}
