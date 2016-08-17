--DROP TABLE users IF EXISTS;


CREATE SEQUENCE IF NOT EXISTS sequser START WITH 100
CREATE SEQUENCE IF NOT EXISTS seqmovie START WITH 300


CREATE TABLE users (
  id INTEGER PRIMARY KEY,
  name VARCHAR(30),
  email  VARCHAR(50),
  age INTEGER
);

CREATE TABLE movies (
  movie_id INTEGER PRIMARY KEY,
  movie_name VARCHAR(60),
  genre VARCHAR(30)
);

CREATE TABLE rating (
 movie_id  INTEGER ,
 user_id INTEGER,
 rating  FLOAT,
 rating_year INTEGER
);



