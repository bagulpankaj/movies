package com.example.demo.reposirtory;

import com.example.demo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepostitory extends JpaRepository<Movie, Integer> {
}
