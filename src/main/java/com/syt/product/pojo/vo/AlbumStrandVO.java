package com.syt.product.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sytsn
 */
@Data
public class AlbumStrandVO implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Integer sort;
}
