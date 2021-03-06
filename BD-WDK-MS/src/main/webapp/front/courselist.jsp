<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>课程列表页面_齐峰教育</title>
<meta name="keywords" content="老原教育">
<meta name="description" content="老原教育">
<meta name="author" content="www.cnblogs.com/weilengdeyu/">
<link rel="stylesheet" href="${pageContext.request.contextPath}/front/css/base.css">
<!--齐峰的共有样式-->
<script type="text/javascript" src="${pageContext.request.contextPath}/front/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/front/js/qlclass.pl.js"></script>
<body>
<!--web-top start-->
<div class="w-all w-minw bd-sd-b hg-45">
    <div class="w-main m-auto"> 
        <!-- top left start-->
        <div class="fl"> <span class="fs-12 line-h45 ftc-000000 dsblock fl"> 济南</span> <a href="城市.html" class="dsblock fl line-h45 fs-12 ftc-fc0503">[切换地图]</a> <a href="index.html" class="dsblock fl fs-12 ftc-000000 line-h45 m-l-70">首页</a> 
            <!--top 导航 start-->
            <div class="hover-topnav fl m-l-45">
                <div class="dh_nav fl fs-12 ftc-000000 line-h45"><span class="dsblock hg-45"><i class="p-l-15 ql_icon dh_topnav hg-45 fl"></i>导航</span>
                     <ul class="dh_nav_sub bg-c-ffffff bd-sd-b">
                        <li> <a href="课程列表页面.html"><i class="ql_icon"></i>小学</a> </li>
                        <li> <a href="课程列表页面.html"><i class="ql_icon"></i>初中</a> </li>
                        <li> <a href="课程列表页面.html"><i class="ql_icon"></i>高中</a> </li>
                        <li> <a href="课程列表页面.html"><i class="ql_icon"></i>心理课</a> </li>
                        <li> <a href="讲师.html"><i class="ql_icon"></i>讲师</a> </li>
                        <li> <a href="招商单页.html"><i class="ql_icon"></i>加盟</a> </li>
                        <li> <a href="分校列表.html"><i class="ql_icon"></i>分校</a> </li>
                        <li> <a href="资讯列表.html"><i class="ql_icon"></i>资讯</a> </li>
                        <li> <a href="联系我们.html"><i class="ql_icon"></i>联系我们</a> </li>
                        <div class="clear"></div>
                    </ul>
                </div>
            </div>
            <!--top 导航 end--> 
            <!--top wap start-->
            <div class="hover-topnav fl m-l-45">
                <div class="dh_nav fl fs-12 ftc-000000 line-h45"><span class="dsblock hg-45"><i class="p-l-15 ql_icon top_wapewem hg-45 fl"></i>手机端</span>
                    <div class="top_wap_ewem bg-c-ffffff bd-sd-b"> <img src="pics/wap.png" width="100" alt=""/>
                        <p class="w-all fs-13 text-c line-h25">扫描二维码</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- top left end--> 
        <!-- top right start-->
        <div class="fr"> 
            <!--登录注册 start-->
            <div class="fl"> <a class="fs-12 ftc-000000 line-h45" href="#"><i class="p-l-20 ql_icon login_icon hg-45 fl m-r-10"></i>请登录</a> <span class="fs-12 ftc-000000 line-h45 m-l-15 m-r-15">|</span> <a class="fs-12 ftc-000000 line-h45" href="#">注册</a> </div>
            <!--登录注册 end--> 
            <!--我的购物车 start-->
            <div class="fl m-l-30" id="hd-my-cart">
                <div class="my-cart"> <i class="p-l-25 ql_icon cart_icon hg-45 fl m-r-10"><em>0</em></i>
                    <p class="fl fs-12 ftc-000000 line-h45">我的购物车</p>
                </div>
            </div>
            <!--我的购物车 end--> 
            <!--top 客服中心 start-->
            <div class="hover-topkf fl m-l-45">
                <div class="top_kf fl fs-12 ftc-000000 line-h45"><span class="dsblock hg-45">客服中心<i class="p-l-10 m-l-10 ql_icon top_kficon hg-45 fr"></i></span>
                    <ul class="top_kf_list bg-c-ffffff bd-sd-b">
                        <li> <a href="#"><i class="ql_icon"></i>加盟热线  ：400-996-9910</a> </li>
                        <li> <a href="#"><i class="ql_icon"></i>联系电话：0531-81768062</a> </li>
                        <li> <a href="#"><i class="ql_icon"></i>邮箱：qifengedu@yeah.net</a> </li>
                        <div class="clear"></div>
                    </ul>
                </div>
            </div>
            <!--top 客服中心 start--> 
        </div>
        <!-- top right end--> 
    </div>
