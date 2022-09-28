package com.syt.product.web;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 业务状态码的枚举
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/28 14:45
 */

public enum ServiceCode {
    /**
     * 响应成功
     */
    OK(20000),
    /**
     * 错误的请求
     */
    ERR_BAD_REQUEST(40000),
    ERR_UNAUTHORIZED(40100),
    ERR_UNAUTHORIZED_DISABLED(40110),
    ERR_FORBIDDEN(40300),
    ERR_NOT_FOUND(40400),
    ERR_CONFLICT(40900),
    /**
     * 插入失败
     */
    ERR_INSERT(50000),
    /**
     * 删除失败
     */
    ERR_DELETE(50100),
    /**
     * 更新失败
     */
    ERR_UPDATE(50200),
    ERR_JWT_EXPIRED(60000),
    ERR_JWT_PARSE(60100);

    private int value;

    ServiceCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

}
