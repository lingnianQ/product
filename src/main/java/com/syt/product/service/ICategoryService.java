package com.syt.product.service;

import com.syt.product.pojo.dto.CategoryAddNewDTO;

/**
 * 类别接口
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:36
 */
public interface ICategoryService {
    /**
     * 添加类别
     *
     * @param categoryAddNewDTO 添加
     */
    void addNew(CategoryAddNewDTO categoryAddNewDTO);

    /**
     * 删除类别
     *
     * @param id 类别id
     */
    void deleteById(Long id);
}
