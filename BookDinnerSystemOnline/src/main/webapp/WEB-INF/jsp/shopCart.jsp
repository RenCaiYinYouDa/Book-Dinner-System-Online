<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>购物车页面</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/style.css" type="text/css" />
	</head>

	<body>
		<div style="height: 150px;" id="top3">
			<embed src="images/top.swf" style="position:absolute;height: 150px;width: 100%;top:0px; z-index: -1;">
			<strong style="margin:28px;"><span style="color: #fff; font-size: 48px;">网上订餐系统</span> </strong>
		</div>
		<table width="95%" height="170" border="0" cellpadding="0" cellspacing="0" align="center">
			<tr>
				<td height="41" colspan="2" style="background-color:#F7F7F7;border-radius: 5px;" align="center">
					|
					<a href="#">&nbsp;&nbsp;网站首页&nbsp;&nbsp;</a> |
					<c:if test="${empty user.username}">
						<a href="#">&nbsp;&nbsp;用户中心&nbsp;&nbsp;</a>|
						<a href="#">&nbsp;&nbsp;用户注册&nbsp;&nbsp;</a> |
						<a href="toLog">&nbsp;&nbsp;用户登录&nbsp;&nbsp;</a> |
						<a href="toLog">&nbsp;&nbsp;管理员登录&nbsp;&nbsp;</a> |
					</c:if>
					<c:if test="${not empty user.username}">
						<font style="color: red">&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;欢迎您：${user.username}</font>
						<a href="showPersonOrder" style="font-size: 13px;">&nbsp;&nbsp;&nbsp;&nbsp;个人中心&nbsp;&nbsp;</a>
						<a href="showCart?userid=${user.userid}" style="font-size: 13px;">&nbsp;&nbsp;&nbsp;&nbsp;我的购物车&nbsp;&nbsp;</a>
						<a href="comlogout" style="font-size: 13px;">&nbsp;&nbsp;&nbsp;&nbsp;退出登录&nbsp;&nbsp;</a>
					</c:if>
				</td>
			</tr>
				<tr>
					<td valign="top" width="80%">
						<div style="background-image:url(<%=request.getContextPath() %>/images/004.gif)">&nbsp;</div>
						<br />
						<div>
							<img src="<%=request.getContextPath() %>/images/zdkf.jpg" align="top" />
							<span>您的购物车中有以下商品<br /></span>
						</div>
						<hr />
						<table align="center" width="95%" cellspacing="0" cellpadding="3"
							style="text-align:center; border:1px #cccccc solid;">
							<tr style="background-color:#CCCCFF;">
								<th>编号</th>
								<th>商品名称</th>
								<th>单价</th>
								<th>数量</th>
								<th>金额</th>
								<th>删除</th>
							</tr>	
							<c:forEach items="${cartList}" var="cart" varStatus="status">
								<tr style="background-color:#FFFFFF;">
									<td>
										${status.index+1}
									</td>
									<td>
										${cart.dishid}
									</td>
									<td>
										￥20
									</td>
									<td>								
										<input type="text"  value="${cart.count}" size="10" 
										onchange="window.location='changeCartCount?dishid=${cart.dishid}&userid=${cart.userid}&count='+this.value;">
									</td>
									<td>
										￥${20 * cart.count}
									</td>
									<td>
										<a href="deleteCart?dishid=${cart.dishid}&userid=${cart.userid}">删除</a>
									</td>
								</tr>
							</c:forEach>
						</table>
						
						<br />
						<table width="300" cellspacing="0" cellpadding="4" align="center"
							style="text-align:center; border:1px #cccccc solid;">
							<tr style="background-color:#CCCCFF;">
								<td>
									<a href="indexShow">继续购物</a>
								</td>
								<td>
									<a href="generateOrder?userid=${user.userid}">生成订单</a>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<br>
						<hr width=100%>
						<br>
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>