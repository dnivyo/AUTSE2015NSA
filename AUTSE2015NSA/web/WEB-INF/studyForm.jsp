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
            Title <br/>
            <input type="text" name="title" style="width: 300px;" value="<jsp:getProperty name="evidenceSource" property="title"/>"/>
        </p>
        <p>
            Author <br/>
            <input type="text" name="author" style="width: 300px;" value="<jsp:getProperty name="evidenceSource" property="author"/>"/>
        </p>
        <p>
            Journal <br/>
            <input type="text" name="journal" style="width: 300px;" value="<jsp:getProperty name="evidenceSource" property="journal"/>"/>
        </p>
        <p>
            Publishing year <br/>
            <input type="text" name="publishingYear" style="width: 300px;" value="<jsp:getProperty name="evidenceSource" property="publishingYear"/>"/>
        </p>
        <p>
            Bib ref <br/>
            <input type="text" name="bibRef" style="width: 300px;" value="<jsp:getProperty name="evidenceSource" property="bibRef"/>"/>
        </p>
        <p>
            Research level <br/>
            I <input type="radio" id="star1" name="researchLevel" value="1" />: Systematic reviews <br />
            II <input type="radio" id="star2" name="researchLevel" value="2" />: Single Experimental Studies (RCTs) <br />
            III <input type="radio" id="star3" name="researchLevel" value="3" />: Quasi-experimental Studies <br />
            IV <input type="radio" id="star4" name="researchLevel" value="4" />: Non-experimental studies <br />
            V <input type="radio" id="star5" name="researchLevel" value="5" />: Case Report / Program Evaluation / Narrative Literature Reviews <br />
            VI <input type="radio" id="star6" name="researchLevel" value="6" />: Opinion of Respected Authorities <br />
            
        </p>
        <h3>Credibility Rating</h3>
        <p>
            Credibility level <br/>
            1 <input type="radio" id="star1" name="credibilityLevel" value="1" />
            2 <input type="radio" id="star2" name="credibilityLevel" value="2" />
            3 <input type="radio" id="star3" name="credibilityLevel" value="3" />
            4 <input type="radio" id="star4" name="credibilityLevel" value="4" />
            5 <input type="radio" id="star5" name="credibilityLevel" value="5" />
        </p>
        <p>
            Reason <br/>
            <textarea name="reason" ><jsp:getProperty name="credibilityRating" property="reason"/></textarea>
        </p>
        <p>
            Rater <br/>
            <input type="text" name="rater" style="width: 300px;" value="<jsp:getProperty name="credibilityRating" property="rater"/>"/>
        </p>
        <h3>Research Design</h3>
        <p>
            Question <br/>
            <input type="text" name="question" style="width: 300px;" value="<jsp:getProperty name="researchDesign" property="question"/>"/>
        </p>
        <p>
            Method <br/>
            <input type="text" name="method" style="width: 300px;" value="<jsp:getProperty name="researchDesign" property="method"/>"/>
        </p>
        <p>
            Participants <br/>
            <input type="text" name="participants" style="width: 300px;" value="<jsp:getProperty name="researchDesign" property="participants"/>"/>
        </p>
        <p>
            Metrics <br/>
            <input type="text" name="metrics" style="width: 300px;" value="<jsp:getProperty name="researchDesign" property="metrics"/>"/>
        </p>
        <input type="submit" value="Next"/>
    </form>
</div>
</div>
<jsp:include page="footer.jsp" />