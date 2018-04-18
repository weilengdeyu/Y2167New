package cn.studio.entity;/**
 * Created by Happy on 2018-04-15.
 */

import java.util.Date;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Log {
    private Integer id;
    private String usercode;
    private String username;
    private String operateinfo;
    private Date operatedatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOperateinfo() {
        return operateinfo;
    }

    public void setOperateinfo(String operateinfo) {
        this.operateinfo = operateinfo;
    }

    public Date getOperatedatetime() {
        return operatedatetime;
    }

    public void setOperatedatetime(Date operatedatetime) {
        this.operatedatetime = operatedatetime;
    }
}
