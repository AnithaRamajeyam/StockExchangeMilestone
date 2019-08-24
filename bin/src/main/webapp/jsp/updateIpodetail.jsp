<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
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
                    <a class="nav-link dropdown-toggle bg-dark" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" id="navitem">Manage Company
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="insert-company.html">Insert New Company</a>
                        <a class="dropdown-item" href="update-company.html">Update Company Details</a>
                    </div>
                </li>
                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle bg-dark" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" id="navitem">Manage Exchange
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="add-stockdetail.html">Add Stock Details</a>
                        <a class="dropdown-item" href="list-stockdetails.html">List All Stock Details</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="update-ipodetail.html" id="navitem">Update IPO Details</a>
                </li>
            </ul>

            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link " href="#" id="navitem">Logout</a>
                </li>
            </ul>
        </div>
    </nav>
    <article>
        <form>
            <p id="body-text">Add IPO Plan</p>
            <table>
                <tr>
                    <td><label>Company code</label></td>
                    <td><input type="number" name="companycode" id="comapnycode" required /></td>
                </tr>
                <tr>
                    <td><label>Stock exchange Name</label></td>
                    <td><input type="text" name="stockexchangename" id="stockexchangename" required /></td>
                </tr>
                <tr>
                    <td><label>Price per share</label></td>
                    <td><input type="number" name="pricepershare" id="pricepershare" required /></td>
                </tr>
                <tr>
                    <td><label>Total no of shares</label></td>
                    <td><input type="number" name="totalshares" id="totalshares" required /></td>
                </tr>
                <tr>
                    <td><label>Open date time</label></td>
                    <td><input type="date" name="opendate" id="opendate" required /></td>
                </tr>
                <tr>
                    <td><label>Remarks</label></td>
                    <td><input type="text" name="remarks" id="remarks" required /></td>
                </tr>
            </table>
            <input type="submit" name="submit" value="Update" class="btn"/>
        </form>
    </article>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>

</html>