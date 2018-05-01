package cn.studio.controller;/**
 * Created by Happy on 2018-04-27.
 */

import cn.studio.entity.TCourse;
import cn.studio.entity.Video;
import cn.studio.service.ICourseService;
import cn.studio.service.IVideoService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-27
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class CourseController {
    //植入Service接口层
    @Resource(name = "courseService")
    public ICourseService courseService;
    //植入Service接口层
    @Resource(name = "videoService")
    public IVideoService videoService;
    //01.获取课程分类
    @RequestMapping("/getCourseData")
    public String getCourseData(Model model){
        //获取有层级关系的课程数据，放入作用域
        List<TCourse> coures= courseService.getAllCourses();
        //新的容器 保存有父子关系的分类
        List<TCourse> rootCourses=new ArrayList<TCourse>();
        for (TCourse item:coures){
            TCourse childMenu=item;
            int pid = childMenu.gettCparent();
            if (pid==0){
                rootCourses.add(item);
            }else{
                for (TCourse innerMenu:coures){
                    Integer id = innerMenu.gettCid();
                    if (id==pid){
                        TCourse parentMenu=innerMenu;
                        parentMenu.getChildren().add(childMenu);
                        break;
                    }
                }
            }
        }
        model.addAttribute("courses",rootCourses);

        List<TCourse> wellVideo = getWellVideo();
        model.addAttribute("videos",wellVideo);
        return "/front/index";
    }

    //02.获取精品视频
    public List<TCourse> getWellVideo(){
        List<TCourse> wellVideo = courseService.getWellVideo();
    return wellVideo;
    }

    //03.根据视频分类编号，获取该分类下所有视频集合
    @RequestMapping("/getDetailCourseById/{tid}")
    public String  getDetaielCourseById(@PathVariable int tid, Model model){
        List<Video> list = videoService.getDetailVideoById(tid);
        model.addAttribute("videoList",list);
        return "/front/courselist";
    }
}
