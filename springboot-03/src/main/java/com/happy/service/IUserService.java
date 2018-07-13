package com.happy.service;

import com.happy.entity.SysUser;

/**
 * Created by Happy on 2018-07-09.
 */
public interface IUserService {
    public SysUser loadUserByUsername(String username);
}
