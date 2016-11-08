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
            <ul>
                <li><a href="voter_profile.jsp">Profile</a></li>
                   <li><a href="vote.jsp">Vote</a></li>
                   <li><a href="updates.jsp">Updates</a></li>
                <li><a href="change_password.jsp">Change Password</a></li>
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
    New Password     : <input type="text" name="npass"/>
   
    Confirm Password : <input type="password" name="cpass"/>
    <hr>
  
    
    <input class="button green" type="submit" value="Change"/>
</form>
    </pre>
</center>
