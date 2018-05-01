package cn.studio.entity.viewmodel;/**
 * Created by Happy on 2018-04-23.
 */

import java.util.Date;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-23
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class UserInfoModel {
    private String    uname ;
    private String    unickname ;
    private String    upwd ;
    private Integer   uroleid ;
    private String    uemail ;
    private String    uphone ;
    private String    uidentityid ;
    private Date ubirthday ;  //出生日期
    private Integer   ugradeid ; //年级编号
    private String    ugender; //性别

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUnickname() {
        return unickname;
    }

    public void setUnickname(String unickname) {
        this.unickname = unickname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getUroleid() {
        return uroleid;
    }

    public void setUroleid(Integer uroleid) {
        this.uroleid = uroleid;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUidentityid() {
        return uidentityid;
    }

    public void setUidentityid(String uidentityid) {
        this.uidentityid = uidentityid;
    }

    public Date getUbirthday() {
        return ubirthday;
    }

    public void setUbirthday(Date ubirthday) {
        this.ubirthday = ubirthday;
    }

    public Integer getUgradeid() {
        return ugradeid;
    }

    public void setUgradeid(Integer ugradeid) {
        this.ugradeid = ugradeid;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }
}
