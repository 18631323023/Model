package com.wisewin.model.entity.bo.jd;

import com.wisewin.model.entity.bo.common.base.BaseModel;

import java.util.List;

public class DetInfoBO extends BaseModel {
    private String person_num;
    private List<String> node_info;

    public String getPerson_num() {
        return person_num;
    }

    public void setPerson_num(String person_num) {
        this.person_num = person_num;
    }

    public List<String> getNode_info() {
        return node_info;
    }

    public void setNode_info(List<String> node_info) {
        this.node_info = node_info;
    }
}
