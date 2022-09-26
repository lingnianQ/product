package com.syt.product.service;

import com.syt.product.pojo.dto.AlbumAddNewDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 16:27
 */
@SpringBootTest
class IAlbumServiceTest {

    @Autowired
    private IAlbumService albumService;

    @Test
    void testAddNew() {
        AlbumAddNewDTO albumAddNewDTO = new AlbumAddNewDTO();
        albumAddNewDTO.setName("test02");
        albumAddNewDTO.setDescription("描述-简介");
        albumAddNewDTO.setSort(2);
        albumService.addNew(albumAddNewDTO);
    }
}