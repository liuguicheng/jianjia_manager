package com.taotao.pojo.commonmodule;

import java.util.Date;

public class SysStaffSecurity {
    private String ssid;

    private Date changeTime;

    private Integer failedTimes;

    private Integer times;

    private Date failedRecordTime;

    private String staffId;

    private String isLock;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid == null ? null : ssid.trim();
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public Integer getFailedTimes() {
        return failedTimes;
    }

    public void setFailedTimes(Integer failedTimes) {
        this.failedTimes = failedTimes;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Date getFailedRecordTime() {
        return failedRecordTime;
    }

    public void setFailedRecordTime(Date failedRecordTime) {
        this.failedRecordTime = failedRecordTime;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getIsLock() {
        return isLock;
    }

    public void setIsLock(String isLock) {
        this.isLock = isLock == null ? null : isLock.trim();
    }
}