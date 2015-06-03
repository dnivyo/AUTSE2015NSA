<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nz.aut.se2015.nsa.persist.EvidenceItem"%>

<jsp:include page="header.jsp" />

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
            <textarea name="benefitOutcome" value="<jsp:getProperty name="evidenceItem" property="benefitOutcome"/>"></textarea>
        </p>
        <p>
            Result<br/>
            <textarea name="evidenceItemResult" value="<jsp:getProperty name="evidenceItem" property="evidenceItemResult"/>"></textarea>
        </p>
        <p>
            Method implementation integrity<br/>
            <input type="text" name="methodImplementationIntegrity" value="<jsp:getProperty name="evidenceItem" property="methodImplementationIntegrity"/>"/>
        </p>
        <h3>Confidence Rating</h3>
        <jsp:useBean id="confidenceRating" class="nz.aut.se2015.nsa.persist.ConfidenceRating" scope="session"/>
        <p>
            Confidence level <br/>
            1 <input type="radio" id="star1" name="confidenceRatingConfidenceLevel" value="1" />
            2 <input type="radio" id="star2" name="confidenceRatingConfidenceLevel" value="2" />
            3 <input type="radio" id="star3" name="confidenceRatingConfidenceLevel" value="3" />
            4 <input type="radio" id="star4" name="confidenceRatingConfidenceLevel" value="4" />
            5 <input type="radio" id="star5" name="confidenceRatingConfidenceLevel" value="5" />
        </p>
        <p>
            <!--Needs persistence stuff-->
            Reason<br />
            <textarea name="confidenceRatingReason" value="<jsp:getProperty name="confidenceRating" property="reason"/>"></textarea>
        </p>
        <p>
            <!--Needs persistence stuff-->
            Rater<br />
            <input type="text" name="confidenceRatingRater" value="<jsp:getProperty name="confidenceRating" property="rater"/>"/>
        </p>
        <input type="submit" name="previous" value="Previous"/>
        <input type="submit" name="next" value="Next"/>
    </form>
</div>
</div>
<jsp:include page="footer.jsp" />
