package com.happy.entity;/**
 * Created by Happy on 2018-06-29.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-29
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
//EmpInfo可以持久化的类
@Entity
public class EmpInfo {
    @Id
    @GeneratedValue //主键的生成策略  Mysql 自增   支持序列的数据库   序列
    private Integer empid;
    private String empname;
    private String empphone;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone;
    }
}
