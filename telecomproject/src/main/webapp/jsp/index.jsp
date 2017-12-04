<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=basePath%>static/js/jquery-3.2.1.min.js" charset="utf-8"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>
    <!-- CSS Libs -->
    <link rel="stylesheet" type="text/css" href="../static/lib/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../static/lib/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../static/lib/css/animate.min.css">
    <link rel="stylesheet" type="text/css" href="../static/lib/css/bootstrap-switch.min.css">
    <link rel="stylesheet" type="text/css" href="../static/lib/css/checkbox3.min.css">
    <link rel="stylesheet" type="text/css" href="../static/lib/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="../static/lib/css/dataTables.bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../static/lib/css/select2.min.css">
    <!-- CSS App -->
    <link rel="stylesheet" type="text/css" href="../static/css/style.css">
    <link rel="stylesheet" type="text/css" href="../static/css/themes/flat-blue.css">
	<style>
		button{
            border: none;
            background-color: #323841;
            color: white;
            margin-left: 50px;
        }
	</style>
</head>
<body class="flat-blue">
    <div class="app-container">
        <div class="row content-container">
            <nav class="navbar navbar-default navbar-fixed-top navbar-top">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-expand-toggle">
                            <i class="fa fa-bars icon"></i>
                        </button>
                        <ol class="breadcrumb navbar-breadcrumb">
                            <li class="active">welcome</li>
                        </ol>
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-th icon"></i>
                        </button>
                    </div>
                    <ul class="nav navbar-nav navbar-right">
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-times icon"></i>
                        </button>
                        <li class="dropdown profile">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">用户信息<span class="caret"></span></a>
                            <ul class="dropdown-menu animated fadeInDown">
                                <li class="profile-img">
                                    <img src="../img/profile/picjumbo.com_HNCK4153_resize.jpg" class="profile-img">
                                </li>
                                <li>
                                    <div class="profile-info">
                                        <h4 class="username">当前用户</h4>
                                        <p>emily_hart@email.com</p>
                                        <div class="btn-group margin-bottom-2x" role="group">
                                            <!--<button type="button" class="btn btn-default"><i class="fa fa-user"></i> Profile</button>-->
                                            <button type="button" class="btn btn-default"><i class="fa fa-sign-out"></i> 退出登录</button>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
            <div class="side-menu sidebar-inverse">
                <nav class="navbar navbar-default" role="navigation">
                    <div class="side-menu-container">
                        <div class="navbar-header">
                            <a class="navbar-brand" href="#">
                                <div class="icon fa fa-paper-plane"></div>
                                <div class="title">电信计费系统</div>
                            </a>
                            <button type="button" class="navbar-expand-toggle pull-right visible-xs">
                                <i class="fa fa-times icon"></i>
                            </button>
                        </div>
                        <ul class="nav navbar-nav">
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-element">
                                    <span class="icon fa fa-desktop"></span><span class="title">基础服务界面</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-element" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="#">个人信息</a>
                                            </li>
                                            <li><a href="ui-kits/grid.html">修改密码</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-table">
                                    <span class="icon fa fa-table"></span><span class="title">前台用户系统</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-table" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><button id="CheckAccount" onclick="loading(this)">查询账单</button>
                                            <!-- <a href="zifuwujsp/CheckAccount.jsp">查询账单</a> -->
                                            </li>
                                            <li><button id="UpdateMsg" onclick="loading(this)">修改个人信息</button>
                                            <!-- <a href="zifuwujsp/NewUpdateMsg.jsp">修改个人信息</a> -->
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-form">
                                    <span class="icon fa fa-file-text-o"></span><span class="title">前台运营系统</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-form" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="form/ui-kits.html">用户管理系统</a>
                                            </li>
                                            <li><a href="form/ui-kits.html">管理员管理系统</a>
                                            </li>
                                            <li><a href="form/ui-kits.html">资费管理系统</a>
                                            </li>
                                            <li><a href="form/ui-kits.html">账单查询系统</a>
                                            </li>
                                            <li><a href="form/ui-kits.html">账务查询系统</a>
                                            </li>
                                            <li><a href="form/ui-kits.html">权限管理系统</a>
                                            </li>
                                            <li><a href="form/ui-kits.html">前台日志系统</a>
                                            </li>
                                            <li><a href="form/ui-kits.html">报表查询系统</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a href="license.html">
                                    <span class="icon fa fa-thumbs-o-up"></span><span class="title">License</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <!-- /.navbar-collapse -->
                </nav>
            </div>
            <div class="container-fluid">
                <div class="side-body padding-top">
                    <iframe id="if" src="welcome.jsp" style="width:1300px;height: 500px;">
                    </iframe>
                </div>
            </div>
        </div>
        </div>
		    <script>
		        function loading(object){
		            var oid = $(object).attr("id");
		            console.info(oid);
		            var of = $("#if").attr("src","zifuwujsp/"+oid+".jsp");
		        }
		    </script>
            <!-- Javascript Libs -->
            <script type="text/javascript" src="../static/lib/js/jquery.min.js"></script>
            <script type="text/javascript" src="../static/lib/js/bootstrap.min.js"></script>
            <script type="text/javascript" src="../static/lib/js/Chart.min.js"></script>
            <script type="text/javascript" src="../static/lib/js/bootstrap-switch.min.js"></script>
            <script type="text/javascript" src="../static/lib/js/jquery.matchHeight-min.js"></script>
            <script type="text/javascript" src="../static/lib/js/jquery.dataTables.min.js"></script>
            <script type="text/javascript" src="../static/lib/js/dataTables.bootstrap.min.js"></script>
            <script type="text/javascript" src="../static/lib/js/select2.full.min.js"></script>
            <script type="text/javascript" src="../static/lib/js/ace/ace.js"></script>
            <script type="text/javascript" src="../static/lib/js/ace/mode-html.js"></script>
            <script type="text/javascript" src="../static/lib/js/ace/theme-github.js"></script>
            <!-- Javascript -->
            <script type="text/javascript" src="../static/js/app.js"></script>
            <script type="text/javascript" src="../static/js/index.js"></script>
</body>
</html>