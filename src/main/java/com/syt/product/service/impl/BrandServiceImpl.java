package com.syt.product.service.impl;

import com.syt.product.ex.ServiceException;
import com.syt.product.mapper.BrandMapper;
import com.syt.product.pojo.dto.BrandAddNewDTO;
import com.syt.product.pojo.entity.Brand;
import com.syt.product.pojo.vo.BrandListItemVO;
import com.syt.product.service.IBrandService;
import com.syt.product.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 品牌业务处理层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:13
 */
@Slf4j
@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public void addNew(BrandAddNewDTO brandAddNewDTO) {
        log.debug("开始处理添加品牌--- {}", brandAddNewDTO);
        int countByName = brandMapper.countByName(brandAddNewDTO.getName());
        if (countByName != 0) {
            String message = "品牌名已存在";
            log.debug(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandAddNewDTO, brand);
        log.debug("开始添加品牌");
        brandMapper.insert(brand);
        log.debug("添加品牌完成");
    }

    @Override
    public void deleteById(Long id) {
        if (brandMapper.getStandardById(id) == null) {
            String message = "品牌id不存在";
            log.debug(message);
            throw new ServiceException(ServiceCode.ERR_DELETE, message);
        }
        brandMapper.deleteById(id);
        log.debug("删除品牌成功");
    }

    @Override
    public List<BrandListItemVO> list() {
        return brandMapper.list();
    }
}
