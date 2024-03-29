package com.bean;

import java.util.Date;

public class User {
    private int id;
    private String userCode;
    private String userName;
    private String userPassword;
    private int gender;
    private Date birthday;
    private String phone;
    private String address;
    private int userRole;
    private int createBy;
    private Date creationDate;
    private int modifyBy;
    private Date modifyDate;
    private String idPicpath;
    private String workPicPath;

    public User() {
    }

    public User(String userCode, String userName, String userPassword, int gender, Date birthday, String phone, String address, int userRole, int createBy, Date creationDate,int modifyBy) {
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.userRole = userRole;
        this.createBy = createBy;
        this.creationDate=creationDate;
        this.modifyBy = modifyBy;
    }

    public User(int id, String userName, int gender, Date birthday, String phone, String address, int userRole, int modifyBy, Date modifyDate) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.userRole = userRole;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
    }

    public User(int id, String userCode, String userName, String userPassword, int gender, Date birthday, String phone, String address, int userRole, int createBy, Date creationDate, int modifyBy, Date modifyDate, String idPicpath, String workPicPath) {
        this.id = id;
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.userRole = userRole;
        this.createBy = createBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.idPicpath = idPicpath;
        this.workPicPath = workPicPath;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getIdPicpath() {
        return idPicpath;
    }

    public void setIdPicpath(String idPicpath) {
        this.idPicpath = idPicpath;
    }

    public String getWorkPicPath() {
        return workPicPath;
    }

    public void setWorkPicPath(String workPicPath) {
        this.workPicPath = workPicPath;
    }
}
