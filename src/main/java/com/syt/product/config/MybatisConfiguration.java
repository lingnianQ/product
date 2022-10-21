package com.syt.product.config;

import com.syt.product.interceptor.mybatis.InsertUpdateTimeInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

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

    @Autowired
    private List<SqlSessionFactory> sqlSessionFactoryList;

    /**
     * 使得此方法在调用了构造方法、完成了属性注入之后自动执行
     */
    @PostConstruct
    public void addInterceptor() {
        InsertUpdateTimeInterceptor interceptor = new InsertUpdateTimeInterceptor();
        for (SqlSessionFactory sqlSessionFactory : sqlSessionFactoryList) {
            sqlSessionFactory.getConfiguration().addInterceptor(interceptor);
        }
    }
}


