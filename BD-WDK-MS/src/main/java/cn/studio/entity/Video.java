package cn.studio.entity;/**
 * Created by Happy on 2018-04-27.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-27
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Video {
    private Integer tVid;

    private String tVname;

    private String tVimage;

    private String tVvideourl;

    private Integer tCid;

    private Integer tVparent;

    private Integer tComment;

    private Double tVprice;

    public Integer gettVid() {
        return tVid;
    }

    public void settVid(Integer tVid) {
        this.tVid = tVid;
    }

    public String gettVname() {
        return tVname;
    }

    public void settVname(String tVname) {
        this.tVname = tVname;
    }

    public String gettVimage() {
        return tVimage;
    }

    public void settVimage(String tVimage) {
        this.tVimage = tVimage;
    }

    public String gettVvideourl() {
        return tVvideourl;
    }

    public void settVvideourl(String tVvideourl) {
        this.tVvideourl = tVvideourl;
    }

    public Integer gettCid() {
        return tCid;
    }

    public void settCid(Integer tCid) {
        this.tCid = tCid;
    }

    public Integer gettVparent() {
        return tVparent;
    }

    public void settVparent(Integer tVparent) {
        this.tVparent = tVparent;
    }

    public Integer gettComment() {
        return tComment;
    }

    public void settComment(Integer tComment) {
        this.tComment = tComment;
    }

    public Double gettVprice() {
        return tVprice;
    }

    public void settVprice(Double tVprice) {
        this.tVprice = tVprice;
    }
}
