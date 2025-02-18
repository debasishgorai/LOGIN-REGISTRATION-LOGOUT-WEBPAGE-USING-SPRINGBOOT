

<!DOCTYPE html>
<html>
<head>

<title>welcome home</title>
</head>
<body class="body_bg">

<h4>   Login Here</h4>

<c :if test="${not empty ErrorMsg}">
<h4 style="color:green">${ErrorMsg}</h4>
</c: if>


<form action="loginForm" method="post">

Email:<input type="text" name="email"><br></br>
Password:<input type="password" name="password"><br></br>

   <input type="submit" value="Login">
</form>
<br></br>
if not registered ...<a href="regPage"><b>Click Here</b></a>


</body>
</html>