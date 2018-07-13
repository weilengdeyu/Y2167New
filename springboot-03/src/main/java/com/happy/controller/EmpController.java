package com.happy.controller;/**
 * Created by Happy on 2018-06-29.
 */

import com.happy.entity.Emp;
import com.happy.service.IEmpService;
import com.happy.service.IEmpServiceFour;
import com.happy.service.IEmpServiceThree;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-29
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
/*@Controller
@RequestMapping("/users")*/
public class EmpController {
    @Resource
    private IEmpService empService;
    @Resource
    private IEmpServiceThree empServiceThree;
    @Resource
    private IEmpServiceFour empServiceFour;

    @RequestMapping("/save")
    @ResponseBody
    public String save() throws Exception {
          Emp emp=new Emp();
          emp.setEmphone("15201069845");
          emp.setEmpname("微冷的雨");
          empService.save(emp);
          return "add ok";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete() throws Exception {
        empService.delete(1);
        return "delete ok";
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Emp> findAll() throws Exception {
        List<Emp> list = empService.findAll();
        return list;
    }
    @RequestMapping("/")
    @ResponseBody
    public List<Emp> findAllIndex() throws Exception {
        List<Emp> list = empService.findAll();
        return list;
    }

    @RequestMapping("/findByEmpid")
    @ResponseBody
    public Emp findByEmpid() throws Exception {
        Emp emp = empService.findByEmpid(2);
        return emp;
    }

    @RequestMapping("/findMyEmpid")
    @ResponseBody
    public Emp findMyEmpid() throws Exception {
        Emp emp = empService.findMyEmpid(2);
        return emp;
    }

    @RequestMapping("/findByEmpname")
    @ResponseBody
    public Emp findByEmpname() throws Exception {
        Emp emp = empServiceThree.findByEmpname("SpringBoot");
        return emp;
    }

    @RequestMapping("/addEmp")
    @ResponseBody
    public String addEmp() throws Exception {
        Emp emp =new Emp();
        emp.setEmpid(3);
        emp.setEmpname("张林");
        emp.setEmphone("15201069845");
        empServiceThree.addEmp(emp);
        return "add ok";
    }


    @RequestMapping("/findAllSort")
    @ResponseBody
    public Object findAllSort() throws Exception {
        Sort sort=new Sort(Sort.Direction.DESC,"emphone");
        List<Emp> list = empServiceFour.findAll(sort);
        return list;
    }

    @RequestMapping("/findAllPage")
    @ResponseBody
    public Object findAllPage() throws Exception {
        Pageable pageable=PageRequest.of(1,2);
        Page<Emp> list = empServiceFour.findAll(pageable);
        return list;
    }


}
