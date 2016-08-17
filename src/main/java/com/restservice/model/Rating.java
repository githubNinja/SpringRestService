package com.restservice.model;


import javax.persistence.*;

public class Rating {

    @Column(name = "movieid")
    private Integer movieId;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "rating_year")
    private Integer ratingYear;

    @Override
    public String toString() {
        return "Rating{" +
                "movieId=" + movieId +
                ", rating=" + rating +
                ", ratingYear=" + ratingYear +
                '}';
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getRatingYear() {
        return ratingYear;
    }

    public void setRatingYear(Integer ratingYear) {
        this.ratingYear = ratingYear;
    }
}
