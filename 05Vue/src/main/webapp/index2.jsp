<%@ page pageEncoding="utf-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Hello Vue!</h2>

<div id="app-2">
  <span v-bind:title="message">
    鼠标悬停几秒钟查看此处动态绑定的提示信息！
  </span>
</div>
<script src="https://cdn.jsdelivr.net/npm/vue"></script>
<script type="text/javascript">

    var app2 = new Vue({
        el: '#app-2',
        data: {
            message: '页面加载于 ' + new Date().toLocaleString()
        }
    })

</script>
</body>
</html>
