
<!DOCTYPE html>
<html>
<head>

<title>welcome home</title>
</head>
<body class="body_bg">

<h4>   Register Here</h4>

<c :if test="${not empty SuccessMsg}">
<h4 style="color:green">${SucessMsg}</h4>
</c: if>
<c :if test="${not empty ErrorMsg}">
<h4 style="color:green">${ErrorMsg}</h4>
</c: if>


<form action="regForm" method="post">
Name:<input type="text" name="name"><br></br>
Email:<input type="text" name="email"><br></br>
Password:<input type="password" name="password"><br></br>
Phone No:<input type="text" name="PhoneNo"><br></br>
   <input type="submit" value="Register">



</form>
</body>
</html>