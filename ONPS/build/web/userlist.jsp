<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="res/Site.css"/>
<title>
    <a href="Admin_homepage.jsp">Online Polling : Admin Voter List</a>
</title>
<link rel="icon" href="images/favicon.ico" type="image/x-icon">

<div id="wrapper">
    <header id="top">
        <h1 id ="heading">ONLINE NATIONAL POLING SYSTEM<br>
        </h1>
        <nav id="mainnav">
            <ul>
                <li><a href="add.jsp">Add</a></li>
                <li><a href="userlist.jsp">List Voter</a></li>
                   <li><a href="setting.jsp">Setting</a></li>
                   <li><a href="result.jsp">Polling Info</a></li>
                <li><a href="logout">Logout</a></li>
            </ul>
        </nav>
    </header>
</div>

<hr>
<center>
    <pre>
<s:setDataSource driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/polling"
    user="root"
    password="system"/>

<s:query var="rs">select * from voter</s:query>

     
  <table class="table" border="1">
      <tr>
          <th>Voter Id</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Mail Id</th>
          <th>city</th>
          <th>Status</th>
      </tr>
      <c:forEach var="cursor" items="${rs.rows}"> 
      <tr class="gridrow">
        <td>${cursor.voter_id}</td>
        <td>${cursor.first_name}</td>
        <td>${cursor.last_name}</td>
        <td>${cursor.mail_id}</td>
        <td>${cursor.citycode}</td>
        <td>${cursor.voting_status}</td>
        
</c:forEach>
      </table>

    </pre>
   
</center>
