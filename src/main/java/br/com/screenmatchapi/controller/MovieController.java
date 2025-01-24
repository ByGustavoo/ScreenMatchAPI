package br.com.screenmatchapi.controller;

import br.com.screenmatchapi.model.dto.MovieDTO;
import br.com.screenmatchapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/v1")
    public ResponseEntity<MovieDTO> findMovie(String movieName) {
        return ResponseEntity.ok(movieService.findMovie(movieName));
    }

    @PostMapping("/v1")
    public ResponseEntity<MovieDTO> saveMovie(String movieName) {
        return ResponseEntity.ok(movieService.saveMovieAndRatings(movieName));
    }
}