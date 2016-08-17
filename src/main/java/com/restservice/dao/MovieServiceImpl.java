package com.restservice.dao;

import com.restservice.config.literals.QueryLiterals;
import com.restservice.mapper.MovieRowMapper;
import com.restservice.model.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MovieServiceImpl implements MovieService, QueryLiterals {

    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<MovieResponse> findMoviesByUserId(Integer userId) {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);

        return namedParameterJdbcTemplate.query(SQL_MOVIES_BY_USER_ID, params, new MovieRowMapper());
    }

    @Override
    public MovieResponse findRatingByMovieId(Integer movieId) {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("movieId", movieId);

        MovieResponse movieResponse = (MovieResponse) namedParameterJdbcTemplate.queryForObject(SQL_RATING_BY_MOVIE_ID, params, new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                MovieResponse movieResponse = new MovieResponse();
                movieResponse.setRating(resultSet.getFloat("avg_rating"));
                return movieResponse;
            }
        });
        return movieResponse;
    }


    @Override
    public List<MovieResponse> findTop5Movies(Integer userId, String genre) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        String sqlQuery = SQL_TOP5_MOVIES.replace("?", genre);

        return namedParameterJdbcTemplate.query(sqlQuery, params, new MovieRowMapper());

    }


    /*private static final class MovieRestServiceMapper implements RowMapper<MovieResponse> {

        public MovieResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
            MovieResponse movieResponse = new MovieResponse();
            movieResponse.setMovieId(rs.getInt("movie_id"));
            movieResponse.setMovieName(rs.getString("movie_name"));
            movieResponse.setRating(rs.getFloat("rating"));
            movieResponse.setGenre(rs.getString("genre"));

            return movieResponse;
        }
    }*/

}