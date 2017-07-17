<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
        <link href="CSS/login.css" rel="stylesheet">
        <script type="text/javascript" src="JS/jquery-1.9.1.min.js"></script>
        <script type="text/javascript" src="JS/jquery.validate.min.js"></script>
        <script type="text/javascript" src="JS/messages_zh.min.js"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
        <script type="text/javascript" src="JS/login.js"></script>
    </head>
    <body>
    	<div class="container">
    		<div class="login">
    			<p>图书管理</p>
    			<div class="top">
    				<form action="main.do" method="post" id="loginForm">
					  <input type="text"  class="form-control"  placeholder="用户名" name="name" id="name" required>
					  <input type="text"  class="form-control" placeholder="密码" name="password" id="password" required>
					  <button type="submit" class="btn btn-info" >登录</button>

	    			</form>
    			</div>
    			<span id="errorMsg">${errorMsg }</span>
    		</div>
    	</div>
    </body>
</html>