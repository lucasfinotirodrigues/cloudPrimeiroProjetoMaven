package com.lucas.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/test")
public class TesteController {
    private static final Logger LOG = LoggerFactory.getLogger(TesteController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name) {
        LOG.info("Teste controller - {}", name);

        return ResponseEntity.ok( "Name: " + name);
    }

    @GetMapping("/dog/color")
    public ResponseEntity<?> dogcolor() {
        LOG.info("Teste controller - cor: Gold!");

        return ResponseEntity.ok( "cor: Gold!");
    }
}
