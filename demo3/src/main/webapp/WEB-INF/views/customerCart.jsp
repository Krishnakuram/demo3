<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<div class="container">

    <h1 class="text-center" id="first">Register To Your Account</h1><br>
    <h1 class="text-center"> </h1>


            <div class="container">

                <f:form action="/customerMenuList" method="get">
                    <c:set var="TotalPrice" value="${0}"/>
                    <table class="table">
                    <thead>
                    <tr>
                        <th>S.NO</th>
                        <th>ItemName</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <c:forEach items="${list}" var="order">

                        <tbody>
                        <tr>
                            <td>${order.id}</td>
                            <td>${order.itemName}</td>
                            <td>${order.price}</td>
                            <td>${order.quantity}</td>
                            <td> <a href="customerDeleteItem?id=${order.id}">Delete</a></td>
                        </tr>
                        </tbody>

                        <c:set var="TotalPrice" value="${TotalPrice + order.price}" />
                    </c:forEach>
                    </table>
                    <h5>TotalPrice: </h5><h5>${TotalPrice}</h5>
                </f:form>
            </div>
        </div>



</body>
</html>