package com.example.movie.service.iplm;

import com.example.movie.model.Movie;
import com.example.movie.repository.IMovieRepository;
import com.example.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService implements IMovieService {

    @Autowired
    private IMovieRepository movieRepository;

    @Override
    public Page<Movie> getAll(Pageable pageable) {
        return movieRepository.findAll(pageable);

    }

    @Override
    public Optional<Movie> getById(Long id) {
        return movieRepository.findById(id);
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void delete(Long id) {
        movieRepository.deleteById(id);
    }
}
