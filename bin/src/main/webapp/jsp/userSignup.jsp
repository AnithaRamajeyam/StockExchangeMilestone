<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <title>SignUp</title>
</head>

<body>
    <header>
        <div id="image">
            <p><img src="${pageContext.request.contextPath}/images/logo.jpg" alt="no image" width="70px" height="70px;"></p>
        </div>
        <div id="text">
            <p>Stock Market</p>
        </div>
      </header>
    <article>
        <form:form action="registeruser" modelAttribute="user" method="post">
                <p id="body-text">Sign Up</p>
			<div class="form-group">
                <table id="table">
                    <tr>
                        <td><label class="font-weight-bold">Username</label></td>
                        <td><form:input type="text" path="userName" class="form-control" /></td>
                        <td><form:errors path="userName" class="text-danger" /></td>
                    </tr>
        
                    <tr>
                        <td><label class="font-weight-bold">Email</label></td>
                        <td><form:input type="text" path="email" class="form-control"/></td>
                        <td><form:errors path="email" class="text-danger" /></td>
                    </tr>
                    <tr>
                        <td><label class="font-weight-bold">Password</label></td>
                        <td><form:password  path="password" class="form-control"/></td>
                        <td><form:errors path="password" class="text-danger" /></td>
                    </tr>
                    <tr>
                        <td><label class="font-weight-bold">Confirm Password</label></td>
                        <td><form:password  path="cpassword" class="form-control" /></td>
                        <td><form:errors path="cpassword" class="text-danger" /></td>
                    </tr>
                    <tr>
                        <td><label class="font-weight-bold">Mobile No</label></td>
                        <td><form:input type="number" path="mobileno" class="form-control"/></td>
                        <td><form:errors path="mobileno" class="text-danger" /></td>
                    </tr>
                </table>
               </div>
                <input type="submit" name="submit" value="save" class="btn" />
        </form:form>
    </article>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>

</html>
