package com.gebarowski.stravaapi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

@Service
public class TokenService {

    private final Map<Long, String> tokens = new HashMap<>();

    public Function<Long, String> getToken = tokens::get;

    @PostConstruct
    private void loadTokens() {
        try (Stream<String> lines = Files.lines(Paths.get("src/main/resources/token.properties"))) {
            lines.filter(line -> line.contains(":"))
                    .forEach(line -> {
                        String[] keyValuePair = line.split(":", 2);
                        String key = keyValuePair[0];
                        String value = keyValuePair[1];
                        tokens.put(Long.valueOf(key), value);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
