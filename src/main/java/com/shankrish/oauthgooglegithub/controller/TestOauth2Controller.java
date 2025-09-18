package com.shankrish.oauthgooglegithub.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestOauth2Controller {


    @GetMapping("/test1")
    public ResponseEntity<String> showText11() {
        return ResponseEntity.ok("my test text 11");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> showText22() {
        return ResponseEntity.ok("my text 2222");
    }

}
