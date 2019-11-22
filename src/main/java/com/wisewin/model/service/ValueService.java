package com.wisewin.model.service;

import com.wisewin.model.dao.ValueDAO;
import com.wisewin.model.entity.bo.jd.ValueBO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("valueService")
@Transactional
public class ValueService {
    @Resource
    private ValueDAO valueDAO;

    public ValueBO getValue(){
        return valueDAO.getValue();
    }

}
