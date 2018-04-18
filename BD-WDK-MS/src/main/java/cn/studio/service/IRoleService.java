package cn.studio.service;

import cn.studio.entity.Role;
import cn.studio.entity.UserInfo;
import cn.studio.util.PageUtil;

import java.util.List;

/**
 * Created by Happy on 2018-04-09.
 */
public interface IRoleService {
    //01.查询所有角色的方法
    public List<Role> findAllRows() throws  Exception;
    //2.获取带条件的总记录数
    public int getTotalCountByRoleName(String userName);
    //3.模糊查询
    public PageUtil getOnePageData(int pageIndex, int pageSize, Role info);
    //2.获取总记录数
    public int getTotalCount();
    //3.获取单页数据
    public PageUtil getOnePageData(int pageIndex, int pageSize);
}
