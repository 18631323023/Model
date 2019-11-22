package com.wisewin.model.service;

import com.wisewin.model.dao.UserDAO;
import com.wisewin.model.entity.bo.AssessmentResultBO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
@Transactional
public class UserService {
    @Resource
    private UserDAO userDAO;


    public AssessmentResultBO getAssess(String ut){
        return userDAO.getAssess(ut);
    }

    public void addAssess(AssessmentResultBO assessmentResultBO){
        userDAO.addAssess(assessmentResultBO);
    }


}
