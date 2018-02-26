package cn.happy.servlet;

import cn.happy.entity.UserInfo;
import cn.happy.service.IUserInfoService;
import cn.happy.service.impl.UserInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Happy on 2018-01-30.
 */
public class UserInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //01.解决乱码
        request.setCharacterEncoding("utf-8");
        //2.接收用户名和密码
        String uname=request.getParameter("uname");
        String upassword=request.getParameter("upassword");
        //3.拼成一个UserInfo对象
        UserInfo info=new UserInfo();
        info.setUname(uname);
        info.setUpassword(upassword);
        //4.实例化serrvice
        IUserInfoService service=new UserInfoServiceImpl();
        //5.调度service.isLogin()获取 返回结果
        try {
            UserInfo uinfo = service.isLogin(info);
            if (uinfo!=null){
                if (uinfo.getUname()!=null){
                    //Login success
                    //跳转到index.jsp
                    //转发   不需要项目名称
                    //6,转发
                    request.getRequestDispatcher("/pages/Index.jsp").forward(request,response);
                }else{
                    //失败 回到登录页面
                    //重定向   需要项目名称
                    response.sendRedirect(request.getContextPath()+"/pages/login.jsp");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
