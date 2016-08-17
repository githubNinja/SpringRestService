
CREATE SEQUENCE IF NOT EXISTS sequser
CREATE SEQUENCE IF NOT EXISTS seqmovie

INSERT INTO users VALUES (NEXT VALUE FOR sequser, 'Kranthi', 'kranthi@gmail.com', 10)
INSERT INTO users VALUES (NEXT VALUE FOR sequser, 'John', 'johng@gmail.com', 15)
INSERT INTO users VALUES (NEXT VALUE FOR sequser, 'Ortiz', 'ortiz@gmail.com', 34)
INSERT INTO users VALUES (NEXT VALUE FOR sequser, 'CiaJohn', 'cia@gmail.com', 12)

INSERT INTO movies VALUES (NEXT VALUE FOR seqmovie, 'Bourne Legacy', 'Action')
INSERT INTO movies VALUES (NEXT VALUE FOR seqmovie, 'Predator', 'Action')
INSERT INTO movies VALUES (NEXT VALUE FOR seqmovie, 'Independence Day', 'Drama')
INSERT INTO movies VALUES (NEXT VALUE FOR seqmovie, 'Sniper', 'Action')


INSERT INTO rating VALUES ( 300, 100, 2.3, 2002 )
INSERT INTO rating VALUES ( 300, 101, 6.2, 2016 )
INSERT INTO rating VALUES ( 301, 102, 9, 2013 )
INSERT INTO rating VALUES ( 301, 100, 7.2, 2015 )
INSERT INTO rating VALUES ( 301, 102, 1, 2012 )
INSERT INTO rating VALUES ( 301, 103, 7, 2013 )
INSERT INTO rating VALUES ( 302, 102, 6, 2016 )
INSERT INTO rating VALUES ( 302, 101, 5.2, 2015 )
INSERT INTO rating VALUES ( 303, 102, 6.6, 2016 )
INSERT INTO rating VALUES ( 303, 101, 8, 2015 )

