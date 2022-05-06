package com.gebarowski.stravaapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.ToString;
import lombok.experimental.NonFinal;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;


@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ActivityResponse {

    @JsonProperty("id")
    Long activityId;

    @NonFinal
    Long athleteId;

    Double distance;

    String type;

    String timezone;

    @JsonProperty("start_date_local")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime startDateLocal;

    @JsonProperty("elapsed_time")
    Long elapsedTime;

    boolean manual;

    @JsonProperty("athlete")
    private void unpackNested(Map<String, Object> athlete) {
        this.athleteId = Optional.ofNullable(athlete)
                .map(a -> (Number) a.get("id"))
                .map(Number::longValue)
                .get();
    }
}
