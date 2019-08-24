<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.demo.stockExchangeApplication.model.Company"    pageEncoding="UTF-8"%>
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

    <title>Login</title>
</head>

<body>
    <header>
        <div id="image">
            <p>
                <img src="${pageContext.request.contextPath}/images/logo.jpg" alt="no image" width="70px" height="70px;">
            </p>
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
    <article>
    <%
List companyList=(List)request.getAttribute("companyList");

%>
        <form>
            <p id="body-text">List of Companies</p>
            <table>
                <thead>
                    <tr>
                        <th>Sno</th>
                        <th>Company Name</th>
                        <th>CEO</th>
                        <th>BOD</th>
                        <th>Turnover</th>
                        <th>Breif</th>
                        <th>Update</th>
                    </tr>
                </thead>
                <tbody>
                   <% for(int i=0;i<companyList.size();i++){
						Company company=(Company)companyList.get(i);
					%>
						<tr>
							<td><%= company.getCompanyCode() %></td>
							<td><%=company.getCompanyName() %></td>
							<td><%=company.getCeo() %></td>
							<td><%= company.getBoardOfDirectors() %></td>
							<td><%= company.getTurnOver() %></td>
							<td><%=company.getBriefWriteup() %></td>
  							<td><input type="submit" value="Update" />
							</tr>
					<% }%>   
                </tbody>
            </table>
        </form>
    </article>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>

</html>