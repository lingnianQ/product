package com.syt.product.service.impl;

import com.syt.product.ex.ServiceException;
import com.syt.product.mapper.BrandMapper;
import com.syt.product.pojo.dto.BrandAddNewDTO;
import com.syt.product.pojo.entity.Brand;
import com.syt.product.pojo.vo.BrandListItemVO;
import com.syt.product.pojo.vo.BrandStandardVO;
import com.syt.product.service.IBrandService;
import com.syt.product.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 品牌业务处理层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 20:13
 */
@Slf4j
@Service
@Transactional
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
    public void setEnable(Long id) {
        updateById(id, 1);
    }

    @Override
    public void setDisable(Long id) {
        updateById(id, 0);
    }

    @Override
    public BrandStandardVO getStandardById(Long id) {
        log.debug("开始查询品牌....");
        BrandStandardVO brand = brandMapper.getStandardById(id);
        if (brand == null) {
            String message = "查询失败所查询的品牌不存在";
            log.warn(message);
            throw new ServiceException(ServiceCode.ERR_NOT_FOUND, message);
        }
        return brand;
    }

    @Override
    public List<BrandListItemVO> list() {
        return brandMapper.list();
    }

    private void updateById(Long id, Integer enable) {
        String[] tips = {"禁用", "启用"};
        log.debug("开始处理【{}品牌】的业务，参数：{}", tips[enable], id);

        BrandStandardVO brandStandardVO = brandMapper.getStandardById(id);

        if (brandStandardVO == null) {
            String message = tips[enable] + "品牌失败，尝试访问的数据不存在！";
            log.debug(message);
            throw new ServiceException(ServiceCode.ERR_NOT_FOUND, message);
        }

        if (brandStandardVO.getEnable().equals(enable)) {
            String message = tips[enable] + "品牌失败，品牌已经处于" + tips[enable] + "状态！";
            log.debug(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }

        Brand brand = new Brand();
        brand.setId(id);
        brand.setEnable(enable);

        //BeanUtils.copyProperties(brandStandardVO, brand)
        int rows = brandMapper.updateById(brand);

        if (rows != 1) {
            String message = tips[enable] + "品牌失败，服务器忙，请稍后再次尝试！";
            log.warn(message);
            throw new ServiceException(ServiceCode.ERR_UPDATE, message);
        }

    }

}
