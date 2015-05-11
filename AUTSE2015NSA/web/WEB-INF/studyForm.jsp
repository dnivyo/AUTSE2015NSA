<%-- 
    Document   : studyForm
    Created on : May 11, 2015, 8:44:05 PM
    Author     : erikzweidorff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nz.aut.se2015.nsa.persist.EvidenceSource"%>
<%@page import="nz.aut.se2015.nsa.persist.CredibilityRating"%>
<%@page import="nz.aut.se2015.nsa.persist.ResearchDesign"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/default.css" type="text/css" />
        <title>Study Form</title>
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
                    <h2>Study</h2>
                    <form action="/AUTSE2015NSA/StudyFormServlet" method="POST">
                        <jsp:useBean id="EvidenceSource" class="nz.aut.se2015.nsa.persist.EvidenceSource" scope="session"/>
                        <jsp:useBean id="CredibilityRating" class="nz.aut.se2015.nsa.persist.CredibilityRating" scope="session"/>
                        <jsp:useBean id="ResearchDesign" class="nz.aut.se2015.nsa.persist.ResearchDesign" scope="session"/>
                        <h3>Evidence Source</h3>
                        <p>
                            Bib ref <br/>
                            <input type="text" name="bibRef" value="<jsp:getProperty name="evidenceSource" property="bibRef"/>"/>
                        </p>
                        <p>
                            Research level <br/>
                            <input type="text" name="researchLevel" value="<jsp:getProperty name="evidenceSource" property="researchLevel"/>"/>
                        </p>
                        <h3>Credibility Rating</h3>
                        <p>
                            Credibility level <br/>
                            <input type="text" name="credibilityLevel" value="<jsp:getProperty name="credibilityRating" property="credibilityLevel"/>"/>
                        </p>
                        <p>
                            Reason <br/>
                            <input type="text" name="reason" value="<jsp:getProperty name="credibilityRating" property="reason"/>"/>
                        </p>
                        <p>
                            Rater <br/>
                            <input type="text" name="rater" value="<jsp:getProperty name="credibilityRating" property="rater"/>"/>
                        </p>
                        <h3>Research Design</h3>
                        <p>
                            Question <br/>
                            <input type="text" name="question" value="<jsp:getProperty name="researchDesign" property="question"/>"/>
                        </p>
                        <p>
                            Method <br/>
                            <input type="text" name="method" value="<jsp:getProperty name="researchDesign" property="method"/>"/>
                        </p>
                        <p>
                            Participants <br/>
                            <input type="text" name="participants" value="<jsp:getProperty name="researchDesign" property="participants"/>"/>
                        </p>
                        <p>
                            Metrics <br/>
                            <input type="text" name="metrics" value="<jsp:getProperty name="researchDesign" property="metrics"/>"/>
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