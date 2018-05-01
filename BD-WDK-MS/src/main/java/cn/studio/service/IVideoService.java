package cn.studio.service;

import cn.studio.entity.Video;

import java.util.List;

/**
 * Created by Happy on 2018-04-27.
 */
public interface IVideoService {
    //01.根据视频分类编号，获取视频集合的方法
    public List<Video> getDetailVideoById(int tid);
    //02.根据视频编号获取单个视频详情
    public Video getOneVideo(int vid);
}
