package com.happy.service.impl;/**
 * Created by Happy on 2018-06-30.
 */

import com.happy.dao.IEmpInfoDAOThree;
import com.happy.entity.EmpInfo;
import com.happy.service.IEmpInfoServiceTwo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("empInfoServiceTwo")
public class EmpInfoServiceTwoImpl implements IEmpInfoServiceTwo {
    @Resource(name = "IEmpInfoDAOThree")
    private IEmpInfoDAOThree empInfoDAOThree;
    @Override
    public List<EmpInfo> findAll(Sort sort) {
        return (List<EmpInfo>) empInfoDAOThree.findAll(sort);
    }

    @Override
    public Page<EmpInfo> findAll(Pageable pageable) {
        return empInfoDAOThree.findAll(pageable);
    }
}
