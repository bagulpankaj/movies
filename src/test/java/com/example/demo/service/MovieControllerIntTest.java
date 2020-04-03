package com.example.demo.service;


import com.example.demo.controller.MovieController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MovieControllerIntTest {

    private LocalServerPort port;

    @Autowired
    private MovieController movieController;





}
