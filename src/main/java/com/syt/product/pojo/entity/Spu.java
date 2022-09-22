package com.syt.product.pojo.entity;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Spu {

    private Long id;
    private String name;
    private String typeNumber;
    private String title;
    private String description;
    private BigDecimal listPrice;
    private Long stock;
    private Long stockThreshold;
    private String unit;
    private Long brandId;
    private String brandName;
    private Long categoryId;
    private String categoryName;
    private Long attributeTemplateId;
    private Long albumId;
    private String pictures;
    private String keywords;
    private String tags;
    private Long sales;
    private Long commentCount;
    private Long positiveCommentCount;
    private Long sort;
    private Long isDeleted;
    private Long isPublished;
    private Long isNewArrival;
    private Long isRecommend;
    private Long isChecked;
    private String checkUser;
    private LocalDate gmtCheck;
    private LocalDate gmtCreate;
    private LocalDate gmtModified;


}
