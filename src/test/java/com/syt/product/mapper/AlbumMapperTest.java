package com.syt.product.mapper;

import com.syt.product.pojo.entity.Album;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class AlbumMapperTest {
    @Autowired
    private AlbumMapper albumMapper;

    @Test
    void testInsert() {
        Album album = new Album();
        album.setName("test");
        album.setDescription("--test---");
        album.setSort(99);
        int rows = albumMapper.insert(album);
        log.info("insert完成,受影响的行数: {}",rows);
    }
    @Test
    void testDeleteById() {
        albumMapper.deleteById(1L);
        System.out.println("删除成功");
    }

    @Test
    void testCount(){
        int count = albumMapper.count();
        System.out.println("count = " + count);
    }
}