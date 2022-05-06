package com.gebarowski.stravaapi.model;

import lombok.Builder;

@Builder
public record ActivityRequest(Long activityId, Long athleteId) {
}
