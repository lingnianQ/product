package com.syt.product.pojo.vo;


import lombok.Data;

import java.time.LocalDateTime;


/**
 * @author sytsn
 */
@Data
public class AttributeTemplateStandardVO {

    /**
     * 记录id
     */
    private Long id;

    /**
     * 属性模板名称
     */
    private String name;

    /**
     * 属性模板名称的拼音
     */
    private String pinyin;

    /**
     * 关键词列表，各关键词使用英文的逗号分隔
     */
    private String keywords;

    /**
     * 自定义排序序号
     */
    private Integer sort;

}
