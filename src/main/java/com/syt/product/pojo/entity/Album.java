package com.syt.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 相册 相册(pms_album) > 属性模板(pms_attribute_template) > 品牌(pms_brand) > 属性(pms_attribute) > 类别(pms_category) > 其它
 *
 * @author sytsnb@gmail.com
 * @version 0.0.1
 */
@Data
public class Album implements Serializable {

    /**
     * 记录id
     */
    private Long id;

    /**
     * 相册名称
     */
    private String name;

    /**
     * 相册简介
     */
    private String description;

    /**
     * 自定义排序序号
     */
    private Integer sort;

    /**
     * 数据创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 数据最后修改时间
     */
    private LocalDateTime gmtModified;

}