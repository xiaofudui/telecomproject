$(function(){
	
	
	$('#btn4').click(function(){
		var url = "users/page";
		$.ajax({
			   type: "GET",
			   url: url,
			   data:"page=1&rows=5&userName=张&age=13",
			   async: true,
			   success: function(msg){
				   console.info(msg);
			   }
			});
		
	});
	
	//删除
	$('#btn3').click(function(){
		var id = 4;
		var version = 1;
		var url = "users/"+id+"/"+version;
		$.ajax({
			   type: "DELETE",
			   url: url,
			   async: true,
			   success: function(msg){
				   alert(msg.status);
				   alert(msg.message);
			   }
			});
		
	});
	
	
	//修改
	$('#btn2').click(function(){
		var id = 4;
		//如果后台配置乐观锁，参数需要提交version
		var user = {userName:"张思",loginName:"zs",version:"0"};
		var url = "users/"+id;
		
		$.ajax({
			   type: "PUT",
			   url: url,
			   async: true,
			   data:user,
			   success: function(msg){
				   alert(msg.status);
				   alert(msg.message);
			   }
			});
	});
	
	//查询
	$('#btn1').click(function(){
		var id = 4;
		var url = "users/"+id;
		$.ajax({
			   type: "GET",
			   url: url,
			   async: true,
			   success: function(msg){
			     alert(msg.userName);
			     alert(msg.loginName);
			     alert(msg.birthday);
			   }
			});
	});
	
	//新增
	$('#btn0').click(function(){
		var id = -1;
		var userName = "张三";
		var loginName = "zs";
		var password = "123456";
		var user = {userName:userName,loginName:loginName,password:password};
		
		var url = "users/"+id;
//		var url = "users/"+id+"/" + userName+"/" + loginName+"/" + password;
		$.ajax({
			   type: "POST",
			   url: url,
			   async: true,
			   data:user,
			   success: function(msg){
			     alert(msg.status);
			     alert(msg.message);
			     
			   }
			});
	});
});