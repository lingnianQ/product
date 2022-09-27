package com.syt.product.ex.handler;

import com.syt.product.ex.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 * Spring MVC建议将处理异常的代码写在专门的类中，
 * 并且，在类上添加@RestControllerAdvice注解，
 * 当添加此注解后，此类中处理异常的代码将作用于整个项目每次处理请求的过程中
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 11:48
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * ServiceException-
     * 同一个异常只可以写一个---不可以冲突
     * -@ExceptionHandler
     *
     * @param e ServiceException
     * @return e.getMessage()
     */
    @ExceptionHandler
    public String handlerServiceException(ServiceException e) {
        log.info("handlerServiceException {}", e.getMessage());
        return e.getMessage();
    }


    @ExceptionHandler
    public String handleThrowable(Throwable e) {
        log.debug("捕获到Throwable：{}", e.getMessage());
        e.printStackTrace(); // 强烈建议--dev
        return e.getMessage();
    }

}
