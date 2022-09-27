package com.syt.product.controller;

import com.syt.product.pojo.dto.AlbumAddNewDTO;
import com.syt.product.service.IAlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 相册控制层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 17:14
 */
@Slf4j
@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    public AlbumController() {
        System.out.println("AlbumController.AlbumController==相册控制层");
    }


    /**
     * 如果有异常不处理---
     * 如果不使用try...catch---500
     * {
     * "timestamp": "2022-09-27T02:32:24.933+00:00",
     * "status": 500,
     * "error": "Internal Server Error",
     * "path": "/albums/add-new"
     * }
     * <p>
     * //@RequestMapping(value = {"/add-new", "/addNew", "/add_new"}, method = {RequestMethod.GET, RequestMethod.POST})
     */
    @GetMapping(value = {"/add-new", "/addNew", "/add_new"})
    public String addNew(AlbumAddNewDTO albumAddNewDTO) {
//        try {
        log.debug("开始处理添加相册的请求: {}", albumAddNewDTO);
        albumService.addNew(albumAddNewDTO);
        return "ok";
//        } catch (ServiceException e) {
//            return e.getMessage();
//        }
    }
}
