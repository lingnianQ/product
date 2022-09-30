package com.syt.product.service;

import com.syt.product.pojo.dto.AlbumAddNewDTO;
import com.syt.product.pojo.vo.AlbumListItemVO;

import java.util.List;

/**
 * 相册业务逻辑接口
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/26 15:57
 */
public interface IAlbumService {
    /**
     * 添加相册
     *
     * @param albumAddNewDTO
     */
    void addNew(AlbumAddNewDTO albumAddNewDTO);

    /**
     * 删除相册
     *
     * @param id 相册id
     */
    void deleteById(Long id);

    /**
     * 查询相册列表
     *
     * @return List<AlbumListItemVO>
     */
    List<AlbumListItemVO> list();
}
