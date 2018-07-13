package com.happy.service;

import com.happy.entity.Emp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by Happy on 2018-06-29.
 */
public interface IEmpServiceFour {
    //排序
    public List<Emp> findAll(Sort sort);
    //分页
    public Page<Emp> findAll(Pageable pageable);

}

