package com.syt.product.service.impl;

import com.syt.product.ex.ServiceException;
import com.syt.product.mapper.CategoryMapper;
import com.syt.product.pojo.dto.BrandAddNewDTO;
import com.syt.product.pojo.dto.CategoryAddNewDTO;
import com.syt.product.pojo.entity.Brand;
import com.syt.product.pojo.entity.Category;
import com.syt.product.service.ICategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:37
 */
@Service
@Slf4j
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void addNew(CategoryAddNewDTO categoryAddNewDTO) {
        log.debug("开始处理添加类别--- {}", categoryAddNewDTO);
        int countByName = categoryMapper.countByName(categoryAddNewDTO.getName());
        if (countByName != 0) {
            String message = "类别已存在";
            log.debug(message);
            throw new ServiceException(message);
        }
        Category category = new Category();
        BeanUtils.copyProperties(categoryAddNewDTO, category);
        log.debug("开始添加类别");
        categoryMapper.insert(category);
        log.debug("添加类别完成");
    }

    @Override
    public void deleteById(Long id) {
        if (categoryMapper.getStandardById(id) == null) {
            String message = "类别id不存在";
            log.debug(message);
            throw new ServiceException(message);
        }
        categoryMapper.deleteById(id);
        log.debug("删除类别成功");
    }
}
