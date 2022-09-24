package com.syt.product.mapper;

import com.syt.product.pojo.entity.Category;
import com.syt.product.pojo.vo.CateGoryListItemVO;
import com.syt.product.pojo.vo.CateGoryStandardVO;

import java.util.List;

/**
 * mapper 处理类别
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/25 2:10
 */
public interface CategoryMapper {

    int insert(Category category);

    int insertBatch(List<Category> categoryList);

    int deleteById(Long id);

    int deleteByIds(Long[] ids);

    int updateById(Category category);

    int count();

    int countByName(String name);

    CateGoryStandardVO getStandardByName(String name);

    List<CateGoryListItemVO> list();

}
