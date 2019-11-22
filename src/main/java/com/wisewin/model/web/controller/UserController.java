package com.wisewin.model.web.controller;

import com.wisewin.model.entity.bo.AssessmentResultBO;
import com.wisewin.model.entity.dto.ResultDTOBuilder;
import com.wisewin.model.service.UserService;
import com.wisewin.model.web.controller.base.BaseCotroller;
import com.wisewin.model.web.controller.base.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController extends BaseCotroller {

    @Resource
    private UserService userService;

    @RequestMapping("/getAssess")
    public void getAssess(String ut, HttpServletRequest request, HttpServletResponse response){

        AssessmentResultBO assessmentResultBO = userService.getAssess(ut);
        String result = JsonUtils.getJsonString4JavaPOJO(ResultDTOBuilder.success(assessmentResultBO));
        super.safeJsonPrint(response, result);
        return;
    }

}
