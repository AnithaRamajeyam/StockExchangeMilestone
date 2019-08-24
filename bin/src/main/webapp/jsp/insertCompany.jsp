<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <title>Insert a new company</title>
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
    <nav class="navbar navbar-expand-lg  bg-dark">

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="dispaly-ipodetails.html" id="navitem">IPO's planned
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="comparison.html" id="navitem">Compare Company</a>
                    </li>
                    <li class="nav-item">
                          <a class="nav-link " href="comparison.html" id="navitem">Compare Sector</a>
                      </li>
                </ul>
    
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link " href="#" id="navitem"><span class="glyphicon glyphicon-log-in"></span>Logout</a>
                    </li>
                </ul>
            </div>
        </nav>
	 <form:form action="insert" method="post" modelAttribute="company">
            <p id="body-text">Create a new company</p>
            <table>
             <div class="form-group">
                <tr>
                    <td class="font-weight-bold">Company name</td>
                    <td> <form:input path="companyName" type="text" class="form-control"/></td>
                     <td><form:errors path="companyName" class="text-danger"/></td>
                   </div>
                </tr>
                <tr>
                    <td> <label class="font-weight-bold"> CEO Name</label></td>
                    <td> <form:input path="ceo" type="text"  class="form-control" /></td>
                     <td><form:errors path="ceo" class="text-danger" /></td>
   
                </tr>
                <tr>
               
                    <td><label class="font-weight-bold">Board Members</label></td>
                    <td><form:input path="boardOfDirectors" type="text"  class="form-control"/></td>
         			<td><form:errors path="boardOfDirectors" class="text-danger" /></td> 
         			
                </tr>
                <tr>
               
                    <td><label class="font-weight-bold">TurnOver</label></td>
                    <td><form:input path="turnOver" type="number"  class="form-control"/></td>
 					 <td><form:errors path="turnOver" /></td>
 					
                </tr>
                <tr>
                 	
                   		 <td><label class="font-weight-bold">Sector Id</label></td>
                   		 <td><form:input path="sectorId" type="number"  class="form-control"/></td>
                     	<td><form:errors path="sectorId" /></td>
                     
                </tr>
                <tr>
                 	
                   		 <td><label class="font-weight-bold">Brief Description</label></td>
                   		 <td><form:input path="briefWriteup" type="text"  class="form-control"/></td>
                     	<td><form:errors path="briefWriteup" /></td>
                     
                </tr>
                <tr>
                 	
                   		 <td><label class="font-weight-bold">Stock Code</label></td>
                   		 <td><form:input path="stockCode" type="number"  class="form-control"/></td>
                     	<td><form:errors path="stockCode" /></td>
                     
                </tr>
               		</div>
            </table>
            <input type="submit" name="submit" value="save" class="btn" />
        </form:form>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>

</body>
</html>