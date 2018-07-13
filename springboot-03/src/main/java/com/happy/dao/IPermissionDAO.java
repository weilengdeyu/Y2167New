package com.happy.dao;

import com.happy.entity.Permission;

import java.util.List;

/**
 * Created by Happy on 2018-07-09.
 */
public interface IPermissionDAO {
    //01.查询所有权限集合   看用户能不能访问某个资源
    public List<Permission> findAll();
    //02.根据用户编号查询权限集合
    public List<Permission> findByAdminUserId(int userId);
}
