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
                <li><a href="Admin_homepage.jsp">hOME</a></li>
                <li><a href="addparty.jsp">Add Party</a></li>
                <li><a href="addcandidate">Add Candidate</a></li>
                   
                <li><a href="logout">Logout</a></li>
            </ul>
        </nav>
    </header>
</div>

<hr>
<center>
    <pre>
      <font size="5">ADD PARTY</font>
<form action="addparty" method="POST">
    Party Id : <input type="text" name="partyid"/>
   
    Party Name : <input type="text" name="partyname"/>
    <hr>
        
    <input class="button green" type="submit" value="Add"/> <input class="button red" type="reset" Value="Reset"/>
</form>
    </pre>
</center>
