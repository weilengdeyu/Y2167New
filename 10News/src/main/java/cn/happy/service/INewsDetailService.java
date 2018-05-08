package cn.happy.service;

import cn.happy.entity.NewsDetail;

import java.util.List;

/**
 * Created by Happy on 2018-05-06.
 */
public interface INewsDetailService {
    //1.查询所有新闻
    public List<NewsDetail> findAll();
    //2.根据主键删除新闻
    public int delNews(int id);
}
