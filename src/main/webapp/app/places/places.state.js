(function() {
    'use strict';

    angular
        .module('nomspdxApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider.state('places', {
            parent: 'app',
            url: '/places',
            data: {
                authorities: [],
                pageTitle: 'Places'
            },
            views: {
                'content@': {
                    templateUrl: 'app/places/places.html',
                    controller: 'PlacesController',
                    controllerAs: 'vm'
                }
            }
        });
    }
})();
