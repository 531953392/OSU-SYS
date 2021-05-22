package com.ruoyi.system.service.osu;

import com.ruoyi.system.domain.osu.AppUser;

public interface IAppUserService {

    public int insertAppUser(AppUser appUser);

    public int updateAppUser(AppUser appUser);

    public AppUser selectUserByOpenId(String openid);

    public AppUser selectUserId(String id) ;

}