</div>
<!--web-top end-->
<div class="clear"></div>
<!--web logo and search start-->
<div class="w-main m-auto m-t-37 m-b-25 ovhidden"> 
    <!--web logo start--> 
    <a href="index.html" class="logo fl"><img src="pics/ql_logo.gif" width="240" height="70" alt="齐峰教育logo(图)"/></a> 
    <!--web logo end--> 
    <!--web search start-->
    <div class="search w-540 m-l-115 m-t-15 fl">
        <form action="#" method="get" id="searchform" name="searchform" onSubmit="return checkSearchForm()" class="w-540 search-form">
            <input class="p-l-15 bd-2s-e9511b w-435 line-h35 hg-35 fs-12 ftc-a9a9a9 fl" type="text" name="keywords" id="keyword" value="搜索：初中物理" onfocus="if(this.value == '搜索：初中物理')this.value = ''" onblur="if(this.value == '')this.value='搜索：初中物理'" autocomplete="off">
            <input type="hidden" value="k1" name="dataBi">
            <button type="submit" class="w-85 line-h39 hg-39 fs-16 ftc-ffffff bg-c-e9511b fl">提交</button>
        </form>
        <div class="w-540 fl" id="hotkeywords"> <a href="#" class="dsblock fs-12 ftc-8b8b8b line-h30 fl m-r-20">一年级</a> <a href="#" class="dsblock fs-12 ftc-8b8b8b line-h30 fl m-r-20">二年级</a> <a href="#" class="dsblock fs-12 ftc-8b8b8b line-h30 fl m-r-20">三年级</a> <a href="#" class="dsblock fs-12 ftc-8b8b8b line-h30 fl m-r-20">语文</a> <a href="#" class="dsblock fs-12 ftc-8b8b8b line-h30 fl m-r-20">数学</a>
            <div class="clear"></div>
        </div>
    </div>
    <!--web search end-->
    <div class="fr"> <img src="${pageContext.request.contextPath}/front/pics/top_tel.gif" width="199" height="70" alt="齐峰教育400电话"/> </div>
