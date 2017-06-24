<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	<script src="js/jquery.min.js"></script>
	<title>餐品详细页面</title> 
	<style>
		a {
			TEXT-DECORATION: none;
		}
		a:hover {
			color: #4876FF;
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
			<td height="41" colspan="2" style="background-color:#F7F7F7;border-radius: 5px;" align="center">
				|
				<a href="#">&nbsp;&nbsp;网站首页&nbsp;&nbsp;</a> |
				<s:if test="(#session.admin==null) && (#session.user==null)">
					<a href="#">&nbsp;&nbsp;用户中心&nbsp;&nbsp;</a>|
					<a href="#">&nbsp;&nbsp;用户注册&nbsp;&nbsp;</a> |
					<a href="#">&nbsp;&nbsp;用户登录&nbsp;&nbsp;</a> |
					<a href="#">&nbsp;&nbsp;管理员登录&nbsp;&nbsp;</a> |
				</s:if>
				<s:if test="#session.user!=null">
					
					<font style="color: red">&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;欢迎您：小小白</font>
					<a href="#" style="font-size: 13px;">&nbsp;&nbsp;&nbsp;&nbsp;退出登录&nbsp;&nbsp;</a>
				</s:if>
			</td>
		</tr>
		<tr>
			<td valign="top" width="100%">
				<br/>
				<div style="background-color:#FFCC99; font-size: 40px;" align="center">
					餐品详情
				</div>
				<br/>
				<br/>
				<table style="width: 100%; border: 0;" cellspacing="0" cellpadding="3">
					<tr>
						<td width="148">
							<img src="${dish.image }" width="500" height="450" />
						</td>
						<td style="width: 700px" valign="top">
							<br />
							<span style="font-size: 20px;"> 详细资料:</span>
							<br />
							<span style="font-size: 20px;"> &nbsp;&nbsp; &nbsp;&nbsp;
							${dish.brief }</span>
							<br/>
						</td>
					</tr>
					<tr>
						<td>
							<span style="text-decoration:line-through;color:gray;font-size: 20px;">原价：人民币<fmt:formatNumber type="number" value="${dish.price }" pattern="0.00" maxFractionDigits="2"/>元</span>
							<br/>
							<span style="font-size: 20px;"> 现价：人民币<fmt:formatNumber type="number" value="${dish.price*0.8 }" pattern="0.00" maxFractionDigits="2"/>元</span>
						</td>
					</tr>
					<tr>
						<td>
							<span style="font-size: 20px;">编号：${dish.dishid }</span>
							<button id="editBtn" style="float: right;"></button>
								<img src="images/buy_cn.gif" border="0" width="60" height="20" />
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
	<table width="95%" border="0" cellpadding="0" cellspacing="0" align="center">
		<tr>
			<td>
				<span style="font-size: 20px;"> 评论：</span>
			</td>
		</tr>
		<c:forEach items="${commentList}" var="comment">
			<tr>
			<td align="center">
				<span style="font-size: 15px;"> 用户名：${comment.userid}</span>
			</td>
			<td>
				<span style="font-size: 15px;"> ${comment.comment}</span>
			</td>
			<td>
				<span style="font-size: 15px;"> ${comment.date}</span>
			</td>
		</tr>
		</c:forEach>
	</table>
	<div class="am-fr">
  		<ul class="am-pagination tpl-pagination">
      	<c:if test="${currentPage > 1}">
        	<li class="am-active"><a href="showOrders?page=${currentPage - 1}&type=${status}">上一页</a></li>
       	</c:if>
     	<c:if test="${currentPage < totalPage}">
      		<li class="am-active"><a href="showOrders?page=${currentPage + 1}&type=${status}">下一页</a></li>
        </c:if>
        </ul>
  	</div>
	<script>
	$(function() {
		$('#editBtn').click(function(){
			console.log(1);
			var url = 'updateDish?dishid=123';
			location.href = url;
		});
	});
	</script>
</body>
</html>
