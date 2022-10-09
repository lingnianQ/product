package com.syt.product.config;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;


/**
 * Spring Validation的配置类
 *
 * @author sytsn
 */
@Slf4j
@Configuration
public class ValidationConfiguration {

    public ValidationConfiguration() {
        log.debug("创建配置类：ValidationConfiguration");
    }

    @Bean
    public javax.validation.Validator validator() {
        return Validation.byProvider(HibernateValidator.class)
                // 开始配置Validator
                .configure()
                // 快速失败，即检查请求参数发现错误时直接视为失败，并不向后继续检查
                .failFast(true)
                .buildValidatorFactory()
                .getValidator();
    }

}
