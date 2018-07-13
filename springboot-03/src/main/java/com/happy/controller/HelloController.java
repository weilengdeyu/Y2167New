package com.happy.controller;/**
 * Created by Happy on 2018-06-22.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-22
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@RestController //等价于Controller +ResponseBody
public class HelloController {
    @Value("${cn.happy.name}")
    private  String name;
    @RequestMapping("/getName")
    @ResponseBody
   public String getName(){
       return name;
   }


    @RequestMapping("/aa")
    public Object hello(){
        return "Hello,SpringBoot!Don't Has Exception!这就是热部署";
    }
}
