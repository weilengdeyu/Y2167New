package cn.studio.service.impl;/**
 * Created by Happy on 2018-04-27.
 */

import cn.studio.dao.IVideoDAO;
import cn.studio.entity.Video;
import cn.studio.service.IVideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-27
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("videoService")
public class VideoServiceImpl implements IVideoService {

    @Resource(name = "IVideoDAO")
    private IVideoDAO videoDAO;
    public List<Video> getDetailVideoById(int tid) {
        return videoDAO.getDetailVideoById(tid);
    }

    public Video getOneVideo(int vid) {
        return videoDAO.getOneVideo(vid);
    }

    public IVideoDAO getVideoDAO() {
        return videoDAO;
    }

    public void setVideoDAO(IVideoDAO videoDAO) {
        this.videoDAO = videoDAO;
    }
}
