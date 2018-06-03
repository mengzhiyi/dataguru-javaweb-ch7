<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login</title>
</head>
<body>
<h1>
	Welcome Register
</h1>

<form action="register" method="post">

	用户名：<input type="text" name="username"> <br>
	密码：<input type="password" name="password"> <br>
	电子邮箱：<input type="text" name="email"> <br>
	性别：<input type="radio" name="gender" value="1" checked>男
	<input type="radio" name="gender" value="2">女 			<br>
	简介：<input type="text" name="simpleDesc"> <br>
	
	<input type="submit" value="提交"> 
</form>

<h3>
${message }
</h3>

</body>
</html>
