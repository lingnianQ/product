package com.syt.product.mapper;

import com.syt.product.pojo.entity.Attribute;
import com.syt.product.pojo.vo.AttributeListItemVO;
import com.syt.product.pojo.vo.AttributeStandardVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


/**
 * 属性测试
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/25 1:14
 */
@SpringBootTest
class AttributeMapperTest {

    @Autowired
    private AttributeMapper attributeMapper;

    @Test
    void testInsert() {
        Attribute attribute = new Attribute();
        attribute.setName("颜色");
        int row = attributeMapper.insert(attribute);
        System.out.println("row = " + row);
    }

    @Test
    void testInsertBatch() {
        List<Attribute> attributeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Attribute attribute = new Attribute();
            attribute.setName("颜色" + i);
            attributeList.add(attribute);
        }
        int rows = attributeMapper.insertBatch(attributeList);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteById() {
        Long id = 1L;
        int rows = attributeMapper.deleteById(id);
        System.out.println("rows = " + rows);
    }

    @Test
    void testDeleteByIds() {
        Long[] ids = {4L, 7L, 8L};
        int rows = attributeMapper.deleteByIds(ids);
        System.out.println("rows = " + rows);
    }

    @Test
    void testUpdateById() {
        Attribute attribute = new Attribute();
        attribute.setId(9L);
        attribute.setName("绿色--");
        int rows = attributeMapper.updateById(attribute);
        System.out.println("rows = " + rows);
    }

    @Test
    void testCount() {
        int count = attributeMapper.count();
        System.out.println("count = " + count);
    }

    @Test
    void testCountByNameAndTemplateI() {
        int countByNameAndTemplateId = attributeMapper.countByNameAndTemplateId("颜色1", 3L);
        System.out.println("countByNameAndTemplateId = " + countByNameAndTemplateId);

    }

    @Test
    void testGetStandById() {
        AttributeStandardVO attributeStandardVO = attributeMapper.getStandById(9L);
        System.out.println("attributeStandardVO = " + attributeStandardVO);
    }

    @Test
    void testList() {
        List<AttributeListItemVO> list = attributeMapper.list();
        list.forEach(System.out::println);

    }
}