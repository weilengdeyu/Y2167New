package com.happy.entity;/**
 * Created by Happy on 2018-06-28.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-28
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Entity
public class Emp {
    @Id
    @GeneratedValue
    private Integer empid;
    private String empname;
    private String emphone;

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

    public String getEmphone() {
        return emphone;
    }

    public void setEmphone(String emphone) {
        this.emphone = emphone;
    }
}
