package com.wisewin.model.dao;

import com.wisewin.model.entity.bo.AssessmentResultBO;

public interface UserDAO {

    AssessmentResultBO getAssess(String ut);

    void addAssess(AssessmentResultBO assessmentResultBO);

}
