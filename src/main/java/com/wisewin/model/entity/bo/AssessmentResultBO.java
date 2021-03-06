package com.wisewin.model.entity.bo;

import com.wisewin.model.entity.bo.common.base.BaseModel;

public class AssessmentResultBO extends BaseModel {
    private Integer id; //
    private String ut; //用户标识
    private String old; //原图本地地址
    private String analysis; //解析图本地地址
    private String bodyImage; //全身图本地地址
    private String headImage; //头部本地地址
    private String chestImage; //胸部本地地址
    private String legImage; //腿部本地地址
    private String pelvisImage; //盆骨本地地址
    private String spineImage; //脊柱本地地址
    private String oldOss; //
    private String outOss; //
    private String bodyImageOss; //
    private String headImageOss; //
    private String chestImageOss; //
    private String legImageOss; //
    private String pelvisImageOss; //
    private String spineImageOss; //
    private String rShoulderImageOss; // 右肩图片
    private String lShoulderImageOss; //左肩图片
    private String lPelvisImageOss; //左盆骨
    private String rPelvisImageOss;//右盆骨
    private String headHeelL; //头部侧倾-左
    private String headHeelR; //头部侧倾-右
    private String highLowShoulderL; //高低肩-左
    private String highLowShoulderR; //高低肩-右
    private String pelvicTiltL; //盆骨侧倾-左
    private String pelvicTiltR; //盆骨侧倾-右
    private String scoliosisL; //脊柱侧弯-左
    private String scoliosisR; //脊柱侧弯-右
    private String oLeftlegR; //O型腿-左腿
    private String oRightlegR; //O型腿-右腿
    private String xLeftlegR; //X型腿-左腿
    private String xRightlegR; //X型腿-右腿
    private String headHeelLStatus; //头部侧倾-左 高或者中低
    private String headHeelRStatus; //头部侧倾-右
    private String highLowShoulderLStatus; //高低肩-左
    private String highLowShoulderRStatus; //高低肩-右
    private String pelvicTiltLStatus; //盆骨侧倾-左
    private String pelvicTiltRStatus; //盆骨侧倾-右
    private String scoliosisLStatus; //脊柱侧弯-左
    private String scoliosisRStatus; //脊柱侧弯-右
    private String oLeftlegRStatus; //O型腿-左腿
    private String oRightlegRStatus; //O型腿-右腿
    private String xLeftlegRStatus; //X型腿-左腿
    private String xRightlegRStatus; //X型腿-右腿

    public String getrShoulderImageOss() {
        return rShoulderImageOss;
    }

    public void setrShoulderImageOss(String rShoulderImageOss) {
        this.rShoulderImageOss = rShoulderImageOss;
    }

    public String getlShoulderImageOss() {
        return lShoulderImageOss;
    }

    public void setlShoulderImageOss(String lShoulderImageOss) {
        this.lShoulderImageOss = lShoulderImageOss;
    }

    public String getlPelvisImageOss() {
        return lPelvisImageOss;
    }

    public void setlPelvisImageOss(String lPelvisImageOss) {
        this.lPelvisImageOss = lPelvisImageOss;
    }

    public String getrPelvisImageOss() {
        return rPelvisImageOss;
    }

