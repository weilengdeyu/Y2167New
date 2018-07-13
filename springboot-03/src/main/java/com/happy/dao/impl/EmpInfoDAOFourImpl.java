package com.happy.dao.impl;/**
 * Created by Happy on 2018-06-30.
 */

import com.happy.dao.IEmpInfoDAOFour;
import com.happy.entity.EmpInfo;
import com.happy.util.MyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Repository
public class EmpInfoDAOFourImpl implements IEmpInfoDAOFour {
    //JDBCTemplate
    //Spring整合JDBCTemplate  比较繁琐
    @Resource
    private JdbcTemplate jdbcTemplate;  //拿到了操作数据的入口
    @Override
    public List<EmpInfo> findAll() {
        String sql="select *  from emp_info";

        List<EmpInfo> list = jdbcTemplate.query(sql,new MyRowMapper());
        return list;
    }

    @Override
    public void addEmp(EmpInfo empInfo) {
        String sql="insert into emp_info(empname,empphone) values(?,?)";
        jdbcTemplate.update(sql,empInfo.getEmpname(),empInfo.getEmpphone());
    }
}
