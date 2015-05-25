<%-- 
    Document   : advancedSearch
    Created on : May 25, 2015, 9:09:39 PM
    Author     : erikzweidorff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="WEB-INF/header.jsp" />
<div style="padding: 20px;">
    <h2>Advanced Search</h2>
    <p>Methodology: <input type="text"> Keyword: <input type="text"></p>
    <p>Rating: <input type="text"> Author:  <input type="text"> </p>
    <p>Year: <input type="text"> </p>

    <h2>Results</h2>
    <p>
    <table>
        <tr>
            <th>Title</th>
            <th>Methodology     </th>
            <th>Author</th>
            <th>Year</th>
            <th>Rating</th>
        </tr>
        <div id="smallTable">
            <tr>
                <td>UI Programming in SCRUM</td>
                <td>SCRUM</td>
                <td>L. S. Movva</td>
                <td>2013</td>
                <td>4</td>
            </tr>
            <tr>
                <td>UI Programming in SCRUM</td>
                <td>SCRUM</td>
                <td>L. S. Movva</td>
                <td>2013</td>
                <td>4</td>
            </tr>
            <tr>
                <td>UI Programming in SCRUM</td>
                <td>SCRUM</td>
                <td>L. S. Movva</td>
                <td>2013</td>
                <td>4</td>
            </tr>
        </div>
    </table>
</p>

</div>
</div>
<jsp:include page="WEB-INF/footer.jsp" />