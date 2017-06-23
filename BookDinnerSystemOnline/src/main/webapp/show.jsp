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
		<table width="95%" height="170" border="0" cellpadding="0" cellspacing="0" align="center">
			<tr>
				<td height="101">
					<img src="img/zr1.jpg" width="70" height="50" style="border-radius: 10%;float: right;margin-right: 40px;"/>
				</td>
				<td> <strong><span style="font-size: 30px;">网上订餐系统</span> </strong> </td>
			</tr>
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
				<td valign="top" align="center">
					<br>
						<p style="background-color: ghostwhite; font-size: 22px;">菜品分类</p>
					<br>
						<!-- 菜系菜的种类循环开始 -->
						<s:iterator id="mealSeries" value="#request.mealSeriesList">
							<br>
							<a href="#" style="font-size: 18px;">粽子</a>
							<br>
						</s:iterator>
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
						<!-- 餐品循环开始   一行显示三个菜，需要加判断换行 -->
						<s:iterator id="mealItem" value="#request.mealList" status="st">
							<td>
								<a href="#"><img src="mealimages/${mealItem.mealImage }" width="148" height="126" border="0" /> </a>
							</td>
							<td>
								<div>
									<p style="font-size: 17px;">0001 : 粉蒸排骨<br /></p>
									<span calss="detailMargin" style="text-decoration: line-through; color: gray;">
										原价：人民币25.00元
									</span>
									<p calss="detailMargin" style="font-size:15px;">现价：人民币 23.00 元</p>
								</div>
								<a href="#"><img src="img/detail_cn.gif" border="0" width="60" height="20" /></a>
								<a href="#"><img src="img/buy_cn.gif" border="0" width="60" height="20" /></a>
							</td>
						</s:iterator>
						
						<!-- 餐品循环结束 -->

						<!-- 分页超链接开始 -->
						<table align="right">
							<tr>
								<td width="130"></td>
								<td>
									<s:if test="pager.curPage>1">
										<A href='#'>首页</A>&nbsp;&nbsp;&nbsp;&nbsp;
										<A href='#'>上一页</A>
									</s:if>
									&nbsp;&nbsp;&nbsp;&nbsp;
									<s:if test="pager.curPage < pager.pageCount">
										<A href='#'>下一页</A>&nbsp;&nbsp;&nbsp;&nbsp;
										<A href='#'>尾页</A>
									</s:if>
								</td>
							</tr>
							<tr>
								<td>
									<td>共300记录&nbsp;&nbsp;/&nbsp;&nbsp;共 10页&nbsp;&nbsp;
								</td>
								</td>
							</tr>
						</table>
						<!-- 分页超链接结束-->

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