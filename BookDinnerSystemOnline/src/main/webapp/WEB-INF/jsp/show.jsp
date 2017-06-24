<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<title>餐品列表显示</title>
		<style>
			a {
				TEXT-DECORATION: none;
			}
			a:hover {
				color: #4876FF;
			}
			.detailMargin {
				margin-top: 20px;
			}
		</style>
		
		<script type="text/javascript">
			
		</script>
		
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
						<a href="toRegiste">&nbsp;&nbsp;用户注册&nbsp;&nbsp;</a> |
						<a href="toLog?flag=0">&nbsp;&nbsp;用户登录&nbsp;&nbsp;</a> |
						<a href="toLog?flag=1">&nbsp;&nbsp;管理员登录&nbsp;&nbsp;</a> |
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
				<td valign="top" align="center">
					<br>
						<p style="background-color: ghostwhite; font-size: 22px;">菜品分类</p>
					<br>
						<!-- 菜系菜的种类循环开始 -->
						<c:forEach items="${typeList }" var="item">
							<br>
							<a href="#" style="font-size: 18px;">${item.type}</a>
							<br>
						</c:forEach>
						<!-- 菜系循环结束 -->
				</td>
				<td valign="top" width="80%">
					<br />
					<div align="right">
					<!--菜品查询表单-->
						<form theme="simple" method="post" action="toShowMeal">
							<input placeholder="请输入菜名" type="text"/>
							<input type="submit" value="查询"/>
						</form>
					</div>
					<div style="background-color: #333333;height: 2px;">
						&nbsp;
					</div>
					<br />
					
					<table cellpadding="5" cellspacing="1" style="font-size: 12px;">
						<c:forEach items="${dishList }" var="item">
							<tr>
								<td><a href="getDish?dishid=${item.dishid }"><img src="mealimages/${item.image }"
										width="148" height="126" border="0" /> </a></td>
								<td>
									<div>
										<p style="font-size: 17px;">${item.dishid }
											: ${item.dishname }<br />
										</p>
										<span calss="detailMargin"
											style="text-decoration: line-through; color: gray;">
											原价：人民币<fmt:formatNumber type="number" value="${item.price }" pattern="0.00" maxFractionDigits="2"/>元 </span>
										<p calss="detailMargin" style="font-size: 15px;">现价：人民币<fmt:formatNumber type="number" value="${item.price*0.8 }" pattern="0.00" maxFractionDigits="2"/>
											元</p>
									</div> <a href="showDishDetail?dishid=${item.dishid}"><img src="img/detail_cn.gif"
										border="0" width="60" height="20" /></a> <a href="addToCart?dishid=${item.dishid}&userid=${user.userid}&page=${currentPage}"><img
										src="img/buy_cn.gif" border="0" width="60" height="20" /></a>
								</td>
							</tr>
					</c:forEach>
						
						<!-- 餐品循环结束 -->

						<!-- 分页超链接开始 -->
						<table align="right">
							<tr>
								<td width="130"></td>
								<td>
									<c:if test="${currentPage > 1}">
                                    	<li class="am-active"><a href="indexShow?page=${currentPage - 1}">上一页</a></li>
                                  	</c:if>
                                 	<c:if test="${currentPage < totalPage}">
                                  		<li class="am-active"><a href="indexShow?page=${currentPage + 1}">下一页</a></li>
                                   	</c:if>
								</td>
							</tr>
						</table>
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
	</body>

</html>