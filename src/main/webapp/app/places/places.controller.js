(function() {
    'use strict';

    angular
        .module('nomspdxApp')
        .controller('PlacesController', PlacesController);

    PlacesController.$inject = ['$scope', 'PlacesService', '$state'];

    function PlacesController ($scope, PlacesService, $state) {
        var vm = this;

        PlacesService.getPlaces({},
            onSuccess, onError);

        function onSuccess(data, headers) {
            vm.places = data.data;
            alert("response1 " + JSON.stringify(vm.places));
        }

        function onError(error) {
            //TODO implement
        }
    }
})();
