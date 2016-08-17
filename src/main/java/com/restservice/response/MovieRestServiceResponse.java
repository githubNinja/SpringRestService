package com.restservice.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.restservice.model.MovieResponse;

import java.io.Serializable;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieRestServiceResponse implements Serializable {

    private Integer countOfMovies;
    private Integer movieRating;
    private MovieResponse movieResponse;
    private List<MovieResponse> movieResponseList;

    public Integer getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(Integer movieRating) {
        this.movieRating = movieRating;
    }

    public MovieResponse getMovieResponse() {
        return movieResponse;
    }

    public void setMovieResponse(MovieResponse movieResponse) {
        this.movieResponse = movieResponse;
    }

    public List<MovieResponse> getMovieResponseList() {
        return movieResponseList;
    }

    public void setMovieResponseList(List<MovieResponse> movieResponseList) {
        this.movieResponseList = movieResponseList;
    }

    public MovieRestServiceResponse(MovieResponse movieResponseList) {
        this.movieResponse = movieResponseList;
    }

    public MovieRestServiceResponse(List<MovieResponse> movieResponseList) {
        this.movieResponseList = movieResponseList;
    }

    public Integer getCountOfMovies() {
        return countOfMovies;
    }

    public void setCountOfMovies(Integer countOfMovies) {
        this.countOfMovies = countOfMovies;
    }


}