</div>
<!--web logo and search end--> 
<!--网站导航 start-->
<div class="w-all w-minw hg-60 bd-bs-e9511b bg-c-ffffff ql_webnav"> 
    <!--网站导航 start-->
    <div class="w-main m-auto ps-r hg-60"> 
        <!--全部商品分类-->
        <div class="hc_lnav jslist">
            <div class="allbtn">
                <h2><a href="#">全部商品分类</a></h2>
                <ul style="width:250px" class="jspop box">
                    <!--导航-->
                    <li class="a1">
                        <div class="tx"><a href="#">小学</a> </div>
                        <dl>
                            <dd> <a href="#">一年级</a><span>/</span> <a href="#">二年级</a><span>/</span> <a href="#">三年级</a> <a href="#">四年级</a><span>/</span> <a href="#">五年级</a><span>/</span> <a href="#">六年级</a> <a href="#">特色课程</a> </dd>
                        </dl>
                        <div class="pop">
                            <dl>
                                <dt><a href="#">一年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">二年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a><span>|</span> <a class="ui-link" href="#">物理</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">三年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a><span>|</span> <a class="ui-link" href="#">物理</a><span>|</span> <a class="ui-link" href="#">化学</a><span>|</span> <a class="ui-link" href="#">全日制托管</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">特色课程 ></a></dt>
                                <dd> <a class="ui-link" href="#">双师课堂</a><span>|</span> <a class="ui-link" href="#">名师精讲班</a><span>|</span> <a class="ui-link" href="#">学霸进阶精英班</a> </dd>
                            </dl>
                            <div class="clr"></div>
                        </div>
                    </li>
                    <!--导航--> 
                    <!--导航-->
                    <li class="a1">
                        <div class="tx"><a href="#">小学</a> </div>
                        <dl>
                            <dd> <a href="#">一年级</a><span>/</span> <a href="#">二年级</a><span>/</span> <a href="#">三年级</a> <a href="#">四年级</a><span>/</span> <a href="#">五年级</a><span>/</span> <a href="#">六年级</a> <a href="#">特色课程</a> </dd>
                        </dl>
                        <div class="pop">
                            <dl>
                                <dt><a href="#">一年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">二年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a><span>|</span> <a class="ui-link" href="#">物理</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">三年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a><span>|</span> <a class="ui-link" href="#">物理</a><span>|</span> <a class="ui-link" href="#">化学</a><span>|</span> <a class="ui-link" href="#">全日制托管</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">特色课程 ></a></dt>
                                <dd> <a class="ui-link" href="#">双师课堂</a><span>|</span> <a class="ui-link" href="#">名师精讲班</a><span>|</span> <a class="ui-link" href="#">学霸进阶精英班</a> </dd>
                            </dl>
                            <div class="clr"></div>
                        </div>
                    </li>
                    <!--导航--> 
                    <!--导航-->
                    <li class="a1">
                        <div class="tx"><a href="#">小学</a> </div>
                        <dl>
                            <dd> <a href="#">一年级</a><span>/</span> <a href="#">二年级</a><span>/</span> <a href="#">三年级</a> <a href="#">四年级</a><span>/</span> <a href="#">五年级</a><span>/</span> <a href="#">六年级</a> <a href="#">特色课程</a> </dd>
                        </dl>
                        <div class="pop">
                            <dl>
                                <dt><a href="#">一年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">二年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a><span>|</span> <a class="ui-link" href="#">物理</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">三年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a><span>|</span> <a class="ui-link" href="#">物理</a><span>|</span> <a class="ui-link" href="#">化学</a><span>|</span> <a class="ui-link" href="#">全日制托管</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">特色课程 ></a></dt>
                                <dd> <a class="ui-link" href="#">双师课堂</a><span>|</span> <a class="ui-link" href="#">名师精讲班</a><span>|</span> <a class="ui-link" href="#">学霸进阶精英班</a> </dd>
                            </dl>
                            <div class="clr"></div>
                        </div>
                    </li>
                    <!--导航--> 
                    <!--导航-->
                    <li class="a1">
                        <div class="tx"><a href="#">小学</a> </div>
                        <dl>
                            <dd> <a href="#">一年级</a><span>/</span> <a href="#">二年级</a><span>/</span> <a href="#">三年级</a> <a href="#">四年级</a><span>/</span> <a href="#">五年级</a><span>/</span> <a href="#">六年级</a> <a href="#">特色课程</a> </dd>
                        </dl>
                        <div class="pop">
                            <dl>
                                <dt><a href="#">一年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">二年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a><span>|</span> <a class="ui-link" href="#">物理</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">三年级 ></a></dt>
                                <dd> <a class="ui-link" href="#">数学</a><span>|</span> <a class="ui-link" href="#">语文</a><span>|</span> <a class="ui-link" href="#">英语</a><span>|</span> <a class="ui-link" href="#">地理</a><span>|</span> <a class="ui-link" href="#">政治</a> <a class="ui-link" href="#">生物</a><span>|</span> <a class="ui-link" href="#">历史</a><span>|</span> <a class="ui-link" href="#">物理</a><span>|</span> <a class="ui-link" href="#">化学</a><span>|</span> <a class="ui-link" href="#">全日制托管</a> </dd>
                            </dl>
                            <dl>
                                <dt><a href="#">特色课程 ></a></dt>
                                <dd> <a class="ui-link" href="#">双师课堂</a><span>|</span> <a class="ui-link" href="#">名师精讲班</a><span>|</span> <a class="ui-link" href="#">学霸进阶精英班</a> </dd>
                            </dl>
                            <div class="clr"></div>
                        </div>
                    </li>
                    <!--导航-->
                </ul>
            </div>
        </div>
        <!--全部商品分类-->
         <ul class="w-950 hg-60 ql_nav">
        <li><a href="index.html" class="cur">首页</a></li>
        <li><a href="课程列表页面.html">小学</a></li>
        <li><a href="双师单页.html">双师课堂</a></li>
        <li><a href="考试日历.html">考试日历</a></li>
        <li><a href="讲师.html">名师</a></li>
        <li><a href="招商单页.html" class="ql_navhot">招商加盟</a></li>
        <li><a href="分校列表.html">分校</a></li>
        <li><a href="资讯列表.html">资讯</a></li>
        <li><a href="联系我们.html">联系我们</a></li>
    </ul>
    </div>
