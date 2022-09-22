package com.syt.product.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sytsn
 */
@Configuration
@Slf4j
@MapperScan("com.syt.product.mapper")
public class MybatisConfiguration {
    public MybatisConfiguration() {
        log.info("创建配置类--MybatisConfiguration");
    }
}


