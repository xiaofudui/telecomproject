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
<input type="text" name="accountName" id="t1"/>
<select id="se1">
<option value="1">男</option>
<option value="0">女</option>
</select>
<input type="text" name="idcard" id="t2"/>
<input type="text" name="userName" id="t3"/>
<input type="text" name="userPwd" id="t4"/>
<input type="text" name="telephone" id="t5"/>
<input type="text" name="address" id="t6"/>
<input type="text" name="postalcode" id="t7"/>
<input type="text" name="qq" id="t8"/>
<select id="se2">
<option value="0">开通</option>
<option value="1">暂停</option>
<option value="2">已删除</option>
</select>
<input type="button" value="提交" id="bt1"/>
<input type="button" value="删除" id="bt2"/>
<script type="text/javascript">

/* 分页获取账户账号数据 */
function getData(){
	$.ajax({
		type:"GET",
		url:"<%=basePath%>login/page",
		async:true,
		data:"page=1&row=3&accountName=张",
		success:function(message){
			console.info(11111111);
			console.info(message);
			console.info(message.rows[0].id);
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


/* 新增账户账号 */
function postaccount(){
	var accountName = $("#t1").val();
	var gender = $("#se1").val();
	var idcard = $("#t2").val();
	var userName = $("#t3").val();
	var userPwd = $("#t4").val();
	var telephone = $("#t5").val();
	var address = $("#t6").val();
	var postalcode = $("#t7").val();
	var qq = $("#t8").val();
	var state = $("#se2").val();
	var datas = {accountName:accountName,gender:gender,idcard:idcard,userName:userName,userPwd:userPwd,telephone:telephone,address:address,postalcode:postalcode,qq:qq,state:state};
	$.ajax({
		type:"post",
		url:"<%=basePath%>login/insert",
		async:true,
		data:datas,
		success:function(message){
			console.info(message);
			//将获取到message字符串转化为json对象
			console.info(message.id);
			//用js来处理结果，显示数据，局部刷新
			
		}
	});
}


/* 删除账户账号 */
function deleteaccount(){
	var id = 6;
	var datas = {id:id};
	$.ajax({
		type:"delete",
		url:"<%=basePath%>login/"+id,
		async:true,
		data:datas,
		success:function(message){
			console.info(message);
			//将获取到message字符串转化为json对象
			console.info(message.id);
			//用js来处理结果，显示数据，局部刷新
			
		}
	});
}


$("#bt1").click(function(){
	postaccount();
});

$("#bt2").click(function(){
	deleteaccount();
});
</script>

</body>
</html>