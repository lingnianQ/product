package com.syt.product.mapper;

import com.syt.product.pojo.entity.Category;
import com.syt.product.pojo.vo.CategoryListItemVO;
import com.syt.product.pojo.vo.CategoryStandardVO;

import java.util.List;

/**
 * mapper接口 处理类别
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/25 2:10
 */
public interface CategoryMapper {

    /**
     * 插入类别数据
     *
     * @param category 类别数据
     * @return 受影响的行数
     */
    int insert(Category category);

    /**
     * 批量插入类别数据
     *
     * @param categoryList 类别数据列表
     * @return 行数
     */
    int insertBatch(List<Category> categoryList);

    /**
     * 根据id删除类别
     *
     * @param id 被删除的类别的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据多个id批量删除类别
     *
     * @param ids 期望删除的多个类别数据的id
     * @return 受影响的行数
     */
    int deleteByIds(List<Long> ids);

    /**
     * 根据id修改类别数据详情
     *
     * @param category 封装了id与新数据的类别对象
     * @return 受影响的行数
     */
    int updateById(Category category);

    /**
     * 统计当前表中类别数据的数量
     *
     * @return 当前表中类别数据的数量
     */
    int count();

    /**
     * 根据类别名称统计当前表中类别数据的数量
     *
     * @param name 类别名称
     * @return 当前表中匹配名称的类别数据的数量
     */
    int countByName(String name);

    /**
     * 根据父级类别，统计其子级类别的数量
     *
     * @param parentId 父级类别的id
     * @return 此类别的子级类别的数量
     */
    int countByParentId(Long parentId);

    /**
     * 根据id获取类别的标准信息
     *
     * @param id 类别id
     * @return 返回匹配的类别的标准信息，如果没有匹配的数据，将返回null
     */
    CategoryStandardVO getStandardById(Long id);

    /**
     * 根据父级类别的id查询类别列表
     *
     * @param parentId 父级类别的id
     * @return 类别列表
     */
    List<CategoryListItemVO> listByParentId(Long parentId);

}
