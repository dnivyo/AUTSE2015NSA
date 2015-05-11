<%-- 
    Document   : methodForm
    Created on : May 11, 2015, 7:55:30 PM
    Author     : erikzweidorff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nz.aut.se2015.nsa.persist.Method"%>
<%@page import="nz.aut.se2015.nsa.persist.Methodology"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/default.css" type="text/css" />
        <title>Method and Methodology Form</title>
    </head>
    <body>
        <div id="header">
            <h1><a href="#">SERLER <br/>
                    <p>Software Engineering Research Laboratory Education Repository</p></a></h1>
            <h2>
                Login<br/>
                <form type="POST">
                    <input type="text" name="username" size="25" value="">
                    <input type="password" name="password" size="25" value=""> <br/>
                    <input type="submit" value="Login"/> <input type="button" value="Register"/>
                </form>
            </h2>
        </div>
        <div id="content">
            <div id="colOne">
                <div id="menu">
                    <ul>
                        <li><a href="#" accesskey="1" title="">Home</a></li>
                        <li><a href="#" accesskey="2" title="">Advanced Search </a></li>
                        <li><a href="#" accesskey="3" title="">Profile</a></li>
                    </ul>
                </div>
                <div style="padding: 20px;">
                    <h2>Add Evidence</h2>
                    <form action="/AUTSE2015NSA/MethodFormServlet" method="POST">
                        <jsp:useBean id="Method" class="nz.aut.se2015.nsa.persist.Method" scope="session"/>
                        <jsp:useBean id="Methodology" class="nz.aut.se2015.nsa.persist.Methodology" scope="session"/>
                        <h3>Method</h3>
                        <p>
                            Name <br/>
                            <input type="text" name="methodName" value="<jsp:getProperty name="method" property="name"/>"/>
                        </p>
                        <p>
                            Description <br/>
                            <input type="text" name="methodDescription" value="<jsp:getProperty name="method" property="description"/>"/>
                        </p>
                        <h3>Methodology</h3>
                        <p>
                            Name <br/>
                            <input type="text" name="methodologyName" value="<jsp:getProperty name="methodology" property="name"/>"/>
                        </p>
                        <p>
                            Description <br/>
                            <input type="text" name="methodologyDescription" value="<jsp:getProperty name="methodology" property="description"/>"/>
                        </p>
                        <input type="submit" value="Previous"/> <input type="submit" value="Next"/>
                    </form>
                </div>
            </div>
            <div id="colTwo">
                <h3>Categories</h3>
                <h4>SCRUM </h4>
                <h4>XP</h4>
                <h4>RAD</h4>
                <h4>DSDM</h4>
                <h4>UP</h4>
                <h4>Waterfall </h4>
                <h4>Cleanroom</h4>
                <h4>V-model</h4>
                <h4>Spiral</h4>
                <h4>Lean</h4>
            </div>
            <div style="clear: both;">&nbsp;</div>
        </div>
        <div id="footer">
            <p align="center">Copyright Blue Balls of Destruction</p>
        </div>
    </body>
</html>
