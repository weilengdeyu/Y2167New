package cn.happy.service.impl;/**
 * Created by Happy on 2018-05-22.
 */

import cn.happy.entity.AirModel;
import cn.happy.mapper.IAirDAO;
import cn.happy.service.IAirService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-05-22
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("airService")
public class AirServiceImpl implements IAirService {
    @Resource(name = "IAirDAO")
    private IAirDAO dao;
    @Override
    public List<AirModel> findAll() throws Exception {
        return dao.findAll();
    }

    @Override
    @Transactional
    public int addAir(AirModel model)  {
        try {
            return dao.addAir(model);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateAir(AirModel model) throws Exception {
        return dao.updateAir(model);
    }

    @Override
    public List<AirModel> findAirByCondition(String district) throws Exception {
        return dao.findAirByCondition(district);
    }

    @Override
    public AirModel selectOneById(Integer id) throws Exception {
        return dao.selectOneById(id);
    }
}
