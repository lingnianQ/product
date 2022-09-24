package com.syt.product.mapper;

import com.syt.product.pojo.entity.Attribute;
import com.syt.product.pojo.vo.AttributeListItemVO;
import com.syt.product.pojo.vo.AttributeStandardVO;

import java.util.List;

/**
 * mapper 处理属性
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/25 0:38
 */
public interface AttributeMapper {
    /**
     * 插入属性
     *
     * @param attribute 属性
     * @return 行数
     */
    int insert(Attribute attribute);

    /**
     * 批量插入属性
     *
     * @param attributeList 属性列表
     * @return 行数
     */
    int insertBatch(List<Attribute> attributeList);

    /**
     * 通过id删除
     *
     * @param id 属性id
     * @return 行数
     */
    int deleteById(Long id);

    /**
     * 批量删除
     *
     * @param ids 属性ids
     * @return 行数
     */
    int deleteByIds(Long[] ids);

    /**
     * 动态sql 更新 属性 数据
     *
     * @param attribute 属性
     * @return 行数
     */
    int updateById(Attribute attribute);

    /**
     * 统计属性 数量
     *
     * @return 数量
     */
    int count();

    /**
     * 通过属性名统计数量
     *
     * @param name 属性名
     * @return 数量
     */
    int countByName(String name);

    /**
     * 通过id查找 属性实体
     *
     * @param id 属性id
     * @return 属性标准视图
     */
    AttributeStandardVO getStandById(Long id);

    /**
     * 查询属性列表
     *
     * @return 属性列表
     */
    List<AttributeListItemVO> list();
}
