<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>管理页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
<!-- 调用CSS，JS -->
<link href="styleadmin.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	font-family: "宋体";
	font-size: 12px;
	color: #333333;
	background-color: #2286C2;
}
.STYLE3 {
	font-size: 24px;
	color: #0066FF;
	font-weight: bold;
	font-family: Arial, Helvetica, sans-serif;
	font-style: italic;
}
.STYLE4 {color: #0066FF; font-weight: bold; font-family: Arial, Helvetica, sans-serif; font-size: 24px;}
.STYLE5 {
	color: #FF0000;
	font-weight: bold;
}
.STYLE6 {color: #0000FF}
-->
</style>
  </head>
  
  <body>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="74" colspan="2" background="images/index1_03.gif">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="62%" rowspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <div align="left"><span class="STYLE3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="STYLE4">&nbsp;&nbsp;<marquee behavior=alternate>
              欢迎进入网络订餐系统后台管理                        
            </marquee>
          </span></div></td>
          
          <td width="38%" height="38" align="right"><table width="120" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td align="center"><img src="images/index1_06.gif" width="16" height="16" /></td>
                <td align="center" class="font2"><a href="#" class="font2"><strong>帮助</strong></a></td>
                <td align="center"><img src="images/index1_08.gif" width="16" height="16" /></td>
                <td align="center" class="font2"><a href="#" class="font2"><strong>退出</strong></a></td>
              </tr>
          </table>          </td>
        </tr>
        <tr>
          <td align="right">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td align="right" class="font2">|&nbsp;登陆用户：<%=session.getAttribute("manager") %>&nbsp;|&nbsp;身份：管理员&nbsp;|&nbsp;&nbsp;</td>
              </tr>
            </table></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td colspan="2">
      <table width="100%" border="0" cellspacing="10" cellpadding="0">
        <tr>
          <td width="10%" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="8" height="8"><img src="images/index1_23.gif" width="8" height="29" /></td>
                <td width="99%" background="images/index1_24.gif"></td>
                <td width="8" height="8"><img src="images/index1_26.gif" width="8" height="29" /></td>
              </tr>
              <tr>
                <td background="images/index1_45.gif"></td>
		   <font size="4" color="#FF0000">当前时间:
              <s:date name="#attr.date"/></font>
                <td bgcolor="#FFFFFF" style="padding:0 2px 0 2px; vertical-align:top;height:500px;">
                  <table width="234" border="0" cellpadding="0" cellspacing="5">
                    <tr>
                      <td width="16%" align="center"><img src="images/index1_54.gif" width="15" height="11" /></td>
                      <td width="84%"><a href="manager!getlistManager.action" class="font2">管理员中心</a></td>
                    </tr>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<tr>
                      <td width="16%" align="center"><img src="images/index1_54.gif" width="15" height="11" /></td>
                      <td width="84%"><a href="news!getallNews.action" class="font2">新闻中心</a></td>
                    </tr>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  <tr>
                      <td align="center"><img src="images/index1_54.gif" width="15" height="11" /></td>
                      <td><a href="orderonline!getlistOrder.action" class="font2">订单中心</a></td>
                    </tr>
                    <tr>
                      <td align="center"><img src="images/index1_54.gif" width="15" height="11" /></td>
                      <td><a href="product!getlistProduct.action" class="font2">餐点中心</a></td>
                    </tr>
					 <tr>
                      <td width="16%" align="center"><img src="images/index1_54.gif" width="15" height="11" /></td>
                      <td width="84%"><a href="user!getlistUser.action" class="font2">会员中心</a></td>
                    </tr>
                    <tr>
                      <td align="center"><img src="images/index1_54.gif" width="15" height="11" /></td>
                      <td><a href="message!getlistMessage.action" class="font2">留言中心</a></td>
                    </tr>
                  </table>
                </td>
                <td background="images/index1_47.gif"></td>
              </tr>
              <tr>
                <td width="8" height="8"><img src="images/index1_91.gif" width="8" height="8" /></td>
                <td background="images/index1_92.gif"></td>
                <td width="8" height="8"><img src="images/index1_93.gif" width="8" height="8" /></td>
              </tr>
            </table>
          </td>
          <td width="70%" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="8" height="8"><img src="images/index1_28.gif" width="8" height="39" /></td>
                <td width="99%" background="images/index1_40.gif">
                  <table border="0" cellspacing="0" cellpadding="0">
                    <tr>
                    <td>
                        <table width="90" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="5"><img src="images/index1_35.gif" width="5" height="39" /></td>
                            <td align="center" background="images/index1_36.gif"><a href="manager!loadManager.action?id=<s:property value="id"/>" class="font3"><strong>管理员管理</strong></a></td>
                            <td width="5"><img src="images/index1_38.gif" width="5" height="39" /></td>
                          </tr>
                        </table>
                      </td>
                      <td>
                        <table width="90" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="5"><img src="images/index1_35.gif" width="5" height="39" /></td>
                            <td align="center" background="images/index1_36.gif"><a href="news!getallNews.action" class="font3"><strong>新闻管理</strong></a></td>
                            <td width="5"><img src="images/index1_38.gif" width="5" height="39" /></td>
                          </tr>
                        </table>
                      </td>
                      <td>
                        <table width="80" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="5"><img src="images/index1_29.gif" width="5" height="39" /></td>
                            <td align="center" background="images/index1_30.gif"><a href="orderonline!getlistOrder.action" class="font2"><strong>订单管理</strong></a></td>
                            <td width="5"><img src="images/index1_33.gif" width="5" height="39" /></td>
                          </tr>
                        </table>
                      </td>
                       <td>
                        <table width="90" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="5"><img src="images/index1_35.gif" width="5" height="39" /></td>
                            <td align="center" background="images/index1_36.gif"><a href="product!getlistProduct.action" class="font3"><strong>餐点管理</strong></a></td>
                            <td width="5"><img src="images/index1_38.gif" width="5" height="39" /></td>
                          </tr>
                        </table>
                      </td>
                      <td>
                        <table width="80" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="5"><img src="images/index1_29.gif" width="5" height="39" /></td>
                            <td align="center" background="images/index1_30.gif"><a href="user!getlistUser.action" class="font2"><strong>会员管理</strong></a></td>
                            <td width="5"><img src="images/index1_33.gif" width="5" height="39" /></td>
                          </tr>
                        </table>
                      </td>
                      <td>
                        <table width="80" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="5"><img src="images/index1_29.gif" width="5" height="39" /></td>
                            <td align="center" background="images/index1_30.gif"><a href="#" class="font2"><strong>留言管理</strong></a></td>
                            <td width="5"><img src="images/index1_33.gif" width="5" height="39" /></td>
                          </tr>
                        </table>
                      </td>
                    </tr>
                  </table>
                </td>
                <td width="8" height="8"><img src="images/index1_43.gif" width="8" height="39" /></td>
              </tr>
              <tr>
                <td background="images/index1_45.gif"></td>
                <td bgcolor="#FFFFFF" style="height:490px; vertical-align:top;">
                  <table width="100%" border="0" cellspacing="10" cellpadding="0">
                    <tr>
                      <td>
                        <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#C4E7FB">
                          <tr>
                            <td>
                              <table width="100%" border="0" cellpadding="0" cellspacing="5" bgcolor="#FFFFFF">
                                <tr>
                                  <td><a href="manager!getlistManager.action" class="font1">首页</a> <span class="STYLE5">&gt;&gt;</span> <a href="admin/addNews.jsp" class="font1">添加新闻</a></td>
                                </tr>
                              </table>                            </td>
                          </tr>
                        </table>                      </td>
                    </tr>
                  </table>
                  <form   action="news!addNews.action" method="post">
                    <table width="800" border="1" bordercolor="#0033FF">
                      <tr>
                        <td width="121"><span class="STYLE6">标题：</span></td>
                        <td width="663"><span class="STYLE6">
                          <label>
                          <input type="text" name="news.title">
                          </label>
                        </span></td>
                      </tr>
                      <tr>
                        <td><span class="STYLE6">关键字：</span></td>
                        <td><span class="STYLE6">
                          <label>
                          <input type="text" name="news.keywords">
                          </label>
                        </span></td>
                      </tr>
                      <tr>
                        <td><span class="STYLE6">内容：</span></td>
                        <td><span class="STYLE6">
                          <label>
                          <textarea name="news.content" cols="60" rows="20"></textarea>
                          </label>
                        </span></td>
                      </tr>
                      <tr>
                        <td><span class="STYLE6">发布时间：</span></td>
                        <td><span class="STYLE6">
                          <label>
                          <input type="text"  name="news.createtime" value=" <s:date name="#attr.date"/>
">                          </label>
                        </span></td>
                      </tr>
                      <tr>
                        <td colspan="2"><span class="STYLE6">
                          <label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                          <input type="submit" name="Submit" value="添加">
                          </label>
                          <label>
                          <input type="submit" name="Submit2" value="重置">
                          </label>
                        </span></td>
                      </tr>
                    </table>
                  </form>
                </td>
                <td background="images/index1_47.gif"></td>
              </tr>
              <tr>
                <td width="8" height="8"><img src="images/index1_91.gif" width="8" height="8" /></td>
                <td background="images/index1_92.gif"></td>
                <td width="8" height="8"><img src="images/index1_93.gif" width="8" height="8" /></td>
              </tr>
            </table>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
  </body>
</html>