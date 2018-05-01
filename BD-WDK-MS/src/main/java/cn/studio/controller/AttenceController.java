package cn.studio.controller;/**
 * Created by Happy on 2018-04-21.
 */

import cn.studio.service.IGradeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-21
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class AttenceController {

    //注入年级service
    @Resource(name = "gradeService")
    private IGradeService gradeService;
    //01.转发到考勤页面
    @RequestMapping("/attenceInsert")
    public String attenceInsert(){
        return "/background/attenceInsert";
    }
    //02.根据登录的用户编号获取绑定的年级集合
    @RequestMapping("/selectGradesByUid")
    @ResponseBody
    public Object selectGradesByUid(Integer uid) throws Exception {
        return gradeService.selectGradesByUid(uid);
    }


    public IGradeService getGradeService() {
        return gradeService;
    }

    public void setGradeService(IGradeService gradeService) {
        this.gradeService = gradeService;
    }
}
