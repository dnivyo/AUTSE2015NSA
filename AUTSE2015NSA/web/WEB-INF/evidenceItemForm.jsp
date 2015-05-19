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
        <input type="submit" name="previous" value="Previous"/>
        <input type="submit" name="next" value="Next"/>
    </form>
</div>
</div>
<jsp:include page="footer.jsp" />
