<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>微冷的雨训练营</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/front/css/base.css">
<!--样式-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/front/css/index.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/front/bs/css/bootstrap.css">
    <link href="${pageContext.request.contextPath}/background/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/front/bs/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/front/bs/js/holder.min.js"></script>
    <style type="text/css">

    </style>
<!--首页banner样式-->
<script type="text/javascript" src="${pageContext.request.contextPath}/front/js/jquery-1.11.3.min.js"></script>


<body>
<div class="clear"></div>

<jsp:include page="top.jsp"></jsp:include>
<!--web logo and search end--> 
<!--网站导航 start-->
<div class="w-all w-minw hg-60 bg-c-ffffff ql_webnav">
    <div class="w-main m-auto ps-r hg-60"> 
        <!--全部商品分类-->
        <div class="hc_lnav jslist">
            <div class="allbtn">
                <h2 style="width: 250px;"><a href="#"  >全部课程分类</a></h2>
                <ul style="width:250px;border-radius: 0px;" class="jspop box">
                    <!--导航-->
                  <c:forEach items="${courses}" var="item">
                      <li class="a1" style="font-size: 15px;">
                          <div class="text-center">
                              <a href="#" class="ftc-ffffff">
                                  <h1 style="font-family: Algerian">${item.tCname}</h1>
                              </a>
                          </div>

                          <div class="pop">
                              <c:forEach items="${item.children}" var="crc">
                                  <dl>
                                      <dt><a href="#">${crc.tCname} ></a></dt>
                                      <dd>
                                          <c:forEach var="ccrc" items="${crc.children}">
                                              <a class="ui-link" href="${pageContext.request.contextPath}/QueryVideo?cid=${ccrc.tCid}">${ccrc.tCname}</a>
                                              <span>|</span>
                                          </c:forEach>
                                      </dd>
                                  </dl>

                                  <div class="clr"></div>
                              </c:forEach>
                          </div>
                      </li>
                  </c:forEach>

                </ul>
            </div>
        </div>
        <!--导航栏-->
        <ul class="w-950 hg-60 ql_nav">
            <li><a href="index.html" class="cur">精品视频</a></li>
            <li><a href="connect.html">笔记分享</a></li>
            <li><a href="connect.html">好书推介</a></li>
            <li><a href="connect.html">开智文章</a></li>
            <li><a href="connect.html">关于我们</a></li>
        </ul>
    </div>
</div>
<!--网站导航 end--> 
<!--web banner start-->
<div class="w-all w-minw banner ps-r">
    <div id="full-screen-slider">
        <ul id="slides">
            <li style="background:url('${pageContext.request.contextPath}front/videopic/banner1.jpg') 325px top no-repeat;"><a href="javascript:void(0)"></a></li>
            <li style="background:url('${pageContext.request.contextPath}/front/videopic/banner.jpg') 325px top no-repeat;"><a href="javascript:void(0)"></a></li>
            <li style="background:url('${pageContext.request.contextPath}/front/videopic/banner3.jpg') 325px top no-repeat;"><a href="javascript:void(0)"></a></li>
        </ul>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/front/js/banner.index.js"></script>
