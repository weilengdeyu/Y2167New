<%@ page pageEncoding="utf-8" language="java" %>
<html>
<head>
    <title>Condition</title>
</head>
<body>

<h2>Hello Vue!</h2>

<div id="app-3">
    <p v-if="seen">现在你看到我了</p>
</div>

<script src="https://cdn.jsdelivr.net/npm/vue"></script>
<script type="text/javascript">
    var app3 = new Vue({
        el: '#app-3',
        data: {
            seen: true
        }
    })

</script>
</body>
</html>
