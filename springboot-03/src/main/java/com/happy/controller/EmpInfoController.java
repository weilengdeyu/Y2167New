package com.happy.controller;/**
 * Created by Happy on 2018-06-29.
 */

import com.happy.entity.EmpInfo;
import com.happy.service.IEmpInfoService;
import com.happy.service.IEmpInfoServiceFour;
import com.happy.service.IEmpInfoServiceTwo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
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
@Controller
@RequestMapping("/new")
public class EmpInfoController {
    //注入Service
    @Resource(name = "empInfoService")
    private IEmpInfoService empInfoService;

    @Resource
    private IEmpInfoServiceTwo empInfoServiceTwo;

    @Resource
    private IEmpInfoServiceFour empInfoServiceFour;

    @RequestMapping("/addEmp")
    @ResponseBody
    public Object addEmp(){
        EmpInfo empInfo=new EmpInfo();
        empInfo.setEmpname("微冷的u");
        empInfo.setEmpphone("120");
        empInfoServiceFour.addEmp(empInfo);
        return "add ok!";

    }


    @RequestMapping("/findAllJDBC")
    @ResponseBody
    public Object findAllJDBC(){
        List<EmpInfo> list = empInfoServiceFour.findAll();
        return list;
    }

    @RequestMapping("/findAllSort")
    @ResponseBody
    public Object findAllSort(){ //DeScending  ASCending
       /* Sort sort=new Sort(Sort.Direction.ASC,"empid","empname");*/
        Sort sort=new Sort(Sort.Direction.ASC,"empid").and(new Sort(Sort.Direction.DESC,"empname"));
        List<EmpInfo> list = empInfoServiceTwo.findAll(sort);
        return list;
    }

    @RequestMapping("/findAllPage")
    @ResponseBody
    public Object findAllPage(){
        Pageable pageable=PageRequest.of(1,2);
        Page<EmpInfo> page=empInfoServiceTwo.findAll(pageable);
        return page;
    }



    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        EmpInfo info=new EmpInfo();
        info.setEmpname("微冷的雨");
        info.setEmpphone("15201069845");
        empInfoService.save(info);
        return "add Ok!";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public Object findAll(){
        List<EmpInfo> list =empInfoService.findAll();
        return list;
    }

    //删除
    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(){
        empInfoService.delete(3);
        return "del ok!";
    }

    //根据主键查询单个对象
    @RequestMapping("/findByEmpid")
    @ResponseBody
    public Object findByEmpid() throws Exception {
        EmpInfo emp = empInfoService.findByEmpid(4);
        return emp;
    }

    //根据员工名称  查询单个对象
    @RequestMapping("/findByEmpname")
    @ResponseBody
    public Object findByEmpname() throws Exception {
        EmpInfo emp = empInfoService.findByEmpname("SpringBoot");
        return emp;
    }
}
