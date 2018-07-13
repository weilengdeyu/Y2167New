package com.happy.service.impl;/**
 * Created by Happy on 2018-07-09.
 */

import com.happy.dao.IUserDAO;
import com.happy.dao.IPermissionDAO;
import com.happy.entity.Permission;
import com.happy.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
//UserDetailsService  用户详情服务
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-07-09
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class UserServiceImpl implements UserDetailsService{
    //在Service层需要植入DAO接口
    @Autowired
    private IUserDAO userDAO;

    @Autowired
    private IPermissionDAO permissionDAO;
    @Override
    public UserDetails loadUserByUsername(String username) {
        //1.调度的是我自己在DAO层定制的方法，只不过有一个巧合，就是我自己定制的方法和SP 中的方法名称一致。
        SysUser sysUser = userDAO.loadUserByUsername(username);
        //断定
        if (sysUser!=null){//有用户对象
            //根据用户对象中的用户编号，获取该用户所拥有的所有权限集合
            List<Permission> permissions = permissionDAO.findByAdminUserId(sysUser.getId());
            //如果想让你的权限在UI层可以使用，必须进行【包装】，保证类型是GrantedAuthority
            //1.先准备一个和框架对接的容器
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            //2.进行容器的替换
            for (Permission permission : permissions) {
                //每个permission对象都是一个权限对象
                if (permission != null && permission.getName()!=null) {//进行双重校验，保证权限的准确性

                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
                    //1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行权限验证时会使用GrantedAuthority 对象。
                    grantedAuthorities.add(grantedAuthority);
                }
            }
            System.out.println("load");
            return new User(sysUser.getUsername(), sysUser.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }

    }
}
