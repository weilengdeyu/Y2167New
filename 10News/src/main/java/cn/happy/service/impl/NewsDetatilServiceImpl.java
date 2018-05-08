package cn.happy.service.impl;/**
 * Created by Happy on 2018-05-06.
 */

import cn.happy.entity.NewsDetail;
import cn.happy.mapper.INewDetailDAO;
import cn.happy.mapper.INewsCommentDAO;
import cn.happy.service.INewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-05-06
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("newsDetailsService")
public class NewsDetatilServiceImpl implements INewsDetailService{
    @Autowired
    private INewDetailDAO newDetailDAO;
    @Autowired
    private INewsCommentDAO commentDAO;
    @Override
    public List<NewsDetail> findAll() {
        return newDetailDAO.findAll();
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public int delNews(int id) {
        int num=1;
       try{
           //这里先删除外键表
           commentDAO.delCommentByNewsId(id);
           //2.再删除主键表
           newDetailDAO.delNews(id);

       }catch (Exception ex){
           num=0;
       }
       return num;
    }


    public INewDetailDAO getNewDetailDAO() {
        return newDetailDAO;
    }

    public void setNewDetailDAO(INewDetailDAO newDetailDAO) {
        this.newDetailDAO = newDetailDAO;
    }
}
