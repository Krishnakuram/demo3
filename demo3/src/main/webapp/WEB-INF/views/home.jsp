<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Krishna
  Date: 7/9/2018
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>

    <style>
        body .header> ul
        {
            text-align: left;
            background-color:red ;
            color: white;
            font-size: 50px;
            font-style: italic;
            list-style:none;
            /*font-stretch: semi-expanded;*/

        }
        body .Home> ul
        {
            text-align:center;

            /*background-color:red ;*/
            font-size: 120px;
            font-style: italic;
            list-style:none;
            background-image: url("https://previews.123rf.com/images/somegirl/somegirl1508/somegirl150800011/43320245-Overhead-shot-of-ingredients-for-sushi-on-dark-background-Raw-salmon-steak-rice-cream-cheese-avocado-Stock-Photo.jpg");

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
        <li>Venu's Corner..</li>

    </ul>
</nav>

<nav class='home'>

    <ul>
        <li><a href ="/login">login</a></li>
        <li><a href ="/register">register</li>
        <li><a href="/OurPage">OurPage</a></li>
        <li><a href="/About">About</a></li>
        <li><a href="/Menu">Menu</a></li>
        <li><a href="/Orders">Orders</a></li>
        <li><a href="/ContactUs">ContactUs</a></li>
    </ul>
</nav>

<nav class='footer'>
    <ul>
        <li>ContactUs</li>
        <li>Address:22499 orchard grass terrace,VA,20148</li>
        <li>Contact:1234567890</li>
        <li>Email:abc@gmail.com</li>

    </ul>
</nav>

</body>>
</html>
