package com.happy.util;/**
 * Created by Happy on 2018-06-30.
 */

import com.happy.entity.EmpInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyRowMapper implements RowMapper<EmpInfo>{

    @Override
    public EmpInfo mapRow(ResultSet rs, int i) throws SQLException {
        EmpInfo info=new EmpInfo();
        info.setEmpid(rs.getInt("empid"));
        info.setEmpname(rs.getString("empname"));
        info.setEmpphone(rs.getString("empphone"));
        return info;
    }
}
