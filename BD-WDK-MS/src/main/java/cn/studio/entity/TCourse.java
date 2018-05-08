package cn.studio.entity;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TCourse {
    private Integer tCid;

    private String tCimage;

    private String tCname;

    private Integer tCparent;

    private Integer tCcomment;

    private String tCourseType;

    private Double tPrice;

    //植入父节点属性
    private  Integer parent;

    //植入子元素集合
    private List<TCourse> children=new ArrayList<TCourse>();


    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public List<TCourse> getChildren() {
        return children;
    }

    public void setChildren(List<TCourse> children) {
        this.children = children;
    }

    public Integer gettCid() {
        return tCid;
    }

    public void settCid(Integer tCid) {
        this.tCid = tCid;
    }

    public String gettCimage() {
        return tCimage;
    }

    public void settCimage(String tCimage) {
        this.tCimage = tCimage == null ? null : tCimage.trim();
    }

    public String gettCname() {
        return tCname;
    }

    public void settCname(String tCname) {
        this.tCname = tCname == null ? null : tCname.trim();
    }

    public Integer gettCparent() {
        return tCparent;
    }

    public void settCparent(Integer tCparent) {
        this.tCparent = tCparent;
    }

    public Integer gettCcomment() {
        return tCcomment;
    }

    public void settCcomment(Integer tCcomment) {
        this.tCcomment = tCcomment;
    }

    public String gettCourseType() {
        return tCourseType;
    }

    public void settCourseType(String tCourseType) {
        this.tCourseType = tCourseType;
    }

    public Double gettPrice() {
        return tPrice;
    }

    public void settPrice(Double tPrice) {
        this.tPrice = tPrice;
    }
}