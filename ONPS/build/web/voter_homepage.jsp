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

<%
  HttpSession s=request.getSession();  
  String user=(String)s.getAttribute("userId");  
%>
<hr>
<center>
    <pre>
     <div id="wrapper"><h2><font color="blue">Welcome <%=user%> </font></h2></div>
    </pre>
   
</center>
