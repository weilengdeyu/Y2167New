package cn.studio.service.impl;/**
 * Created by Happy on 2018-04-27.
 */

import cn.studio.dao.ICourseDAO;
import cn.studio.entity.TCourse;
import cn.studio.service.ICourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-27
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("courseService")
public class CourseServiceImpl implements ICourseService{
    @Resource(name = "ICourseDAO")
    private ICourseDAO courseDAO;
    public List<TCourse> getAllCourses() {
        return courseDAO.getAllCourses();
    }
    //02.获取精品视频
    public List<TCourse> getWellVideo() {
        return courseDAO.getWellVideo();
    }

    public ICourseDAO getCourseDAO() {
        return courseDAO;
    }

    public void setCourseDAO(ICourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }
}
