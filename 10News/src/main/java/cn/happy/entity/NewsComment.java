package cn.happy.entity;/**
 * Created by Happy on 2018-05-06.
 */

import java.util.Date;

/**
 * 作者：微冷的雨
 *
 * @create 2018-05-06
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class NewsComment {
    private Integer id;
    private Integer newid;
    private String content;
    private String author;
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewid() {
        return newid;
    }

    public void setNewid(Integer newid) {
        this.newid = newid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
