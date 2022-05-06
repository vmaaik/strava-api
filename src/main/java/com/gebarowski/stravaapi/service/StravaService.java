package com.gebarowski.stravaapi.service;


import com.gebarowski.stravaapi.model.AccessTokenResponse;
import com.gebarowski.stravaapi.model.ActivityRequest;
import com.gebarowski.stravaapi.model.ActivityResponse;
import reactor.core.publisher.Mono;

public interface StravaService {
    Mono<ActivityResponse> getActivity(ActivityRequest activityRequest);
    Mono<AccessTokenResponse> getAccessToken(Long athleteId);
}
