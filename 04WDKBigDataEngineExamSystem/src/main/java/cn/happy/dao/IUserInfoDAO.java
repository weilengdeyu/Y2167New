package cn.happy.dao;

import cn.happy.entity.UserInfo;

import java.util.List;

/**
 * Created by Happy on 2018-01-30.
 */
public interface IUserInfoDAO {
    //01.写一个用于登录的方法
    public UserInfo isLogin(UserInfo info) throws Exception;

    //02.写一个返回所有用户集合的方法
    public List<UserInfo> findAll() throws  Exception;
}
