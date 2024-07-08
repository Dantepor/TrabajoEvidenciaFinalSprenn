package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.springboot.repository")
@EntityScan("com.springboot.models")
public class Evidencia2GamerstartApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(Evidencia2GamerstartApplicationTests.class, args);
    }

}