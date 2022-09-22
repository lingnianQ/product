package com.syt.product.pojo.entity;


import lombok.Data;

import java.time.LocalDate;

@Data
public class AttributeTemplate {

    private Long id;
    private String name;
    private String pinyin;
    private String keywords;
    private Integer sort;
    private LocalDate gmtCreate;
    private LocalDate gmtModified;

}
