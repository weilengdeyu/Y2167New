package com.happy.service;

import com.happy.entity.Emp;
import com.happy.entity.EmpInfo;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Happy on 2018-06-29.
 */
public interface IEmpInfoService {
    public void save(EmpInfo empInfo);
    public List<EmpInfo> findAll();
    public void delete(Integer id);
    //按照规范定制方法
    //定义一个根据主键查询单个对象的方法
    public EmpInfo findByEmpid(Integer empid) throws Exception;

    public EmpInfo findByEmpname(String empname) throws Exception;

    
}
