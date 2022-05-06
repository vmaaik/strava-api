package com.gebarowski.stravaapi.service;

import com.gebarowski.stravaapi.model.AccessTokenResponse;
import com.gebarowski.stravaapi.model.ActivityRequest;
import com.gebarowski.stravaapi.model.ActivityResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class StravaServiceImpl implements StravaService{

    private TokenService tokenService;

    @Override
    public Mono<ActivityResponse> getActivity(ActivityRequest activityRequest) {
        return null;
    }

    @Override
    public Mono<AccessTokenResponse> getAccessToken(Long athleteId) {
        String token = tokenService.getToken.apply(athleteId);

        return null;
    }
}
