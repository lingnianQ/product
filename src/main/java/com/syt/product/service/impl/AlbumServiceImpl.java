package com.syt.product.service.impl;

import com.syt.product.ex.ServiceException;
import com.syt.product.mapper.AlbumMapper;
import com.syt.product.pojo.dto.AlbumAddNewDTO;
import com.syt.product.pojo.entity.Album;
import com.syt.product.pojo.vo.AlbumStandardVO;
import com.syt.product.service.IAlbumService;
import com.syt.product.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 相册业务逻辑实现
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 15:57
 */
@Slf4j
@Service
public class AlbumServiceImpl implements IAlbumService {

    public AlbumServiceImpl() {
        System.out.println("AlbumServiceImpl.AlbumServiceImpl----------相册业务逻辑实现");
    }

    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public void addNew(AlbumAddNewDTO albumAddNewDTO) {
        int countByName = albumMapper.countByName(albumAddNewDTO.getName());

        if (countByName != 0) {
            String message = "添加相册失败,尝试添加的相册名称已存在";
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }
        Album album = new Album();
        //复制albumAddNewDTO 到album
        BeanUtils.copyProperties(albumAddNewDTO, album);
        int rows = albumMapper.insert(album);
        System.out.println("添加成功: " + rows);
    }

    @Override
    public void deleteById(Long id) {
        log.debug("开始处理相册数据: {}", id);

        AlbumStandardVO standardVO = albumMapper.getStandardById(id);
        if (standardVO == null) {
            String message = "删除失败,相册id不存在";
            log.warn(message);
            throw new ServiceException(ServiceCode.ERR_DELETE, message);
        }
        log.debug("开始删除相册数据: {}", id);
        albumMapper.deleteById(id);
        log.debug("删除相册成功");
    }
}
