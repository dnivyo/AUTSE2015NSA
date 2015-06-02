<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="WEB-INF/header.jsp" />
<div style="padding: 20px;">
    <h2>SERLER</h2>
    <h3>About</h3>
    <form>
        <table id="fieldTable">
            <tr>
                <td>Field 1: </td>
                <td>
                    <select>
                        <option>Author</option>
                        <option>Title</option>
                        <option>Year</option>
                        <option>Methodology</option>
                        <option>Method</option>
                        <option>...</option>
                    </select>
                </td>
                <td>Search: <input type="text" name="field1"</td>
            </tr>
        </table>
        <table>
            <tr>
                <td><input type="button" value="Add field" id="button"  onclick="addField('fieldTable')" /></td>
                <td><input type="submit"/></td>
            </tr>
        </table>
    </form>
    <p></p>
</div>
</div>
<jsp:include page="WEB-INF/footer.jsp" />
