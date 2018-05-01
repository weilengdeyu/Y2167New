package cn.studio.service;

import cn.studio.entity.UserInfo;
import cn.studio.entity.viewmodel.UserInfoModel;
import cn.studio.util.PageUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Happy on 2018-04-04.
 */
public interface IUserInfoService {
    //01.书写一个isLogin方法
    public UserInfo isLogin(UserInfo info) throws  Exception;

    //02.显示所有用户信息的方法
    public List<UserInfo> listAll()  throws  Exception;

    //03.用户最后一次登录时间登记
    public Date getLastLoginDate(int uid) throws Exception;

    //04.更新最后一次登录时间
    public int updateLastLoginDate(int uid) throws  Exception;

    //05.写一个获取单页数据的方法
    public PageUtil<UserInfo> getOnePageData(int pageIndex,int pageSize) throws  Exception;
    //05.1 写一个获取单页数据的方法  带条件查询
    public PageUtil<UserInfo> getOnePageData(int pageIndex,int pageSize,UserInfo info) throws  Exception;

    //07.写一个添加学生的方法
    public int addUserInfo(UserInfoModel info);

    //08.根据年级编号查询学员姓名集合
    public List<String> findStudentsByGradeId(Integer gid);
}
