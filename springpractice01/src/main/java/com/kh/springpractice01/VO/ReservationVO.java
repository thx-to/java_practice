package com.kh.springpractice01.VO;

import java.util.Date;

public class ReservationVO {

    private Integer rNo;
    private String userId;
    private String userName;
    private String storeName;
    private String storePhone;
    private Integer rPersonCnt;
    private String rTime;
    private Date rSubmitTime;

    // 기본 생성자
    public ReservationVO() {
    }

    // Getter / Setter
    public Integer getrNo() {
        return rNo;
    }

    public void setrNo(Integer rNo) {
        this.rNo = rNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public Integer getRPersonCnt() {
        return rPersonCnt;
    }

    public void setRPersonCnt(Integer rPersonCnt) {
        this.rPersonCnt = rPersonCnt;
    }

    public String getRTime() {
        return rTime;
    }

    public void setRTime(String rTime) {
        this.rTime = rTime;
    }

    public Date getRSubmitTiime() {
        return rSubmitTime;
    }

    public void setRSubmitTiime(Date rSubmitTiime) {
        this.rSubmitTime = rSubmitTiime;
    }

}
