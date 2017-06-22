<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>My JSP 'about.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">		
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<style type="text/css">
		<!--
		.STYLE2 {color: #00FF99}
		.STYLE3 {font-size: 15px}
		-->
	</style>
</head>
	
	<body bgcolor="#990000">
		<div id="top1"><img src="images/copy_r1_c1.jpg" style="position:absolute;left:180px;right:20px;"></div>
		<div id="top2"><img src="images/copy_r2_c1.jpg" style=" position:absolute;left:180px;right:20px;top:45px;"></div>
		<div id="top3"><embed src="images/top.swf" style="position:absolute;height: 200px;width: 960px;left: 224px;float:center;top:80px;"></div>
		<div id="aa"><img src="images/copy_r3_c1.jpg" style="position:absolute;height:1530px;width:44px;left:180px;right:800px;"></div>
		<div id="bb"><img src="images/copy_r6_c4.jpg" style="position:absolute;height:1530px;width:44px;left:1173px;right:0px;"></div>
		<div id="xian1"><hr color="black" style="position:absolute;height:20px;width:960px;left:224px;top:270px;"></div>
		<div id="menu" style="position:absolute;height:20px;width:960px;left:224px;top:290px;">
			<ol>
				<li><a href="news!getlistNews.action"><h3>餐饮新闻<br></h3></a></li>
				<li><a href="product!getallProduct.action"><h3>菜谱浏览</h3></a></li>
				<li><a href="message!getallMessage.action"><h3>查看留言</h3></a></li>
				<li><a href="front/message.jsp"><h3>客户留言</h3></a></li>
				<li><a href="front/login.jsp"><h3>客户登录</h3></a></li>
				 <li><a href="front/register.jsp"><h3>客户注册</h3></a></li>
				<li><a href="orderonline!getallOrder.action"><h3>我的订单</h3></a></li>
			</ol>
		</div>
		<div id="xian2"><hr color="black" style="position:absolute;height:12px;width:960px;left:224px;top:340px;"></div>
		<div id="zhinan"><img src="images/copy_r5_c1.jpg" style="position:absolute;height:252px;width:240px;top:352px;left:225px;"></div>
		<div id="jiameng"><embed src="images/join-21.swf" style="position:absolute;height:252px;width:240px;top:604px;left:225px;"></div>
		<div id="dianhua"><img src="images/copy_r8_c1.jpg" style="position:absolute;height:292px;width:240px;top:856px;left:225px;"></div>
		<div id="about"><hr color="#CC6600" style="position:absolute;height:20px;width:700px;left:470px;top:360px;"></div>
		<div id="us" style="position:absolute;top:360px;left:473px;">
			<ol style="list-style-type: square"><li style="size: 8;color:white;"><strong>客户登录</strong></li></ol>
		</div>
		<div id="words" style="position:absolute;left:480px;top:440px;width:700px;height:700px;font-size: 15;color: yellow;">
			<center><s:fielderror></s:fielderror></center>
				<form action="user!login.action" method="post">
					<table width="320" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#66FFCC">
						<tr>
							<td width="40" height="50"><img src="images/user.gif" width="30" height="30"></td>
							<td width="38" height="50" class="STYLE2">用户</td>
							<td width="242" height="50"><input type="text" name="user.name" style="width:164px; height:32px; line-height:34px; background:url(images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; font-family:Verdana, Geneva, sans-serif;"></td>
						</tr>
						<tr>
							<td height="50"><img src="images/password.gif" width="28" height="32"></td>
							<td height="50"><span class="STYLE2">密码</span></td>
							<td height="50"><input type="password" name="user.password"style="width:164px; height:32px; line-height:34px; background:url(images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; "></td>
						</tr>
						<tr>
						<tr><td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td><input type="submit" value="登陆"/>
						 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重填"/></td></tr>
					</table>
				</form>
			<center>
				<a href="front/register.jsp" class="STYLE2">返回注册</a>
			</center>
		</div>
		<div id="guanggao"><embed src="images/sp.swf" style="position:absolute;top:1050px;left:468px;width:700px;height:100px;"></div>
		<div id="kinds">
			<embed src="images/bot1.swf" style="position:absolute;top:1150px;left:225px;width:950px;height:200px;">
		</div>
		<div id="bottom"><img src="images/copy_r11_c11.jpg" style="position:absolute;top:1350px;left:225px;width:950px;height:186px;"></div>
		<div id="bo"><img src="images/cai-2.jpg" style="position:absolute;top:850px;left:750px;"></div>
		<div id="bo2" style="position:absolute;top:990px;left:600px;"><h2 style="font-style:italic; color: yellow;">————快餐速食是餐饮行业的潮流————</h2> </div>
	</body>
</html>