package com.syt.product.service;


import com.syt.product.pojo.dto.BrandAddNewDTO;
import com.syt.product.pojo.vo.BrandListItemVO;
import com.syt.product.pojo.vo.BrandStandardVO;

import java.util.List;

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

    /**
     * 启用品牌
     *
     * @param id 品牌的id
     */
    void setEnable(Long id);

    /**
     * 禁用品牌
     *
     * @param id 品牌的id
     */
    void setDisable(Long id);

    /**
     * 通过id查询标准视图
     *
     * @param id
     * @return
     */
    BrandStandardVO getStandardById(Long id);

    /**
     * 查询品牌列表
     *
     * @return List<BrandListItemVO>
     */
    List<BrandListItemVO> list();

    /**
     * 重建品牌数据缓存
     */
    void rebuildCache();
}
