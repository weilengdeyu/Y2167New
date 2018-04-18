<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="utf-8" language="java" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/themes/icon.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/background/pagenation/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
    <link href="${pageContext.request.contextPath}/background/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/pagenation/jquery.pagination.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btnSearch").click(function () {
                getData(0);
            });
        })
        function getData(index) {
            //发送一个Ajax请求
            $.ajax({
                url:"${pageContext.request.contextPath}/getPagedUsersJson",
                type:"POST",
                //加多了入参
                data:{"pageIndex":index,"pageSize":2,"uname":$("[name=uname]").val()},
                success:function (data) {
                    //data是不是就是用jquery数据形态体现 PageUtil中的信息
                    $("#userList").html('');
                    $.each(data.list,function (i,dom) {
                        //每个dom就是一个用户对象
                        var userInfo="<tr><td>"+dom.uid+"</td><td>"+dom.uname+"</td></tr>";
                        $("#userList").append(userInfo);
                    });
                    //渲染分页
                    if(data.totalRecords>0){
                        $('#pagination').pagination(data.totalRecords, {
                            current_page : index, //当前页码，但是从0开始
                            items_per_page : data.pageSize, //每页显示的记录数
                            num_display_entries :1,
                            num_edge_entries: 1,
                            ellipse_text:'...',
                            callback :getData, //回调函数 ，指的是不会立刻执行，在特定的时机执行
                            load_first_page : true,
                            prev_text : '上一页',
                            next_text : '下一页'
                        });
                    }else{
                        $("#userList").html('大爷，没有检索到您到记录啊！！！');
                    }


                    //总页数
                    $("#totalRecords").html(data.totalRecords);
                }
            });
        }


        $(document).ready(function(){

            getData(0);

            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

        });
    </script>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">数据表</a></li>
        <li><a href="#">基本内容</a></li>
    </ul>
</div>

<div class="rightinfo">
    <div class="tools">
        <ul class="toolbar">
            <li >用户名：<input type="text" style="margin-top: 2px;display: inline-block" name="uname"/></li><li id="btnSearch"><span ><img src="${pageContext.request.contextPath}/background/images/t05.png"/></span>查询</li>
            <li class="click"><span><img src="${pageContext.request.contextPath}/background/images/t01.png" /></span>添加</li>
            <li class="click"><span><img src="${pageContext.request.contextPath}/background/images/t02.png" /></span>修改</li>
            <li><span><img src="${pageContext.request.contextPath}/background/images/t03.png" /></span>删除</li>
            <li><span><img src="${pageContext.request.contextPath}/background/images/t04.png" /></span>统计</li>
        </ul>
        <%-- <ul class="toolbar1">
         <li><span><img src="${pageContext.request.contextPath}/background/images/t05.png" /></span>设置</li>
         </ul>--%>

    </div>


    <table class="tablelist">
        <thead>
        <tr>
            <th><input name="" type="checkbox" value="" checked="checked"/></th>
            <th>用户编号<i class="sort"><img src="${pageContext.request.contextPath}/background/images/px.gif" /></i></th>
            <th>用户名称</th>
            <th>用户昵称</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="userList">
        <%--  <c:forEach items="${list}" var="item">
              <tr>
                  <td><input name="" type="checkbox" value="" /></td>
                  <td>${item.uid}</td>
                  <td>${item.uname}</td>
                  <td>${item.unickname}</td>
                  <td><a href="#" class="tablelink">查看</a>     <a href="#" class="tablelink"> 删除</a></td>
              </tr>
          </c:forEach>--%>
        </tbody>
    </table>


    <div class="pagin">
        <div class="message">共<i class="blue" id="totalRecords"></i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <div class="pagination" id="pagination" style="margin:4px 0 0 0"></div>
    </div>


    <div class="tip">
        <div class="tiptop"><span>提示信息</span><a></a></div>

        <div class="tipinfo">
            <span><img src="images/ticon.png" /></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>

        <div class="tipbtn">
            <input name="" type="button"  class="sure" value="确定" />&nbsp;
            <input name="" type="button"  class="cancel" value="取消" />
        </div>

    </div>
</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>
</body>
</html>
