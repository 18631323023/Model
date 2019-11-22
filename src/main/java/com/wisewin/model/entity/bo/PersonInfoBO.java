/**
  * Copyright 2019 bejson.com 
  */
package com.wisewin.model.entity.bo;


import com.wisewin.model.entity.bo.common.base.BaseModel;

public class PersonInfoBO extends BaseModel {

    private BodyPartsBO body_parts;
    private LocationBO location;

    public BodyPartsBO getBody_parts() {
        return body_parts;
    }

    public void setBody_parts(BodyPartsBO body_parts) {
        this.body_parts = body_parts;
    }

    public LocationBO getLocation() {
        return location;
    }

    public void setLocation(LocationBO location) {
        this.location = location;
    }
}