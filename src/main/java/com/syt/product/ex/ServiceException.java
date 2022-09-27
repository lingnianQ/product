package com.syt.product.ex;

/**
 * 自定义异常-业务异常
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 9:47
 */
public class ServiceException extends RuntimeException {
    public ServiceException(String message) {
        super(message);
    }
}
