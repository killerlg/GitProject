<%--
  Created by IntelliJ IDEA.
  User: Q Anh DD
  Date: 10-Feb-22
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
  <a href="products">Back to product list</a>
</p>
<form method="post">
  <h3>Are you sure?</h3>
  <fieldset>
    <legend>Customer information</legend>
    <table>
      <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
      </tr>
      <tr>
        <td>Email: </td>
        <td>${requestScope["product"].getAmount()}</td>
      </tr>
      <tr>
        <td>Address: </td>
        <td>${requestScope["product"].getPrice()}</td>
      </tr>
      <tr>
        <td><input type="submit" value="Delete product"></td>
        <td><a href="products">Back to product list</a></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
