package cn.happy.dao.impl;

import cn.happy.dao.BaseDao;
import cn.happy.dao.IUserInfoDAO;
import cn.happy.entity.UserInfo;
import cn.happy.utils.RefUtil;

import java.sql.Ref;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Happy on 2018-01-30.
 */
public class UserInfoDAOImpl extends BaseDao implements IUserInfoDAO {
    public UserInfo isLogin(UserInfo info) throws Exception {
        UserInfo userinfo=new UserInfo();
        String sql="select * from sys_userinfo where uname=? and upassword=?";
        Object[] paras={info.getUname(),info.getUpassword()};
        ResultSet rs = executeQuery(sql,paras);
        if(rs!=null){
            while (rs.next()){
                //证明有记录
                String uname = rs.getString("uname");
                if (uname!=null){
                    userinfo.setUname(uname);
                }
                Integer utype = rs.getInt("utype");
                if (utype!=null){
                    userinfo.setUtype(utype);
                }
            }
        }
        return userinfo;
    }

    public List<UserInfo> findAll() throws Exception {
        List<UserInfo> list=new ArrayList<UserInfo>();
        String sql="select * from sys_userinfo";
        ResultSet rs = executeQuery(sql);


        if(rs!=null){
            while (rs.next()){
                UserInfo info=new UserInfo();
               /*  info.setUid(rs.getInt("uid"));
                 info.setUname(rs.getString("uname"));
                 info.setUpassword(rs.getString("upassword"));
                 info.setUstatus(rs.getInt("ustatus"));
                 info.setUtype(rs.getInt("utype"));*/
                 RefUtil.veryhappy(info,rs);
                 list.add(info);
            }
            //释放资源
            closeAll();
        }

        return list;
    }
}
