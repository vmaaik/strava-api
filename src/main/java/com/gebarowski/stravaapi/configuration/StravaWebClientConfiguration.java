package com.gebarowski.stravaapi.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class StravaWebClientConfiguration {

    @Value("${strava.api.url}")
    private String baseUrl;

    @Bean("stravaHttpClient")
    public WebClient getStravaWebClient() {
        return WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }
}
