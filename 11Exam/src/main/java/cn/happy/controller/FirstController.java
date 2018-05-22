package cn.happy.controller;/**
 * Created by Happy on 2018-05-21.
 */

import cn.happy.entity.AirModel;
import cn.happy.service.IAirService;
import com.sun.javafx.sg.PGShape;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.constraints.FutureOrPresent;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-05-21
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class FirstController {
    //植入Service
    @Resource(name = "airService")
    private IAirService  myAirService;

    @RequestMapping("/goHome")
    public String getHome(){
        return "main";
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public Object findAll() throws Exception {
        List<AirModel> list = myAirService.findAll();
        return list;
    }

    @RequestMapping("/goAddPage")
    public String goAddPage(){
        return "addAir";
    }

    //添加数据
    @RequestMapping("/addAir")
    public String addAir(AirModel model, Model modelData) throws Exception {
        int count = myAirService.addAir(model);
        if (count>0){
            return "redirect:goHome";
        }else{
            modelData.addAttribute("erroMsg","添加失败");
            return "redirect:goHome";
        }
    }

    @RequestMapping("/goUpdatePage")
    @ResponseBody
    public Object goUpdatePage(int id) throws Exception {
        AirModel air = myAirService.selectOneById(id);
        return air;
    }

    @RequestMapping("/updateAir")
    public String updateAir(AirModel model) throws Exception {
        int count = myAirService.updateAir(model);
        return "redirect:goHome";
    }
    //按条件查询
    @RequestMapping("selectByCondition")
    @ResponseBody
    public Object selectByCondition(String district) throws Exception {
        List<AirModel> list = myAirService.findAirByCondition(district);
        return list;
    }
}
