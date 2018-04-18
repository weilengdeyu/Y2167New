<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page pageEncoding="utf-8" language="java" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/background/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/background/js/jquery.js"></script>

</head>


<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    </ul>
    </div>
    
    <div class="mainindex">
    
    
    <div class="welinfo">
    <span><img src="${pageContext.request.contextPath}/background/images/sun.png" alt="天气" /></span>
    <b>【${userInfo.uname}】早上好，欢迎使用信息管理系统</b>
    <a href="#">帐号设置</a>
    </div>
    
    <div class="welinfo">
    <span><img src="${pageContext.request.contextPath}/background/images/time.png" alt="时间" /></span>
    <i>您上次登录的时间：<fmt:formatDate value="${userInfo.userLastLogin}" pattern="yyyy-MM-dd hh:mm:ss"></fmt:formatDate></i> （不是您登录的？<a href="#">请点这里</a>）
    </div>
    
    <div class="xline"></div>
    
    <ul class="iconlist">
    
    <li><img src="${pageContext.request.contextPath}/background/images/ico01.png" /><p><a href="#">管理设置</a></p></li>
    <li><img src="${pageContext.request.contextPath}/background/images/ico02.png" /><p><a href="#">发布文章</a></p></li>
    <li><img src="${pageContext.request.contextPath}/background/images/ico03.png" /><p><a href="#">数据统计</a></p></li>
    <li><img src="${pageContext.request.contextPath}/background/images/ico04.png" /><p><a href="#">文件上传</a></p></li>
    <li><img src="${pageContext.request.contextPath}/background/images/ico05.png" /><p><a href="#">目录管理</a></p></li>
    <li><img src="${pageContext.request.contextPath}/background/images/ico06.png" /><p><a href="#">查询</a></p></li>
            
    </ul>
    
    <div class="ibox"><a class="ibtn"><img src="${pageContext.request.contextPath}/background/images/iadd.png" />添加新的快捷功能</a></div>
    
    <div class="xline"></div>
    <div class="box"></div>
    
    <div class="welinfo">
    <span><img src="${pageContext.request.contextPath}/background/images/dp.png" alt="提醒" /></span>
    <b>信息管理系统使用指南</b>
    </div>
    
    <ul class="infolist">
    <li><span>您可以快速进行文章发布管理操作</span><a class="ibtn">发布或管理文章</a></li>
    <li><span>您可以快速发布产品</span><a class="ibtn">发布或管理产品</a></li>
    <li><span>您可以进行密码修改、账户设置等操作</span><a class="ibtn">账户管理</a></li>
    </ul>
    
    <div class="xline"></div>
    
    <div class="info"><b>查看网站使用指南，您可以了解到多种风格的B/S后台管理界面,软件界面设计，图标设计，手机界面等相关信息</b>(More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>)</div>
    
    <ul class="umlist">
    <li><a href="#">如何发布文章</a></li>
    <li><a href="#">如何访问网站</a></li>
    <li><a href="#">如何管理广告</a></li>
    <li><a href="#">后台用户设置(权限)</a></li>
    <li><a href="#">系统设置</a></li>
    </ul>
    </div>
</body>
</html>