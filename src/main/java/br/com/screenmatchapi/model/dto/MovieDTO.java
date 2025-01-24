package br.com.screenmatchapi.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {

    @NotNull
    @Size(max = 20)
    @JsonProperty("imdbID")
    private String imdbId;

    @NotNull
    @Size(max = 50)
    @JsonProperty("Title")
    private String title;

    @NotNull
    @Size(max = 4)
    @JsonProperty("Year")
    private String year;

    @Size(max = 10)
    @JsonProperty("Rated")
    private String rated;

    @NotNull
    @Size(max = 50)
    @JsonProperty("Released")
    private String released;

    @NotNull
    @Size(max = 10)
    @JsonProperty("Runtime")
    private String runtime;

    @NotNull
    @Size(max = 50)
    @JsonProperty("Genre")
    private String genre;

    @Size(max = 50)
    @JsonProperty("Director")
    private String director;

    @NotNull
    @Size(max = 50)
    @JsonProperty("Writer")
    private String writer;

    @NotNull
    @JsonProperty("Actors")
    private String actors;

    @NotNull
    @JsonProperty("Plot")
    private String plot;

    @NotNull
    @Size(max = 50)
    @JsonProperty("Language")
    private String language;

    @NotNull
    @Size(max = 50)
    @JsonProperty("Country")
    private String country;

    @Size(max = 50)
    @JsonProperty("Awards")
    private String awards;

    @NotNull
    @JsonProperty("Poster")
    private String poster;

    @JsonProperty("Ratings")
    private List<RatingsDTO> ratings;

    @Size(max = 5)
    @JsonProperty("Metascore")
    private String metascore;

    @Size(max = 5)
    @JsonProperty("imdbRating")
    private String imdbRating;

    @Size(max = 20)
    @JsonProperty("imdbVotes")
    private String imdbVotes;

    @NotNull
    @Size(max = 30)
    @JsonProperty("Type")
    private String type;

    @Size(max = 10)
    @JsonProperty("TotalSeasons")
    private String totalSeasons;
}