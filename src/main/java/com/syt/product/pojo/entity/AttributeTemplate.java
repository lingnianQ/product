package com.syt.product.pojo.entity;


import lombok.Data;

import java.time.LocalDateTime;


/**
 * @author sytsn
 */
@Data
public class AttributeTemplate {

    private Long id;
    private String name;
    private String pinyin;
    private String keywords;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
