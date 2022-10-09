package com.syt.product.ex.handler;

import com.syt.product.ex.ServiceException;
import com.syt.product.web.JsonResult;
import com.syt.product.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

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

    public GlobalExceptionHandler() {
        System.out.println("GlobalExceptionHandler.GlobalExceptionHandler");
    }

    /**
     * ServiceException-
     * 同一个异常只可以写一个---不可以冲突
     * -@ExceptionHandler
     *
     * @param e ServiceException
     * @return e.getMessage()
     */
    @ExceptionHandler
    public JsonResult<Void> handlerServiceException(ServiceException e) {
        log.info("handlerServiceException {}", e.getMessage());
        return JsonResult.fail(e);
    }

    @ExceptionHandler
    public JsonResult<Void> handleBindException(BindException e) {
        log.debug("捕获到BindException：{}", e.getMessage());
        // 以下2行代码，如果有多种错误时，将随机获取其中1种错误的信息，并响应
        // 当配置了“快速失败”后，Spring Validation检查永远最多只有1种错误
        String message = e.getFieldError().getDefaultMessage();
        int state = ServiceCode.ERR_BAD_REQUEST.getValue();
        return JsonResult.fail(state, message);
        // ===============================
        // 以上代码，如果有多种错误时，将获取所有错误信息，并响应
        // StringBuilder stringBuilder = new StringBuilder();
        // List<FieldError> fieldErrors = e.getFieldErrors();
        // for (FieldError fieldError : fieldErrors) {
        //     stringBuilder.append(fieldError.getDefaultMessage());
        //  }
        // return JsonResult.fail(ServiceCode.ERR_BAD_REQUEST, stringBuilder.toString());
    }

    @ExceptionHandler
    public JsonResult<Void> handleConstraintViolationException(ConstraintViolationException e) {
        log.debug("捕获到ConstraintViolationException：{}", e.getMessage());
        StringBuilder stringBuilder = new StringBuilder();
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        for (ConstraintViolation<?> constraintViolation : constraintViolations) {
            stringBuilder.append(constraintViolation.getMessage());
        }
        return JsonResult.fail(ServiceCode.ERR_BAD_REQUEST.getValue(), stringBuilder.toString());
    }

    /**
     * get post 异常
     *
     * @param e e
     * @return e.getMessage()
     */
    @ExceptionHandler
    public String handlerHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        log.debug("HttpRequestMethodNotSupportedException: {}", e.getMessage());
        return e.getMessage();
    }

    @ExceptionHandler
    public JsonResult<Void> handleThrowable(Throwable e) {
        log.debug("处理Throwable");
        e.printStackTrace();//dev-强烈建议

        Integer serviceCode = 99999;
        String message = "程序运行过程中出现未知错误，请联系系统管理员！";
        return JsonResult.fail(serviceCode, message);
    }


}
