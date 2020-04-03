package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.reposirtory.MovieRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("movieService")
public class MovieService {

    @Autowired
    private MovieRepostitory movieRepostitory;

    public List<Movie> getAllMovies() {
        return movieRepostitory.findAll();
    }

    public Movie saveMovie(Movie movie) {
        return movieRepostitory.save(movie);
    }
}
