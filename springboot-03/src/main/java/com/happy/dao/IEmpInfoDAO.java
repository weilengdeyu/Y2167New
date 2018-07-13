package com.happy.dao;/**
 * Created by Happy on 2018-06-29.
 */

import com.happy.entity.EmpInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-29
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public interface IEmpInfoDAO extends CrudRepository<EmpInfo,Integer> {
}
