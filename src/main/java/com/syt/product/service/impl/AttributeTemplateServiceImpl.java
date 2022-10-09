package com.syt.product.service.impl;

import com.syt.product.ex.ServiceException;
import com.syt.product.mapper.AttributeTemplateMapper;
import com.syt.product.pojo.dto.AttributeTemplateAddNewDTO;
import com.syt.product.pojo.entity.AttributeTemplate;
import com.syt.product.pojo.vo.AttributeTemplateListItemVO;
import com.syt.product.service.IAttributeTemplateService;
import com.syt.product.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 属性模板业务处理层
 *
 * @author sytsnb@gmail.com
 * @date 2022 2022/9/27 11:21
 */
@Slf4j
@Service
public class AttributeTemplateServiceImpl implements IAttributeTemplateService {

    @Autowired
    private AttributeTemplateMapper attributeTemplateMapper;

    @Override
    public void addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO) {
        if (attributeTemplateMapper.countByName(attributeTemplateAddNewDTO.getName()) != 0) {
            String message = "属性模板名已存在,请更换属性模板名";
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }
        AttributeTemplate attributeTemplate = new AttributeTemplate();
        BeanUtils.copyProperties(attributeTemplateAddNewDTO, attributeTemplate);
        attributeTemplateMapper.insert(attributeTemplate);
        log.debug("属性模板添加成功");
    }

    @Override
    public void deleteById(Long id) {
        if (attributeTemplateMapper.getStandardById(id) == null) {
            String message = "属性模板名不存在,删除失败";
            log.debug(message);
            throw new ServiceException(ServiceCode.ERR_DELETE, message);
        }
        log.debug("开始删除属性模板");
        attributeTemplateMapper.deleteById(id);
        log.debug("属性模板删除成功");
    }

    @Override
    public List<AttributeTemplateListItemVO> list() {
        return attributeTemplateMapper.list();
    }
}
