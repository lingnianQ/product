package com.syt.product.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 品牌添加DTO类
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:08
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrandAddNewDTO {
    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌名称的拼音
     */
    private String pinyin;

    /**
     * 品牌logo的URL
     */
    private String logo;

    /**
     * 品牌简介
     */
    private String description;

    /**
     * 关键词列表，各关键词使用英文的逗号分隔
     */
    private String keywords;

    /**
     * 自定义排序序号
     */
    private Integer sort;

    /**
     * 销量（冗余）
     */
    private Integer sales;

    /**
     * 商品种类数量总和（冗余）
     */
    private Integer productCount;

    /**
     * 买家评论数量总和（冗余）
     */
    private Integer commentCount;

    /**
     * 买家好评数量总和（冗余）
     */
    private Integer positiveCommentCount;

    /**
     * 是否启用，1=启用，0=未启用
     */
    private Integer enable;
}
