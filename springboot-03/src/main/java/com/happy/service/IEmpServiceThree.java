package com.happy.service;

import com.happy.entity.Emp;

/**
 * Created by Happy on 2018-06-29.
 */
public interface IEmpServiceThree {
    public Emp findByEmpname(String empname) throws Exception;
    public void addEmp(Emp emp) throws Exception;
}
