package cn.studio.service.impl;/**
 * Created by Happy on 2018-04-09.
 */

import cn.studio.dao.IRoleDAO;
import cn.studio.entity.Role;
import cn.studio.entity.UserInfo;
import cn.studio.service.IRoleService;
import cn.studio.util.PageUtil;
import org.springframework.stereotype.Service;

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
@Service("roleService")
public class RoleServiceImpl implements IRoleService {
    @Resource(name = "IRoleDAO")
    private IRoleDAO roleDAO;
    public List<Role> findAllRows() throws Exception {
        return roleDAO.findAllRows();
    }

    public int getTotalCountByRoleName(String userName) {
        return roleDAO.getTotalCountByRoleName(userName);
    }

    public PageUtil getOnePageData(int pageIndex, int pageSize, Role info) {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("pageIndex",pageIndex*pageSize);
        map.put("pageSize",pageSize);
        if (info!=null) {
            map.put("roleName", info.getRoleName());
        }
        PageUtil page=new PageUtil(); //实例化一个PageUtil对象
        page.setPageSize(pageSize); //给PageUtil属性赋值
        page.setPageIndex(pageIndex);//给PageUtil的pageIndex赋值
        if (info!=null){
            page.setTotalRecords(roleDAO.getTotalCountByRoleName(info.getRoleName()));
        }else{
            page.setTotalRecords(roleDAO.getTotalCount());
        }
        int totalPages=page.getTotalRecords()%page.getPageSize()==0?page.getTotalRecords()/page.getPageSize():page.getTotalRecords()/page.getPageSize()+1;
        page.setTotalPages(totalPages);
        //为什么dao层方法的入参我写成map？？？
        List<Role> list = roleDAO.getOnePageData(map);
        page.setList(list);
        return page;
    }

    public int getTotalCount() {
        return roleDAO.getTotalCount();
    }

    public PageUtil getOnePageData(int pageIndex, int pageSize) {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("pageIndex",pageIndex*pageSize);
        map.put("pageSize",pageSize);
        PageUtil page=new PageUtil(); //实例化一个PageUtil对象
        page.setPageSize(pageSize); //给PageUtil属性赋值
        page.setPageIndex(pageIndex);//给PageUtil的pageIndex赋值

        page.setTotalRecords(roleDAO.getTotalCount());
        int totalPages=page.getTotalRecords()%page.getPageSize()==0?page.getTotalRecords()/page.getPageSize():page.getTotalRecords()/page.getPageSize()+1;
        page.setTotalPages(totalPages);
        //为什么dao层方法的入参我写成map？？？
        List<Role> list = roleDAO.getOnePageData(map);
        page.setList(list);
        return page;
    }

    public IRoleDAO getRoleDAO() {
        return roleDAO;
    }

    public void setRoleDAO(IRoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }
}
