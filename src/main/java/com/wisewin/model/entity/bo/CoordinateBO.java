package com.wisewin.model.entity.bo;


import com.wisewin.model.entity.bo.common.base.BaseModel;

public class CoordinateBO extends BaseModel {

    private double y;
    private double x;
    private double score;
    public void setY(double y) {
         this.y = y;
     }
     public double getY() {
         return y;
     }

    public void setX(double x) {
         this.x = x;
     }
     public double getX() {
         return x;
     }

    public void setScore(double score) {
         this.score = score;
     }
     public double getScore() {
         return score;
     }

}