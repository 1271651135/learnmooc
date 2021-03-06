package com.lihuanyu.model;

import javax.persistence.*;
import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * Created by skyADMIN on 16/1/27.
 */
@Entity
@Table(name = "t_user")
public class CustomUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String no;
    @NotNull
    private String nickname;
    private String avatar;
    private String name;
    @NotNull
    private String password;
    private int role_type;
    @NotNull
    private int status;
    private String mail;
    private String major;
    private String academy;
    private Date createDate;

    private long collectCourse;//收藏的课程 在collected_course表中的id
    private long collectArticle;//收藏的文章 在collected_article表中的id
    private long learnTime;//学习时长
    private long exp;//经验值  (暂定为learnTime/2取整)

    public CustomUser() {
    }

    public CustomUser(long id) {
        this.id = id;
    }

    public CustomUser(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
        this.status = 3;
        this.mail = "123@qq.com";
    }

    public CustomUser(String no, String mail, String nickname, String avatar, String name, String password, int role_type, int status, String major, String academy) {
        this.no = no;
        this.mail = mail;
        this.nickname = nickname;
        this.avatar = avatar;
        this.name = name;
        this.password = password;
        this.role_type = role_type;
        this.status = status;
        this.major = major;
        this.academy = academy;
    }

    public CustomUser(String name, String mail, String password) {
        this.nickname = name;
        this.password = password;
        this.mail = mail;
        this.status = 3;
        this.avatar = "http://120.27.47.134/avatar/default_avatar.png";
        this.role_type = 0;
        createDate = new Date();
    }

    public void setLearnTime(long learnTime) {
        this.learnTime = learnTime;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }

    public long getLearnTime() {
        return learnTime;
    }

    public long getExp() {
        return exp;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCollectCourse(long collectCourse) {
        this.collectCourse = collectCourse;
    }

    public void setCollectArticle(long collectArticle) {
        this.collectArticle = collectArticle;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public long getCollectCourse() {
        return collectCourse;
    }

    public long getCollectArticle() {
        return collectArticle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole_type() {
        return role_type;
    }

    public void setRole_type(int role_type) {
        this.role_type = role_type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
