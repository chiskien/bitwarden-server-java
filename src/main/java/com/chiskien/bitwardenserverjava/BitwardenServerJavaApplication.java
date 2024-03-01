package com.chiskien.bitwardenserverjava;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class BitwardenServerJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BitwardenServerJavaApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner() {
        return args -> {
            log.info("Hello Bitwarden Server");
            log.info("=========================================================");
            log.info("=========================================================");
            log.info("=========================================================");
        };
    }
}
