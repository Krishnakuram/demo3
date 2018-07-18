<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<html>--%>
<%--<head>--%>
    <%--<body>--%>
      <%--HelloSpring--%>
<%--</body>--%>
<%--</head>--%>
<%--</html>--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <!-- Links -->
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="#">Link 1</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Link 2</a>
        </li>
    </ul>
    <!-- Navbar text-->
    <span class="navbar-text">
    Navbar text
  </span>
</nav>
<br>

<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>numberofPeople</th>
            <th>name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="bookATables" items ="${bookATables}">
        <tr>
            <td>${bookATables.id}</td>
            <td>${bookATables.numberofPeople}</td>
            <td>${bookATables.name}</td>

        </tr>

        </c:forEach>
        </tbody>
    </table>
<%--</div>--%>
    <%--<h3>Navbar Text</h3>--%>
    <%--<p>Use the .navbar-text class to vertical align any elements inside the navbar that are not links (ensures proper padding).</p>--%>
<%--</div>--%>

</body>
</html>

