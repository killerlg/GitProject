<%--
  Created by IntelliJ IDEA.
  User: Q Anh DD
  Date: 11-Feb-22
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
  <form method="get" action="calculate">
    <label>First Number</label>
    <input type="number" step="any" name="first">
    <label>Calculate</label>
    <select name="calculation">
      <option value="+">+</option>
      <option value="-">-</option>
      <option value="*">*</option>
      <option value="/">/</option>
    </select>
    <label>Second Number</label>
    <input type="number" step="any" name="second">
    <button type="submit">Submit</button>
  </form>
  </body>
</html>
