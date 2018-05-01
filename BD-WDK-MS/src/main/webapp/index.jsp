<%@page isELIgnored="false" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/themes/icon.css">
<%--引入jquery--%>
<script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/locale/easyui-lang-zh_TW.js"></script>
<script type="text/javascript">
    $(function () {
        $.messager.alert('提示','消息文本!','question');
        $("#box").css("background","pink");
    });
    function del() {
        alert('del');
    }
</script>

<body>
<h2>SSM必胜!</h2>
<a href="javascript:void(0)">热点文字</a>
<a href="javascript:del()">有本事，你删除我照片！！！</a>
<div id="box">我是box</div>
<%--<video src="192.168.8.88:8989/01struts整合Spring.avi" controls="controls">
    您的浏览器不支持 video 标签。
</video>--%>

<video controls width="500px" height="500px">
    <source src="http://192.168.8.88:9090/01数据字典和学员考勤.mp4" type="video/mp4" />
    你的浏览器不支持video元素
</video>


</body>
</html>
