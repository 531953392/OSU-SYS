package com.ruoyi.web.controller.osuApi.login.vo;


import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by codedrinker on 2018/11/24.
 */

public class SessionVo {
    private String openid;

    @JSONField(name = "session_key")
    private String sessionKey;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
}
