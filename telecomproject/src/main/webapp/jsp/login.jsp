<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../../header.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
	
	<script type="text/javascript" src="<%=basePath %>static/js/jquery-3.2.1.min.js" charset="utf-8"></script>
	<script type="text/javascript" src="<%=basePath %>static/js/index.js" charset="utf-8"></script>
<%-- </head>
<body>



	<button id="btn0">登录</button>

	<p>	


	<form action="<%=basePath %>login/check" method="get">
		登录名：<input  name="userName" type="text"/>
		<br/>
		密码：<input name="userPwd" type="password"/>
		<br/>
		<input type="submit" value="提交">
	</form>

</body>
</html> --%>
	<link rel="stylesheet" href="<%=basePath %>static/css/amazeui.min.css">
  	<link rel="stylesheet" href="<%=basePath %>static/css/app.css">
</head>
<body>
<div class="am-g myapp-login">
	<div class="myapp-login-bg">
		 <div class="myapp-login-logo">
		 	<i class="am-icon-stumbleupon"></i>
		 </div>
		 <div class="am-u-sm-10 myapp-login-form">
		 	<form class="am-form" action="<%=basePath %>login/check" method="get">
			  <fieldset>
		
			    <div class="am-form-group">

			      <input type="email" class="" id="doc-ipt-email-1" name="userName"  placeholder="请输入账号">
			    </div>

			    <div class="am-form-group">
			     
			      <input type="password" class="" id="doc-ipt-pwd-1" name="userPwd"  placeholder="请输入密码">
			    </div>
			    <p><button type="submit" class="am-btn am-btn-default">登录</button></p>
			    <div class="login-text">
			    	忘记密码?
			    </div>
			  </fieldset>
			</form>
		 </div>
	</div>
</div>
<script src="<%=basePath %>static/js/jquery.min.js"></script>
<script src="<%=basePath %>static/js/amazeui.min.js"></script>
<script src="<%=basePath %>static/js/app.js"></script>
</body>
</html>