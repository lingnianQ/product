package com.syt.product.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 业务状态码的枚举
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/28 14:45
 */

public enum ServiceCode {

    /**
     * 成功
     */
    OK(20000),
    /**
     * 错误：请求参数有误
     */
    ERR_BAD_REQUEST(40000),
    /**
     * 错误：未认证
     */
    ERR_UNAUTHORIZED(40100),
    /**
     * 错误：未认证，账号已被禁用
     */
    ERR_UNAUTHORIZED_DISABLED(40101),
    /**
     * 错误：无操作权限，禁止访问
     */
    ERR_FORBIDDEN(40300),
    /**
     * 错误：尝试访问的数据不存在
     */
    ERR_NOT_FOUND(40400),
    /**
     * 错误：请求方式错误
     */
    ERR_NOT_ALLOWED(40500),
    /**
     * 错误：数据冲突
     */
    ERR_CONFLICT(40900),
    /**
     * 错误：插入数据错误
     */
    ERR_INSERT(50000),
    /**
     * 错误：删除数据错误
     */
    ERR_DELETE(50100),
    /**
     * 错误：更新数据错误
     */
    ERR_UPDATE(50200),
    /**
     * 错误：查询数据错误
     */
    ERR_SELECT(50300),
    /**
     * 错误：JWT签名错误
     */
    ERR_JWT_SIGNATURE(60000),
    /**
     * 错误：JWT数据格式错误
     */
    ERR_JWT_MALFORMED(60000),
    /**
     * 错误：JWT已过期
     */
    ERR_JWT_EXPIRED(60002),
    /**
     * 错误：未知错误
     */
    ERR_UNKNOWN(99999);
    @Getter
    private final int value;

    ServiceCode(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "" + value;
    }

}
