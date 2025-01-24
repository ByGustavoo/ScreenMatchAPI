package br.com.screenmatchapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "movie", schema = "public")
public class Movie {

    @Id
    @NotNull
    @Size(max = 20)
    @Column(name = "imdbid", length = 20, nullable = false)
    private String imdbID;

    @NotNull
    @Size(max = 50)
    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @NotNull
    @Size(max = 4)
    @Column(name = "year", length = 4, nullable = false)
    private String year;

    @Size(max = 10)
    @Column(name = "rated", length = 10)
    private String rated;

    @NotNull
    @Size(max = 50)
    @Column(name = "released", length = 50, nullable = false)
    private String released;

    @NotNull
    @Size(max = 10)
    @Column(name = "runtime", length = 10, nullable = false)
    private String runtime;

    @NotNull
    @Size(max = 50)
    @Column(name = "genre", length = 50, nullable = false)
    private String genre;

    @Size(max = 50)
    @Column(name = "director", length = 50)
    private String director;

    @NotNull
    @Size(max = 50)
    @Column(name = "writer", length = 50, nullable = false)
    private String writer;

    @NotNull
    @Column(name = "actors", nullable = false)
    private String actors;

    @NotNull
    @Column(name = "plot", nullable = false, columnDefinition = "TEXT")
    private String plot;

    @NotNull
    @Size(max = 50)
    @Column(name = "language", length = 50, nullable = false)
    private String language;

    @NotNull
    @Size(max = 50)
    @Column(name = "country", length = 50, nullable = false)
    private String country;

    @Size(max = 50)
    @Column(name = "awards", length = 50)
    private String awards;

    @NotNull
    @Column(name = "poster", nullable = false)
    private String poster;

    @Size(max = 5)
    @Column(name = "metascore", length = 5)
    private String metascore;

    @Size(max = 5)
    @Column(name = "imdbrating", length = 5)
    private String imdbRating;

    @Size(max = 20)
    @Column(name = "imdbvotes", length = 20)
    private String imdbVotes;

    @NotNull
    @Size(max = 30)
    @Column(name = "type", length = 30, nullable = false)
    private String type;

    @Size(max = 10)
    @Column(name = "totalseasons", length = 10)
    private String totalSeasons;
}