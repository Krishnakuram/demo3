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
    <title>Menu</title>

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

<div class="rowColor">

        <label class="btn btn-primary">
            <figure> <img
                    src="http://chichilicious.com/wp-content/uploads/Thai-red-curry-recipe.jpg" alt="imgs"
                    style="width: 180px; height: 128px;"
                    class="img-thumbnail img-check">

                <input type="checkbox" name="Thai" id="item4" value="Thai"
                       autocomplete="off">
                <figcaption> Thai(M) </figcaption>


            </figure>
        </label>

        <div class="container-fluid">

            <h1 class="text-center"> Menu </h1>
                <f:form action="/adminMenuList" method="get">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>S.NO</th>
                            <th>ItemName</th>
                            <th>  </th>
                            <th>Price</th>
                            <th>Delete</th>
                        </tr>
                        </thead>
                        <c:forEach items="${list}" var="menu">

                            <tbody>
                            <tr>
                                <td>${menu.id}"</td>
                                <td>${menu.itemName}</td>
                                <td><img
                                        src="${menu.image}" alt="imgs"
                                        style="width: 180px; height: 128px;"
                                        class="img-thumbnail img-check">
                                </td>
                                <td>${menu.price}</td>
                                <td> <a href="adminDeleteItem?id=${menu.id}">Delete</a></td>
                            </tr>
                            </tbody>

                        </c:forEach>
                    </table>

                </f:form>
            </div>
        </div>



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
