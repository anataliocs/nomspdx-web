(function () {
    'use strict';

    angular
        .module('nomspdxApp')
        .factory('PlacesService', PlacesService);

    PlacesService.$inject = ['$resource'];

    function PlacesService($resource) {

        var service = $resource('/googleplaces/places?sort=test&page=1', {}, {
            'getPlaces': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    return data;
                }
            }
        });

        return service;
    }
})();
