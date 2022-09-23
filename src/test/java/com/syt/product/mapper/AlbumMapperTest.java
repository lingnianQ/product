package com.syt.product.mapper;

import com.syt.product.pojo.entity.Album;
import com.syt.product.pojo.vo.AlbumStandardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
class AlbumMapperTest {
    @Autowired
    private AlbumMapper albumMapper;

    @Test
    void testGetStandardById() {
        AlbumStandardVO albumStandardVO = albumMapper.getStandardById(1L);
        System.out.println(albumStandardVO);
    }

    @Test
    void testInsert() {
        Album album = new Album();
        album.setName("test");
        album.setDescription("--test---");
        album.setSort(22);
        int rows = albumMapper.insert(album);
        log.info("insert完成,受影响的行数: {}", rows);
    }

    @Test
    void testInsertBatch() {
        List<Album> albumList = new ArrayList<Album>();
        for (int i = 0; i < 10; i++) {
            Album album = new Album();
            album.setName("test" + i);
            album.setDescription("--test---" + i);
            album.setSort(22 + i);
            albumList.add(album);
        }
        int rows = albumMapper.insertBatch(albumList);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteById() {
        albumMapper.deleteById(1L);
        System.out.println("删除成功");
    }

    @Test
    void testUpdateById() {
        Album album = new Album();
        album.setId(2L);
        album.setName("testUpdate");
        album.setDescription("--testUpdate---");
        album.setSort(66);
        int rows = albumMapper.updateById(album);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCount() {
        int count = albumMapper.count();
        System.out.println("count = " + count);
    }

    @Test
    void testList() {
        albumMapper.list().forEach(System.out::println);
    }

    @Test
    void testDeleteByIds() {
        Long[] ids = {3L, 4L, 5L, 6L};
        int rows = albumMapper.deleteByIds(ids);
        System.out.println("rows = " + rows);
    }
}