package com.happy.service;

import com.happy.entity.Emp;

import java.util.List;

/**
 * Created by Happy on 2018-06-29.
 */
public interface IEmpService {
    public void save(Emp emp) throws Exception;
    public void delete(int id) throws Exception;
    public List<Emp> findAll() throws Exception;
    public Emp findByEmpid(Integer empId) throws Exception;
    public Emp findMyEmpid(Integer empId) throws Exception;
}
