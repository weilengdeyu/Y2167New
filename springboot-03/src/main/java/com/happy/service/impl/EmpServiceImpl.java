package com.happy.service.impl;/**
 * Created by Happy on 2018-06-29.
 */

import com.happy.dao.IEmpDAO;
import com.happy.dao.IEmpDAOTwo;
import com.happy.entity.Emp;
import com.happy.service.IEmpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-29
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("empService")
public class EmpServiceImpl implements IEmpService {
    @Resource(name = "IEmpDAO")
    private IEmpDAO empDAO;
    @Resource(name = "IEmpDAOTwo")
    private IEmpDAOTwo empDAOTwo;
    @Override
    @Transactional
    public void save(Emp emp) throws Exception {
        empDAO.save(emp);
    }

    @Override
    @Transactional
    public void delete(int id) throws Exception {
        empDAO.deleteById(id);
    }

    @Override
    public List<Emp> findAll() throws Exception {
        return (List<Emp>) empDAO.findAll();
    }

    @Override
    public Emp findByEmpid(Integer empId) throws Exception {
        return empDAOTwo.findByEmpid(empId);
    }

    @Override
    public Emp findMyEmpid(Integer empId) throws Exception {
        return empDAOTwo.findMyEmpid(empId);
    }
}
