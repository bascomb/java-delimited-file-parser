package com.bascomb.files;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileFactoryConfig {

    @Bean
    public Files delimitedFile(String path) {
        return new DelimitedFile(path);
    }
}
