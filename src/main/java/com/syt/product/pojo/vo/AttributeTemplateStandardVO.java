package com.syt.product.pojo.vo;


import lombok.Data;

import java.time.LocalDateTime;


/**
 * @author sytsn
 */
@Data
public class AttributeTemplateStandardVO {

    private Long id;
    private String name;
    private String pinyin;
    private String keywords;
    private Integer sort;

}
