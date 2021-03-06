package com.gebarowski.stravaapi.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FileReader {

    public static Map<String, String> createMapFromFile(String filePath) {

        Map<String, String> map = new HashMap<>();

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines.filter(line -> line.contains(":"))
                    .forEach(line -> {
                        String[] keyValuePair = line.split(":", 2);
                        String key = keyValuePair[0];
                        String value = keyValuePair[1];
                        map.put(key, value);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }
}
