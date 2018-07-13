package com.happy.entity;/**
 * Created by Happy on 2018-06-30.
 */

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
/**
 * 作者：微冷的雨
 * @create 2018-06-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
//文档
@Document(indexName = "blog",type = "blog")
//@Entity //可以被持久化的一个被Hibernate框架监管的一个bean
//在本地在网络上保证一个对象被传输或者序列化
public class EsBlog implements Serializable {
    @Id //主键
    private String id;
    private String title; //博客标题
    private String summary; //博客简介
    private String content; //博客内容
    protected EsBlog(){

    }

    public EsBlog(String title, String summary, String content) {
        this.title = title;
        this.summary = summary;
        this.content = content;
    }

    @Override
    public String toString() {
        return "EsBlog{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
