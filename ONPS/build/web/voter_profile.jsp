<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jdbc.*" %>
<%@page import="java.sql.*" %>
<link rel="stylesheet" href="res/Site.css"/>



<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/polling"
                 user="root" password="system"/>
<title>
    Online Pooling
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
    

<%
  HttpSession s=request.getSession();  
  String user=(String)s.getAttribute("userId");  
String q="select voter.first_name,voter.last_name,voter.gender,voter.dob,voter.mail_id from users  INNER JOIN voter ON users.voterid=voter.voter_id where users.UserID='"+user+"'";

 ResultSet rs =DAOLayer.selectData(q);
if(rs.next())
            {
%>
<div id="wrapper">
    <table class="table" border="2">
        <tr class="gridheader"><th colspan="2"><h3>Voter Details</h3></th></tr>
        <tr>
         <th>First Name</th><th><%=rs.getString(1)%></th>
         </tr>
         <tr>
         <th>Last Name</th><th><%=rs.getString(2)%></th>
         </tr>
         <tr>
             <th>Gender</th><th><%=rs.getString(3)%></th>
         </tr>
         <tr>
         <th>Date of Birth</th><th><%=rs.getString(4)%></th>
         </tr>
         <tr>
         <th>Email ID</th><th><%=rs.getString(5)%></th>
         </tr>
         <%
            }
         %>
      </table>
      </div>

 
   
</center>
