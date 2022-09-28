package com.syt.product.web;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.syt.product.ex.ServiceException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 状态信息
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/28 11:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult<T> implements Serializable {
    /**
     * 响应状态
     */
    private Integer state;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 成功时响应的数据
     */
    private T data;

    /**
     * 成功时
     * 无data数据
     */
    public static JsonResult<Void> ok() {
        return ok(null);
    }

    public static <T> JsonResult<T> ok(T data) {
        return new JsonResult<>(ServiceCode.OK.getValue(), null, data);
    }

    public static JsonResult<Void> fail(ServiceException e) {
        return fail(e.getServiceCode().getValue(), e.getMessage());
    }

    public static JsonResult<Void> fail(Integer state, String message) {
        return new JsonResult<>(state, message, null);
    }
}
