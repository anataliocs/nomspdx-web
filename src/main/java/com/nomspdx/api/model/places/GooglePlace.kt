package com.nomspdx.api.model.places

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
class GooglePlace {
    var data: List<String>? = null
}

