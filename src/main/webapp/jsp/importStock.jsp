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
    <title>Listcompanies</title>
</head>

<body>
    <header>
        <div id="image">
            <p><img src=""${pageContext.request.contextPath}/images/logo.jpg" alt="no image" width="70px" height="70px;"></p>
        </div>
        <div id="text">
            <p>Stock Market</p>
        </div>
    </header>
    <nav class="navbar navbar-expand-lg  bg-dark">

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="import-stock.html" id="navitem">Import Data
          </a>
        </li>
        <li class="nav-item dropdown bg-dark">
          <a class="nav-link dropdown-toggle bg-dark" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
            aria-haspopup="true" aria-expanded="false" id="navitem">Manage Company
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="/insertcompany">Insert New Company</a>
            <a class="dropdown-item" href="displaycompany">Update Company Details</a>
          </div>
        </li>
        <li class="nav-item dropdown bg-dark">
            <a class="nav-link dropdown-toggle bg-dark" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false" id="navitem">Manage Exchange
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="/addstock">Add Stock Details</a>
              <a class="dropdown-item" href="/displaystock">List All Stock Details</a>
            </div>
          </li>
        <li class="nav-item">
          <a class="nav-link " href="insertipodetail" id="navitem">Update IPO Details</a>
        </li>
      </ul>

      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="nav-link " href="/login" id="navitem">Logout</a>
        </li>
      </ul>
    </div>
  </nav>
    <p id="body-text">Import Excel</p>
    <form:form action="form" method="post">
        <p id="search"><form:label path="file">Select file to be uploaded : </form:label><input type="file" name="file"/> <input type="submit" name="submit" value="save" class="btn" id="button"/></p>   
        <br><br>
        <p  id="search"><a href="stock-details.html">Click here to download sample excel file</a></p>
    </form:form>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>

</html>