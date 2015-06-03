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
            <textarea cols="70" rows="7" name="methodDescription" value="<jsp:getProperty name="method" property="description"/>"></textarea>
        </p>
        <h3>Methodology</h3>
        <p>
            Name <br/>
            <input type="text" name="methodologyName" value="<jsp:getProperty name="methodology" property="name"/>"/>
        </p>
        <p>
            Description <br/>
            <textarea cols="70" rows="7" name="methodologyDescription" value="<jsp:getProperty name="methodology" property="description"/>"></textarea>
        </p>
        <input type="submit" name="previous" value="Previous"/> <input type="submit" name="next" value="Next"/>
    </form>
</div>
</div>
<jsp:include page="footer.jsp" />
