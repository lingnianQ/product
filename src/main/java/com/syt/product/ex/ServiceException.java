package com.syt.product.ex;

import com.syt.product.web.ServiceCode;

/**
 * 自定义异常-业务异常
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 9:47
 */
public class ServiceException extends RuntimeException {

    private ServiceCode serviceCode;

    public ServiceException(ServiceCode serviceCode, String message) {
        super(message);
        this.serviceCode = serviceCode;
    }

    public ServiceCode getServiceCode() {
        return serviceCode;
    }

}
