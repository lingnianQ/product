package com.syt.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Album implements Serializable {

    private Long id;
    private String name;
    private String description;
    private Integer sort;
    private LocalDate gmtCreate;
    /**
     * 数据最后修改时间
     */
    private LocalDate gmtModified;

}
