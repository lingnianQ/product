package com.syt.product.service.impl;

import com.syt.product.ex.ServiceException;
import com.syt.product.mapper.AlbumMapper;
import com.syt.product.pojo.dto.AlbumAddNewDTO;
import com.syt.product.pojo.entity.Album;
import com.syt.product.service.IAlbumService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 相册业务逻辑实现
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 15:57
 */
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
            throw new ServiceException("添加相册失败,尝试添加的相册名称已存在");
        }
        Album album = new Album();
        //复制albumAddNewDTO 到album
        BeanUtils.copyProperties(albumAddNewDTO, album);
        int rows = albumMapper.insert(album);
        System.out.println("添加成功: " + rows);
    }
}
