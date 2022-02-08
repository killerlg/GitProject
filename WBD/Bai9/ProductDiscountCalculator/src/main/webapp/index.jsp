<%--
  Created by IntelliJ IDEA.
  User: Q Anh DD
  Date: 08-Feb-22
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="display-discount" method="post">
    <input type="text" name="productDescription" placeholder="Description: "/>
    <input type="number" name ="listPrice" placeholder="List Price">
    <input type="number" name ="discountPercent" placeholder="Discount Percent">
    <input type = "submit" id = "submit" value = "Search"/>
  </form>
  </body>
</html>
