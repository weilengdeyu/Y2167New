package cn.happy.mapper;

import cn.happy.entity.NewsComment;

/**
 * Created by Happy on 2018-05-06.
 */
public interface INewsCommentDAO {
    //01.写一个添加评论的方法
    public  int addComment(NewsComment comment);
    //02.写一个根据新闻编号删除评论的方法
    public  int delCommentByNewsId(int id);
}
