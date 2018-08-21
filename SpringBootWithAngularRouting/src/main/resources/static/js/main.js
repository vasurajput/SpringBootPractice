var app = angular.module('myapp', ["ngRoute"]);
app.controller('myctrl', function ($scope) {
    $scope.firstname = "vasu";
});

app.config(function ($routeProvider) {
    $routeProvider
            .when("/", {
                templateUrl: "defaul"

            })
            .when("/first", {
                templateUrl: "first",
                controller: "firstController"
            })
            .when("/second", {
                templateUrl: "second"

            })
            .otherwise({
                redirectTo: "/"
            });
});
