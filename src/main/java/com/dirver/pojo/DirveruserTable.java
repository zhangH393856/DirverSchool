package com.dirver.pojo;

public class DirveruserTable {
    private Integer id;

    private String userLoginname;

    private String userName;

    private String userLoginpwd;

    private String userId;

    private String userPhone;

    private String userCartype;

    private Double userCost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserLoginname() {
        return userLoginname;
    }

    public void setUserLoginname(String userLoginname) {
        this.userLoginname = userLoginname == null ? null : userLoginname.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserLoginpwd() {
        return userLoginpwd;
    }

    public void setUserLoginpwd(String userLoginpwd) {
        this.userLoginpwd = userLoginpwd == null ? null : userLoginpwd.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserCartype() {
        return userCartype;
    }

    public void setUserCartype(String userCartype) {
        this.userCartype = userCartype == null ? null : userCartype.trim();
    }

    public Double getUserCost() {
        return userCost;
    }

    public void setUserCost(Double userCost) {
        this.userCost = userCost;
    }
}