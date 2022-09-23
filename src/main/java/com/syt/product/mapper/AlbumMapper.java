package com.syt.product.mapper;

import com.syt.product.pojo.entity.Album;
import com.syt.product.pojo.vo.AlbumListItemVO;
import com.syt.product.pojo.vo.AlbumStandardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 处理相册的Mapper接口
 *
 * @author sytsn
 */
@Repository
public interface AlbumMapper {
    /**
     * 插入相册数据
     *
     * @param album
     * @return
     */
    int insert(Album album);

    /**
     * 根据id删除相册数据
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 统计数量
     *
     * @return
     */
    int count();

    /**
     * 通过id查找
     *
     * @param id
     * @return
     */
    AlbumStandardVO getStandardById(Long id);

    /**
     * 查询列表
     * @return java.util.List
     */
    List<AlbumListItemVO> list();
}
