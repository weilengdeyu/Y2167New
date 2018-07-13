package com.happy.dao;

import com.happy.entity.Emp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Happy on 2018-06-29.
 */
public interface IEmpDAOTwo extends Repository<Emp,Integer> {
    public Emp findByEmpid(Integer empId) throws Exception;
    @Query("from Emp where empid=:empid")
    public Emp findMyEmpid(@Param("empid") Integer empid) throws Exception;
}
