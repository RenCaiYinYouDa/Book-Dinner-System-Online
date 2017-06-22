<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>登录页面</title>	
		<link rel="stylesheet" href="css/login.css" />
		<!-- Bootstrap core CSS -->
	    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	    <!-- Custom styles for this template -->
	</head>
	<body>
		<table width="95%" height="170" border="0" cellpadding="0" cellspacing="0" align="center">
			<tr>
				<td height="101">
					<img src="img/zr1.jpg" width="70" height="50" style="border-radius: 10%;float: left;margin-left: 150px;"/>
					<strong><span style="font-size: 30px;float: left;margin-left:40px;">网上订餐系统</span>
				</td>
			</tr>
			<tr>
				<td valign="top" width="80%">
					<div style="background-color:#9AC0CD;font-size: 20px;" align="center">网上订餐系统用户请直接登录
				    </div>
					
					
					<s:if test="#">
						
					    <div class="container">
					      <form id="loginForm" class="form-signin" action="login" method="post">
					        <h3 class="form-signin-heading">用户登录</h3>
					        <label for="loginName" class="sr-only">请输入用户名</label>					        
					        <input type="text" id="loginName" name="loginName" class="form-control" placeholder="请输入用户名" required autofocus>
					        <label for="password" class="sr-only">请输入密码</label>
					        <input type="password" id="password"  name="loginPwd" class="form-control" placeholder="请输入密码" required>
					       
					        <div class="checkbox">
					          <label>
					            <input type="checkbox" value="remember-me">两周以内自动登录
					          </label>
					        </div>
					        <button class="btn btn-lg btn-primary btn-block" name="login" type="submit">登录</button>
					      </form>
					      <div style="margin:0 auto; max-width:330px; padding: 20px 20px;">
					      	<a href="register.jsp">马上注册</a>
					      </div>
					    </div>
			
			       
					</s:if>
					
				
					<s:if test="#parameters.role[0]=='admin'"> 

						
						<form id="loginForm" class="form-signin" action="login" method="post">
					        <h3 class="form-signin-heading">用户登录</h3>
					        <label for="loginName" class="sr-only">登录名：</label>					        
					        <input type="text" id="loginName" name="loginName" class="form-control" placeholder="请输入用户名" required autofocus>
					        <label for="passwrod" class="sr-only">密码：</label>
					        <input type="password" id="password"  name="loginPwd" class="form-control" placeholder="请输入密码" required>
					       
					        <div class="checkbox">
					          <label>
					            <input type="checkbox" value="remember-me">两周以内自动登录
					          </label>
					        </div>
					        <button class="btn btn-lg btn-primary btn-block" name="login" type="submit">登录</button>
					      </form>
					      <div style="margin:0 auto; max-width:330px; padding: 20px 20px;">
					      	<a href="toReg">马上注册</a>
					      </div>
					    </div>
						
						
									
					</s:if>					
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<br>
					<hr width=100%>
					<br>					
					<br>
					<br>
				</td>
			</tr>
		</table>
	</body>
</html>
