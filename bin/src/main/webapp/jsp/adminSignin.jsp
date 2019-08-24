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
    <article>
        <form action="user.html">
            <p id="body-text">Login</p>

            <table id="table">
                <tr>
                    <td><label>Username</label></td>
                    <td><input type="text" name="username" id="username" required /></td>
                </tr>
                <tr>
                    <td><label>Password</label></td>
                    <td><input type="password" name="password" id="password" required /></td>
                </tr>
            </table>
            <input type="submit" name="submit" value="save" class="btn"/>
        </form>
    </article>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>

</html>