<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="res/Site.css"/>
<title>
    Online Polling
</title>
<link rel="icon" href="images/favicon.ico" type="image/x-icon">

<div id="wrapper">
    <header id="top">
        <h1 id ="heading">ONLINE NATIONAL POLING SYSTEM<br>
        </h1>
        <nav id="mainnav">
            <ul><li><a href="Admin_homepage.jsp">Home</a></li>
               <li><a href="updatenotice.jsp">Update Notice</a></li>
                <li><a href="start.jsp">Start Voting</a></li>
                   <li><a href="change_password1.jsp">Change Password</a></li>
                <li><a href="logout">Logout</a></li>
            </ul>
        </nav>
    </header>
</div>

<hr>
<center>
    <pre>
     <font size="5">CHANGE PASSWORD</font>
<form action="changepass" method="POST">
    New Password : <input type="text" name="npass"/>
   
    Confirm Password : <input type="password" name="cpass"/>
    <hr>
    <h4 style="color: red">${requestScope.msg}</h4>
    
    <input class="button green" type="submit" value="Change"/>
</form>
    </pre>
</center>
