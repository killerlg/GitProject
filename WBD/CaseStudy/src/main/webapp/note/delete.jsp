<%--
  Created by IntelliJ IDEA.
  User: Q Anh DD
  Date: 10-Feb-22
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>Note Delete</h1>
    <h2>
        <a href="home">List All View</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Delete Note
                </h2>
            </caption>
            <c:if test="${note != null}">
                <input type="hidden" name="id" value="<c:out value='${note.id}' />" readonly/>
            </c:if>
            <tr>
                <th>Note Title:</th>
                <td>
                    <input type="text" name="title" size="45"
                           value="<c:out value='${note.title}' />" readonly
                    />
                </td>
            </tr>
            <tr>
                <th>Note Content:</th>
                <td>
                    <input type="text" name="content" size="45"
                           value="<c:out value='${note.content}' />" readonly
                    />
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Delete"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
