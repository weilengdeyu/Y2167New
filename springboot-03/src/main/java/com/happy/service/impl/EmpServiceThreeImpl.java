package com.happy.service.impl;/**
 * Created by Happy on 2018-06-29.
 */

import com.happy.dao.IEmpDAOThree;
import com.happy.entity.Emp;
import com.happy.service.IEmpServiceThree;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-29
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("empServiceThree")
public class EmpServiceThreeImpl implements IEmpServiceThree {
    @Resource(name = "empDAOThreeImpl")
    private IEmpDAOThree empDAOThree;
    @Override
    public Emp findByEmpname(String empname) throws Exception {
        return empDAOThree.findByEmpname(empname);
    }

    @Override
    @Transactional
    public void addEmp(Emp emp) throws Exception {
        empDAOThree.addEmp(emp);
    }
}
