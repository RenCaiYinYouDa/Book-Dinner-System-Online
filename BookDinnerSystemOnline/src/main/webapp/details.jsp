<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>餐品详细页面</title> 
	<link rel="stylesheet" href="css/styles.css" type="text/css" />
  </head>
  
  <body>
    <table width="90%" height="629" border="0" cellpadding="0"
			cellspacing="0" align="center">
			<tr>
				<td width="200" height="101">
					<img src="images/jb_logo.jpg" width="64" height="32" />
					<strong><span
						style="font-size: 20px;">网上订餐系统</span> </strong>
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
					<font style="color: red">欢迎您：${sessionScope.user.trueName }</font>					
					</s:if>
					<s:if test="#session.admin!=null">
					<a href="/Restrant/toAddMeal">添加餐品</a> |
					<a href="/Restrant/toManageMeal">管理餐品</a> |
					<a href="/Restrant/toManageOrders">订单处理</a> |
					<a href="/Restrant/logOut?type=adminlogout">注销</a> &nbsp;&nbsp; &nbsp;&nbsp;
					<font style="color: red">欢迎您：${sessionScope.admin.loginName }</font>
					</s:if>
				</td>
			</tr>
			<tr>
				<td valign="top" width="80%">
					<img src="images/001.jpg" style="width: 100%; height: 72px" />
					<br />
					<div style="background-image:url(images/004.gif)">
						&nbsp;
					</div>
					<div style="background-color:#FFCC99; font-size: 40px;" align="center">
						餐品详情
					</div>
					<br>
					<br />			
					<table width: 100% border="0" cellspacing="0" cellpadding="3">
						<tr>
							<td width="148">
								<img src="mealimages/500047.jpg" width="500" height="450" />
							</td>
							<td width="268" valign="top">
								<br />
								<span style="font-size: 20px;"> 详细资料:
								<br />
								<span style="font-size: 20px;"> &nbsp;&nbsp; &nbsp;&nbsp; 皮蛋瘦肉粥
								<br />
								
							</td>
						</tr>
						<tr>
							<td>
								<span style="text-decoration:line-through;color:gray;font-size: 20px;">原价：人民币${requestScope.aMeal.mealPrice }元</span>
								<br />
								<span style="font-size: 20px;"> 现价：人民币${requestScope.aMeal.mealPrice*0.9 }元
							</td>
						</tr>
						<tr>
							<td>
								<span style="font-size: 20px;">编号：123456789
								<a style="float: right;" href="/Restrant/addtoshopcart?mealId=${requestScope.aMeal.mealId }">
									<img src="images/buy_cn.gif" border="0" width="60" height="20" />
								</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<br>
					<hr width=100%>					
				</td>
			</tr>
		</table>
  </body>
</html>
