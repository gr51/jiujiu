package com.jiujiu.app.user.entity;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2020-05-09 11:54:02
 */
public class Users implements Serializable {
    private static final long serialVersionUID = -59073221207576362L;
    
    private String id;
    
    private String username;
    
    private String password;
    /**
    * 头像
    */
    private String faceImage;
    /**
    * 大头像
    */
    private String faceImageBig;
    /**
    * 昵称
    */
    private String nickname;
    /**
    * 二维码
    */
    private String qrcode;
    /**
    * 手机识别码，通过h5获取
    */
    private String cid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public String getFaceImageBig() {
        return faceImageBig;
    }

    public void setFaceImageBig(String faceImageBig) {
        this.faceImageBig = faceImageBig;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

}