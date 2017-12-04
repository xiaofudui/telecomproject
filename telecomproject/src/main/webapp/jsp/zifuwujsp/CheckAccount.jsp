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
        .div1{
            width: 1000px;
            height: 500px;
            border: 1px solid gray;
        }
        .div2{
            width: 1000px;
            height: 500px;
            border: 1px solid gray;
        }
        .title{
            width: 1000px;
            height: 80px;
            position: relative;
        }
        h1{
            margin-top: 20px;
            margin-left: 400px;
            position: absolute;
        }
        #text{
            margin-left: 300px;
            margin-top: 10px;
            position: absolute;
            display: inline-block;
        }
        #check1{
            width: 1000px;
            height: 60px;
        }
        .tab{
            width: 1000px;
            height: 300px;
        }
        .table{
        	width: 1000px;
            height: 200px;
        }
        #check2{
            width: 1000px;
            height: 60px;
            position: relative;
        }
        #btn1{
            width: 80px;
            height: 40px;
            margin-left: 550px;
            margin-top: 5px;
            position: absolute;
        }
        #btn2{
            width: 80px;
            height: 40px;
            margin-left: 430px;
            margin-top: 10px;
            position: absolute;
            display: block;
        }
        tr{
        	height: 50px;
        }
        .as{
            display: block;!important;
        }
        .as1{
            background-color:orange!important;
        }
    </style>
</head>
<body>
<div class="div1">
    <div class="title">
        <h1>账单查询</h1>
    </div>
    <div id="check1">
        <div id="text">
            <lable>月份</lable><input id="month" type="text" />
        </div>
        <input id="btn1" type="button" value="查询"/>
    </div>
    <div class="tab">
        <table  class="table table-bordered" id="mytable" border="2">
        </table>
       <!--  翻页 -->
        	<button type="button" class="btn btn-primary" id="shangbtn"><</button>
           &nbsp;
           <button type="button" class="btn btn-primary" id="firstbtn">|< </button>
           &nbsp;
           <span id="spanp1">1</span>
           
           <span>/</span>
               <span id="spanp2">10</span>
           <button type="button" class="btn btn-primary" id="lastbtn">>|</button>
           &nbsp;
           <button type="button" class="btn btn-primary" id="xiabtn">></button>
    </div>
    <div id="check2">
        <input id="btn2"  type="button" value="查看明细"/>
    </div>
</div>

<div class="div2" style="display:none">
    <div class="title">
        <h1>明细记录</h1>
    </div>
    <div class="tab">
        <table class="table table-bordered" id="mytable1" border="2">
        </table>
    </div>
</div>
<script>
    /* 为表格的点击事件，添加颜色属性并且获得accountid */
    var accountid = 0;
    function look(){
        var otable  = document.getElementById("mytable");
        var trArr = otable.getElementsByTagName("tr");

        for(var i=0;i<trArr.length;i++){
            trArr[i].onclick =function(){
                for(var j=0;j<trArr.length;j++){
                    trArr[j].className="";
                }
                this.className="as1";
                //获取到每次点击tr的index值
                accountid = this.getAttribute("index");
                console.info(accountid);
            }
        }
    }
    /*查询所有月份账单信息*/
    var id = 1;
    var page = 1;
    var row = 1;//测试
    function getData(page,row,id){
        $.ajax({
            type:"get",
            url:"<%=basePath%>account/getFee",
            async:true,
            data:{"page":page,"row":row,"id":id},
            success:function(message){
                //将获取到message字符串转化为json对象
                var s = "";
                var h = "<tr><td>身份信息</td><td>账务账号</td><td>总费用</td><td>月份</td><td>支付方式</td><td>支付状态</td></tr>"
                for(var i=0;i<message.rows.length;i++){
                    s+="<tr index='"+message.rows[i].id+"'><td>"+message.rows[i].idcomment+"</td><td>"+message.rows[i].account.accountName+"</td><td>"+message.rows[i].price+"</td><td>"+message.rows[i].month+"</td><td>"+message.rows[i].paytype+"</td><td>"+message.rows[i].paystate+"</td></tr>"
                }// index = '"+message.rows[i].idcomment+"'
                $("#mytable").html(h+s);
              //翻页
    			$("#spanp1").html(message.page);
    			$("#spanp2").html(message.totalPage);
                look();
            }
        });
    }
    getData(page,row,id);
  //上一页
    $("#shangbtn").click(function(){
    	 if(parseInt($("#spanp1").text())>1){
    		 
    		 getData(parseInt($("#spanp1").text())-1,row,id) ;
    	 }else{
    		 getData(page,row,id);
    	 }
    })

    //下一页
     $("#xiabtn").click(function(){
    	 if(parseInt($("#spanp1").text())<parseInt($("#spanp2").text())){
    		 getData(parseInt($("#spanp1").text())+1,row,id) ;
    	 }else if(parseInt($("#spanp1").text())=parseInt($("#spanp2").text())){
    		 getData($("#spanp2").text(),row,id);
    	 }
    })
    //首页
     $("#firstbtn").click(function(){
    	 
    		 getData(1,row,id);
    	 
    })
    //最后一页
     $("#lastbtn").click(function(){
    	 
    		 getData($("#spanp2").text(),row,id);
    	 
    })

    /*查询某月的账单明细*/
    function getDetail(id,month){
        $.ajax({
            type:"get",
            url:"<%=basePath%>account/getFeeByMonth",
            async:true,
            data:{"id":id,"month":month},
            success:function(message){
                //将获取到message字符串转化为json对象
                var s = "";
                var h = "<tr><td>身份信息</td><td>账务账号</td><td>总费用</td><td>月份</td><td>支付方式</td><td>支付状态</td></tr>"
                s="<tr index='"+message.id+"'><td>"+message.idcomment+"</td><td>"+message.account.accountName+"</td><td>"+message.price+"</td><td>"+message.month+"</td><td>"+message.paytype+"</td><td>"+message.paystate+"</td></tr>";
                $("#mytable").html(h+s);
                look();
            }
        });
    }
    //获取输入的月份
    $("#btn1").click(function(){
        var month = $("#month").val();
        getDetail(id,month);
    })

    /* 查看某月具体业务明细 */
    function getOsDetail(id,accountid){
        $.ajax({
            type:"get",
            url:"<%=basePath%>os/getOsDetail",
            async:true,
            data:{"id":id,"accountid":accountid},
            success:function(message){
                //将获取到message字符串转化为json对象
                var s = "";
                var h = "<tr><td>服务器信息</td><td>登录时间</td><td>退出时间</td><td>时长(s)</td><td>费用</td><td>资费套餐</td></tr>"
                /* alert("打印出数据："+message[0].allos.ipcomment); */
                for(var i=0;i<message.length;i++){
                    s+="<tr><td>"+message[i].allos.ipcomment+"</td><td>"+message[i].startTime+"</td><td>"+message[i].outTime+"</td><td>"+message[i].dateLength+"</td><td>"+message[i].price+"</td><td>"+message[i].allos.pricetype+"</td></tr>";
                }
                $("#mytable1").html(h+s);
            }
        });
    }


    $("#btn2").click(function(){
        alert("id是："+accountid);
        $("div").attr("style","");
        $(".div1").attr("style","display:none");
        getOsDetail(id,accountid);
    })
</script>
</body>
</html>