<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jdbc.*" %>
<%@page import="java.sql.*" %>
<link rel="stylesheet" href="res/Site.css"/>



<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/polling"
                 user="root" password="system"/>

<s:query var="rs">select * from politicalparty</s:query>
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
    

<form action="voting" method="post">
    <div id="wrapper">
     <table class="table" border="1">
         <tr class="gridheader"><th><h4>Party Name</h4></th><th></th></tr>
    <c:forEach var="cursor" items="${rs.rows}">      
         <tr>
         <td>${cursor.party_name}</td><td><input type="radio" name="vote" value="${cursor.party_id}"></td>
         </tr>
         </c:forEach>
       <tr class="gridheader"><td colspan="2"><input type="submit" value="Vote"></td></tr>
      </table>

</form>
</div>
    
   
</center>
