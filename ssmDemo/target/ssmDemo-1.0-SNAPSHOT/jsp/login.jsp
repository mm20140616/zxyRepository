<%--
  Created by IntelliJ IDEA.
  User: 赵晓宇
  Date: 2018/8/12
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
    <jsp:include page="common.jsp" />
</head>
<body>
<div class="container">
    <form id="loginForm" class="loginForm">
        <div style="margin-top: 100px;">
            <!--用户名输入框 -->
            <div class="input-group col-xs-4 col-xs-offset-4">
                <span class="input-group-addon" id="addon2">@</span>
                <input id="userName" name="userName" type="text" class="form-control" placeholder="用户名" aria-describedby="addon2">
            </div>
            <br>
            <!--密码输入框 -->
            <div class="input-group col-xs-4 col-xs-offset-4">
                <span class="input-group-addon" id="addon3">@</span>
                <input id="password" name="password" type="password" class="form-control" placeholder="密码" aria-describedby="addon3">
            </div>
            <br>
            <!--登陆按钮 -->
            <div class="col-xs-4 col-xs-offset-4">
                <span style="width: 100%;" class="btn btn-default" id="loginBtn">登 录</span>
            </div>
        </div>
    </form>
</div>
</body>
<script>
    function checkLogin () {
        var username = $("#userName").val();
        var password = $("#password").val();
        if (username==""||username==null) {
            alert("用户名不能为空");
            location.reload();
        }
        if (password==""||password==null) {
            alert("请输入密码");
            location.reload();
        }
        $.ajax({
            url: '/checkLogin',
            type: 'POST',
            data: JSON.stringify({'username': username, 'password': password}),
            contentType: "application/json",
            dataType: 'json',
            success:function (result) {
                console.log(result.__status+"------");
                if(result.__status == "success") {
                    var msg = result.message;
                    alert(msg);
                    window.location.href = "jsp/main.jsp";
                    return ;
                }
                if (result == "error") {
                    var msg = result.message;
                    alert(msg);
                    window.location.href = "jsp/error.jsp";
                    return ;
                }
            }
        });


    }
    $("#loginBtn").click(function () {
        checkLogin();
    });
</script>
</html>

