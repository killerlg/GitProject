<%--
  Created by IntelliJ IDEA.
  User: Q Anh DD
  Date: 10-Feb-22
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home Note</title>
    <style>
        table {
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="home?action=create">Add New Note</a>
    </h2>
    <h2>Search Note</h2>
    <form method="post" action="home?action=search">
        <input type="text" name="keyword">
        <input type="submit" value="Search">
    </form>
</center>
<div style="text-align: center">${message}</div>
<div class="container" align="center">
    <table border="1" cellpadding="5">
        <thead>
        <tr>
            <td>ID</td>
            <td>Title</td>
            <td>Content</td>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${noteList}" var="note">
            <tr>
                <td><a href="home?action=read&id=${note.id}">${note.id}</a></td>
                <td>${note.title}</td>
                <td>${note.content}</td>
                <td>
                    <a href="home?action=update&id=${note.id}">Update</a>
                    <a href="home?action=delete&id=${note.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
