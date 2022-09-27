package com.syt.product.controller;

import com.syt.product.ex.ServiceException;
import com.syt.product.pojo.dto.AlbumAddNewDTO;
import com.syt.product.service.IAlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 相册控制层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 17:14
 */
@Slf4j
@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    public AlbumController() {
        System.out.println("AlbumController.AlbumController==相册控制层");
    }

    /**
     * 如果不使用try...catch---500
     * {
     * "timestamp": "2022-09-27T02:32:24.933+00:00",
     * "status": 500,
     * "error": "Internal Server Error",
     * "path": "/album/add-new"
     * }
     */
    @GetMapping("/add-new")
    public String addNew(AlbumAddNewDTO albumAddNewDTO) {
//        try {
        albumService.addNew(albumAddNewDTO);
        return "添加相册成功";
//        } catch (ServiceException e) {
//            return e.getMessage();
//        }
    }

}
