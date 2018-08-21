<%-- 
    Document   : index
    Created on : 21 Aug, 2018, 4:11:05 PM
    Author     : Vasu Rajput
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="myapp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AngularRoutingSpringBoot</title>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
              rel="stylesheet"> 
        <script src="webjars/angularjs/1.7.0/angular.min.js"></script>
        <script src="webjars/angularjs/1.7.0/angular-route.min.js"></script>
        <script src="js/main.js"></script>
        <script src="js/controller.js"></script>
    </head>
    <body ng-controller="myctrl">
        <h1 style="background-color: gray;"><center>SpringBoot Example For Angular Routing</center></h1>
        <br>
        <div class="jumbotron">
            <div class="col-md-4">
            </div>
            <a href="#!first">GoTo FirstPage</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="#!second">GoTo SecondPage</a>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="#!abc">GoTo Default</a>   
            <input type="text" class="form-control" ng-model="demoModel"/><br>
            {{demoModel}}
        </div>
        <div ng-view></div>     
        <div class="jumbotron">
            <center>copyright@vasuRajput 2018</center>
        </div>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
</html>
