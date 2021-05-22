package com.ruoyi.system.mapper.osu;

import com.ruoyi.system.domain.osu.AppUser;


public interface AppUserMapper {

    public AppUser selectUserByOpenId(String openid);

    public AppUser selectUserId(String id) ;

    public int insertAppUser(AppUser appUser);

    public int updateAppUser(AppUser appUser);
}