</div>
<!--网站导航 end--> 

<!--web main body start-->
<div class="w-all w-minw bg-c-fcfcfc ovhidden">
    <div class="w-main m-auto"> 
        <!--面包屑 start-->
        <div class="w-main fs-14 ftc-7a7a7a line-h45 m-t-18 m-b-18 fl"> 网站位置：首页  >  小学 </div>
        <!--filter start-->
        <div class="w-1150 p-l-25 p-r-25 bg-c-ffffff fl">
            <div class="w-1150 fl">
                <h3 class="fs-14 ftc-000000 line-h60 fl">全部课程</h3>
            </div>
            
            <!--分割线-->
            <div class="w-all fl hg-1 bg-c-d2d2d2"></div>
            <!--分割线-->
            <div class="w-1150 ql_ftclass">
                <div class="w-all p-t-10 p-b-10 ovhidden">
                    <div class="w-80 fs-14 line-h28 m-t-6 m-b-6 ftc-888888 fl">课程分类</div>
                    <ul class="w-970 fl">
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl class_cur">小学</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">初中</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">高中</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">家庭教育</a></li>
                        <div class="clear"></div>
                    </ul>
                </div>
                
                <!--分割线-->
                <div class="w-all fl hg-1 bg-c-d2d2d2"></div>
                <!--分割线-->
                <div class="w-all p-t-16 p-b-16 ovhidden">
                    <div class="w-80 fs-14 line-h28 m-t-6 m-b-6 ftc-888888 fl">所在年级</div>
                    <ul class="w-970 fl">
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl class_cur">不限</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">一年级</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">二年级</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">三年级</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">四年级</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">五年级</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">六年级</a></li>
                        <div class="clear"></div>
                    </ul>
                </div>
                
                <!--分割线-->
                <div class="w-all fl hg-1 bg-c-d2d2d2"></div>
                <!--分割线-->
                <div class="w-all p-t-16 p-b-16 ovhidden">
                    <div class="w-80 fs-14 line-h28 m-t-6 m-b-6 ftc-888888 fl">学习科目</div>
                    <ul class="w-970 fl">
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl class_cur">不限</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">语文</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">数学</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">英语</a></li>
                        <div class="clear"></div>
                    </ul>
                </div>
                
                <!--分割线-->
                <div class="w-all fl hg-1 bg-c-d2d2d2"></div>
                <!--分割线-->
                <div class="w-all p-t-16 p-b-16 ovhidden">
                    <div class="w-80 fs-14 line-h28 m-t-6 m-b-6 ftc-888888 fl">上课时间</div>
                    <ul class="w-970 fl">
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl class_cur">不限</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">周末</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">非周末</a></li>
                        <div class="clear"></div>
                    </ul>
                </div>
                
                <!--分割线-->
                <div class="w-all fl hg-1 bg-c-d2d2d2"></div>
                <!--分割线-->
                <div class="w-all p-t-16 p-b-16 ovhidden">
                    <div class="w-80 fs-14 line-h28 m-t-6 m-b-6 ftc-888888 fl">授课方式</div>
                    <ul class="w-970 fl">
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl class_cur">不限</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">一对一</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">一对二</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">一对三</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">小班课</a></li>
                        <div class="clear"></div>
                    </ul>
                </div>
                
                <!--分割线-->
                <div class="w-all fl hg-1 bg-c-d2d2d2"></div>
                <!--分割线-->
                <div class="w-all p-t-16 p-b-16 ovhidden">
                    <div class="w-80 fl">
                        <dt class="w-80 fs-14 line-h28 m-t-6 m-b-6 ftc-888888 fl">上课地点</dt>
                    </div>
                    <ul class="w-970 fl">
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl class_cur">不限</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">历下区</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">市中区</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">槐荫区</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">天桥区</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">历城区</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">长清区</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">高新区</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">章丘市</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">平阴县</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">济阳县</a></li>
                        <li class="w-70 m-l-24 fl"><a href="#" class="dsblock w-all fs-14 line-h28 ftc-888888 m-t-6 m-b-6 curpter text-c fl">章丘市</a></li>
                        <div class="clear"></div>
                    </ul>
                </div>
            </div>
        </div>
        <!--filter end--> 
        
        <!--排序 start-->
        <div class="w-1170 bg-c-ffffff p-t-10 p-b-10 p-r-15 p-l-15 fl m-t-30">
            <dl class="ql_sort">
                <dd class="w-60 p-l-10 curpter fs-14 ftc-000000 line-h24 m-l-12 fl">综合排序</dd>
                <dd class="w-60 p-l-10 curpter fs-14 ftc-000000 line-h24 m-l-12 fl">人气</dd>
                <dd class="w-60 p-l-10 curpter fs-14 ftc-000000 line-h24 m-l-12 fl cur">时间</dd>
                <dd class="w-60 p-l-10 curpter fs-14 ftc-000000 line-h24 m-l-12 fl">价格</dd>
                <div class="clear"></div>
            </dl>
        </div>
        <div class="w-main m-auto m-t-25 fl">
            <ul class="home_calss w-1224 ovhidden">
                <c:forEach items="${videoList}" var="item">
                <li class="w-280 m-l-13 m-r-13 bg-c-ffffff m-t-8 m-b-33 fl"> <a href="${pageContext.request.contextPath}/getOneVideo?vid=${item.tVid}" class="dsblock w-280 hg-200 ovhidden ps-r"> <img src="pics/12.jpg" alt=""/> </a>
                    <div class="w-255 p-l-10 p-r-15 p-b-10 fl">
                        <div class="home_calsstxt w-155 fl">
                            <h3 class="w-all fs-16 ftc-000000 line-h32  one_hidden  m-t-6 fl">${item.tVname}</h3>
                            <span class="dsblock w-all fs-20 ftc-ff0000 line-h32 fl">￥：300</span> </div>
                        <a href="课程详情.html" class="dsblock ql_icon hg-34 line-h34 fs-14 ftc-ffffff m-t-22 ql_h_btnfr w-86 text-c fr">马上购买</a> </div>
                </li>
                </c:forEach>
                <div class="clear"></div>
            </ul>
            <div class="w-amin hg-30"></div>
            <!--pages start-->
            <ul class="w-560 hg-36 ql_pages m-auto">
                <li class="fl"><a class="" href="#">&lt;</a></li>
                <li class="fl"><a class="cur" href="#">1</a></li>
                <li class="fl"><a class="" href="#">2</a></li>
                <li class="fl"><a class="" href="#">3</a></li>
                <li class="fl"><a class="" href="#">...</a></li>
                <li class="fl"><a class="" href="#">12</a></li>
                <li class="fl"><a class="" href="#">&gt;</a></li>
            </ul>
            <!--pages end-->
            <div class="w-amin hg-30"></div>
        </div>
        <!--精选课程 end--> 
    </div>
