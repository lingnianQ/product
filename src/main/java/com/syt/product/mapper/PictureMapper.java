package com.syt.product.mapper;


import com.syt.product.pojo.entity.Picture;
import com.syt.product.pojo.vo.PictureListItemVO;
import com.syt.product.pojo.vo.PictureStandardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 图片Mapper接口
 *
 * @author sytsnb@gmail.com
 * @version 0.0.1
 */
@Repository
public interface PictureMapper {

    /**
     * 插入图片数据
     *
     * @param picture 图片数据
     * @return 受影响的行数
     */
    int insert(Picture picture);

    /**
     * 根据id删除图片
     *
     * @param id 被删除的图片的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据多个id批量删除图片数据
     *
     * @param ids 期望删除的若干个图片数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

    /**
     * 根据相册统计图片数量
     *
     * @param albumId 相册ID
     * @return 此相册的图片数量
     */
    int countByAlbum(Long albumId);

    /**
     * 根据id获取图片的标准信息
     *
     * @param id 图片id
     * @return 返回匹配的图片的标准信息，如果没有匹配的数据，将返回null
     */
    PictureStandardVO getStandardById(Long id);

    /**
     * 根据相册查询图片列表
     *
     * @param albumId 相册id
     * @return 匹配的图片列表，如果没有匹配的数据，则返回长度为0的列表
     */
    List<PictureListItemVO> listByAlbum(Long albumId);

}
