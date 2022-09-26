package com.syt.product.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 9:59
 */
@Data
public class SkuSpecificationListItemVO implements Serializable {
    /**
     * 记录id
     */
    private Long id;

    /**
     * SKU id
     */
    private Long skuId;

    /**
     * 属性id
     */
    private Long attributeId;

    /**
     * 属性名称
     */
    private String attributeName;

    /**
     * 属性值
     */
    private String attributeValue;

    /**
     * 自动补充的计量单位
     */
    private String unit;

    /**
     * 自定义排序序号
     */
    private Integer sort;
}
