package com.syt.product.mapper;

import com.syt.product.pojo.entity.SkuSpecification;
import com.syt.product.pojo.vo.SkuSpecificationListItemVO;
import com.syt.product.pojo.vo.SkuSpecificationStandardVO;

import java.util.List;

/**
 * 处理SKU数据数据的Mapper接口
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 9:22
 */
public interface SkuSpecificationMapper {

    /**
     * 插入SKU数据数据
     *
     * @param skuSpecification SKU数据数据
     * @return 受影响的行数
     */
    int insert(SkuSpecification skuSpecification);

    /**
     * 批量插入SKU数据数据
     *
     * @param skuSpecificationList 若干个SKU数据数据的集合
     * @return 受影响的行数
     */
    int insertBatch(List<SkuSpecification> skuSpecificationList);

    /**
     * 根据id删除SKU数据数据
     *
     * @param id SKU数据id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 批量删除SKU数据
     *
     * @param ids 需要删除的若干个SKU数据的id
     * @return 受影响的行数
     */
    int deleteByIds(Long[] ids);

    /**
     * 更新SKU数据数据
     *
     * @param skuSpecification 封装了SKU数据的id和需要更新的新数据的对象
     * @return 受影响的行数
     */
    int updateById(SkuSpecification skuSpecification);

    /**
     * 统计SKU数据数据的数量
     *
     * @return SKU数据数据的数量
     */
    int count();

    /**
     * 根据id查询SKU数据标准信息
     *
     * @param id SKU数据id
     * @return 匹配的SKU数据的标准信息，如果没有匹配的数据，则返回null
     */
    SkuSpecificationStandardVO getStandardById(Long id);

    /**
     * 查询SKU数据列表
     *
     * @return SKU数据列表
     */
    List<SkuSpecificationListItemVO> list();

}
