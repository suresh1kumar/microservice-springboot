var app = angular.module("EmployeeManagement", []);
 

var REST_SERVICE_URI = 'http://localhost:5034/employees/';


$scope.addModal = function() {
    	alert("model----------------11");
    	self.user = angular.copy($scope.master);
    	$('#btnTest').click(function() {
    		$('#form_modal').modal('show');
    	});
    }

// Controller Part
app.controller("EmployeeController", function($scope, $http) {
 
 
    $scope.employees = [];
    $scope.employeeForm = {
        empId: 1,
        empNo: "",
        empName: ""
    };
 
    // Now load the data from server
    _refreshEmployeeData();
 
    // HTTP POST/PUT methods for add/edit employee  
    // Call: http://localhost:8080/employee
    $scope.submitEmployee = function() {
    	$('#form_modal').modal('show');
        var method = "";
        var url = "";
 
        if ($scope.employeeForm.empId == -1) {
            method = "POST";
            url = '/employee';
        } else {
            method = "PUT";
            url = '/employee';
        }
 
        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.employeeForm),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };
 
    $scope.createEmployee = function() {
    	$('#form_modal').modal('show');
        _clearFormData();
    }
 
    // HTTP DELETE- delete employee by Id
    // Call: http://localhost:8080/employee/{empId}
    $scope.deleteEmployee = function(employee) {
        $http({
            method: 'DELETE',
            url: '/employee/' + employee.empId
        }).then(_success, _error);
    };
    $('#form_modal').modal('show');
    // In case of edit
    $scope.editEmployee = function(employee) {
    	alert("edit///////");
    	$('#form_modal').modal('show');
        $scope.employeeForm.empId = employee.empId;
        $scope.employeeForm.empNo = employee.empNo;
        $scope.employeeForm.empName = employee.empName;
    };
 
    // Private Method  
    // HTTP GET- get all employees collection
    // Call: http://localhost:8080/employees
    function _refreshEmployeeData() {
    	alert(".............")
        $http({
            method: 'GET',
            url: '/employees'
        }).then(
            function(res) { // success
            	alert("ssssss");
                $scope.employees = res.data;
            },
            function(res) { // error
            	alert("faluredddddddd");
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }
 
    function _success(res) {
        _refreshEmployeeData();
        _clearFormData();
    }
 
    function _error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    }
 
    // Clear the form
    function _clearFormData() {
        $scope.employeeForm.empId = -1;
        $scope.employeeForm.empNo = "";
        $scope.employeeForm.empName = ""
    };
});