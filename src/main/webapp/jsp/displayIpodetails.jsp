<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.demo.stockExchangeApplication.model.IPODetail"    pageEncoding="UTF-8"%>
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
                        <a class="nav-link" href="/displayipo" id="navitem">IPO's planned
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
                        <a class="nav-link " href="/login" id="navitem">Logout</a>
                    </li>
                </ul>
            </div>
        </nav>
    <article>
        <form>
           <%
			List ipoList=(List)request.getAttribute("ipoList");
			%>
        <form>
            <p id="body-text">IPO Details</p>
            <table>
                <thead>
                    <tr>
                        <th>Company Code</th>
                        <th>Stock Exchange Code</th>
                        <th>Price per share</th>
                        <th>Totalshare</th>
                        <th>Open date Time</th>
                        <th>Remarks</th>
                    </tr>
                </thead>
                <tbody>
                   <% for(int i=0;i<ipoList.size();i++){
						IPODetail ipo=(IPODetail)ipoList.get(i);
					%>
						<tr>
							<td><%=ipo.getCompanycode() %></td>
							<td><%=ipo.getStockexchange_id() %></td>
							<td><%=ipo.getPricepershare() %></td>
							<td><%= ipo.getTotalshares() %></td>
							<td><%=ipo.getOpendate() %></td>
							<td><%=ipo.getRemarks() %></td>
  							
							</tr>
					<% }%>   
                </tbody>
            </table>
        </form>
        </form>
    </article>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>

</html>