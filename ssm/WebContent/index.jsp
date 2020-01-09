<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1" style="border-collapse: collapse;margin: auto;" >
	<tr>
		<th>编号</th>
		<th>用户名</th>
		<th>密码</th>
		<th>年龄</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${users }" var="user">
		<tr>
			<td>${user.id }</td>
			<td>${user.name }</td>
			<td>${user.password }</td>
			<td>${user.age }</td>
			<td>
				<a href="#">删除</a>&nbsp;&nbsp;&nbsp;
				<a href="#">修改</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>