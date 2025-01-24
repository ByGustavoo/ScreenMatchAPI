package br.com.screenmatchapi.service;

import br.com.screenmatchapi.model.dto.MovieDTO;
import br.com.screenmatchapi.model.dto.RatingsDTO;
import br.com.screenmatchapi.model.entity.Movie;
import br.com.screenmatchapi.model.entity.Ratings;
import br.com.screenmatchapi.repository.MovieRepository;
import br.com.screenmatchapi.repository.RatingsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService extends AbstractService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    RatingsRepository ratingsRepository;

    public MovieDTO saveMovieAndRatings(String pMovieName) {
        MovieDTO movieDTO = findMovie(pMovieName);

        if (movieDTO != null) {
            String movieId = saveMovie(movieDTO);

            List<RatingsDTO> ratingsListDTO = movieDTO.getRatings();

            if (ratingsListDTO != null) {
                ratingsListDTO.forEach(ratings -> {
                    ratings.setMovieId(movieId);
                    saveMovieRatings(ratings);
                });
            }
        }

        return movieDTO;
    }

    private String saveMovie(MovieDTO pMovieDTO) {
        var movie = modelMapper.map(pMovieDTO, Movie.class);
        movieRepository.save(movie);
        return movie.getImdbID();
    }

    private void saveMovieRatings(RatingsDTO pRatingsDTO) {
        Ratings ratings = modelMapper.map(pRatingsDTO, Ratings.class);
        ratingsRepository.save(ratings);
    }
}