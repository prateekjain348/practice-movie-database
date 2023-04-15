package com.movie.utils;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class MetadataService {
    public static Properties getResource(String resourcePath) {
        Properties property = null;
        try {
            Resource resource = new ClassPathResource(resourcePath);
            if (resource.exists()) {
                property = PropertiesLoaderUtils.loadProperties(resource);
            } else {
                System.out.println("File " + resourcePath + " does not exist");
            }
        } catch (IOException ioEx) {
            System.out.println("Error while reading Application.properties: " + ioEx);
        }
        return property;
    }
}
