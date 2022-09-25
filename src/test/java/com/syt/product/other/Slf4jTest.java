package com.syt.product.other;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/23 17:30
 */
@Slf4j
@SpringBootTest
public class Slf4jTest {
    @Test
    void testLog(){
        log.trace("testSlf4j---[trace]--");
        log.debug("testSlf4j---[debug]--");
        log.info("testSlf4j---[info]--");
        log.warn("testSlf4j---[warn]--");
        log.error("testSlf4j---[error]--");
    }

}
