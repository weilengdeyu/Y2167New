<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="utf-8" language="java" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>角色管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/themes/icon.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/background/pagenation/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
    <link href="${pageContext.request.contextPath}/background/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/pagenation/jquery.pagination.js"></script>
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/background/js/jquery.js"></script>--%>

<script type="text/javascript">

    jQuery.noConflict();
    jQuery(function ($) {

        $("#btnSearch").click(function () {
            load(0);
        });

      //加载数据
      load(0);
      function  load(index) {
          $.ajax({
              url:"/selectRole",
              traditional: true,
              type:"post",
              data:{"pageIndex":index,"pageSize":2,"roleName":$("[name=roleName]").val()},
              success:function (data) {
                  //pageUtil
                  //模拟ajax去后端读取页数，获取数据并渲染列表的过程
                  $('#list-content').html('');
                  $.each(data.list,function (i,dom) {
                      $('#list-content').
                      append('<tr><td>1</td><td>' + dom.roleName + '</td><td>操作</td></tr>');
                  });
                  //渲染分页
                  if(data.totalPages>0){
                      $('#pagination').pagination(data.totalRecords, {
                          current_page :index, //当前页索引
                          items_per_page : data.pageSize, //每页记录数
                          num_display_entries :3, //显示页码块数量
                          callback :load,
                          ellipse_text:"...",
                          num_edge_entries:2,
                          load_first_page : true,
                          prev_text : '上一页',
                          next_text : '下一页'
                      });
                  }else{
                      $('#pagination').html("<span style='color:red;font-size: 18px'>没有检索到结果~~~~~！！！！！！</span>");
                  }

              }
          });
      }
    });

    //读懂：工具来用
    function change(data){
        if(!data.length){
            data.text=data.name;
            if(data.children){
                change(data.children);
            }
        }else{
            $.each(data,function (i,v){
                change(v);
            });
        }
    }
    function openListActionDialog(){
        //获取到选择的角色编号
        alert(roleId);
        $("#dlg3").dialog("open").dialog("setTitle","分配权限");
        $("#tt").tree({
            //请求的后台地址
            url: '${pageContext.request.contextPath}/getAllMenusJson?rid='+roleId,
            checkbox:true,
            animate:true,
            cascadeCheck:false,
            loadFilter ://过滤数据
                function(data) { //data;从Server端响应回来的数据
                    change(data);
                    //图标的设定
                    $.each(data,function (i,v){
                        v.iconCls="icon-folder";
                    });
                    return data;
                }
           /* onLoadSuccess:function () {
                $.ajax({
                    url:"getPrivilegeByRoleid",
                    type:"POST",
                    data:{rid:roleId},
                    success:function (data) {
                        $.each(data,function (i,dom) { //用户拥有的一个权限对象
                            //dom就是一个权限对象
                            //通过find方法寻址数上应该被勾选的节点对象，然后将其选中
                            var checkedNode = $('#tt').tree('find', dom.id);
                            $('#tt').tree('check', checkedNode.target);
                        });
                    }
                });
            }*/

        });
    }
    var  roleId;
    $(document).ready(function(){

        $(".roleList td a").click(function () {
            roleId=$(this).parent().prev().prev().html();

        });

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
    function getChecked()
    {
        var arr = [];
        var checkeds=$('#tt').tree('getChecked','checked');
        for (var i=0;checkeds.length>i;i++) {
            arr.push(checkeds[i].id);
        }
        $.ajax({
            traditional: true,
            url:"${pageContext.request.contextPath}/updaterole_privilege",
            type:"post",
            data:{"strridquan":roleId,"checkedprivilegeid":arr},
            success:function (data) {
                window.location.href='${pageContext.request.contextPath}/roleList'
            }
        })
    }
</script>


</head>


<body>
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">权限相关</a></li>
    <li><a href="#">角色管理</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    <div class="tools">
    	<ul class="toolbar">
            <li> 角色名称： <input style="margin-top: 2px;display: inline-block" type="text" name="roleName"></li><li id="btnSearch"><span><img src="${pageContext.request.contextPath}/background/images/t05.png"/></span>查询</li>
            <li class="click"><span><img src="${pageContext.request.contextPath}/background/images/t01.png" /></span>添加</li>
            <li class="click"><span><img src="${pageContext.request.contextPath}/background/images/t02.png" /></span>修改</li>
            <li><span><img src="${pageContext.request.contextPath}/background/images/t03.png" /></span>删除</li>
            <li><span><img src="${pageContext.request.contextPath}/background/images/t04.png" /></span>统计</li>
        </ul>
        
        
        <ul class="toolbar1">
        <li><span><img src="${pageContext.request.contextPath}/background/images/t05.png" /></span>设置</li>
        </ul>
    
    </div>
    
    <%--按照角色名称搜索--%>

    <table class="tablelist">
    	<thead>
            <tr>
                <th><input name="" type="checkbox" value="" checked="checked"/></th>
                <th>角色编号<i class="sort"><img src="${pageContext.request.contextPath}/background/images/px.gif" /></i></th>
                <th>角色名称</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody id="list-content"></tbody>
       <%-- <tbody>
            <c:forEach items="${roleList}" var="item">
                <tr class="roleList">
                    <td><input name="" type="checkbox" value="" /></td>
                    <td>${item.rid}</td>
                    <td>${item.roleName}</td>
                    <td><a href="javascript:openListActionDialog()" id="${item.rid}" class="tablelink">分配权限</a>     <a href="#" class="tablelink"> 删除</a></td>
                </tr>
            </c:forEach>
        </tbody>--%>
    </table>
    
   
    <div class="pagin">
    	<div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <div class="pagination" id="pagination" style="margin:4px 0 0 0"></div>
      <%--  <ul class="paginList">
        <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
        <li class="paginItem"><a href="javascript:;">1</a></li>
        <li class="paginItem current"><a href="javascript:;">2</a></li>
        <li class="paginItem"><a href="javascript:;">3</a></li>
        <li class="paginItem"><a href="javascript:;">4</a></li>
        <li class="paginItem"><a href="javascript:;">5</a></li>
        <li class="paginItem more"><a href="javascript:;">...</a></li>
        <li class="paginItem"><a href="javascript:;">10</a></li>
        <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>--%>
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
    <%--弹层Dialog 模式窗口--%>
    <div id="dlg3" class="easyui-dialog" style="width: 350px;height: 500px;padding: 10px 20px" closed="true" >
        分配权限：
        <ul id="tt"></ul>
        <a href="#" class="easyui-linkbutton" onclick="getChecked()">保存权限</a>
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>
</html>
