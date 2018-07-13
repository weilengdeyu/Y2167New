package com.happy.service.impl;/**
 * Created by Happy on 2018-06-30.
 */

import com.happy.dao.IEmpInfoDAOFour;
import com.happy.entity.EmpInfo;
import com.happy.service.IEmpInfoServiceFour;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("empInfoServiceFour")
public class EmpInfoServiceFourImpl implements IEmpInfoServiceFour {
    @Resource(name = "empInfoDAOFourImpl")
    private IEmpInfoDAOFour empInfoDAOFour;
    @Override
    public List<EmpInfo> findAll() {
        return empInfoDAOFour.findAll();
    }

    @Override
    public void addEmp(EmpInfo empInfo) {
        empInfoDAOFour.addEmp(empInfo);
    }
}
