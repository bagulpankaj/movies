package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(path = "/movies", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie>  getMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping(path = "/save/movie", consumes =  MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Movie  saveMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }


}
