package com.happy.dao;

import com.happy.entity.EmpInfo;

import java.util.List;

/**
 * Created by Happy on 2018-06-30.
 */
public interface IEmpInfoDAOFour {
    //先写一个查询所有信息的方法
    public List<EmpInfo> findAll();
    public void addEmp(EmpInfo empInfo);
}
