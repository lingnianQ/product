package com.syt.product.controller;

import com.syt.product.pojo.dto.AlbumAddNewDTO;
import com.syt.product.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 相册控制层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 17:14
 */
@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    public AlbumController() {
        System.out.println("AlbumController.AlbumController==相册控制层");
    }

    @GetMapping("/add-new")
    public String addNew(AlbumAddNewDTO albumAddNewDTO) {
        try {
            albumService.addNew(albumAddNewDTO);
            return "添加相册成功";
        } catch (Exception e) {
            return "添加相册失败,已存在";
        }
    }
}
