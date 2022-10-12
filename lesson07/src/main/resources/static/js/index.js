angular.module('app',['ui.bootstrap']).controller('indexController', function ($scope, $uibModal, $http) {
    const contextPath = 'http://localhost:8089/student-s/api/v1';

    $scope.loadStudents = function (pageIndex = 1) {
        $http({
            url: contextPath + '/students',
            method: 'GET',
        }).then(function (response) {
            $scope.StudentsPage = response.data;
        });
    };

    $scope.loadStudents();

    $scope.addStudent = function () {
        $http({
            url: contextPath + '/students',
            method: 'POST',
            data: $scope.student
        }).then(function (response) {
            $scope.student = null;
            $scope.loadStudents();
        });
    };

    $scope.modifyStudent = function () {
        $http({
            url: contextPath + '/students',
            method: 'PUT',
            data: $scope.student
        }).then(function (response) {
            $scope.student = null;
            $scope.loadStudents();
        });
    };

    $scope.showModal = function (student) {
        const modalInstance = $uibModal.open({
            animation: false,
            templateUrl: 'myModalContent.html',
            controller: 'ModalCtrl',
            backdrop: 'static',
            resolve: {
                student: function () {
                    return student;
                }
            }
        });

        modalInstance.result.then(function (student) {
            $scope.student = student;
            $scope.modifyStudent();
        });
    }

    $scope.deleteStudent = function (id) {
        $http({
            url: contextPath + '/students',
            method: 'DELETE',
            params: {
                id
            }
        }).then(function (response) {
            $scope.loadStudents();
        });
    };
});

angular.module('app').controller('ModalCtrl', function ($scope, $uibModalInstance, student) {

    $scope.student = student;

    $scope.ok = function () {
        $uibModalInstance.close($scope.student);
    };

    $scope.cancel = function () {
        $uibModalInstance.dismiss('cancel');
    };
});