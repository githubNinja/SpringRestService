package com.restservice.config.literals;


public interface QueryLiterals {

    String SQL_MOVIES_BY_USER_ID = "SELECT count(*) " + "\"Count\"" + ",m.movie_id,m.movie_name, r.rating, m.genre FROM users u , movies m, " +
            "rating r WHERE u.id=:userId AND u.id = r.user_id " +
            "and m.movie_id = r.movie_id and u.id = r.user_id group by m.movie_id, r.rating";


    String SQL_RATING_BY_MOVIE_ID = "SELECT  AVG(r.rating) " + "\"avg_rating\"" + " FROM movies m, " +
            "rating r WHERE m.movie_id = r.movie_id and r.movie_id=:movieId";


    String SQL_TOP5_MOVIES = "SELECT * from (\n" +
            "SELECT LIMIT 0 5  M.movie_name, M.MOVIE_ID,AVG(r.rating) as \"RATING\" , M.GENRE FROM movies m,\n" +
            "users u1, rating r,\n" +
            "(Select u4.age from users u4 where u4.id=:userId) z \n" +
            "WHERE  r.movie_id = m.movie_id  and u1.age\n" +
            "between (z.age - 5) AND (z.age + 5)\n" +
            "and r.user_id = u1.id\n" +
            "and m.genre=? \n" +
            "GROUP BY M.movie_name,m.MOVIE_ID ) AS T1 order by T1.\"RATING\" desc";

}
