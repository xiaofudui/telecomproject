<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.css"/>
    <script src="../../static/js/jQuery-2.2.2-min.js"></script>
    <script src="../../static/js/bootstrap.min.js"></script>
    <style>
        #all{
            width: 1000px;
            height: 500px;
            /* border: 1px solid gray; */
        }
        #head{
            width: 1000px;
            height: 100px;
            position: relative;
            /* background-color: darkseagreen; */
        }
        h1{
            margin-top: 20px;
            margin-left: 400px;
            position: absolute;
        }
        #table{
            width: 1000px;
            height: 300px;
            /* background-color: lightblue; */
        }
        thead{
            background-color: gainsboro;
        }
        #btn{
            width: 1000px;
            height: 100px;
            /* background-color: orange; */
            position: relative;
        }
        #btn1{
            width: 80px;
            height: 40px;
            margin-left: 460px;
            margin-top: 30px;
            position: absolute;
            display: block;
        }
    </style>
</head>
<body>
    <div id="all">
        <div id="head">
            <h1>修改个人信息</h1>
        </div>
        <!--<table>

        </table>-->
        <div id="table">
            <table class="table table-bordered" id="mytable" border="2">
                <thead>
                    <th>真实姓名</th>
                    <th>性别</th>
                    <th>身份证号</th>
                    <th>账务账号</th>
                    <th>密码</th>
                    <th>联系方式</th>
                    <th>通讯地址</th>
                    <th>邮编</th>
                    <th>QQ</th>
                </thead>
                <tbody>
                    <tr>
                        <td><lable class="name"></lable></td>
                        <td><lable class="gender"></lable></td>
                        <td><lable class="id"></lable></td>
                        <td><lable class="accountNum"></lable></td>
                        <td><input class="pwd" type="text" /></td>
                        <td><input class="phoneNum" type="text" /></td>
                        <td><lable class="address"></lable></td>
                        <td><lable class="postal"></lable></td>
                        <td><lable class="qq"></lable></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div id="btn">
            <input id="btn1" type="button" value="修改"/>
        </div>
    </div>

    <script>
        function getData(){
            $.ajax({
                type:"get",
                url:"<%=basePath%>userMsg/getMsg",
                async:true,
                success:function(message){
                    //将获取到message字符串转化为json对象
                    $("#btn1").attr("name",message.id)
                    $(".name").html(message.accountName);
                    $(".gender").html(message.gender);
                    $(".id").html(message.idcard);
                    $(".accountNum").html(message.userName);
                    $(".pwd").val(message.userPwd);
                    $(".phoneNum").val(message.telephone);
                    $(".address").html(message.address);
                    $(".postal").html(message.postalcode);
                    $(".qq").html(message.qq);
            }
            });
        }

        getData();


        function update(id,userPwd,telephone){
            $.ajax({
                type:"put",
                url:"<%=basePath%>userMsg/updateMsg",
                async:true,
                data:{"id":id,"userPwd":userPwd,"telephone":telephone},
                success:function(message){
                    alert("修改成功");
                    getData();
                }
            });
        }

        $("#btn1").click(function(){
            var userPwd = $(".pwd").val();
            var telephone = $(".phoneNum").val();
            var id = $("#btn1").attr("name");
            update(id,userPwd,telephone);
        })


    </script>
</body>
</html>