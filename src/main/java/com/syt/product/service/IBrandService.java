package com.syt.product.service;


import com.syt.product.pojo.dto.BrandAddNewDTO;

/**
 * 品牌接口
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:11
 */
public interface IBrandService {
    /**
     * 添加品牌模板
     *
     * @param brandAddNewDTO 添加
     */
    void addNew(BrandAddNewDTO brandAddNewDTO);

    /**
     * 删除品牌
     *
     * @param id 品牌id
     */
    void deleteById(Long id);
}