    public void setrPelvisImageOss(String rPelvisImageOss) {
        this.rPelvisImageOss = rPelvisImageOss;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUt() {
        return ut;
    }

    public void setUt(String ut) {
        this.ut = ut;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getBodyImage() {
        return bodyImage;
    }

    public void setBodyImage(String bodyImage) {
        this.bodyImage = bodyImage;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getChestImage() {
        return chestImage;
    }

    public void setChestImage(String chestImage) {
        this.chestImage = chestImage;
    }

    public String getLegImage() {
        return legImage;
    }

    public void setLegImage(String legImage) {
        this.legImage = legImage;
    }

    public String getPelvisImage() {
        return pelvisImage;
    }

    public void setPelvisImage(String pelvisImage) {
        this.pelvisImage = pelvisImage;
    }

    public String getSpineImage() {
        return spineImage;
    }

    public void setSpineImage(String spineImage) {
        this.spineImage = spineImage;
    }

    public String getOldOss() {
        return oldOss;
    }

    public void setOldOss(String oldOss) {
        this.oldOss = oldOss;
    }

    public String getOutOss() {
        return outOss;
    }

    public void setOutOss(String outOss) {
        this.outOss = outOss;
    }

    public String getBodyImageOss() {
        return bodyImageOss;
    }

    public void setBodyImageOss(String bodyImageOss) {
        this.bodyImageOss = bodyImageOss;
    }

    public String getHeadImageOss() {
        return headImageOss;
    }

    public void setHeadImageOss(String headImageOss) {
        this.headImageOss = headImageOss;
    }

    public String getChestImageOss() {
        return chestImageOss;
    }

    public void setChestImageOss(String chestImageOss) {
        this.chestImageOss = chestImageOss;
    }

    public String getLegImageOss() {
        return legImageOss;
    }

    public void setLegImageOss(String legImageOss) {
        this.legImageOss = legImageOss;
    }

    public String getPelvisImageOss() {
        return pelvisImageOss;
    }

    public void setPelvisImageOss(String pelvisImageOss) {
        this.pelvisImageOss = pelvisImageOss;
    }

    public String getSpineImageOss() {
        return spineImageOss;
    }

    public void setSpineImageOss(String spineImageOss) {
        this.spineImageOss = spineImageOss;
    }

    public String getHeadHeelL() {
        return headHeelL;
    }

    public void setHeadHeelL(String headHeelL) {
        this.headHeelL = headHeelL;
    }

    public String getHeadHeelR() {
        return headHeelR;
    }

    public void setHeadHeelR(String headHeelR) {
        this.headHeelR = headHeelR;
    }

    public String getHighLowShoulderL() {
        return highLowShoulderL;
    }

    public void setHighLowShoulderL(String highLowShoulderL) {
        this.highLowShoulderL = highLowShoulderL;
    }

    public String getHighLowShoulderR() {
        return highLowShoulderR;
    }

    public void setHighLowShoulderR(String highLowShoulderR) {
        this.highLowShoulderR = highLowShoulderR;
    }

    public String getPelvicTiltL() {
        return pelvicTiltL;
    }

    public void setPelvicTiltL(String pelvicTiltL) {
        this.pelvicTiltL = pelvicTiltL;
    }

    public String getPelvicTiltR() {
        return pelvicTiltR;
    }

    public void setPelvicTiltR(String pelvicTiltR) {
        this.pelvicTiltR = pelvicTiltR;
    }

    public String getScoliosisL() {
        return scoliosisL;
    }

    public void setScoliosisL(String scoliosisL) {
        this.scoliosisL = scoliosisL;
    }

    public String getScoliosisR() {
        return scoliosisR;
    }

    public void setScoliosisR(String scoliosisR) {
        this.scoliosisR = scoliosisR;
    }

    public String getoLeftlegR() {
        return oLeftlegR;
    }

    public void setoLeftlegR(String oLeftlegR) {
        this.oLeftlegR = oLeftlegR;
    }

    public String getoRightlegR() {
        return oRightlegR;
    }

    public void setoRightlegR(String oRightlegR) {
        this.oRightlegR = oRightlegR;
    }

    public String getxLeftlegR() {
        return xLeftlegR;
    }

    public void setxLeftlegR(String xLeftlegR) {
        this.xLeftlegR = xLeftlegR;
    }

    public String getxRightlegR() {
        return xRightlegR;
    }

    public void setxRightlegR(String xRightlegR) {
        this.xRightlegR = xRightlegR;
    }

    public String getHeadHeelLStatus() {
        return headHeelLStatus;
    }

    public void setHeadHeelLStatus(String headHeelLStatus) {
        this.headHeelLStatus = headHeelLStatus;
    }

    public String getHeadHeelRStatus() {
        return headHeelRStatus;
    }

    public void setHeadHeelRStatus(String headHeelRStatus) {
        this.headHeelRStatus = headHeelRStatus;
    }

    public String getHighLowShoulderLStatus() {
        return highLowShoulderLStatus;
    }

    public void setHighLowShoulderLStatus(String highLowShoulderLStatus) {
        this.highLowShoulderLStatus = highLowShoulderLStatus;
    }

    public String getHighLowShoulderRStatus() {
        return highLowShoulderRStatus;
    }

    public void setHighLowShoulderRStatus(String highLowShoulderRStatus) {
        this.highLowShoulderRStatus = highLowShoulderRStatus;
    }

    public String getPelvicTiltLStatus() {
        return pelvicTiltLStatus;
    }

    public void setPelvicTiltLStatus(String pelvicTiltLStatus) {
        this.pelvicTiltLStatus = pelvicTiltLStatus;
    }

    public String getPelvicTiltRStatus() {
        return pelvicTiltRStatus;
    }

    public void setPelvicTiltRStatus(String pelvicTiltRStatus) {
        this.pelvicTiltRStatus = pelvicTiltRStatus;
    }

    public String getScoliosisLStatus() {
        return scoliosisLStatus;
    }

    public void setScoliosisLStatus(String scoliosisLStatus) {
        this.scoliosisLStatus = scoliosisLStatus;
    }

    public String getScoliosisRStatus() {
        return scoliosisRStatus;
    }

    public void setScoliosisRStatus(String scoliosisRStatus) {
        this.scoliosisRStatus = scoliosisRStatus;
    }

    public String getoLeftlegRStatus() {
        return oLeftlegRStatus;
    }

    public void setoLeftlegRStatus(String oLeftlegRStatus) {
        this.oLeftlegRStatus = oLeftlegRStatus;
    }

    public String getoRightlegRStatus() {
        return oRightlegRStatus;
    }

    public void setoRightlegRStatus(String oRightlegRStatus) {
        this.oRightlegRStatus = oRightlegRStatus;
    }

    public String getxLeftlegRStatus() {
        return xLeftlegRStatus;
    }

    public void setxLeftlegRStatus(String xLeftlegRStatus) {
        this.xLeftlegRStatus = xLeftlegRStatus;
    }

    public String getxRightlegRStatus() {
        return xRightlegRStatus;
    }

    public void setxRightlegRStatus(String xRightlegRStatus) {
        this.xRightlegRStatus = xRightlegRStatus;
    }
}
