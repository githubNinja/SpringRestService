package com.restservice.model;

import javax.persistence.*;

public class Movie {

    @Id
    @Column(name = "movieid")
    private Integer movieId;

    @Column(name = "userid")
    private Integer userId;

    @Column(name = "moviename")
    private String movieName;

    @Column(name = "genre")
    private String genre;

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", userId=" + userId +
                ", movieName='" + movieName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }



}
