package com.syt.product.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * list
 * @author sytsn
 */
@Data
public class AlbumListItemVO implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Integer sort;
}
