<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nz.aut.se2015.nsa.persist.EvidenceSource"%>
<%@page import="nz.aut.se2015.nsa.persist.CredibilityRating"%>
<%@page import="nz.aut.se2015.nsa.persist.ResearchDesign"%>

<jsp:include page="header.jsp" />
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
        <input type="submit" value="Next"/>
    </form>
</div>
</div>
<jsp:include page="footer.jsp" />