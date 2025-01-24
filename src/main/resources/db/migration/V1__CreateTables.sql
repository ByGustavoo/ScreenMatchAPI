CREATE TABLE movie(
    imdbID VARCHAR(20) PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    "year" VARCHAR(4)  NOT NULL,
    rated VARCHAR(10),
    released VARCHAR(30) NOT NULL,
    runtime VARCHAR(10) NOT NULL,
    genre VARCHAR(50) NOT NULL,
    director VARCHAR(50),
    writer VARCHAR(50) NOT NULL,
    actors VARCHAR NOT NULL,
    plot TEXT NOT NULL,
    "language" VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL,
    awards VARCHAR(50),
    poster VARCHAR NOT NULL,
    metascore VARCHAR(5),
    imdbrating VARCHAR(5),
    imdbvotes VARCHAR(20),
    type VARCHAR(30) NOT NULL,
    totalSeasons VARCHAR(10)
);

CREATE TABLE ratings(
    id SERIAL PRIMARY KEY,
    movie_id VARCHAR(20) NOT NULL,
    source VARCHAR(50) NOT NULL,
    value VARCHAR(10) NOT NULL,
    CONSTRAINT ratings_movie_id_fkey FOREIGN KEY (movie_id) REFERENCES public.movie (imdbid) ON DELETE CASCADE
);