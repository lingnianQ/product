package com.syt.product.mapper;

import com.syt.product.pojo.entity.Brand;
import com.syt.product.pojo.vo.BrandListItemVO;
import com.syt.product.pojo.vo.BrandStandardVO;

import java.util.List;

/**
 * 品牌mapper
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/23 10:50
 */

public interface BrandMapper {
    /**
     * 增加品牌
     *
     * @param brand 品牌
     * @return 受影响的行数
     */
    int insert(Brand brand);

    /**
     * 批量插入
     *
     * @param brandList 数据集合
     * @return 受影响的行数
     */
    int insertBatch(List<Brand> brandList);

    /**
     * 根据id删除
     *
     * @param id 被删除的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 通过数组批量删除
     *
     * @param ids 数组ids
     * @return 受影响的行数
     */
    int deleteByIds(Long[] ids);

    /**
     * 通过id更新数据
     * @param brand 品牌参数
     * @return 受影响的行数
     */
    int updateById(Brand brand);

    /**
     * 查询品牌数量
     * @return 行数
     */
    int count();

    /**
     * 匹配品牌名称的品牌数量
     * @param name
     * @return
     */
    int countByName(String name);

    /**
     * 通过id获取 BrandStandardVO
     *
     * @param id long
     * @return
     */
    BrandStandardVO getStandardById(Long id);

    /**
     * list
     *
     * @return
     */
    List<BrandListItemVO> list();
}
