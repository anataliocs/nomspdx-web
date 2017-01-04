package com.nomspdx.api.service.google;

import com.nomspdx.api.model.places.GooglePlace;
import org.springframework.stereotype.Service;

@Service
public class PlacesServiceImpl implements PlacesService {

    @Override
    public GooglePlace getPlaces() {
        return new GooglePlace();
    }
}
