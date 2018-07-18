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
    <div class="container-fluid">
                <f:form action="/customerMenuList" method="get">
                    <table class="table">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>S.NO</th>
                            <th>ItemName</th>
                            <th>  </th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Add</th>
                        </tr>
                        </thead>
                            <c:forEach items="${list}" var="menu">

                            <tbody>
                        <f:form action="/addToCart" method="post">

                        <tr>
                            <td>${menu.id}"</td>
                            <td>${menu.itemName}</td>
                            <td><img
                                    src="${menu.image}" alt="imgs"
                                    style="width: 180px; height: 128px;"
                                    class="img-thumbnail img-check">
                            </td>
                            <td>${menu.price}</td>
                            <%--<td><input type="number" id="quantity" placeholder="1" name="quantity"/></td>--%>
                            <td> <a href="/addToCart">add</a></td>
                        </tr>

                            </f:form>
                            </tbody>
                            </c:forEach>
                            </table>

                        </f:form>
</div>
</div>
</body>
</html>