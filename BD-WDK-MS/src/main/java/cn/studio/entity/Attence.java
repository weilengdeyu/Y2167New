package cn.studio.entity;/**
 * Created by Happy on 2018-04-21.
 */

import java.util.Date;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-21
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Attence {
   private Integer attence_id;
   private Integer attence_class;
   private Integer attence_stuid;
   private Integer attence_user;
   private Date attence_date;
   private Integer attence_status;

    public Integer getAttence_id() {
        return attence_id;
    }

    public void setAttence_id(Integer attence_id) {
        this.attence_id = attence_id;
    }

    public Integer getAttence_class() {
        return attence_class;
    }

    public void setAttence_class(Integer attence_class) {
        this.attence_class = attence_class;
    }

    public Integer getAttence_stuid() {
        return attence_stuid;
    }

    public void setAttence_stuid(Integer attence_stuid) {
        this.attence_stuid = attence_stuid;
    }

    public Integer getAttence_user() {
        return attence_user;
    }

    public void setAttence_user(Integer attence_user) {
        this.attence_user = attence_user;
    }

    public Date getAttence_date() {
        return attence_date;
    }

    public void setAttence_date(Date attence_date) {
        this.attence_date = attence_date;
    }

    public Integer getAttence_status() {
        return attence_status;
    }

    public void setAttence_status(Integer attence_status) {
        this.attence_status = attence_status;
    }
}
