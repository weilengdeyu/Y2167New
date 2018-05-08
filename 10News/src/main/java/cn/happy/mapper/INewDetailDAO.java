package cn.happy.mapper;/**
 * Created by Happy on 2018-05-06.
 */

import cn.happy.entity.NewsDetail;

import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-05-06
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public interface INewDetailDAO {
    //1.查询所有新闻
    public List<NewsDetail> findAll();
   //2.根据主键删除新闻
    public int delNews(int id);
}
