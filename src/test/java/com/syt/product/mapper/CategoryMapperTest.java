package com.syt.product.mapper;

import com.syt.product.pojo.entity.Category;
import com.syt.product.pojo.vo.CateGoryListItemVO;
import com.syt.product.pojo.vo.CateGoryStandardVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 类别测试
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/25 2:23
 */
@SpringBootTest
class CategoryMapperTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    void Insert() {
        Category category = new Category();
        category.setName("test");
        int rows = categoryMapper.insert(category);
        System.out.println("rows = " + rows);
        System.out.println("category = " + category);
    }

    @Test
    void InsertBatch() {
        List<Category> categoryList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Category category = new Category();
            category.setName("test" + i);
            categoryList.add(category);
        }
        int rows = categoryMapper.insertBatch(categoryList);
        System.out.println("rows = " + rows);
        System.out.println("categoryList = " + categoryList);
    }

    @Test
    void DeleteById() {
        int row = categoryMapper.deleteById(79L);
        System.out.println("row = " + row);

    }

    @Test
    void DeleteByIds() {
        Long[] ids = {80L, 81L, 82L, 83L};
        int rows = categoryMapper.deleteByIds(ids);
        System.out.println("rows = " + rows);
    }

    @Test
    void testUpdateById() {

        Category category = new Category();
        category.setId(77L);
        category.setName("test computer");
        int rows = categoryMapper.updateById(category);
        System.out.println("rows = " + rows);
        System.out.println("category = " + category);
    }

    @Test
    void Count() {
        int count = categoryMapper.count();
        System.out.println("count = " + count);
    }

    @Test
    void CountByName() {
        int countByName = categoryMapper.countByName("test");
        System.out.println("countByName = " + countByName);
    }

    @Test
    void GetStandardByName() {
        CateGoryStandardVO cateGoryStandardVO = categoryMapper.getStandardByName("test");
        System.out.println("cateGoryStandardVO = " + cateGoryStandardVO);
    }

    @Test
    void List() {
        List<CateGoryListItemVO> cateGoryListItemVOList = categoryMapper.list();
        cateGoryListItemVOList.forEach(System.out::println);
    }
}