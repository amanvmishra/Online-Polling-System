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
    <c:set var="now" value="<%=new java.util.Date()%>" />
    
 <pre>
      <font size="5">Set Voting Date and Time</font>
<form action="startvote" method="POST">
    Start : <input type="text" name="start" value="${now}"/>
   
    End : <input type="text" name="end"/>
    <hr>
    
    <input class="button green" type="submit" value="Start"/> 
</form>
    </pre>
</center>
