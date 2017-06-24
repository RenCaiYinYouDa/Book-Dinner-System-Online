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
		
		<style type="text/css">
			select {
				margin-bottom: 10px;
				width: 300px;
				padding: 15px;
  				font-size: 16px;
			}
		</style>
	</head>

	<body>
		<div style="height: 150px;" id="top3">
			<embed src="images/top.swf" style="position:absolute;height: 150px;width: 100%;top:0px; z-index: -1;">
			<strong style="margin:28px;"><span style="color: #fff; font-size: 48px;">网上订餐系统</span> </strong>
		</div>
		<table width="95%" height="170" border="0" cellpadding="0" cellspacing="0" align="center">
			<tr>
				<td valign="top" width="80%">
					<div class="container">
				      <form class="form-signin" action="comreg" method="post">
				        <h3 class="form-signin-heading">用户注册</h3>
				        <label for="username" class="sr-only">用户名：</label>
				        <input type="text" id="username"  name="username" class="form-

control" placeholder="请输入登录名称" required autofocus>
				        <label for="passwrod" class="sr-only">登录密码：</label>
				        <input type="password" id="password"  name="password" 

class="form-control" placeholder="请输入密码" required>
				        <label for="user.address" class="sr-only">电子邮件：</label>
				        <input type="text" id="user.address"  name="email" class="form-

control" placeholder="请输入电子邮件" required>
				        <label for="user.trueName" class="sr-only">密保问题：</label>
				        <select name="securityid">
							<option value="1">aa</option> 
							<option value="2">bb</option> 
							<option value="3">cc</option> 
						</select> 
				        <label for="user.trueName" class="sr-only">密保答案：</label>
				        <input type="text" id="user.trueName"  name="key" class="form-

control" placeholder="请输入密保答案" required>
				        
				        <div class="checkbox">
				          <label>
				            <input type="checkbox" value="remember-me">同意<a href="">"

服务条款"</a>和<a href="">"隐私权相关政策"</a>
				          </label>
				        </div>
				        <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
				      </form>
				      <div style="margin:0 auto; max-width:330px; padding: 20px 20px;">
				      	<a href="toLog?flag=0">返回登录</a>
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
