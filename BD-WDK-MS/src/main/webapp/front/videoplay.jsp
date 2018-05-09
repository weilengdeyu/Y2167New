<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>视频播放页面_老原教育</title>
<meta name="keywords" content="老原教育">
<meta name="description" content="老原教育">
<meta name="author" content="www.cnblos.com/weilengdeyu">
<link rel="stylesheet" href="${pageContext.request.contextPath}/front/css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/front/css/index.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/front/bs/css/bootstrap.css">
    <link href="${pageContext.request.contextPath}/background/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/front/bs/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/front/bs/js/holder.min.js"></script>
    <link href="${pageContext.request.contextPath}/background/layui/css/layui.css" rel="stylesheet" type="text/css" />
<body>
<video controls width="500px" height="500px">
    <source src="http://192.168.8.88:9090/01数据字典和学员考勤.mp4" type="video/mp4" />
    你的浏览器不支持video元素
</video>
</body>
</html>