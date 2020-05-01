package com.example.oath2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:deafult-aplication.properties")
@SpringBootApplication
public class SpringOauth2Aplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2Aplication.class, args);
    }
}