</div>
<!--web main body start--> 
<!--like start-->

<!--like end--> 
<!--web footer start-->
<div class="w-all w-minw bg-c-e3e3e3 p-t-15 ovhidden"> 
    <!--link start-->
    <div class="w-main m-auto">
        <div class="fl w-65 fs-12 ftc-414141 line-h30 ft-w-b">友情链接：</div>
        <div class="fr">
            <ul class="ql_link">
                <li><a href="#">决胜教育网</a></li>
                <li><a href="#">优米网</a></li>
                <li><a href="#">八维教育</a></li>
                <li><a href="#">雅思培训</a></li>
                <li><a href="#">中国夏令营</a></li>
                <li><a href="#">英语口语培训</a></li>
                <li><a href="#">英语培训</a></li>
                <li><a href="#">高考试题库</a></li>
                <li><a href="#">留学监理网</a></li>
                <li><a href="#">上海雅思培训</a></li>
                <li><a href="#">幼儿英语培训</a></li>
                <li><a href="#">广州机构总汇</a></li>
                <li><a href="#">吉林教育信息网</a></li>
                <li><a href="#">少儿英语外教</a></li>
                <li><a href="#">在职研究生</a></li>
                <li><a href="#">一级建造师</a></li>
                <li><a href="#">创客教育</a></li>
                <li><a href="#">百科知识</a></li>
                <li><a href="#">新航道</a></li>
                <li><a href="#">顺顺留学</a></li>
                <li><a href="#">国际学校</a></li>
                <li><a href="#">成人高考</a></li>
                <div class="clear"></div>
            </ul>
        </div>
    </div>
    <!--link end--> 
    <!--分割线 start-->
    <div class="w-main m-auto">
        <div class="w-main fl hg-12"></div>
        <div class="w-main fl hg-1 bg-c-d2d2d2"></div>
        <div class="w-main fl hg-24"></div>
    </div>
    <!--分割线 start-->
    <div class="w-main m-auto m-b-23 ovhidden">
        <div class="m-t-12 fl"> <a href="index.html" class="m-t-25 fl"><img src="${pageContext.request.contextPath}/front/pics/footer_logo.png" width="235" height="70" alt=""/></a>
            <div class="qlfooter_nav m-l-45 fl">
                <dl class="ql_f_nav fl">
                    <dt><a href="#">关于我们</a></dt>
                    <dd><a href="#"><i></i>齐峰介绍</a></dd>
                    <dd><a href="#"><i></i>加盟齐峰</a></dd>
                    <dd><a href="#"><i></i>帮助中心</a></dd>
                    <dd><a href="#"><i></i>招贤纳士</a></dd>
                </dl>
                <dl class="ql_f_nav ql_f_navzp fl">
                    <dt><a href="#">课程分类</a></dt>
                    <dd><a href="#"><i></i>小学阶段</a></dd>
                    <dd><a href="#"><i></i>初中阶段</a></dd>
                    <dd><a href="#"><i></i>高中阶段</a></dd>
                    <dd><a href="#"><i></i>家庭教育</a></dd>
                </dl>
                <div class="ql_f_infp w-200 m-l-15 fl">
                    <h3>联系我们</a></h3>
                    <p><i></i>电话：0531-81768062</p>
                    <p><i></i>邮箱：qifengedu@yeah.net</p>
                </div>
            </div>
        </div>
        <div class="w-244 fr">
            <div class="w-112 m-l-10 fl"> <img src="${pageContext.request.contextPath}/front/pics/f_ewm1.gif" width="112" height="112" alt=""/>
                <p class="w-all fs-12 ftc-000000 text-c line-h25 fl">手机端</p>
            </div>
            <div class="w-112 m-l-10 fl"> <img src="${pageContext.request.contextPath}/front/pics/f_ewm1.gif" width="112" height="112" alt=""/>
                <p class="w-all fs-12 ftc-000000 text-c line-h25 fl">手机端</p>
            </div>
        </div>
    </div>
</div>
<!--web footer copyright start-->
<div class="w-all w-minw bg-c-cccccc p-t-6 p-b-6 ovhidden">
    <div class="w-main m-auto text-c fs-12 ftc-414141 line-24"> Copyright 2010-2017     鲁ICP备88888888号-1（济南齐峰教育咨询有限公司） <br/>
        公司地址：济南市市中区社会组织创新园307（二环南路6086号） </div>
</div>
<!--web footer copyright end--> 
<!--web footer end-->
</body>
</html>