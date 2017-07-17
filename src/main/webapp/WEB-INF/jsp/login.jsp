<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="CSS/login.css">
        <script type="text/javascript" src="JS/jquery-1.9.1.min.js"></script>
        <script type="text/javascript" src="JS/bootstrap.min.js"></script>
    </head>
    <body>
    	<div class="container">
    		<div class="login">
    			<p>图书管理</p>
    			<div class="top">
    				<form action="#" method="post">
					  <input type="text"  class="form-control"  placeholder="用户名">
					  <input type="text"  class="form-control" placeholder="密码">
					  <button type="submit" class="btn btn-info">登录</button>

	    			</form>
    			</div>
    			<span>${errorMsg }</span>
    		</div>
    	</div>
    </body>
</html>