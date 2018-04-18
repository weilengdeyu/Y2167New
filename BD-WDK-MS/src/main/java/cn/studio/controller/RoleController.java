package cn.studio.controller;/**
 * Created by Happy on 2018-04-09.
 */

import cn.studio.annotation.BusinessAnnotation;
import cn.studio.entity.Privilege;
import cn.studio.entity.Role;
import cn.studio.entity.UserInfo;
import cn.studio.service.IPrivilegeService;
import cn.studio.service.IRoleService;
import cn.studio.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.ModalityListener;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-09
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class RoleController {
    //注入RoleService
    @Resource(name = "roleService")
    private IRoleService roleService;

    @Resource(name = "privilegeService")
    private IPrivilegeService privilegeService;

   /* @RequestMapping("/roleList")
    public String findAllRoles(Model model) throws Exception {
        List<Role> list = roleService.findAllRows();
        System.out.println(list.size()+"============");
        model.addAttribute("roleList",list);
        return "roleList";
    }*/

    @RequestMapping("/roleList")
    public String findAllRoles() throws Exception {
        return "roleList";
    }

    //根据角色编号获取所有权限集合方法
    @RequestMapping("/getPrivilegeByRoleid")
    @ResponseBody
    public Object getPrivilegeByRoleid(int rid) throws Exception {
        List<Privilege> list = privilegeService.getPrivilegeByRoleid(rid);
        return list;
    }
    @RequestMapping("/updaterole_privilege")
    @ResponseBody
    @BusinessAnnotation(moduleName="角色管理",option="保存权限")
    public Object updaterole_privilege(String strridquan,String[] checkedprivilegeid){
        try {
            privilegeService.updaterole_privilege(strridquan,checkedprivilegeid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    //03.获取单页数据
    @ResponseBody
    //获取单页用户数据
    @RequestMapping("/selectRole")
    @BusinessAnnotation(moduleName="角色管理",option="角色列表")
    public Object selectRole(@RequestParam(defaultValue = "1") int pageIndex, @RequestParam(defaultValue = "2") int pageSize, Role info){
        PageUtil pp=null;
        if (info==null||info.getRoleName()==null||info.getRoleName().equals("")){
            pp=roleService.getOnePageData(pageIndex,pageSize);
        }else{
            pp= roleService.getOnePageData(pageIndex,pageSize,info);
        }
        return pp;
    }


    public IRoleService getRoleService() {
        return roleService;
    }

    public void setRoleService(IRoleService roleService) {
        this.roleService = roleService;
    }
}
