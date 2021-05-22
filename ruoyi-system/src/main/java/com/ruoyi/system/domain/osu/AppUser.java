package com.ruoyi.system.domain.osu;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AppUser implements Serializable {

    private String user_name;

    private String id;

    private String openid;

    private String nick_name;

    private String avatar_url;

    private Integer gender;

    private String country;

    private String province;

    private String city;

    private String mobile;

    private Date create_time;

    private String session_key;

    private Date lastvisit_time;

    private Integer user_type;

    private Integer status;



}
