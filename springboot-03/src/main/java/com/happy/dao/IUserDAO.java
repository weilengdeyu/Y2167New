package com.happy.dao;/**
 * Created by Happy on 2018-07-09.
 */

import com.happy.entity.SysUser;

/**
 * 作者：微冷的雨
 *
 * @create 2018-07-09
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public interface IUserDAO {
    //01.根据用户名称检索用户对象  Spring  Security
    public SysUser loadUserByUsername(String username);
}