<!--web banner end--> 
<!--web home main-body start-->
<div class="w-all w-minw bg-c-fcfcfc ovhidden"> 

    <div class="w-main m-auto">
        <div class="w-main fl hg-40"></div>
        <div class="w-main fl hg-1 bg-c-e5e5e5"></div>
        <div class="w-main fl hg-8"></div>
    </div>
    <!--分割线 start--> 
    <!--精品视频 start-->
    <div class="w-main m-auto"> 
        <!--title start-->
        <div class="w-main m-t-15 ovhidden fl">
            <h3 class="fl fs-20 ft-w-b line-h50"><span class="dsblock ql_icon ql_h_class tx-ind m-r-15 fl">精品视频</span>精品视频</h3>
            <%--<a href="课程列表页面.html" class="fr fs-14 ftc-000000 line-h50">查看更多></a>--%> </div>
        <!--title end--> 
    </div>
    <div class="w-main m-auto">
        <ul class="home_calss w-1224 ovhidden">
                <c:forEach items="${videos}" var="item">
                    <li class="w-280 m-l-13 m-r-13 bg-c-ffffff m-t-8 m-b-23 fl">
                        <a href="${pageContext.request.contextPath}/getCourseDetail/${item.tCid}" class="dsblock w-260 hg-140 ovhidden ">
                            <img src="${pageContext.request.contextPath}/front/videopic/${item.tCimage}" alt=""/>
                            <div class="course-label">
                                <label>${item.tCourseType}</label>
                            </div>
                        </a>
                        <div class="w-255 p-l-10 p-r-15 fl">
                            <div class="home_calsstxt w-200 fl">
                                <h3 class="w-all fs-16 ftc-000000 line-h32  one_hidden  m-t-6 fl">${item.tCname}</h3>
                                <span class="dsblock w-all fs-14 ftc-ff0000 line-h32 fl">¥${item.tPrice}</span> </div>
                        </div>
                    </li>
                </c:forEach>
            <div class="clear"></div>
        </ul>
    </div>
    <%--笔记分享--%>

  <%--  <div class="w-main m-auto">
        <!--title start-->
        <div class="w-main m-t-15 ovhidden fl">
            <h3 class="fl fs-20 ft-w-b line-h50"><span class="dsblock ql_icon login_icon tx-ind m-r-15 fl">笔记分享</span>笔记分享</h3>
         </div>
    </div>

    <div class="w-main m-auto">
        <ul class="home_calss w-1224 ovhidden">
            <li class="w-280  m-l-13 m-r-13 bg-c-ffffff m-t-8 m-b-23 fl"><a class="dsblock w-280 hg-200 ovhidden ps-r"><img src="${pageContext.request.contextPath}/front/bookcovers/my.png" alt="C#本质论"/></a>
                <div class="w-255 p-l-10 p-r-15 fl">
                    <div class="home_calsstxt w-155 fl">
                       &lt;%&ndash; <h3 class="w-all fs-16 ftc-000000 line-h32  one_hidden  m-t-6 fl">C#本质论</h3>&ndash;%&gt;
                        <span class="dsblock w-all fs-14 ftc-ff0000 line-h32 fl">C#本质论</span> </div>
                </div>
            </li>
            <div class="clear"></div>
        </ul>
    </div>--%>

    <%--好书推介--%>

    <div class="w-main m-auto">
        <!--title start-->
        <div class="w-main m-t-15 ovhidden fl">
            <h3 class="fl fs-20 ft-w-b line-h50"><span class="dsblock ql_icon ql_like tx-ind m-r-15 fl">好书推介</span>好书推介</h3>
        </div>
    </div>
    <div class="w-main m-auto">
        <ul class="home_calss2 w-1224 ovhidden">
            <li class="w-280  m-l-13 m-r-13 bg-c-ffffff m-t-8 m-b-23 fl" style="border-radius:25px;cursor: pointer;"><a class="dsblock w-280 hg-338 ovhidden ps-r"><img src="${pageContext.request.contextPath}/front/bookcovers/http.png" alt="Http权威指南"/></a>
                <div class="w-255 p-l-10 p-r-15 fl">
                    <div class="home_calsstxt w-200 fl">
                        <%-- <h3 class="w-all fs-16 ftc-000000 line-h32  one_hidden  m-t-6 fl">C#本质论</h3>--%>
                        <span class="dsblock w-all fs-14 ftc-ff0000 line-h32 fl">Http权威指南</span> </div>
                </div>
            </li>
            <li class="w-280  m-l-13 m-r-13 bg-c-ffffff m-t-8 m-b-23 fl" style="border-radius:25px;cursor: pointer;"><a class="dsblock w-280 hg-338 ovhidden ps-r"><img src="${pageContext.request.contextPath}/front/bookcovers/javaweb.png" alt="深入分析JavaWeb技术内幕"/></a>
                <div class="w-255 p-l-10 p-r-15 fl">
                    <div class="home_calsstxt w-200 fl">
                        <%-- <h3 class="w-all fs-16 ftc-000000 line-h32  one_hidden  m-t-6 fl">C#本质论</h3>--%>
                        <span class="dsblock w-all fs-14 ftc-ff0000 line-h32 fl">深入分析JavaWeb技术内幕</span> </div>
                </div>
            </li>
            <li class="w-280  m-l-13 m-r-13 bg-c-ffffff m-t-8 m-b-23 fl" style="border-radius:25px;cursor: pointer;"><a class="dsblock w-280 hg-338 ovhidden ps-r"><img src="${pageContext.request.contextPath}/front/bookcovers/Oracle.png" alt="Oracle DBA工作笔记"/></a>
                <div class="w-255 p-l-10 p-r-15 fl">
                    <div class="home_calsstxt w-200 fl">
                        <%-- <h3 class="w-all fs-16 ftc-000000 line-h32  one_hidden  m-t-6 fl">C#本质论</h3>--%>
                        <span class="dsblock w-all fs-14 ftc-ff0000 line-h32 fl">Oracle DBA工作笔记</span> </div>
                </div>
            </li>
            <li class="w-280  m-l-13 m-r-13 bg-c-ffffff m-t-8 m-b-23 fl" style="border-radius:25px;cursor: pointer;"><a class="dsblock w-280 hg-338 ovhidden ps-r"><img src="${pageContext.request.contextPath}/front/bookcovers/springboot.png" alt="SpringBoot实战"/></a>
                <div class="w-255 p-l-10 p-r-15 fl">
                    <div class="home_calsstxt w-200 fl">
                        <%-- <h3 class="w-all fs-16 ftc-000000 line-h32  one_hidden  m-t-6 fl">C#本质论</h3>--%>
                        <span class="dsblock w-all fs-14 ftc-ff0000 line-h32 fl">SpringBoot实战</span> </div>
                </div>
            </li>
            <div class="clear"></div>
        </ul>
    </div>
</div>
<!--web home main-body end--> 

<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>