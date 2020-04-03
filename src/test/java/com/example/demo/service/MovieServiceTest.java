package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.reposirtory.MovieRepostitory;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class MovieServiceTest {

    @InjectMocks
    @Autowired
    private MovieService movieService;

    @Mock
    private MovieRepostitory movieRepostitory;

    @Test
    public void getAllMovieTest() {
        MockitoAnnotations.initMocks(this);

        Movie movie = new Movie();
        movie.setId(1);
        movie.setName("abc");

       List<Movie> movies = new ArrayList<>();
       movies.add(movie);
       when(movieRepostitory.findAll()).thenReturn(movies);

       List<Movie> movieList = movieService.getAllMovies();
       assertEquals("", movieList.size(), 1);

    }

    @Test
    public void createMovieTest() {
        MockitoAnnotations.initMocks(this);

        Movie movie = new Movie();
        movie.setId(1);
        movie.setName("abc");

        when(movieRepostitory.save(movie)).thenReturn(movie);

        Movie movie1 = movieService.saveMovie(movie);
        assertEquals("", movie.getName(), "abc");
    }


//    @Test
//    public void getMovieByIdTest() {
//        MockitoAnnotations.initMocks(this);
//
//        Movie movie = new Movie();
//        movie.setId(1);
//        movie.setName("abc");
//
//        when(movieRepostitory.getOne(1)).thenReturn(movie);
//
//        List<Movie> movieList = movieService.getAllMovies();
//        assertEquals("", movie.getName(), "abc");
//    }
}
