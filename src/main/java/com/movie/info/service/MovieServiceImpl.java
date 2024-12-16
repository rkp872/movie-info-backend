package com.movie.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.movie.info.utils.Constants;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseEntity<String> getPopularMovies() {
        String url=Constants.TMDB_BASE_URL+"/movie/popular?api_key="+Constants.API_KEY;
        return restTemplate.getForEntity(url, String.class);
    }

    @Override
    public ResponseEntity<String> getMovieDetails(Long id) {
     String url=Constants.TMDB_BASE_URL+"/movie/"+id+"?api_key="+Constants.API_KEY;
     return restTemplate.getForEntity(url, String.class);  
    }

    @Override
    public ResponseEntity<String> searchMovies(String query) {
       String url=Constants.TMDB_BASE_URL+"/search/movie?api_key="+Constants.API_KEY+"&query="+query;
       return restTemplate.getForEntity(url, String.class);
    }

    @Override
    public ResponseEntity<String> getRecommendations(Long id) {
        String url=Constants.TMDB_BASE_URL+"/movie/"+id+"/recommendations?api_key="+Constants.API_KEY;
        return restTemplate.getForEntity(url, String.class);
    }

}
