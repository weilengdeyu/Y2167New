package cn.happy.service.impl;/**
 * Created by Happy on 2018-05-06.
 */

import cn.happy.entity.NewsComment;
import cn.happy.mapper.INewsCommentDAO;
import cn.happy.service.INewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 作者：微冷的雨
 *
 * @create 2018-05-06
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("commentService")
public class NewsCommentServiceImpl implements INewsCommentService {
    @Autowired
    private INewsCommentDAO commentDAO;
    @Override
    @Transactional
    public int addComment(NewsComment comment) {
        return commentDAO.addComment(comment);
    }

    public INewsCommentDAO getCommentDAO() {
        return commentDAO;
    }

    public void setCommentDAO(INewsCommentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }
}
