package com.syt.product.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.syt.product.pojo.dto.AlbumAddNewDTO;
import com.syt.product.pojo.vo.AlbumListItemVO;
import com.syt.product.service.IAlbumService;
import com.syt.product.web.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 相册控制层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 17:14
 */
@Api(tags = "01. 相册管理")
@Slf4j
@Validated
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
    @ApiOperation("添加相册")
    @ApiOperationSupport(order = 1)
    @PostMapping(value = {"/add-new", "/addNew", "/add_new"})
    public JsonResult<Void> addNew(@Validated AlbumAddNewDTO albumAddNewDTO) {
//        try {
        log.debug("开始处理添加相册的请求: {}", albumAddNewDTO);
        albumService.addNew(albumAddNewDTO);
        return JsonResult.ok();
//        } catch (ServiceException e) {
//            return e.getMessage();
//        }
    }

    @ApiOperation("删除相册")
    @ApiOperationSupport(order = 2)
    @GetMapping("/delById/{id:[0-9]+}")
    public JsonResult<Void> deleteById(@PathVariable Long id) {
        log.debug("开始处理相册deleteById: {}", id);
        albumService.deleteById(id);
        return JsonResult.ok();
    }

    @ApiOperation("相册列表")
    @ApiOperationSupport(order = 3)
    @PostMapping("")
    public JsonResult<List<AlbumListItemVO>> list() {
        String message = "开始查询相册列表";
        log.debug(message);
        return JsonResult.ok(albumService.list(), message);
    }

    /**
     * 还需要在控制器类上添加`@Validated`注解，
     * 以下方法参数前的检查注解才会生效！
     * Spring Validation框架将抛出`ConstraintViolationException`类型的异常
     *
     * <p>
     * 处理请求的方法上有多个未封装的参数
     * * @ApiImplicitParams({
     * *     @ApiImplicitParam(xxx),
     * *     @ApiImplicitParam(xxx),
     * *     @ApiImplicitParam(xxx)
     * * })
     * </p>
     *
     * @param id
     * @return
     */
    @Deprecated
    @ApiOperation("删除相册【测试2】")
    @ApiOperationSupport(order = 910)
    @ApiImplicitParam(name = "id", value = "相册id", paramType = "query")
    @PostMapping("/delete/test2")
    public String deleteTest(@Range(min = 1, message = "测试删除相册失败，id值必须是1或更大的有效整数！") Long id) {
        log.debug("【测试】开始处理【删除相册】的请求，这只是一个测试，没有实质功能！");
        return "OK";
    }

}
