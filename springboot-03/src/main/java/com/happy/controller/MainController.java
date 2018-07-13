package com.happy.controller;/**
 * Created by Happy on 2018-07-03.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：微冷的雨
 *
 * @create 2018-07-03
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class MainController {
   /* @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }*/

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","登录失败，用户名或密码错误");
        return "login";
    }


}
