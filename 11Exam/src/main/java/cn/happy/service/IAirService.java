package cn.happy.service;

import cn.happy.entity.AirModel;

import java.util.List;

/**
 * Created by Happy on 2018-05-22.
 */
public interface IAirService {
    //查询所有
    public List<AirModel> findAll() throws Exception;
    //添加
    public int addAir(AirModel model) throws Exception;
    //修改
    public int updateAir(AirModel model) throws Exception;
    //按条件查询
    public List<AirModel> findAirByCondition(String district) throws Exception;
    //根据编号查询对象的方法
    public AirModel selectOneById(Integer id) throws Exception;
}

