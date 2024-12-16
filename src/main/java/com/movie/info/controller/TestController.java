package com.movie.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<String> testApi(){
        String apiUrl = "https://api.themoviedb.org/3/movie/popular?api_key=25f67c53487a30ae0674b4ef613d4626";

        ResponseEntity<String> response=restTemplate.getForEntity(apiUrl, String.class);
        return response;
    }
}
