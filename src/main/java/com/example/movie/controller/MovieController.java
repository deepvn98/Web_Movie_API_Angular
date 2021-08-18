package com.example.movie.controller;

import com.example.movie.dto.responsy.ResponMessage;
import com.example.movie.model.Movie;
import com.example.movie.service.iplm.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity<?> createMovie(@RequestBody Movie movie) {
        Movie movie1 = movieService.save(movie);
        return new ResponseEntity<>(movie1, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> pageMovies(@PageableDefault(sort = "name", direction = Sort.Direction.ASC) Pageable pageable) {
        Page<Movie> moviesPage = movieService.getAll(pageable);
        if (moviesPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(moviesPage, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMovies(@PathVariable Long id, @RequestBody Movie movie) {
        Optional<Movie> movie1 = movieService.getById(id);
        if (!movie1.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            movie.setId(id);
            movieService.save(movie);
            return new ResponseEntity<>(new ResponMessage("yes"), HttpStatus.OK);
        }

    }


}
