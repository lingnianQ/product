package com.syt.product.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 品牌类别关联详情的VO类
 *
 * @author syst
 * @version 0.0.1
 */
@Data
public class BrandCategoryStandardVO implements Serializable {

    /**
     * 记录id
     */
    private Long id;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 类别id
     */
    private Long categoryId;

}
