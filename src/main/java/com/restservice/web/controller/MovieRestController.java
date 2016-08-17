package com.restservice.web.controller;

import com.restservice.dao.MovieService;
import com.restservice.model.MovieResponse;
import com.restservice.response.MovieRestServiceResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class MovieRestController {

    private static final Logger logger = LoggerFactory.getLogger(MovieRestController.class);

    @Autowired
    private MovieService movieService;


    @RequestMapping(value = "/movieDetails/{user}", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public MovieRestServiceResponse getAllMoviesByUserId(@RequestParam("userId") Integer userId) {
        List<MovieResponse> moviesList = movieService.findMoviesByUserId(userId);
        MovieRestServiceResponse movieRestServiceResponse = new MovieRestServiceResponse(moviesList);
        movieRestServiceResponse.setCountOfMovies(moviesList.size());

        return movieRestServiceResponse;
    }


    @RequestMapping(value = "/movieDetails/rating", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public MovieRestServiceResponse getRatingByMovieId(@RequestParam("movieId") Integer movieId) {
        MovieRestServiceResponse movieRestServiceResponse = new MovieRestServiceResponse(movieService.findRatingByMovieId(movieId));

        return movieRestServiceResponse;
    }


    @RequestMapping(value = "/movieDetails/top5", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public MovieRestServiceResponse getTop5MoviesByRating(@RequestParam("userId") Integer userId, @RequestParam("genre") String genre) {
        MovieRestServiceResponse movieRestServiceResponse = new MovieRestServiceResponse(movieService.findTop5Movies(userId, genre));
        movieRestServiceResponse.setCountOfMovies(movieRestServiceResponse.getMovieResponseList().size());

        return movieRestServiceResponse;
    }


}