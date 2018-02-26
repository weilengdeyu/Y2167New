package cn.happy.test;

import cn.happy.dao.IUserInfoDAO;
import cn.happy.dao.impl.UserInfoDAOImpl;
import cn.happy.entity.UserInfo;
import org.junit.Test;

/**
 * Created by Happy on 2018-01-30.
 */
public class Test20180130 {
    @Test
    public void testlogin() throws Exception {
        IUserInfoDAO dao=new UserInfoDAOImpl();
        UserInfo info=new UserInfo();
        info.setUname("2");
        info.setUpassword("2");
        UserInfo login = dao.isLogin(info);
        if (login!=null){
            System.out.println(login.getUname()+"================");
        }
    }
}
