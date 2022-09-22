package com.syt.product.mapper.vo;

import com.syt.product.mapper.AlbumMapper;
import com.syt.product.pojo.vo.AlbumStrandVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/22 23:03
 */
@SpringBootTest
class AlbumStrandMapperTest {

    @Autowired
    private AlbumMapper albumMapper;
    @Test
    void getById() {
        AlbumStrandVO byId = albumMapper.getById(1L);
        System.out.println(byId);
    }
}