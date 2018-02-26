
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.4.1/themes/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.4.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.4.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        $(function () {
            /*$.messager.alert('My Title','Here is a question message!','question');*/
            $('#tt').datagrid({
                title:'用户列表',
                iconCls:'icon-save',
                width:800,
                height:450,
                //frozen：冻结
                frozenColumns:[[
                    {field:'ck',checkbox:true},
                    {title:'用户编号',field:'uid',width:80,sortable:true}
                ]],
                url:'${pageContext.request.contextPath}/UserInfoNewServlet',
                columns:[[
                    {field:'uname',title:'用户名称',width:100},
                    {field:'ustatus',title:'状态',width:100,align:'right'}
                ]],
                pagination:true,
                rownumbers:true,
                toolbar:[{
                    text:'添加',
                    iconCls:'icon-lock',
                    handler:function(){
                        alert('add')
                    }
                },{
                    text:'剪切',
                    iconCls:'icon-cut',
                    disabled:true,
                    handler:function(){
                        alert('cut')
                    }
                },'-',{
                    text:'保存',
                    iconCls:'icon-save',
                    handler:function(){
                        alert('save')
                    }
                }]
            });
        });

    </script>
</head>
<body>
<table id="tt"></table>
<%--<table class="easyui-datagrid" title="用户列表" style="width:700px;height:250px"
       data-options="singleSelect:true,collapsible:true,url:'${pageContext.request.contextPath}/UserInfoNewServlet',method:'get'">
    <thead>
    <tr>
        <th data-options="field:'uid',width:80">用户编号</th>
        <th data-options="field:'uname',width:100">用户名称</th>
        <th data-options="field:'ustatus',width:60,align:'center'">状态</th>
        <th data-options="field:'attr1',width:250">操作</th>

    </tr>
    </thead>
</table>--%>
<%--<input class="easyui-datebox" label="Start Date:" labelPosition="top" style="width:100%;">--%>
</body>
</html>
