package cn.studio.dao;

import cn.studio.entity.Privilege;

import java.util.List;

/**
 * Created by Happy on 2018-04-07.
 */
//权限接口
public interface IPrivilegeDAO {
   //1.根据用户编号，获取该用户所有的权限集合
   public List<Privilege> getAllPrivileges(Integer uid) throws  Exception;
   //2.获取系统所有权限集合
   public List<Privilege> getAllPrivilege() throws  Exception;

   //3.根据角色编号获取到权限集合
   public  List<Privilege> getPrivilegeByRoleid(int roleid) throws Exception;

   public void deletePrivilegebyRoleid(Integer roleId) throws Exception;

   public void insertPrivilegebyRoleidandChecked(Integer roleId, Integer i) throws Exception;
}

