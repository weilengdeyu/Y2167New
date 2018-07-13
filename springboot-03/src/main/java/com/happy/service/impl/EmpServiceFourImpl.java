package com.happy.service.impl;/**
 * Created by Happy on 2018-06-29.
 */

import com.happy.dao.IEmpDAOFour;
import com.happy.entity.Emp;
import com.happy.service.IEmpServiceFour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-29
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("empServiceFourImpl")
public class EmpServiceFourImpl implements IEmpServiceFour{
    @Resource(name = "IEmpDAOFour")
    private IEmpDAOFour empDAOFour;
    @Override
    public List<Emp> findAll(Sort sort) {
        return (List<Emp>) empDAOFour.findAll(sort);
    }

    @Override
    public Page<Emp> findAll(Pageable pageable) {
        return  empDAOFour.findAll(pageable);
    }
}

