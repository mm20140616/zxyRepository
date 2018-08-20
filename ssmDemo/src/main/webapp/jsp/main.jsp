<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主界面</title>
    <jsp:include page="common.jsp" />
    <style type="text/css">
        .nav_a{
            font-weight: lighter;
            font-size: 20px;
            color: black;
        }
        .navbar-nav{
            margin-top: 5px;
        }
        #left_nav #userListBtn,#selfMegBtn{
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <!--网页顶部-->
    <div class="container topContainer">
        <div class="top">
            <div class="col-xs-12" style="background-color: #87CEEB">
                <div class="top-left col-xs-3">
                    <label class="label" style="color: black; font-weight: lighter;font-size: 20px;">
                        <p>xx管理系统</p>
                    </label>
                </div>
                <div class="col-xs-5 col-xs-offset-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#" class="nav_a"><p>svn</p></a></li>
                        <li><a href="#" class="nav_a"><p>git</p></a></li>
                        <li><a href="#" class="nav_a"><p>ubantu</p></a></li>
                        <li class="dropdown">
                            <a href="#" class="nav_a dropdown-toggle" data-toggle="dropdown">
                                <p>编程语言<span class="caret"></span></p>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><p>java</p></a></li>
                                <li><a href="#"><p>c++</p></a></li>
                                <li><a href="#"><p>php</p></a></li>
                                <li><a href="#"><p>python</p></a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div class="top-right col-xs-3">
                    <label class="label" style="color: black; font-weight: lighter;font-size: 20px;">
                        <p>欢迎：<%=request.getSession().getAttribute("username")%></p>
                    </label>
                </div>
            </div>
        </div>
    </div>
    <!--网页内容部分-->
    <div class="container main">
        <nav class="navbar navbar-default navbar-static-top col-xs-3" role="navigation">
            <div class="navbar-default navbar-collapse" style="padding-top: 10px" id="slider_sub">
                <ul class="nav" id="left_nav">
                    <li class="left-btn" style="padding-bottom: 10px">
                        <span class="btn btn-info col-xs-6 col-xs-offset-3" id="userListBtn">
                            用户展示列表
                        </span>
                        <span class="col-xs-3"> </span>
                    </li>
                    <li class="left-btn">
                        <span class="btn btn-info col-xs-6 col-xs-offset-3" id="selfMegBtn">
                            个人信息维护
                        </span>
                        <span class="col-xs-3"> </span>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="main_content col-xs-9" style="text-align: center">
            <div id="showContent"></div>
            <footer>
                <p>&copy; Hand-Company 2018</p>
            </footer>
        </div>
    </div>
</body>
<script type="text/javascript">
    $("#userListBtn").click(function () {
        //点击按钮，展示分页表格
        var url = "/userShowPage.jsp";
        $("#showContent").load(url);
    });
</script>
</html>
