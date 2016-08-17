Spring Rest Service Embedded Database
===============================
Spring 4 MVC, Embedded Database using HSQLDB.

#1. Technologies used
* Maven 3.0
* Spring 4.1.6.RELEASE
* HSQLDB 2.3.2

#2. To Run this project locally
$ mvn jetty:run
Access ```http://localhost:8080/spring-mvc-db/```

#3. To import this project into Eclipse IDE
1. ```$ mvn eclipse:eclipse```
2. Import into Eclipse via **existing projects into workspace** option.
3. Done.

Running
1) To run the jetty container use the mvn jetty:run
2) Run under folder spring-movie-restservice

Note:
Default User id = 'sa' and password is empty.
Couldnt able to modify the to given userId and password.

Data Model 
1) Users table.
a) id INTEGER PRIMARY KEY,
b) Index can be created on the age as age is used in the where condition.

2) Movies table.
a) movie_id INTEGER PRIMARY KEY,
b) Index can be created on the genre

3) Rating table.
a) This table uses the several users with different ratings for a movie.
b) We can have index on user_id.


#4. Project Demo
Working URL's for the Movie Rest Service.
Given a userId, return all movies that user has watched and the total count, as well as the rating for that movie
1) http://localhost:8080/spring-mvc-db/movieService/movieDetails/rating?movieId=303

Given a parameter of "movieId", return its average rating.
2) http://localhost:8080/spring-mvc-db/movieService/movieDetails/user?userId=102

Given a genre such as "action" and a userId, return the top 5 movies for that genre by average rating, where the rating was made by other users within 5 years (older and younger) of the user's age.

Note:Please check if the genre is Drama or 'Action'; for verifying the results.

3)http://localhost:8080/spring-mvc-db/movieService/movieDetails/top5?userId=103&genre='Drama'

