package cn.happy.servlet;

import cn.happy.entity.UserInfo;
import cn.happy.service.IUserInfoService;
import cn.happy.service.impl.UserInfoServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Happy on 2018-02-06.
 */
public class UserInfoNewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //01.servie对象
        IUserInfoService service=new UserInfoServiceImpl();

        //02.调度方法，获取泛型
        try {
            List<UserInfo> list = service.findAll();
            //03.得将数据包装成特定的json  rows  total
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("total",list.size());
            map.put("rows",list);

            //手工json fastjson
            String result = JSON.toJSONString(map);
            //04.直接放入响应流 Response.write(String str)
            response.setCharacterEncoding("utf-8");
            response.getWriter().write(result);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }
}
