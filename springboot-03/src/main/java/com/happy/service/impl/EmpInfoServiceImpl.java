package com.happy.service.impl;/**
 * Created by Happy on 2018-06-29.
 */

import com.happy.dao.IEmpInfoDAO;
import com.happy.dao.IEmpInfoDAOTwo;
import com.happy.entity.EmpInfo;
import com.happy.service.IEmpInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-06-29
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("empInfoService")
public class EmpInfoServiceImpl implements IEmpInfoService{
  //注入一个DAO接口
    @Resource(name = "IEmpInfoDAO")
    private IEmpInfoDAO empInfoDAO;

    //注入另一个DAO接口
   @Resource(name ="IEmpInfoDAOTwo" )
   private IEmpInfoDAOTwo iEmpInfoDAOTwo;
  @Override
  @Transactional
  public void save(EmpInfo empInfo) {
    empInfoDAO.save(empInfo);
  }

  @Override
  public List<EmpInfo> findAll() {
    return (List<EmpInfo>) empInfoDAO.findAll();
  }

  @Override
  @Transactional
  public void delete(Integer id) {
    empInfoDAO.deleteById(id);
  }

  @Override
  public EmpInfo findByEmpid(Integer empid) throws Exception {
    return iEmpInfoDAOTwo.findByEmpid(empid);
  }

  @Override
  public EmpInfo findByEmpname(String empname) throws Exception {
    return iEmpInfoDAOTwo.findByEmpname(empname);
  }
}
