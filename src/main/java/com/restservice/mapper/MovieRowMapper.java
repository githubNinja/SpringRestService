package com.restservice.mapper;


import com.restservice.model.MovieResponse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<MovieResponse> {

    public MovieResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
        MovieResponse movieResponse = new MovieResponse();
        movieResponse.setMovieId(rs.getInt("movie_id"));
        movieResponse.setMovieName(rs.getString("movie_name"));
        movieResponse.setRating(rs.getFloat("rating"));
        movieResponse.setGenre(rs.getString("genre"));

        return movieResponse;
    }
}