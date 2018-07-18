<%--
  Created by IntelliJ IDEA.
  User: Krishna
  Date: 7/9/2018
  Time: 11:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ContactUs</title>

    <style>

        body .header> ul
        {
            text-align:left;
            background-color:red ;
            font-size: 50px;
            font-style: italic;
        }
        body .header> ul>li
        {
            list-style: none;
            display: inline-block;
        }

        body .footer> ul
        {
            text-align:center;
            background-color:blue ;
            font-size: 25px;
            font-style: italic;
            list-style: none;
        }


    </style>
</head>
<body>

<nav class='header'>
    <ul>
        <li>Venu's Corner</li>
        <li class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
        <li ><a href="${pageContext.request.contextPath}/About">About</a></li>
        <li><a href="${pageContext.request.contextPath}/ContactUs">ContactUS</a></li>
        <li><a href="${pageContext.request.contextPath}/Orders">orders</a></li>
        <li><a href="${pageContext.request.contextPath}/Menu">Menu</a></li>
    </ul>
</nav>

<input type="number" value="3513513654">

<nav class='footer'>
    <ul>
        <li>ContactUs</li>
        <li>address:22499 orchard grass terrace,VA,20148</li>
        <li>contact:1234567890</li>
        <li>Email:abc@gmail.com</li>

    </ul>
</nav>
</body>
</html>
