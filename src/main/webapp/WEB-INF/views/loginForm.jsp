<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login</title>
</head>
<body>
<h1>
	Welcome Login
</h1>

<form action="login" method="post">
	<input type="text" name="username">
	<input type="password" name="password">
	<input type="submit" value="登录"> <a href="register"><input type="button" value="注册"></a>
</form>

<h3>
${message }
</h3>

</body>
</html>
