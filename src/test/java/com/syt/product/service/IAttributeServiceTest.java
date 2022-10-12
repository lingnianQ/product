package com.syt.product.service;

import com.syt.product.pojo.dto.AttributeAddNewDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/13 1:53
 */
@Slf4j
@SpringBootTest
class IAttributeServiceTest {

    @Autowired
    private IAttributeService attributeService;

    @Test
    void testAddNew() {
        AttributeAddNewDTO attributeAddNewDTO = new AttributeAddNewDTO();
        attributeAddNewDTO.setName("颜色11");
        attributeAddNewDTO.setTemplateId(2L);
        try {
            attributeService.addNew(attributeAddNewDTO);
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
    }
}