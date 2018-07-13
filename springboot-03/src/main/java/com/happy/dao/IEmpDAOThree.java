package com.happy.dao;

import com.happy.entity.Emp;

/**
 * Created by Happy on 2018-06-29.
 */
public interface IEmpDAOThree {
    //根据名称查询单个对象
    public Emp findByEmpname(String empname) throws Exception;
    //添加
    public void addEmp(Emp emp) throws Exception;
}
