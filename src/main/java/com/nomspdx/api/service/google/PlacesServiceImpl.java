package com.nomspdx.api.service.google;

import org.springframework.stereotype.Service;

@Service
public class PlacesServiceImpl implements PlacesService {

    @Override
    public String getPlaces() {
        return "test";
    }
}
