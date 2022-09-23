package com.syt.product.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 相册
 * @author sytsn
 */
@Data
public class Album implements Serializable {
    /**
     * 相册id-主键
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
