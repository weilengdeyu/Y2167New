package cn.studio.service;

import cn.studio.entity.TCourse;
import cn.studio.entity.Video;

import java.util.List;

/**
 * Created by Happy on 2018-04-27.
 */
public interface ICourseService {
    //1.获取所有课程集合，没有层级关系
    public List<TCourse> getAllCourses();
    //2.获取精品视频集合，1代表精品，0代表非精品视频
    public List<TCourse> getWellVideo();



}
