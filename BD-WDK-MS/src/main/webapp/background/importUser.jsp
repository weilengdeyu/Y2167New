<%@page pageEncoding="utf-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>五道口平台</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/themes/icon.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/background/pagenation/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
    <link href="${pageContext.request.contextPath}/background/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/background/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <%--traditional: true,<%--这个设置为true，data:{"steps":["qwe","asd","zxc"]}会转换成steps=qwe&steps=asd&...--%>
    <script type="text/javascript">
        $(function () {
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
        })
    </script>
</head>


<body>

  <%--  <form style="display:none;" action="posAction_importFile" method="post" enctype="multipart/form-data">
 <input type="file" name="file"/>
            <input type="submit" value="上传"/>
    </form>--%>
    <div class="rightinfo">
        <div class="tools">
                <button class="layui-btn layui-btn-radius click">导入学员信息</button>
        </div>
    </div>



  <div class="tip">
      <div class="tiptop"><span>导入学员档案</span><a></a></div>

      <div class="layui-container" style="">
          <div class="layui-row" style="margin-left: 150px;margin-top:50px;">
              <button type="button" class="layui-btn" id="upload">
                  <i class="layui-icon">&#xe67c;</i>选择文件</button>
          </div>
      </div>

      <%--  <div class="tipinfo">

         <form  action="${pageContext.request.contextPath}/importFile" method="post" enctype="multipart/form-data">
               <input type="file" name="file" id="file" style="font-size:15px; width: 300px;height: 30px;" /><br/>
                <div id="msg" style="color: red;"></div>
               <input type="submit" value="导入"  style="font-size: 15px;width: 100px;height: 30px;"/>
           </form>
      </div>--%>
  </div>

  <script type="text/javascript" src="${pageContext.request.contextPath}/background/layui/layui.js"></script>

  <script>
      layui.use('upload', function(){
          var upload = layui.upload;
          //执行上传
          var uploadInst = upload.render({
              elem: '#upload' //绑定元素
              ,url: '${pageContext.request.contextPath}/importFile' //上传接口
              ,method: 'POST'
              ,accept: 'file'
              ,size: 5000,
              exts:'xls|xlsx',
              before: function(obj){
                  layer.load();
              }
              ,done: function(res){//上传完毕回调
                  layer.closeAll('loading');
              }
              ,error: function(){//请求异常回调
                  layer.closeAll('loading');
                  layer.msg('网络异常，请稍后重试！');
              }
          });
      });
  </script>

  <script type="text/javascript">
     function  checkfile() {
         var path= $("[type=file]").val();
         if(path.substring(path.lastIndexOf('.')+1)!="xls"&&path.substring(path.lastIndexOf('.')+1)!="xlsx"){
            $("#msg").html("请选择一个xls文件或者xlsx文件");
            alert(path.substring(path.lastIndexOf('.')+1));
            return false;
         }
         return true;
     }
     $(function () {
         $("form").submit(function () {
              return checkfile();
         });
     })
 </script>
</body>
</html>
