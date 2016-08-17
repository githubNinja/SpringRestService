package com.restservice.dao;

import java.util.List;

import com.restservice.model.MovieResponse;
import com.restservice.model.User;

public interface MovieService {

	List<MovieResponse> findMoviesByUserId(Integer userId);

	MovieResponse findRatingByMovieId(Integer movieId);

	List<MovieResponse> findTop5Movies(Integer userId, String genre);


}