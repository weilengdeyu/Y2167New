package cn.happy.service.impl;

import cn.happy.dao.IUserInfoDAO;
import cn.happy.dao.impl.UserInfoDAOImpl;
import cn.happy.entity.UserInfo;
import cn.happy.service.IUserInfoService;

import java.util.List;

/**
 * Created by Happy on 2018-01-30.
 */
public class UserInfoServiceImpl implements IUserInfoService {
    //植入DAO接口对象
    IUserInfoDAO dao=new UserInfoDAOImpl();
    public UserInfo isLogin(UserInfo info) throws Exception {
        return dao.isLogin(info);
    }

    public List<UserInfo> findAll() throws Exception {
        return dao.findAll();
    }
}
