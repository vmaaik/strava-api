package com.gebarowski.stravaapi.service;

import com.gebarowski.stravaapi.dataprovider.ApplicationPropertiesProvider;
import com.gebarowski.stravaapi.dataprovider.TokenProvider;
import com.gebarowski.stravaapi.model.AccessTokenResponse;
import com.gebarowski.stravaapi.model.ActivityRequest;
import com.gebarowski.stravaapi.model.ActivityResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class StravaServiceImpl implements StravaService{

    private TokenProvider tokenProvider;
    private ApplicationPropertiesProvider applicationPropertiesProvider;

    @Override
    public Mono<ActivityResponse> getActivity(ActivityRequest activityRequest) {
        return null;
    }

    @Override
    public Mono<AccessTokenResponse> getAccessToken(String athleteId) {
        String token = tokenProvider.getToken.apply(athleteId);

        return null;
    }
}
