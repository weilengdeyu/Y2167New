﻿<%@page pageEncoding="utf-8" language="java" isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录后台管理系统</title>
<link href="${pageContext.request.contextPath}/background/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="${pageContext.request.contextPath}/background/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/background/js/cloud.js" type="text/javascript"></script>

<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  
});  
</script> 

</head>

<body style="background-color:#1c77ac; background-image:url(${pageContext.request.contextPath}/background/images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎登录五道口平台后台管理</span>
    <ul>
    <li><a href="#">回首页</a></li>
    <li><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    </ul>    
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    
    <form action="${pageContext.request.contextPath}/login" method="post">
        <ul>
            <li><input name="uid" type="text" class="loginuser" value="1"/></li>
            <li><input name="upwd" type="text" class="loginpwd" value="1"/></li>
            <li><input type="submit" class="loginbtn" value="登录"  /><label>
                <input name="" type="checkbox" value="" checked="checked" />记住密码</label><label><a href="#">忘记密码？</a></label></li>
        </ul>
    </form>
    
    
    </div>
    
    </div>
    
    
    
    <div class="loginbm">版权所有  微冷的雨  2018</div>
</body>
</html>
