<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>用户注册页面</title>		
		<link rel="stylesheet" href="css/styles.css" type="text/css" />
		<link rel="stylesheet" href="css/new_file.css" />
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
		<table width="90%" height="629" border="0" cellpadding="0" cellspacing="0" align="center">
			<tr>
				<td width="200" height="101">
					<img src="images/jb_logo.jpg" width="64" height="32" />
					<strong><span style="font-size: 20px;">网上订餐系统</span> </strong>
				</td>
				<td width="640" style="padding-left: 40px;">
				</td>
			</tr>
			<tr>
				<td height="41" colspan="2"
					style="background-image:url(images/001.gif);" align="center">
					|
					<a href="/Restrant/toShowMeal">网站首页</a> |
					<s:if test="(#session.admin==null) && (#session.user==null)">					
					<a href="register.jsp">用户注册</a> |
					<a href="login.jsp?role=user">用户登录</a> |
					<a href="login.jsp?role=admin">管理员登录</a> |
					</s:if>
					<s:if test="#session.user!=null">
					<a href="modifyMyInfo.jsp">修改个人信息</a> |
					<a href="shopCart.jsp">我的购物车</a> |
					<a href="/Restrant/toMyOrders">我的订单</a> |
					<a href="/Restrant/logOut?type=userlogout">注销</a> &nbsp;&nbsp; &nbsp;&nbsp;
					<font style="color: red">欢迎您：</font>					
					</s:if>
					<s:if test="#session.admin!=null">
					<a href="/Restrant/toAddMeal">添加餐品</a> |
					<a href="/Restrant/toManageMeal">管理餐品</a> |
					<a href="/Restrant/toManageOrders">订单处理</a> |
					<a href="/Restrant/logOut?type=adminlogout">注销</a> &nbsp;&nbsp; &nbsp;&nbsp;
					<font style="color: red">欢迎您：</font>
					</s:if>
					
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
