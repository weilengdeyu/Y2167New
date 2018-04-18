package cn.studio.service.impl;/**
 * Created by Happy on 2018-04-04.
 */

import cn.studio.dao.IUserInfoDAO;
import cn.studio.entity.UserInfo;
import cn.studio.service.IUserInfoService;
import cn.studio.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-04
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource(name = "IUserInfoDAO")
    private IUserInfoDAO userInfoDAO;
    public UserInfo isLogin(UserInfo info) throws Exception {
        return userInfoDAO.isLogin(info);
    }
    //02.获取所有用户信息
    public List<UserInfo> listAll() throws Exception {
        return userInfoDAO.listAll();
    }
    //03.用户最后一次登录时间登记
    public Date getLastLoginDate(int uid) throws Exception {
        return userInfoDAO.getLastLoginDate(uid);
    }

    public int updateLastLoginDate(int uid) throws Exception {
        return userInfoDAO.updateLastLoginDate(uid);
    }
   //05.获取单页数据的方法
    public PageUtil<UserInfo> getOnePageData(int pageIndex,int pageSize) throws Exception {
        PageUtil<UserInfo> pageUtil=new PageUtil<UserInfo>();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("pageIndex",(pageIndex)*pageSize);
        map.put("pageSize",pageSize);
        //list集合
        List<UserInfo> list = userInfoDAO.getOnePageData(map);
        pageUtil.setList(list);
        //总记录数
        int count = userInfoDAO.getTotalCount(new UserInfo());
        pageUtil.setTotalRecords(count);
        //页大小
        pageUtil.setPageSize(pageSize);
        //总页数
        int pageCount=pageUtil.getTotalRecords()%pageUtil.getPageSize()==0?pageUtil.getTotalRecords()/pageUtil.getPageSize():pageUtil.getTotalRecords()/pageUtil.getPageSize()+1;
        pageUtil.setTotalPages(pageCount);
        //当前页码
        pageUtil.setPageIndex(pageIndex);
        return pageUtil;
    }

    public PageUtil<UserInfo> getOnePageData(int pageIndex, int pageSize, UserInfo info) throws Exception {
        PageUtil<UserInfo> pageUtil=new PageUtil<UserInfo>();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("pageIndex",(pageIndex)*pageSize); //当前页码
        map.put("pageSize",pageSize); //每页的数据量
        map.put("uname",info.getUname());
        //list集合
        List<UserInfo> list = userInfoDAO.getOnePageData(map);
        pageUtil.setList(list);
        //总记录数
        int count = userInfoDAO.getTotalCount(info);
        pageUtil.setTotalRecords(count);
        //页大小
        pageUtil.setPageSize(pageSize);
        //总页数
        int pageCount=pageUtil.getTotalRecords()%pageUtil.getPageSize()==0?pageUtil.getTotalRecords()/pageUtil.getPageSize():pageUtil.getTotalRecords()/pageUtil.getPageSize()+1;
        pageUtil.setTotalPages(pageCount);
        //当前页码
        pageUtil.setPageIndex(pageIndex);
        return pageUtil;
    }


    public IUserInfoDAO getUserInfoDAO() {
        return userInfoDAO;
    }

    public void setUserInfoDAO(IUserInfoDAO userInfoDAO) {
        this.userInfoDAO = userInfoDAO;
    }
}













