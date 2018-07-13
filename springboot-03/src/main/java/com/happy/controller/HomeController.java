package com.happy.controller;/**
 * Created by Happy on 2018-07-09.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者：微冷的雨
 *
 * @create 2018-07-09
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String index(Model model){
     /*   Msg msg =  new Msg("测试标题","测试内容","欢迎来到HOME页面,您拥有 ROLE_HOME 权限");
        model.addAttribute("msg", msg);*/
        return "home";
    }
    @RequestMapping("/admin")
    @ResponseBody
    public String hello(){
        return "hello admin";
    }
}
