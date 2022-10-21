package com.syt.product.security;

import lombok.Data;

import java.io.Serializable;

/**
 * 当前登录的当事人
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/21 20:52
 */
@Data
public class LoginPrincipal implements Serializable {

    /**
     * 管理员id
     */
    private Long id;
    /**
     * 管理员用户名
     */
    private String username;
}
