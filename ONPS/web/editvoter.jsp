<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="res/Site.css"/>
<title>
    Online Pooling : LOGIN
</title>
<link rel="icon" href="images/favicon.ico" type="image/x-icon">

<div id="wrapper">
    <header id="top">
        <h1 id ="heading">ONLINE NATIONAL POLING SYSTEM<br>
        </h1>
        <nav id="mainnav">
            <ul>
                <li><a href="index.html" >Home</a></li>
                <li><a href="login.jsp"class="thispage">Voter Login</a></li>
                <li><a href="register.jsp">Voter Registration</a></li>
              
            </ul>
        </nav>
    </header>
</div>

<hr>
<center>
    <pre>
     <img src="res/login.png" width="50" height="50"/> <font size="5">LOGIN HERE</font>
<form action="editv" method="POST">
    First Name : <input type="text" name="userId"/>
   
    Last Name : <input type="password" name="pass"/>
    
    First Name : <input type="text" name="userId"/>
   
    Last Name : <input type="password" name="pass"/>
    
    First Name : <input type="text" name="userId"/>
   
    Last Name : <input type="password" name="pass"/>
    <hr>
    <h4 style="color: red">${requestScope.msg}</h4>
    
    <input class="button green" type="submit" value="Login"/> <input class="button red" type="reset"/>
</form>
    </pre>
    <img src="res/register.png" width="40px" height="40px"/>
    <a href="register.jsp">REGISTER HERE</a>
</center>
