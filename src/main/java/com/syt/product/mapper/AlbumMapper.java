package com.syt.product.mapper;

import com.syt.product.pojo.entity.Album;
import org.springframework.stereotype.Repository;

/**
 * 处理相册的Mapper接口
 */
@Repository
public interface AlbumMapper {
    /**
     * 插入相册数据
     * @param album
     * @return
     */
    int insert(Album album);

    /**
     * 根据id删除相册数据
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 统计数量
     * @return
     */
    int count();
}
