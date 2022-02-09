<%--
  Created by IntelliJ IDEA.
  User: Q Anh DD
  Date: 09-Feb-22
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Baitap1</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
    </style>
</head>
<body>
<%
    class Customer {
        String name;
        Date birthday;
        String address;

        public Customer(String name, Date birthday, String address) {
            this.name = name;
            this.birthday = birthday;
            this.address = address;
        };

        public Customer() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getBirthday() {
            return birthday;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
%>

<%
    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    ArrayList<Customer> listCustomer = new ArrayList<>();
    listCustomer.add(new Customer("Mai Van Hoan",sdf.parse("1983-08-20"),"Ha Noi"));
    listCustomer.add(new Customer("Nguyen Van Nam",sdf.parse("1983-08-20"),"Bac Giang"));
    listCustomer.add(new Customer("Nguyen Thai Hoa",sdf.parse("1983-08-20"),"Nam Dinh"));
    listCustomer.add(new Customer("NGuyen Dinh Thi",sdf.parse("1983-08-20"),"Ha Nam"));
%>

<table border="0">
    <caption><h1>Danh sách khách hàng</h1></caption>
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
    </tr>
    <c:forEach items="${listCustomer}" var="customer" varStatus="index">
        <tr>
            <td>${index.index}</td>
            <td>${customer.getName}</td>
            <td>${customer.getBirthday}</td>
            <td>${customer.getAddress}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
