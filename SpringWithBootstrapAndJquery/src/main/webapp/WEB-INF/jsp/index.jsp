<%-- 
    Document   : index
    Created on : 21 Aug, 2018, 2:33:15 PM
    Author     : Vasu Rajput
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="webjars/bootstrap/4.1.1/css/bootstrap.min.css"
              rel="stylesheet"> 
    </head>
    <body>
        <h1><center><i>Jsp Using Jquery And Bootstrap</i></center></h1>
        <div class="jumbotron">
            This Is BootStrap JumboTron
            <div class="col-md-6">
                <form action="" method="POST">
                    Name: <input type="text" class="form-control"/>
                    Pass: <input type="text" class="form-control"/></br>
                    <input type="submit" value="Login">
                </form>
            </div>


        </div>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    </body>
</html>
