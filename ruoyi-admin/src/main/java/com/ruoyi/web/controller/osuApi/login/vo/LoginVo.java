package com.ruoyi.web.controller.osuApi.login.vo;


import lombok.Data;

/**
 * Created by codedrinker on 2018/11/24.
 */

@Data
public class LoginVo {
//    // 用户信息原始数据
//    private String rawData;
//
//    // 用于验证用户信息是否被篡改过
//    private String signature;

    // 用户获取 session_key 的 code
    private String code;

    private String encryptedData;

    private String iv;

    private UserInfoVo userInfo;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

    public UserInfoVo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoVo userInfo) {
        this.userInfo = userInfo;
    }
}
