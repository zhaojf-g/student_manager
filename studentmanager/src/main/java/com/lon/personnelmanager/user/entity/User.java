package com.lon.personnelmanager.user.entity;

import java.io.Serializable;

/**
 * M_USER
 * @author 
 */
public class User implements Serializable {
    private Integer id;

    private String userId;

    private String userType;

    private String name;

    private String pas;

    private String dzbh;

    private String zy;

    private String bz;

    private String zt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public String getDzbh() {
        return dzbh;
    }

    public void setDzbh(String dzbh) {
        this.dzbh = dzbh;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }
}