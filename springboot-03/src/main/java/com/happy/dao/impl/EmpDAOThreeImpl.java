package com.happy.dao.impl;/**
 * Created by Happy on 2018-06-29.
 */

import com.happy.dao.IEmpDAOThree;
import com.happy.entity.Emp;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-29
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Repository
public class EmpDAOThreeImpl implements IEmpDAOThree {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public Emp findByEmpname(String empname) throws Exception {
        String sql="select * from Emp where empname=?";
        RowMapper<Emp> mapper=new BeanPropertyRowMapper<Emp>(Emp.class);
        Emp emp = jdbcTemplate.queryForObject(sql, mapper, empname);
        return emp;
    }

    @Override
    public void addEmp(Emp emp) throws Exception {
        String sql="insert into Emp(empid,empname,emphone) values(?,?,?)";
        jdbcTemplate.update(sql,emp.getEmpid(),emp.getEmpname(),emp.getEmphone());
    }
}
