package com.happy.dao;

import com.happy.entity.Emp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Happy on 2018-06-29.
 */
public interface IEmpDAO extends CrudRepository<Emp,Integer> {

}
