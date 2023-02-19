package org.example.app.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.app.service.BasicOperationsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final BasicOperationsService basicOperationsService;


    @GetMapping(value = "/low", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> cacheTest(@RequestParam String id) {
        return new ResponseEntity<>(basicOperationsService.maintenance(id), HttpStatus.OK);
    }

    @GetMapping(value = "/high", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> cacheTestHigh(@RequestParam String id) {
        return new ResponseEntity<>(basicOperationsService.maintenanceHighCache(id), HttpStatus.OK);
    }

    @PutMapping(value = "/")
    public ResponseEntity<String> cacheTestPut() {
        return null;
    }

    @PostMapping(value = "/")
    public ResponseEntity<String> cacheTestPost() {
        return null;
    }


    @DeleteMapping(value = "/")
    public ResponseEntity<String> cacheTestDelete() {
        return null;
    }


}