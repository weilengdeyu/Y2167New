package cn.studio.util;/**
 * Created by Happy on 2018-04-13.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-13
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
//分页工具类
public class PageUtil<T> {
    //1.数据集合
    private List<T> list=new ArrayList<T>();
    //2.当前页码
    private  Integer pageIndex;
    //3.总记录数
    private  Integer totalRecords;
    //4.总页数
    private  Integer totalPages;
    //5.每页显示的记录数
    private  Integer pageSize;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
