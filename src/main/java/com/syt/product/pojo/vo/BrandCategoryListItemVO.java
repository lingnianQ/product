package com.syt.product.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 品牌类别关联列表项的VO类
 *
 * @author syts
 * @version 0.0.1
 */
@Data
public class BrandCategoryListItemVO implements Serializable {

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
