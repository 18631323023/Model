package com.wisewin.model.common.constants;

public enum  CaseConstants {

    /*上线 可查看*/ YES("yes"),
    /*下线 不可查看*/ NO("no");

    private CaseConstants(String value) {
        this.value = value;
    }

    private CaseConstants(Integer num) {
        this.num = num;
    }

    private String value;
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }




}
