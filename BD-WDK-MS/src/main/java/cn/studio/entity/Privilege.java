package cn.studio.entity;/**
 * Created by Happy on 2018-04-07.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-07
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
//权限表
public class Privilege {

    private Integer id;
    private String url; //权限导航的地址
    private String name;
    private Integer parent;
    private String icon;

    private boolean checked;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    //保存子权限集合
    private List<Privilege> children=new ArrayList<Privilege>();

    public List<Privilege> getChildren() {
        return children;
    }

    public void setChildren(List<Privilege> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
