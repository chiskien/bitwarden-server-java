package com.chiskien.bitwardenserverjava.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<String> hello() {
        log.info("Incoming Request");
        return ResponseEntity.ok("Hello Worlds");
    }
}
