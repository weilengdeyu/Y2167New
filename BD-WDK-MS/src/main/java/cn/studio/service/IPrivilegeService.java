package cn.studio.service;

import cn.studio.entity.Privilege;

import java.util.List;

/**
 * Created by Happy on 2018-04-07.
 */
public interface IPrivilegeService {
    public List<Privilege> getAllPrivileges(Integer uid) throws  Exception;
    //2.获取系统所有权限集合
    public List<Privilege> getAllPrivilege() throws  Exception;
    //3.根据角色编号获取到权限集合
    public  List<Privilege> getPrivilegeByRoleid(int roleid) throws Exception;

    public void updaterole_privilege(String strridquan, String[] checkedprivilegeid)throws Exception;
}
