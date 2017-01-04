package com.nomspdx.api.web.rest;

import com.nomspdx.api.model.places.GooglePlace;
import com.nomspdx.api.service.google.PlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/googleplaces")
public class GooglePlacesResource {

    @Autowired
    PlacesService placesService;

    @GetMapping("/places")
    public ResponseEntity<GooglePlace> activateAccount(@RequestParam(value = "sort") String sort,
                                                       @RequestParam(value = "page") String page) {

        return new ResponseEntity<GooglePlace>(placesService.getPlaces(), HttpStatus.OK);
    }
}
