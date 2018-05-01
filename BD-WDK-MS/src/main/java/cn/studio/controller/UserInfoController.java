package cn.studio.controller;/**
 * Created by Happy on 2018-04-04.
 */

import cn.studio.annotation.BusinessAnnotation;
import cn.studio.entity.Privilege;
import cn.studio.entity.UserInfo;
import cn.studio.entity.viewmodel.UserInfoModel;
import cn.studio.service.IPrivilegeService;
import cn.studio.service.IUserInfoService;
import cn.studio.util.ExcelUtilTool;
import cn.studio.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-04
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class UserInfoController {
    //注入用户Service
    @Resource(name = "userInfoService")
    private IUserInfoService userInfoService;

    //注入权限的Service
    @Resource(name = "privilegeService")
    private IPrivilegeService privilegeService;
    //1.登录
    @RequestMapping("/login")
    @BusinessAnnotation(moduleName = "系统管理",option = "登录")
    public String isLogin(UserInfo info, HttpSession session) throws Exception {
        UserInfo uinfo = userInfoService.isLogin(info);
        if (uinfo!=null&&uinfo.getUname()!=null){
            //记录session
            session.setAttribute("userInfo",uinfo);
            List<Privilege> allPrivileges = getAllPrivileges(uinfo.getUid());
            session.setAttribute("allPrivileges",allPrivileges);
            //显示上次登录时间
          //Date lastLoginDate = userInfoService.getLastLoginDate(uinfo.getUid());
            //更新用户最后一次登录时间
            userInfoService.updateLastLoginDate(uinfo.getUid());
            //登录成功，跳转到主界面
            return "/background/main";
        }else{
            //登录失败，跳回登录
            return "/background/login";
        }
    }

    //2.登出系统
    @RequestMapping("/logout")
    @BusinessAnnotation(moduleName="系统管理",option="退出系统")
    public String loginOut(HttpSession session) {
        session.removeAttribute("userInfo");
        //1.清空session
        //2.跳转到登录
        return "redirect:/background/login.jsp";
    }

    //3.用户列表
    @RequestMapping("/listUsers")
    public String userList(Model model) throws Exception {
        List<UserInfo> list = userInfoService.listAll();
        model.addAttribute("list",list);
        return "/background/userList";
    }

    //4.获取某个用户所有权限的方法
    public List<Privilege> getAllPrivileges(int uid) throws Exception {

        //新的容器 保存有父子关系的权限
        List<Privilege> rootMenus=new ArrayList<Privilege>();
        try {
            //get  Data from db  , this list is not layer list这个集合是平级的，没有任何的对象植入
            List<Privilege> privilegeList = privilegeService.getAllPrivileges(uid);
            for (Privilege item:privilegeList){//原始平级容器
                Privilege childMenu=item;//接收每一项
                int pid = childMenu.getParent(); //当前项目的pid  父分类编号  1
                if (pid==0){  //如果是0，证明是顶级分类
                    rootMenus.add(item); //作为单列集合的直接对象
                }else{
                    for (Privilege innerMenu:privilegeList){  //扫描整个内存中的数据
                        Integer id = innerMenu.getId(); //1
                        if (id==pid){
                            Privilege parentMenu=innerMenu;
                            parentMenu.getChildren().add(childMenu);
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rootMenus;
    }

    //5.返回系统中所有权限的json格式
    @RequestMapping("/getAllMenusJson")
    @ResponseBody
    public Object getAllMenusJson(int rid) throws Exception {
        //角色拥有的权限
        List<Privilege> list = privilegeService.getPrivilegeByRoleid(rid);

        //新的容器 保存有父子关系的权限
        List<Privilege> rootMenus=new ArrayList<Privilege>();
        try {
            List<Privilege> privilegeList = privilegeService.getAllPrivilege();
            for (Privilege item:privilegeList){//原始平级容器

                for (Privilege roleItem:list) {
                    if (roleItem.getId().equals(item.getId())){
                        item.setChecked(true);
                    }
                }
                Privilege childMenu=item;//接收每一项
                int pid = childMenu.getParent(); //当前项目的pid  父分类编号  1
                if (pid==0){  //如果是0，证明是顶级分类
                    rootMenus.add(item); //作为单列集合的直接对象
                }else{
                    for (Privilege innerMenu:privilegeList){  //扫描整个内存中的数据
                        Integer id = innerMenu.getId(); //1
                        if (id==pid){
                            Privilege parentMenu=innerMenu;
                            parentMenu.getChildren().add(childMenu);
                            break;
                        }
                    }
                }
            }
            return rootMenus;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //06.获取单页数据的控制器方法
    @RequestMapping("/getPagedUsers")
    public String getPagedUsers() throws Exception {
       return "/background/userList";
    }
    @RequestMapping("/getPagedUsersJson")
    @ResponseBody
    @BusinessAnnotation(moduleName="系统管理",option="用户列表")
    public Object getPagedUsers(@RequestParam(defaultValue = "1") int pageIndex,@RequestParam(defaultValue = "2") int pageSize,UserInfo info) throws Exception {
        //分情况讨论
        PageUtil<UserInfo> pageUtil=null;
        if (info!=null&&info.getUname()!=null&&(!info.getUname().equals(""))){
            //用户输入了条件
            pageUtil = userInfoService.getOnePageData(pageIndex, pageSize,info);
        }else{
            pageUtil = userInfoService.getOnePageData(pageIndex, pageSize);
        }

        return pageUtil;
    }

    //07.导入学员信息
    @RequestMapping("/importUser")
    public String importUser() {
        return "/background/importUser";
    }

    ExcelUtilTool<UserInfoModel> tool=new ExcelUtilTool<UserInfoModel>();

    //08.从Excel导入数据到Lis集合
    @RequestMapping("/importFile")
    @BusinessAnnotation(moduleName="导入学员信息",option="导入学员Excel到List")
    @ResponseBody
    public Object importFile(MultipartFile file,HttpSession session) throws Exception {
        tool.setClazz(UserInfoModel.class);
        String fileName=file.getOriginalFilename();
        String leftPath = session.getServletContext().getRealPath("/background/tempfile");
        //进行路径拼接
        File fullFile=new File(leftPath,fileName);
        file.transferTo(fullFile);
        List<UserInfoModel> list=tool.ExcelToList(fullFile);
        for (UserInfoModel info : list) {
            userInfoService.addUserInfo(info);
        }
        UserInfo info=new UserInfo();
        info.setUname("aa");
        return info;
    }
    //09.根据年级编号查询学员姓名集合
    @RequestMapping("/findStudentsByGradeId")
    @ResponseBody
    public Object findStudentsByGradeId(Integer gid){
        List<String> list = userInfoService.findStudentsByGradeId(gid);
        return list;
    }

    public IUserInfoService getUserInfoService() {
        return userInfoService;
    }

    public void setUserInfoService(IUserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }
}
