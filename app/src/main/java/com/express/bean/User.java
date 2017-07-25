package com.express.bean;

import cn.bmob.v3.BmobUser;

/**
 * Created by hyc on 2017/7/25 15:59
 */


public class User extends BmobUser {

    private String number;
    private String highSchool;
    private String name;
    private String nickname;
    private String depName;
    private String className;
    private String address;
    private String headPic;
    private String gender;
    private String userId;
    private String headPicThumb;

    public User(UserBean.DataBean dataBean){
        number = dataBean.getStudentKH();
        highSchool = dataBean.getSchool();
        name = dataBean.getTrueName();
        nickname = dataBean.getUsername();
        depName = dataBean.getDep_name();
        className = dataBean.getClass_name();
        address = dataBean.getAddress();
        headPic = dataBean.getHead_pic();
        gender  = dataBean.getSex();
        userId = dataBean.getUser_id();
        headPicThumb = dataBean.getHead_pic_thumb();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHeadPicThumb() {
        return headPicThumb;
    }

    public void setHeadPicThumb(String headPicThumb) {
        this.headPicThumb = headPicThumb;
    }
}