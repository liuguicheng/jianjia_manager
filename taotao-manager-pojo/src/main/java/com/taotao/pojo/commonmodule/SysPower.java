package com.taotao.pojo.commonmodule;

public class SysPower {
    private String powerId;

    private String url;

    private String powerName;

    private String imgurl;

    private String moduleName;

    private String powerCode;

    private String powerTypeFlag;

    private Integer passwordlevel;

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId == null ? null : powerId.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getPowerCode() {
        return powerCode;
    }

    public void setPowerCode(String powerCode) {
        this.powerCode = powerCode == null ? null : powerCode.trim();
    }

    public String getPowerTypeFlag() {
        return powerTypeFlag;
    }

    public void setPowerTypeFlag(String powerTypeFlag) {
        this.powerTypeFlag = powerTypeFlag == null ? null : powerTypeFlag.trim();
    }

    public Integer getPasswordlevel() {
        return passwordlevel;
    }

    public void setPasswordlevel(Integer passwordlevel) {
        this.passwordlevel = passwordlevel;
    }
}