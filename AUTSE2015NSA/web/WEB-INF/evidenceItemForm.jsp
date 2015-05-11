<%-- 
    Document   : evidenceItemForm
    Created on : May 10, 2015, 5:33:03 PM
    Author     : erikzweidorff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nz.aut.se2015.nsa.persist.EvidenceItem"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/default.css" type="text/css" />
        <title>Evidence Item Form</title>
    </head>
    <body>
        <div id="header">
            <h1><a href="#">SERLER <br/>
                    <p>Software Engineering Research Laboratory Education Repository</p></a></h1>
            <h2>
                Login<br/>
                <form method="POST">
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
                    <h3>Evidence Item</h3>
                    <form action="/AUTSE2015NSA/EvidenceItemFormServlet" method="POST">
                        <jsp:useBean id="evidenceItem" class="nz.aut.se2015.nsa.persist.EvidenceItem" scope="session"/>
                        <p>
                            Context: why <br/>
                            <input type="text" name="contextWhy" value="<jsp:getProperty name="evidenceItem" property="contextWhy"/>"/>
                        </p>
                        <p>
                            Context: who <br/>
                            <input type="text" name="contextWho" value="<jsp:getProperty name="evidenceItem" property="contextWho"/>"/>
                        </p>
                        <p>
                            Context: what <br/>
                            <input type="text" name="contextWhat" value="<jsp:getProperty name="evidenceItem" property="contextWhat"/>"/>
                        </p>
                        <p>
                            Context: where <br/>
                            <input type="text" name="contextWhere" value="<jsp:getProperty name="evidenceItem" property="contextWhere"/>"/>
                        </p>
                        <p>
                            Context: when <br/>
                            <input type="text" name="contextWhen" value="<jsp:getProperty name="evidenceItem" property="contextWhen"/>"/>
                        </p>
                        <p>
                            Context: how <br/>
                            <input type="text" name="contextHow" value="<jsp:getProperty name="evidenceItem" property="contextHow"/>"/>
                        </p>
                        <p>
                            Benefit under test<br/>
                            <input type="text" name="benefitOutcome" value="<jsp:getProperty name="evidenceItem" property="benefitOutcome"/>"/>
                        </p>
                        <p>
                            Result<br/>
                            <input type="text" name="evidenceItemResult" value="<jsp:getProperty name="evidenceItem" property="evidenceItemResult"/>"/>
                        </p>
                        <p>
                            Method implementation integrity<br/>
                            <input type="text" name="methodImplementationIntegrity" value="<jsp:getProperty name="evidenceItem" property="methodImplementationIntegrity"/>"/>
                        </p>
                        <input type="submit" value="Next"/>
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
                <h4>Waterfall</h4>
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
