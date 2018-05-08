package cn.happy.controller;/**
 * Created by Happy on 2018-05-06.
 */

import ch.qos.logback.classic.Logger;
import cn.happy.entity.NewsComment;
import cn.happy.entity.NewsDetail;
import cn.happy.service.INewsCommentService;
import cn.happy.service.INewsDetailService;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-05-06
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class NewDetailController {
    @Autowired
    @Qualifier("newsDetailsService")
    private INewsDetailService detailService;

    @Autowired
    @Qualifier("commentService")
    private INewsCommentService commentService;
    @RequestMapping("/goHome")
    public String getHome(){
        return "main";
    }

    //01.查询所有
    @RequestMapping("/findAll")
    @ResponseBody
    public Object findAll(){
        List<NewsDetail> list = detailService.findAll();
        return list;
    }
    //02.发表评论
    @RequestMapping("/reply")
    public String rePlayComment(int nid,Model model){
        model.addAttribute("nid",nid);
        return "addComment";
    }

    //03.真正发表评论
    @RequestMapping("/addComment")
    @ResponseBody
    public  String  addComment(@RequestParam(value = "id") int id, NewsComment comment){
        comment.setCreateDate(new Date());
        comment.setNewid(id);
        commentService.addComment(comment);

        return "新增成功";
    }

    //04.删除新闻以及联动删除评论
    @RequestMapping("/delNews")
    @ResponseBody
    public Object delNews(int id){
        int count = detailService.delNews(id);
        if (count>0){
            return true;
        }else{
            return false;
        }
    }


    public INewsDetailService getDetailService() {
        return detailService;
    }

    public void setDetailService(INewsDetailService detailService) {
        this.detailService = detailService;
    }


}
