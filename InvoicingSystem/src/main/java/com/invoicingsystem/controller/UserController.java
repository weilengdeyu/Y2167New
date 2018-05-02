package com.invoicingsystem.controller;

import com.invoicingsystem.entity.Product;
import com.invoicingsystem.entity.Users;
import com.invoicingsystem.service.ProductService;
import com.invoicingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by FLC on 2018/4/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userServices;
    @Autowired
    private ProductService productServices;
    @RequestMapping("/dologin")
    public String dologin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(String userName, String password, HttpServletResponse response, HttpServletRequest request, Model model) throws IOException {

        System.out.println("接收的值为：" + userName + ":" + password);
        Users users = userServices.login(userName);
        if (users == null) {
            response.setContentType("text/html; charset=UTF-8"); //转码
            PrintWriter out = response.getWriter();
            out.flush();
            out.println("<script>");
            out.println("alert('用户名或者密码错误！');");
            out.println("</script>");
            return "login";
        }
        System.out.println("查询出来的密码为：" + users.getPassword());
        if (users.getPassword().equals(password) || users.getPassword() == password) {
            /**
             * 登陆成功跳转main.html
             */
            request.getSession().setAttribute("user", users);
            List<Product> productList = productServices.getProductList();
            request.getSession().setAttribute("prolist",productList);
            model.addAttribute("usermodel", users);
            model.addAttribute("productList",productList);
            return "main";
        } else {
            /**
             * 登陆失败跳转login.html
             */
            response.setContentType("text/html; charset=UTF-8"); //转码
            PrintWriter out = response.getWriter();
            out.flush();
            out.println("<script>");
            out.println("alert('登录失败！用户名或者密码错误！');");
            out.println("</script>");
            return "login";
        }

    }

    @RequestMapping("/loginout")
    public String loginout(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return "login";
    }
}
