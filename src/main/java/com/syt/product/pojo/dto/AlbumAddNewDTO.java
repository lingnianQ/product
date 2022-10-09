package com.syt.product.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
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
    @ApiModelProperty(value = "相册名称", example = "小米10的相册", required = true)
    @NotNull(message = "添加相册失败，必须提交相册名称！")
    private String name;

    /**
     * 相册简介
     */
    @ApiModelProperty(value = "相册简介", example = "小米10的相册的简介", required = true)
    @NotNull(message = "添加相册失败，必须提交相册简介！")
    private String description;

    /**
     * 自定义排序序号
     */
    @NotNull(message = "添加相册失败，必须提交排序序号！")
    @Range(max = 255, message = "添加相册失败，排序序号必须是[0, 255]区间范围内的数值！")
    private Integer sort;

}
