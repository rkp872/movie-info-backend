package com.movie.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.info.service.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/popular")
    public ResponseEntity<String> getPopularMovies(){
        return movieService.getPopularMovies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getMovieDetails(@PathVariable Long id){
        return movieService.getMovieDetails(id);
    }

    @GetMapping("/search")
    public ResponseEntity<String> searchMovies(@RequestParam String query){
        return movieService.searchMovies(query);
    }

    @GetMapping("/recommend/{id}")
    public ResponseEntity<String> getRecommendations(@PathVariable Long id){
        return movieService.getRecommendations(id);
    }
}
