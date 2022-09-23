package com.syt.product.pojo.vo;

import lombok.Data;

/**
 * list
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/23 10:53
 */
@Data
public class BrandListItemVO {
    private Long id;
    private String name;
    private String pinyin;
    private String logo;
    private String description;
    private String keywords;
    private Integer sort;
    private Integer sales;
    private Integer productCount;
    private Integer commentCount;
    private Integer positiveCommentCount;
    private Integer enable;
}
