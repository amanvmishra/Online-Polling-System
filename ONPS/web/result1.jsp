<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <li><a href="voter_homepage.jsp">Home</a></li>
                   <li><a href="viewnotice.jsp">Notice</a></li>
                   <li><a href="result1.jsp">Polling Status</a></li>
                <li><a href="finalresult.jsp">Result</a></li>
                <li><a href="logout">Logout</a></li>
            </ul>
        </nav>
    </header>
</div>

<hr>
<center>
   <div id="wrapper">
      <table class="table" border="1">
          <tr class="gridheader">
         <th>Party Id</th>
         <th>Party Name</th>
         <th>Total Votes</th>
         </tr>
    <c:forEach var="cursor" items="${rs.rows}">      
         <tr>
         <td>${cursor.party_id}</td>
         <td>${cursor.party_name}</td>
         <td>${cursor.vote}</td>
         </tr>
         </c:forEach>
       <tr class="gridfooter"></tr>
      </table>
   </div>
</center>
