package com.gebarowski.stravaapi.dataprovider;

import com.gebarowski.stravaapi.utils.FileReader;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.function.Function;

import static com.gebarowski.stravaapi.utils.FileReader.*;

@Component
public class TokenProvider {

    @Value("${token.properties.path}")
    private String tokenPropertiesPath;

    private static Map<String, String> tokens;

    public Function<String, String> getToken = id -> tokens.get(id);

    @PostConstruct
    private void loadTokens() {
        tokens = createMapFromFile(tokenPropertiesPath);
    }
}
