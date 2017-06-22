<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>用户注册页面</title>		
		<link rel="stylesheet" href="css/styles.css" type="text/css" />
		<link rel="stylesheet" href="css/login.css" />
		<!-- Bootstrap core CSS -->
	    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	    <!-- Custom styles for this template -->
	    <link href="css/signin.css" rel="stylesheet">
		<script type="text/javascript">
			function usercheck(){
				if(document.ufrm.username.value.length==0){
					alert("请输入用户名");
					return false;
				}
				if(document.ufrm.userpwd.value.length==0){
					alert("请输入密码");
					return false;
				}
				return true;
			}
			function admincheck(){
				if(document.afrm.adminname.value.length==0){
					alert("请输入登录名");
					return false;
				}
				if(document.afrm.adminpwd.value.length==0){
					alert("请输入密码");
					return false;
				}
				return true;
			}
		</script>
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
								    
					<div class="container">
				      <form class="form-signin" action="reg" method="post">
				        <h3 class="form-signin-heading">用户注册</h3>
				        <label for="username" class="sr-only">登录名称：</label>
				        <input type="text" id="username"  name="user.loginName" class="form-control" placeholder="请输入登录名称" required autofocus>
				        <label for="passwrod" class="sr-only">登录密码：</label>
				        <input type="password" id="password"  name="user.loginPwd" class="form-control" placeholder="请输入密码" required>
				        <label for="user.trueName" class="sr-only">真实姓名：</label>
				        <input type="text" id="user.trueName"  name="user.trueName" class="form-control" placeholder="请输入真实姓名" required>
				        <label for="user.phone" class="sr-only">电话号码：</label>
				        <input type="text" id="user.phone"  name="user.phone" class="form-control" placeholder="请输入电话号码" required>
				        <label for="user.address" class="sr-only">电子邮件：</label>
				        <input type="text" id="user.address"  name="user.email" class="form-control" placeholder="请输入电子邮件" required>
				        <label for="user.address" class="sr-only">默认地址：</label>
				        <input type="text" id="user.address"  name="user.address" class="form-control" placeholder="请输入默认地址" required>
				        <div class="checkbox">
				          <label>
				            <input type="checkbox" value="remember-me">同意<a href="">"服务条款"</a>和<a href="">"隐私权相关政策"</a>
				          </label>
				        </div>
				        <button class="btn btn-lg btn-primary btn-block" name="register" type="submit">注册</button>
				      </form>
				      <div style="margin:0 auto; max-width:330px; padding: 20px 20px;">
				      	<a href="login.jsp">返回登录</a>
				      </div>
				    </div>			    
								    
                    		
							
								
							
					</div>
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
