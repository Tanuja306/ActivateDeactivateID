<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="adminDash.jsp" %>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Management</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-5">
   <center> <h2>Teacher List</h2>
    <table border=2>
            <tr>
               
               
                <th>Email</th>
                <th>Status</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="teacher" items="${teachers}">
                <tr>
                   
                
                    <td>${teacher.email}</td>
                    <td>
                        <c:choose>
                            <c:when test="${teacher.active}">
                                Active
                            </c:when>
                            <c:otherwise>
                                Inactive
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <c:choose>
                            <c:when test="${!teacher.active}">
                                <!-- Form to activate student -->
                                <form action="${pageContext.request.contextPath}/activateTeach/${teacher.id}" method="post" style="display:inline;">
                                    <button type="submit" class="btn btn-success btn-sm">Activate</button>
                                </form>
                            </c:when>
                            <c:otherwise>
                                <!-- Form to deactivate student -->
                                <form action="${pageContext.request.contextPath}/deactivateTeach/${teacher.id}" method="post" style="display:inline;">
                                    <button type="submit" class="btn btn-danger btn-sm">Deactivate</button>
                                </form>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
