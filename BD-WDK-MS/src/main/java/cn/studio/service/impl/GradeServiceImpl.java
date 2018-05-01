package cn.studio.service.impl;/**
 * Created by Happy on 2018-04-21.
 */

import cn.studio.dao.IGradeDAO;
import cn.studio.entity.Grade;
import cn.studio.service.IGradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-21
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("gradeService")
public class GradeServiceImpl implements IGradeService {
    @Resource(name = "IGradeDAO")
    private IGradeDAO gradeDAO;
    public List<Grade> selectGradesByUid(Integer uid) throws Exception {
        return gradeDAO.selectGradesByUid(uid);
    }
    public IGradeDAO getGradeDAO() {
        return gradeDAO;
    }

    public void setGradeDAO(IGradeDAO gradeDAO) {
        this.gradeDAO = gradeDAO;
    }


}
