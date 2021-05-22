package com.ruoyi.system.service.osu.impl;

import com.ruoyi.system.domain.osu.AppUser;
import com.ruoyi.system.mapper.osu.AppUserMapper;
import com.ruoyi.system.service.osu.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl  implements IAppUserService {

    @Autowired
    private AppUserMapper appUserMapper;

    @Override
    public int insertAppUser(AppUser appUser) {
        return appUserMapper.insertAppUser(appUser);
    }

    @Override
    public int updateAppUser(AppUser appUser) {
        return appUserMapper.updateAppUser(appUser);
    }

    @Override
    public AppUser  selectUserByOpenId(String openid) {
        return appUserMapper.selectUserByOpenId(openid);
    }

    @Override
    public AppUser selectUserId(String id) {
        return appUserMapper.selectUserId(id);
    }
}
