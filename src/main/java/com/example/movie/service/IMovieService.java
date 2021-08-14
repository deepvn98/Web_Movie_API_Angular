package com.example.movie.service;

import com.example.movie.model.Movie;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IMovieService {
    Iterable<Movie> getAll(Pageable pageable);
    Optional<Movie> getById(Long id);
    Movie save (Movie movie);
    void delete(Long id);

}
