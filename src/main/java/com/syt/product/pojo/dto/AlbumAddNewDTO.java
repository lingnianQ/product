package com.syt.product.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 添加相册的DTO类
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 16:17
 */
@Data
public class AlbumAddNewDTO implements Serializable {

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

}
