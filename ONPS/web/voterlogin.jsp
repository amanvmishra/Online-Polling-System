<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="res/Site.css"/>
<title>
    Online Poling
</title>
<link rel="icon" href="images/favicon.ico" type="image/x-icon">

<div id="wrapper">
    <header id="top">
        <h1 id ="heading">ONLINE NATIONAL POLING SYSTEM</a><br>
        </h1>
        <nav id="mainnav">
            <ul>
                <li><a href="index.jsp" >Home</a></li>
                <li><a href="voterlogin.jsp">Voter Login</a></li>
                
                <li><a href="about.jsp">About Us</a></li>
              
            </ul>
        </nav>
    </header>
</div>

<hr>
<center>
    <pre>
     <img src="res/login.png" width="50" height="50"/> <font size="5">LOGIN HERE</font>
<form action="authv" method="POST">
    Login ID : <input type="text" name="userId"/>
   
    Password : <input type="password" name="pass"/>
    <hr>
 
    <input class="button green" type="submit" value="Login"/> 
</form>
    </pre>
    
</center>
