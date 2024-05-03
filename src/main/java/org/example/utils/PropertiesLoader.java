package org.example.utils;

import lombok.extern.slf4j.Slf4j;
import org.example.exceptions.WrongDataException;

import java.io.*;
import java.util.Properties;

@Slf4j
public final class PropertiesLoader {

    private final Properties properties;

    public PropertiesLoader(String filePath) {
        if(filePath == null || filePath.isEmpty()) {
            throw new WrongDataException("Incorrect filepath");
        }
        try (InputStream input = new FileInputStream(filePath)){
            properties = new Properties();
            properties.load(input);
        } catch (FileNotFoundException e) {
            log.error("File not found, check path to .properties file");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
