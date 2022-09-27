package com.syt.product.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 添加属性模板的DTO类
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 19:27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttributeTemplateAddNewDTO {

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
