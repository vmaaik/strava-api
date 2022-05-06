package com.gebarowski.stravaapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;


@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public record AccessTokenResponse(Long athleteId, @JsonProperty("access_token") String accessToken) {
}