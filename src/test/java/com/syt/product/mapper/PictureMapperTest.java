package com.syt.product.mapper;

import com.syt.product.pojo.entity.Picture;
import com.syt.product.pojo.vo.PictureListItemVO;
import com.syt.product.pojo.vo.PictureStandardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/25 23:20
 */
@Slf4j
@SpringBootTest
class PictureMapperTest {

    @Autowired
    private PictureMapper pictureMapper;

    @Test
    void testInsert() {
        Picture picture = new Picture();
        picture.setAlbumId(2L);
        int rows = pictureMapper.insert(picture);
        System.out.println("rows = " + rows);
        System.out.println("picture = " + picture);
    }

    @Test
    void testDeleteById() {
        int rows = pictureMapper.deleteById(2L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteByIds() {
        int rows = pictureMapper.deleteByIds(3L, 4L, 5L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCountByAlbum() {
        int rows = pictureMapper.countByAlbum(1L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testGetStandardById() {
        PictureStandardVO pictureStandardVO = pictureMapper.getStandardById(2L);
        System.out.println("pictureStandardVO = " + pictureStandardVO);
    }

    @Test
    void testListByAlbum() {
        List<PictureListItemVO> pictureListItemVOList = pictureMapper.listByAlbum(2L);
        pictureListItemVOList.forEach(System.out::println);
    }
}