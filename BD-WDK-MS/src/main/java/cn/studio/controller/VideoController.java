package cn.studio.controller;/**
 * Created by Happy on 2018-04-28.
 */

import cn.studio.entity.Video;
import cn.studio.service.IVideoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-28
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class VideoController {
    @Resource(name = "videoService")
    private IVideoService videoService;
  @RequestMapping("/getOneVideo")
    public String getOneVideo(int vid,Model model){
      Video video = videoService.getOneVideo(vid);
      model.addAttribute("oneVideo",video);
      return "/front/coursedetail";
  }
}
