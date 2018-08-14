<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
</head>
<body>
	登陆
	<form action="${pageContext.request.contextPath }/test/login" method="POST">
		用户名: <input type="text" name="name">
		<br />
		密码: <input type="password" name="password" />
		<br />
		<input type="submit" value="登陆" />
	</form>
	<a href="${pageContext.request.contextPath }/test/regist">注册</a>
</body>
</html>