<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>我的订单明细</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/style.css" type="text/css" />
	</head>

	<body>
		<table width="90%" height="629" border="0" cellpadding="0" cellspacing="0" align="center">
			<tr>
				<td width="200" height="101">
					<img src="<%=request.getContextPath() %>/images/jb_logo.jpg" width="64" height="32" />
					<strong><span style="font-size: 20px;">网上订餐系统</span> </strong>
				</td>
				<td width="640" style="padding-left: 40px;">
					
				</td>
			</tr>
			<tr>
				<td height="41" colspan="2" style="background-image:url(<%=request.getContextPath() %>/images/001.gif);" align="center">
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
				<td valign="top" align="center">
					<img src="<%=request.getContextPath() %>/images/left_top.jpg" width="215" height="100" />
					<br>
					<img src="<%=request.getContextPath() %>/images/003.gif" width="191" height="8">
				</td>
				<td valign="top" width="80%">
					<img src="<%=request.getContextPath() %>/images/001.jpg" width="595" height="72" />
					<br/>
					<div style="background-image:url(<%=request.getContextPath() %>/images/004.gif)">&nbsp;</div>
					<br />
					<img src="<%=request.getContextPath() %>/images/icon_order.gif" align="top" />
					订单明细
					<br />
					<hr />
					<table align="center" width="95%" cellspacing="0" cellpadding="3"style="text-align:center; border:1px #cccccc solid;">
						<tr style="background-color:#CCCCFF;">
							<td>明细编号</td>
							<td>菜名</td>
							<td>价格</td>
							<td>数量</td>
							<td>总额</td>
						</tr>
						<s:set var="count" value="0" />
						<s:iterator id="ordersDtsItem" value="#request.ordersDtsList">
						<tr style="background-color:#FFFFFF;">
							<td>
								<s:property value="odid"/>
							</td>
							<td>
								<s:property value="meal.mealName"/>
							</td>
							<td>
								<s:property value="mealPrice"/>
							</td>
							<td>
								<s:property value="mealCount"/>
							</td>
							<td>
								<s:property value="mealPrice*mealCount"/>
							</td>
						</tr>
						<s:set var="count" value="#count+mealPrice*mealCount" /></s:iterator>
						<tr style="background-color:#CCCCFF;">
							<td>
								合计
							</td>
							<td>
								-
							</td>
							<td>
								-
							</td>
							
							<td>
								-
							</td>
							<td>
								￥：<s:property value="#count"/>
							</td>
						</tr>
					</table>
					<br />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<br>
					<hr width=100%>
					<br>	
					<br>
				</td>
			</tr>
		</table>
	</body>
</html>
