package com.syt.product.mapper;

import com.syt.product.pojo.entity.Spu;
import com.syt.product.pojo.vo.SpuStandardVO;
import com.syt.product.util.IdUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpuMapperTest {

    @Autowired
    private SpuMapper spuMapper;

    @Test
    void testInsert() {
        Spu spu = new Spu();
        spu.setId(IdUtils.getId());
        spu.setBrandId(IdUtils.getId());
        spu.setCategoryId(IdUtils.getId());
        spu.setAlbumId(IdUtils.getId());
        int i = spuMapper.insert(spu);
        System.out.println("spu = " + spu);
    }

    @Test
    void testDeleteById() {
        int i = spuMapper.deleteById(2L);
        System.out.println("i = " + i);
    }

    @Test
    void testDeleteByIds() {
        int rows = spuMapper.deleteByIds(2022092602565873218L, 2022092523412892730L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCountByBrand() {
        int rows = spuMapper.countByBrand(2022092603013766450L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCountByCategory() {
        int rows = spuMapper.countByCategory(2022092603011758887L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCountByAlbum() {
        int rows = spuMapper.countByAlbum(2022092603013766489L);
        System.out.println("rows = " + rows);
    }

    @Test
    void testGetStandardById() {
        SpuStandardVO spuStandardVO = spuMapper.getStandardById(2022092603011758887L);
        System.out.println("spuStandardVO = " + spuStandardVO);
    }
}