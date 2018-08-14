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
	=============用户信息==============
	<form action="${pageContext.request.contextPath }/test/updateUser" method="POST">
		<input type="hidden" name="id" value="${user.id }">
		用户名: <input type="text" name="name" value="${user.name }">
		<br />
		密码: <input type="password" name="password" value="${user.password}"/>
		<br />
		<input type="submit" value="提交" />
	</form>
	<a href="${pageContext.request.contextPath }/test/delete?id=${user.id }">永久删除账户</a>
</body>
</html>