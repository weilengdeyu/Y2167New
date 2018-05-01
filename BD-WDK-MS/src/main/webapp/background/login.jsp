<%@page pageEncoding="utf-8" language="java" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" id="login-css" href="${pageContext.request.contextPath}/background/vendor/styles/bootstrap.css"
	type="text/css" media="all">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/background/vendor/img/favicon.ico">
<link href="${pageContext.request.contextPath}/background/vendor/styles/my-flat-ui.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/background/vendor/styles/bootstrap-datetimepicker.css" rel="stylesheet">
</head>

<body style="background-color: #34495e">


	<div class="container col-md-2"></div>
	<div class="container col-md-8">
		<div class="login">
			<div class="login-screen">
				<div class="login-icon">
					<img src="${pageContext.request.contextPath}/background/vendor/img/Retina-Ready.png" alt="欢迎登录五道口平台" />
					<h4>
						欢迎登录<small>五道口平台</small>
					</h4>
				</div>

				<form name="loginform" id="loginform"
					  action="${pageContext.request.contextPath}/login" method="post">
					<div class="login-form">
						<div class="form-group">
							<input type="text" class="form-control login-field" value="1"
								placeholder="请输入用户名" id="username" name="uid" />
							<label class="login-field-icon fui-user" for="username"></label>
						</div>

						<div class="form-group">
							<input type="password" class="form-control login-field" value="1"
								placeholder="请输入密码" id="password" name="upwd" /> <label
								class="login-field-icon fui-lock" for="password"></label>
						</div>
						<input type="submit" name="wp-submit" id="wp-submit"
							class="btn btn-primary btn-lg btn-block" value="登录"> <a
							class="login-link" href="#">忘记密码?</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>