<%@page isELIgnored="false" language="java" pageEncoding="utf-8" %>
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
</body>
</html>
