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
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/js/jquery-migrate-1.2.0.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/background/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
    <link href="${pageContext.request.contextPath}/background/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/background/layui/css/layui.css" rel="stylesheet" type="text/css" />
    <%--traditional: true,<%--这个设置为true，data:{"steps":["qwe","asd","zxc"]}会转换成steps=qwe&steps=asd&...--%>
    <style type="text/css">
        select option{
            font-size: 15px;
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $("#tbStuList").on("click","div",function () {
                $(this).toggle(function (i) {
                   $(this).addClass("layui-btn-normal");
                },function (i) {
                    $(this).addClass("layui-btn-warm");
                },function (i) {
                    $(this).addClass("layui-btn-danger");
                },function (i) {
                    $(this).removeClass("layui-btn-normal layui-btn-warm layui-btn-danger");
                });
                    $(this).trigger('click');
                //$(this).addClass("layui-btn-normal");
            });

            $("#tnGen").click(function () {
                generateStudents();
            });
            //01.加载年级下拉框,和当前登录用户绑定的
            $.ajax({
                url:"${pageContext.request.contextPath}/selectGradesByUid",
                type:"POST",
                data:{"uid":${userInfo.uid}},
                success:function (data) {
                    $.each(data,function (i,dom) {
                        var option=$("<option style='width: 50px;'  value='"+dom.dicid+"'>"+dom.dicname+"</option>");
                        $("#cboGrade").append(option);
                    });
                }
            });
        });
        function generateStudents() {
            $("#tbStuList").html('');
            //生成学员名称列表
            $.ajax({
                url:"${pageContext.request.contextPath}/findStudentsByGradeId",
                type:"POST",
                data:{"gid":$("#cboGrade").val()},
                success:function (data) {
                    $.each(data,function (i,dom) {
                        if(i%5==4){
                            var div="<div style='width: 130px;' class='layui-btn layui-btn-radius'>"+dom+"</div><br/><br/><br/><br/>";
                        }else{
                            var div="<div style='width: 130px;' class='layui-btn layui-btn-radius'>"+dom+"</div>";
                        }

                        $("#tbStuList").append(div);
                    });
                }
            });
        }
    </script>
</head>


<body>
<div class="rightinfo">

    <div class="tools">

        <ul class="toolbar" style="">
            <li>请选择班级：
                <select id="cboGrade" name="cboGrade" style="width: 70px;">

                </select>
            </li>
            <button id="tnGen" class="layui-btn layui-btn-radius">生成班级成员</button>
            <button class="layui-btn layui-btn-radius">保存出勤信息</button>
        <%--    <li onclick=""><span></span>生成班级成员</li>
            <li onclick=""><span></span>保存出勤信息</li>--%>
        </ul>
       <div style="float: right;">颜色含义说明：
           <button class="layui-btn layui-btn-radius">出勤</button>
           <button class="layui-btn layui-btn-normal layui-btn-radius">迟到</button>
           <button class="layui-btn layui-btn-warm layui-btn-radius">请假</button>
           <button class="layui-btn layui-btn-danger layui-btn-radius">缺勤</button>
       </div>
    </div>
    <div id="tbStuList" style="margin-top: 50px;margin-left: 160px">

    </div>
    <span class="layui-badge">出勤</span>
    <div class="layui-carousel-ind"><ul><li class="layui-this">考勤</li></ul></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/background/layui/layui.js"></script>
<script type="text/javascript">
</script>

</body>
</html>
