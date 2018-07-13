package com.happy.dao;

import com.happy.entity.Emp;
import com.happy.entity.EmpInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Happy on 2018-06-29.
 */
public interface IEmpInfoDAOTwo extends Repository<EmpInfo,Integer>{
    //按照规范定制方法
    //定义一个根据主键查询单个对象的方法
    public EmpInfo findByEmpid(Integer empid) throws Exception;

    //定义一个根据   员工姓名   查询单个对象的方法
    @Query("from EmpInfo where empname=:empname")
    public EmpInfo findByEmpname(@Param("empname") String empname) throws Exception;
}
