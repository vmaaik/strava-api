package com.gebarowski.stravaapi.dataprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.function.Function;

import static com.gebarowski.stravaapi.utils.FileReader.createMapFromFile;

@Component
public class ApplicationPropertiesProvider {

    @Value("${app.properties.path}")
    private String appPropertiesPath;

    private static Map<String, String> applicationProperties;

    public Function<String, String> getApplicationProperty = id -> applicationProperties.get(id);

    @PostConstruct
    private void loadApplicationConfig() {
        applicationProperties = createMapFromFile(appPropertiesPath);
    }
}
