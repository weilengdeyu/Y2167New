package cn.studio.dao;/**
 * Created by Happy on 2018-04-09.
 */

import cn.studio.entity.Role;

import java.util.List;
import java.util.Map;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-09
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public interface IRoleDAO {
    //01.查询所有角色的方法
    public List<Role> findAllRows() throws  Exception;
   //02.获取单页数据带条件
    public List<Role> getOnePageData(Map<String, Object> map);
    //3.获取带条件的总记录数
    public int getTotalCountByRoleName(String rolename);
    //4.获取总记录数
    public int getTotalCount();
}
