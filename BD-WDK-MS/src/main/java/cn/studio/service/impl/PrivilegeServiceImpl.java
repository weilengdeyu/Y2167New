package cn.studio.service.impl;/**
 * Created by Happy on 2018-04-07.
 */

import cn.studio.dao.IPrivilegeDAO;
import cn.studio.entity.Privilege;
import cn.studio.service.IPrivilegeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-07
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("privilegeService")
public class PrivilegeServiceImpl implements IPrivilegeService {
    @Resource(name = "IPrivilegeDAO")
    private IPrivilegeDAO privilegeDAO;
    public List<Privilege> getAllPrivileges(Integer uid) throws Exception {
        return privilegeDAO.getAllPrivileges(uid);
    }

    public List<Privilege> getAllPrivilege() throws Exception {
        return privilegeDAO.getAllPrivilege();
    }

    public List<Privilege> getPrivilegeByRoleid(int roleid) throws Exception {
        return privilegeDAO.getPrivilegeByRoleid(roleid);
    }
    //出发点是好的
    @Transactional()
    public void updaterole_privilege(String strridquan, String[] checkedprivilegeid) throws Exception {
        Integer roleId=Integer.parseInt(strridquan);
        privilegeDAO.deletePrivilegebyRoleid(roleId);
        for (String item:checkedprivilegeid) {
            privilegeDAO.insertPrivilegebyRoleidandChecked(roleId,Integer.parseInt(item));
        }
    }

    public IPrivilegeDAO getPrivilegeDAO() {
        return privilegeDAO;
    }

    public void setPrivilegeDAO(IPrivilegeDAO privilegeDAO) {
        this.privilegeDAO = privilegeDAO;
    }
}
