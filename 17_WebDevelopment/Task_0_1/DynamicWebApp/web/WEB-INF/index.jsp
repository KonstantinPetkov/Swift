<%-- 
    Document   : index
    Created on : Nov 17, 2016, 8:44:58 PM
    Author     : Konstantin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Citizen</title>
    </head>
    <body>
        <div id = "name">
            <ul>
                <li>First name:<%=getParameter()%></li>
                <li>Surname: </li>
                <li>Date of birth: </li>
                <li>Prof: </li>
                <li><a href = "web/index.html">Back</a></li>
            </ul>
        </div>
    </body>
</html>
