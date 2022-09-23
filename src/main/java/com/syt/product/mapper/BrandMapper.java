package com.syt.product.mapper;

import com.syt.product.pojo.vo.BrandListItemVO;
import com.syt.product.pojo.vo.BrandStandardVO;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/23 10:50
 */

public interface BrandMapper {
    /**
     * 通过id获取 BrandStandardVO
     *
     * @param id long
     * @return
     */
    BrandStandardVO getStandardById(Long id);

    /**
     * list
     * @return
     */
    List<BrandListItemVO> list();
}