<html>
<body>

<h2>Hello Vue!</h2>

<div id="app">
    {{ message }}
</div>
<script src="https://cdn.jsdelivr.net/npm/vue"></script>
<script type="text/javascript">

    var app = new Vue({
        el: '#app',
        data: {
            message: 'Hello Vue!'
        }
    })

</script>
</body>
</html>
