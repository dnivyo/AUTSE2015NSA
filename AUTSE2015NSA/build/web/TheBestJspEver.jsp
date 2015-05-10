<%-- 
    Document   : TheBestJspEver
    Created on : May 1, 2015, 1:54:12 PM
    Author     : erikzweidorff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nz.aut.se2015.nsa.persist.Methodology"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="methodology" class="nz.aut.se2015.nsa.persist.Methodology" scope="session"/>
        <h1>Hello World!</h1>
        <p>Methodology name: 
        <jsp:getProperty name="methodology" property="name"/>
        </p>
        
        <p>Description: 
        <jsp:getProperty name="methodology" property="description"/>
        </p>

    </body>
</html>
