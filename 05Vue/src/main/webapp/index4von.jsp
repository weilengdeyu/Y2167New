<%@ page pageEncoding="utf-8" language="java" %>
<html>
<head>
    <title>v-for</title>
</head>
<body>

<h2>Hello Vue!</h2>

<div id="app-4">
    <ol>
        <li v-for="todo in todos">
            {{ todo.text }}
        </li>
    </ol>
</div>

<script src="https://cdn.jsdelivr.net/npm/vue"></script>
<script type="text/javascript">
    var app4 = new Vue({
        el: '#app-4',
        data: {
            todos: [
                { text: '学习 JavaScript' },
                { text: '学习 Vue' },
                { text: '整个牛项目' }
            ]
        }
    })
</script>
</body>
</html>
