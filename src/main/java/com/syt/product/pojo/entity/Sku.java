package com.syt.product.pojo.entity;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
public class Sku {

  private Long id;
  private Long spuId;
  private String title;
  private String barCode;
  private Long attributeTemplateId;
  private String specifications;
  private Long albumId;
  private String pictures;
  private BigDecimal price;
  private Long stock;
  private Long stockThreshold;
  private Long sales;
  private Long commentCount;
  private Long positiveCommentCount;
  private Long sort;
  private LocalDate gmtCreate;
  private LocalDate gmtModified;

}
