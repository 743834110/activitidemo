package com.example.acitivitidemo;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AcitivitidemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcitivitidemoApplication.class, args);
    }
}
