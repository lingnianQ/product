package com.syt.product.other;

import com.syt.product.service.impl.AlbumServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
@Slf4j
public class SpringTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testGetBean() {
        log.debug("即将从ApplicationContext中获取对象……");
        AlbumServiceImpl albumService1 = applicationContext.getBean(AlbumServiceImpl.class);
        AlbumServiceImpl albumService2 = applicationContext.getBean(AlbumServiceImpl.class);
        AlbumServiceImpl albumService3 = applicationContext.getBean(AlbumServiceImpl.class);
        log.debug("albumService1 >>> {}", albumService1);
        log.debug("albumService2 >>> {}", albumService2);
        log.debug("albumService3 >>> {}", albumService3);
    }

}
