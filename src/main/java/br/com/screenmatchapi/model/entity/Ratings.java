package br.com.screenmatchapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ratings", schema = "public")
public class Ratings {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 20)
    @Column(name = "movie_id", length = 20, nullable = false)
    private String movieId;

    @NotNull
    @Size(max = 50)
    @Column(name = "source", length = 50, nullable = false)
    private String source;

    @NotNull
    @Size(max = 10)
    @Column(name = "value", length = 10, nullable = false)
    private String value;
}