package com.taotao.pojo.commonmodule;

public class SysRole {
    private String roleId;

    private String roleName;

    private String defaultHomeUrl;

    private String remark;

    private Integer sortOrder;

    private String powerstr;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getDefaultHomeUrl() {
        return defaultHomeUrl;
    }

    public void setDefaultHomeUrl(String defaultHomeUrl) {
        this.defaultHomeUrl = defaultHomeUrl == null ? null : defaultHomeUrl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getPowerstr() {
        return powerstr;
    }

    public void setPowerstr(String powerstr) {
        this.powerstr = powerstr == null ? null : powerstr.trim();
    }
}