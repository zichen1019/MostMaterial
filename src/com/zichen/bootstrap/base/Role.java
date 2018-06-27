package com.zichen.bootstrap.base;

public class Role extends Base {
    private String annalid;

    private String roleName;

    private String rolePath;

    private String roleImg;

    private String parentid;

    private String roleType;

    private String roleCode;

    public String getAnnalid() {
        return annalid;
    }

    public void setAnnalid(String annalid) {
        this.annalid = annalid == null ? null : annalid.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRolePath() {
        return rolePath;
    }

    public void setRolePath(String rolePath) {
        this.rolePath = rolePath == null ? null : rolePath.trim();
    }

    public String getRoleImg() {
        return roleImg;
    }

    public void setRoleImg(String roleImg) {
        this.roleImg = roleImg == null ? null : roleImg.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }
}