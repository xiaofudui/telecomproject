<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../header.jsp" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript"
	src="<%=basePath%>static/js/jquery-3.2.1.min.js" charset="utf-8"></script>
</head>
<body>
<p>hello</p>
<table class="table table-striped table-bordered table-hover" id="mytable">

            </table>


<script type="text/javascript">

function getData(){
	$.ajax({
		type:"GET",
		url:"<%=basePath%>login/page",
		async:true,
		data:"page=1&row=3&accountName=张",
		success:function(message){
			console.info(message);
			//将获取到message字符串转化为json对象
			console.info(message.rows[0].id);
			//用js来处理结果，显示数据，局部刷新
			var s = "";
			var h = "<tr><th>姓名</th><th>性别</th><th>身份证</th><th>账务账号</th><th>密码</th><th>联系电话</th><th>通讯地址</th><th>邮编</th><th>QQ</th><th>状态</th></tr>"
			for(var i=0;i<message.rows.length;i++){
				s+="<tr index = '"+message.rows[i].id+"'><td>"+message.rows[i].accountName+"</td><td>"+message.rows[i].gender+"</td><td>"+message.rows[i].idcard+"</td><td>"+message.rows[i].userName+"</td><td>"+message.rows[i].userPwd+"</td><td>"+message.rows[i].telephone+"</td><td>"+message.rows[i].address+"</td><td>"+message.rows[i].postalcode+"</td><td>"+message.rows[i].qq+"</td><td>"+message.rows[i].state+"</td></tr>"
			}
			$("#mytable").html(h+s);
		}
	});
}

getData()

</script>

</body>
</html>