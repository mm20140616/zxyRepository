<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主界面</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <div class="top">
            <div class="col-xs-12">
                <div class="top-left col-xs-3">
                    <h3>xx管理系统</h3>
                </div>
                <div class="col-xs-5">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">svn</a></li>
                        <li><a href="#">git</a></li>
                        <li><a href="#">ubantu</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                编程语言
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">java</a></li>
                                <li><a href="#">c++</a></li>
                                <li><a href="#">php</a></li>
                                <li><a href="#">python</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div class="top-right col-xs-4">
                    <p>放置头像</p>
                </div>
            </div>
        </div>
        <div class="center-block" style="background-color: #4cae4c"></div>
        <div class="bottom" style="background-color: #5bc0de"></div>
    </div>
</body>
</html>
