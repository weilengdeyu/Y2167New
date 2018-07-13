package com.happy.service;

import com.happy.entity.EmpInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by Happy on 2018-06-30.
 */
public interface IEmpInfoServiceTwo {
    //01。排序的方法 按照员工的手机号进行排序
    public List<EmpInfo> findAll(Sort sort);

    //02.分页的方法
    public Page<EmpInfo> findAll(Pageable pageable);

}
