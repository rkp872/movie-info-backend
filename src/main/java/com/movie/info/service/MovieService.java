package com.movie.info.service;

import org.springframework.http.ResponseEntity;

public interface MovieService {
    ResponseEntity<String> getPopularMovies();
    ResponseEntity<String> getMovieDetails(Long id);
    ResponseEntity<String> searchMovies(String query);
    ResponseEntity<String> getRecommendations(Long id);
}
