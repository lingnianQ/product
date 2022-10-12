package com.syt.product.service.impl;

import com.syt.product.ex.ServiceException;
import com.syt.product.mapper.AttributeMapper;
import com.syt.product.mapper.AttributeTemplateMapper;
import com.syt.product.pojo.dto.AttributeAddNewDTO;
import com.syt.product.pojo.entity.Attribute;
import com.syt.product.pojo.vo.AttributeTemplateStandardVO;
import com.syt.product.service.IAttributeService;
import com.syt.product.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 属性业务接口实现类
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/10/13 1:14
 */
@Slf4j
@Service
public class AttributeServiceImpl implements IAttributeService {

    @Autowired
    private AttributeMapper attributeMapper;

    @Autowired
    private AttributeTemplateMapper attributeTemplateMapper;

    @Override
    public void addNew(AttributeAddNewDTO attributeAddNewDTO) {

        log.debug("开始查询属性模板id下的属性数量");
        {
            int countByNameAndTemplateId = attributeMapper.countByNameAndTemplateId(
                    attributeAddNewDTO.getName(), attributeAddNewDTO.getTemplateId());

            if ((countByNameAndTemplateId > 0)) {
                String message = "插入失败,该属性模板下,属性名已存在";
                log.warn(message);
                throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
            }
        }
        log.debug("开始查询是否存在属性模板");
        {
            AttributeTemplateStandardVO standardVO = attributeTemplateMapper.getStandardById(attributeAddNewDTO.getTemplateId());
            if (standardVO == null) {
                String message = "添加属性失败,属性模板id不存在";
                log.warn(message);
                throw new ServiceException(ServiceCode.ERR_NOT_FOUND, message);
            }
        }
        log.debug("开始插入属性模板数据");
        {
            Attribute attribute = new Attribute();

            BeanUtils.copyProperties(attributeAddNewDTO, attribute);

            int rows = attributeMapper.insert(attribute);
            if (rows != 1) {
                String message = "添加属性失败,服务器繁忙,请稍后再试";
                log.warn(message);
                throw new ServiceException(ServiceCode.ERR_INSERT, message);
            }
        }

    }
}
