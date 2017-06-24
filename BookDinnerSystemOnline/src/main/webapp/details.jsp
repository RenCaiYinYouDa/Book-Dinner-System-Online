<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

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
							<img src="images/25.jpg" width="500" height="450" />
						</td>
						<td style="width: 700px" valign="top">
							<br />
							<span style="font-size: 20px;"> 详细资料:</span>
							<br />
							<span style="font-size: 20px;"> &nbsp;&nbsp; &nbsp;&nbsp;
							 鲜榨草莓汁系统使用说明										
							本查询系统的信息来源于各高校招生网对外公开的数据，中国教育在线提供此信息之目的在于
							为高考生提供更多的信息作为参考,请综合各种信息进行报考	
							如对本系统有任何疑问请联系我们，欢迎更多招生单位及教育机构与我们合作，
							联系电话:010-62603709</span>
							<br/>
						</td>
					</tr>
					<tr>
						<td>
							<span style="text-decoration:line-through;color:gray;font-size: 20px;">原价：人民币${requestScope.aMeal.mealPrice }元</span>
							<br/>
							<span style="font-size: 20px;"> 现价：人民币${requestScope.aMeal.mealPrice*0.9 }元</span>
						</td>
					</tr>
					<tr>
						<td>
							<span style="font-size: 20px;">编号：123456789</span>
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
		<tr>
			<td align="center">
				<span style="font-size: 15px;"> 用户名：</span>
			</td>
			<td>
				<span style="font-size: 15px;"> 嗯，有点好吃。</span>
			</td>
		</tr>
	</table>
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
