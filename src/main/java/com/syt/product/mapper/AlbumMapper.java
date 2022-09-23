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
     * @param album 受影响的行数
     * @return
     */
    int insert(Album album);

    /**
     * 批量插入相册数据
     *
     * @param albumList 数据集合
     * @return 受影响的行数
     */
    int insertBatch(List<Album> albumList);

    /**
     * 根据id删除相册数据
     *
     * @param id 相册id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 通过id批量删除
     *
     * @param ids 受影响的行数
     * @return
     */
    int deleteByIds(Long[] ids);

    /**
     * 根据id修改相册
     * 使用动态SQL
     *
     * @param album 修改后的数据
     * @return
     */
    int updateById(Album album);

    /**
     * 统计数量
     *
     * @return 行数
     */
    int count();

    /**
     * 通过id查找
     *
     * @param id 相册id
     * @return 相册视图VO
     */
    AlbumStandardVO getStandardById(Long id);

    /**
     * 查询列表
     *
     * @return java.util.List相册列表
     */
    List<AlbumListItemVO> list();

}
