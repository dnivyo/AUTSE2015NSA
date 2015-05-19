<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="nz.aut.se2015.nsa.persist.Method"%>
<%@page import="nz.aut.se2015.nsa.persist.Methodology"%>

<jsp:include page="header.jsp" />
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
        <input type="submit" name="previous" value="Previous"/> <input type="submit" name="next" value="Next"/>
    </form>
</div>
</div>
<jsp:include page="footer.jsp" />
