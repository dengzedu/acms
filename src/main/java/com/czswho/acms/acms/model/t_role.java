package com.czswho.acms.acms.model;

import java.util.Date;

public class t_role {
    private int roleId;
    private String roleName;
    private int rolePermission;
    private Date loginTime;

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRolePermission() {
        return rolePermission;
    }

    public void setRolePermission(int rolePermission) {
        this.rolePermission = rolePermission;
    }
}
