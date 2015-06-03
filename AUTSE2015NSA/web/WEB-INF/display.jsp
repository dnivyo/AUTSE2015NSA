<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />

<div style="padding: 20px;">
    <h1>Overview</h1>
    <jsp:useBean id="EvidenceSource" class="nz.aut.se2015.nsa.persist.EvidenceSource" scope="session"/>
    <jsp:useBean id="CredibilityRating" class="nz.aut.se2015.nsa.persist.CredibilityRating" scope="session"/>
    <jsp:useBean id="ResearchDesign" class="nz.aut.se2015.nsa.persist.ResearchDesign" scope="session"/>
    <h3>Evidence Source</h3>
    <p>
        <!--Needs to change the persistence name and property-->
        Title: <jsp:getProperty name="evidenceSource" property="title"/>
    </p>
    <p>
        <!--Needs to change the persistence name and property-->
        Author: <jsp:getProperty name="evidenceSource" property="author"/>
    </p>
    <p>
        <!--Needs to change the persistence name and property-->
        Journal: <jsp:getProperty name="evidenceSource" property="journal"/>
    </p>
    <p>
        <!--Needs to change the persistence name and property-->
        Publishing year: <jsp:getProperty name="evidenceSource" property="publishingYear"/>
    </p>
    <p>
        Bib ref: <jsp:getProperty name="evidenceSource" property="bibRef"/>
    </p>
    <p>
        Research level: <jsp:getProperty name="evidenceSource" property="researchLevel"/>
    </p>
    <h3>Credibility Rating</h3>
    <p>
        Credibility level:<jsp:getProperty name="credibilityRating" property="credibilityLevel"/>
    </p>
    <p>
        Reason: <jsp:getProperty name="credibilityRating" property="reason"/>
    </p>
    <p>
        Rater: <jsp:getProperty name="credibilityRating" property="rater"/>
    </p>
    <h3>Research Design</h3>
    <p>
        Question: <jsp:getProperty name="researchDesign" property="question"/>
    </p>
    <p>
        Method: <jsp:getProperty name="researchDesign" property="method"/>
    </p>
    <p>
        Participants: <jsp:getProperty name="researchDesign" property="participants"/>
    </p>
    <p>
        Metrics: <jsp:getProperty name="researchDesign" property="metrics"/>
    </p>

    <h3>Method</h3>
    <jsp:useBean id="Method" class="nz.aut.se2015.nsa.persist.Method" scope="session"/>
    <jsp:useBean id="Methodology" class="nz.aut.se2015.nsa.persist.Methodology" scope="session"/>
    <p>
        Name: <jsp:getProperty name="method" property="name"/>
    </p>
    <p>
        Description: <jsp:getProperty name="method" property="description"/>
    </p>
    <h3>Methodology</h3>
    <p>
        Name: <jsp:getProperty name="methodology" property="name"/>
    </p>
    <p>
        Description: <jsp:getProperty name="methodology" property="description"/>
    </p>

    <h3>Evidence Item</h3>
    <jsp:useBean id="evidenceItem" class="nz.aut.se2015.nsa.persist.EvidenceItem" scope="session"/>
    <p>
        Context: why: <jsp:getProperty name="evidenceItem" property="contextWhy"/>
    </p>
    <p>
        Context: who: <jsp:getProperty name="evidenceItem" property="contextWho"/>
    </p>
    <p>
        Context: what: <jsp:getProperty name="evidenceItem" property="contextWhat"/>
    </p>
    <p>
        Context: where: <jsp:getProperty name="evidenceItem" property="contextWhere"/>
    </p>
    <p>
        Context: when: <jsp:getProperty name="evidenceItem" property="contextWhen"/>
    </p>
    <p>
        Context: how: <jsp:getProperty name="evidenceItem" property="contextHow"/>
    </p>
    <p>
        Benefit under test: <jsp:getProperty name="evidenceItem" property="benefitOutcome"/>
    </p>
    <p>
        Result: <jsp:getProperty name="evidenceItem" property="evidenceItemResult"/>
    </p>
    <p>
        Method implementation integrity: <jsp:getProperty name="evidenceItem" property="methodImplementationIntegrity"/>
    </p>

    <form action="/AUTSE2015NSA/DisplayServlet" method="POST">
        <input type="submit" name="previous" value="Previous"/>
        <input type="submit" name="saveToDB" value="Save"/>
    </form>
</div>
</div>

<jsp:include page="footer.jsp" />
